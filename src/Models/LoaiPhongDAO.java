/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.LoaiPhong;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class LoaiPhongDAO extends DAO<LoaiPhong, Integer> {
    
    private static final String SQL_INSERT = "INSERT INTO LOAIPHONG(TenLP, SoGiuong, giaGio, giaNgay) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE LOAIPHONG SET TenLP=?, SoGiuong=?, giaGio=?, giaNgay=? WHERE MaLP=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM LOAIPHONG";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM LOAIPHONG WHERE MaLP=?";
    private static final String SQL_DELETE = "DELETE FROM LOAIPHONG WHERE MaLP=?";
    
    JdbcHelper jdbc;
    
    public LoaiPhongDAO() {
        jdbc = new JdbcHelper();
    }
    
    @Override
    public void insert(LoaiPhong entity) {
        jdbc.update(SQL_INSERT, entity.getTenLP(), entity.getSoGiuong(), entity.getGiaGio(), entity.getGiaNgay());
    }
    
    @Override
    public void update(LoaiPhong entity) {
        jdbc.update(SQL_UPDATE, entity.getTenLP(), entity.getSoGiuong(), entity.getGiaGio(), entity.getGiaNgay(), entity.getMaLP());
    }
    
    @Override
    public void delete(Integer id) {
        jdbc.update(SQL_DELETE, id);
    }
    
    @Override
    public LoaiPhong selectById(Integer id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }
    
    @Override
    public List selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }
    
    @Override
    protected List<LoaiPhong> selectBySql(String sql, Object... args) {
        List<LoaiPhong> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            
            while (rs.next()) {
                int MaLP = rs.getInt(1);
                String TenLP = rs.getString(2);
                int SoGiuong = rs.getInt(3);
                double giaGio = rs.getDouble(4);
                double giaNgay = rs.getDouble(5);
                ls.add(new LoaiPhong(MaLP, TenLP, SoGiuong, giaGio, giaNgay));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (ls.isEmpty()) {
            return null;
        }
        return ls;
    }
}
