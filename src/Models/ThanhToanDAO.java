/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.ThanhToan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class ThanhToanDAO extends DAO<ThanhToan, Integer> {
    
    private static final String SQL_INSERT = "INSERT INTO THANHTOAN(MaHD, MaLoaiTT, ThoiGianThanhToan, GhiChu) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE THANHTOAN SET MaHD=?, MaLoaiTT=?, ThoiGianThanhToan=?, GhiChu=? WHERE MaHD=? and MaLoaiTT=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM THANHTOAN";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM THANHTOAN WHERE MaHD=? and MaLoaiTT=?";
    private static final String SQL_DELETE = "DELETE FROM THANHTOAN WHERE MaHD=? and MaLoaiTT=?";
    
    JdbcHelper jdbc;
    
    public ThanhToanDAO() {
        jdbc = new JdbcHelper();
    }
    
    @Override
    public void insert(ThanhToan entity) {
        jdbc.update(SQL_INSERT, entity.getMaHD(), entity.getMaLoaiTT(), entity.getThoiGianThanhToan(), entity.getGhiChu());
    }
    
    @Override
    public void update(ThanhToan entity) {
        jdbc.update(SQL_UPDATE, entity.getMaHD(), entity.getMaLoaiTT(), entity.getThoiGianThanhToan(), entity.getGhiChu(), entity.getMaHD(), entity.getMaLoaiTT());
    }
    
    @Override
    public void delete(Integer id) {
//        jdbc.update(SQL_DELETE, id);
    }
    
    @Override
    public ThanhToan selectById(Integer id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }
    
    public ThanhToan selectByIdD(Integer id, int maloaiTT) {
        return selectBySql(SQL_SELECT_BY_ID, id, maloaiTT).get(0);
    }
    
    @Override
    public List<ThanhToan> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }
    
    @Override
    protected List<ThanhToan> selectBySql(String sql, Object... args) {
        List<ThanhToan> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            
            while (rs.next()) {
                int MaHD = rs.getInt(1);
                int MaLoaiTT = rs.getInt(2);
                Timestamp ThoiGianThanhToan = rs.getTimestamp(3);
                String GhiChu = rs.getString(4);
                ls.add(new ThanhToan(MaHD, MaLoaiTT, ThoiGianThanhToan, GhiChu));
            }
        } catch (SQLException ex) {
            System.out.println("Error selectbySQL in NhanVienDao");
            ex.printStackTrace();
        }
        if (ls.isEmpty()) {
            return null;
        }
        return ls;
    }

    public ThanhToan selectById(int mahd, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
