/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.HoaDonChiTiet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class HoaDonChiTietDAO extends DAO<HoaDonChiTiet, Object> {
    
    private static final String SQL_INSERT = "insert into HOADONCHITIET(MaHD, MaDV, MaPhong, SoTang,NgayDK,ThoiGianBDSD,SoLanSuDung,TrangThai) VALUES (?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE HOADONCHITIET SET MaHD=?, MaDV=?, MaPhong=?, SoTang=?,NgayDK=?,ThoiGianBDSD=?,SoLanSuDung=?,TrangThai=? WHERE MaHD=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM HOADON";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM HOADON WHERE MaHD=?";
    private static final String SQL_DELETE = "DELETE FROM HOADON WHERE MaHD=?";
    
    JdbcHelper jdbc;
    
    public HoaDonChiTietDAO() {
        jdbc = new JdbcHelper();
    }
    
    @Override
    public void insert(HoaDonChiTiet entity) {
        jdbc.update(SQL_INSERT, entity.getMaHD(), entity.getMaDV(), entity.getMaPhong(), entity.getSoTang(), entity.getNgayDK(), entity.getThoiGianBDSD(), entity.getSoLanSuDung(), entity.isTrangThai());
    }
    
    @Override
    public void update(HoaDonChiTiet entity) {
        jdbc.update(SQL_INSERT, entity.getMaHD(), entity.getMaDV(), entity.getMaPhong(), entity.getSoTang(), entity.getNgayDK(), entity.getThoiGianBDSD(), entity.getSoLanSuDung(), entity.isTrangThai());
    }
    
    @Override
    public void delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public HoaDonChiTiet selectById(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<HoaDonChiTiet> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected List<HoaDonChiTiet> selectBySql(String sql, Object... args) {
        List<HoaDonChiTiet> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            
            while (rs.next()) {
                int MaHD = rs.getInt(1);
                int MaDV = rs.getInt(2);
                String MaPhong = rs.getString(3);
                int SoTang = rs.getInt(4);
                Date NgayDK = rs.getDate(5);
                Date ThoiGianBDSD = rs.getDate(6);
                int SoLanSuDung = rs.getInt(7);
                boolean TrangThai = rs.getBoolean(8);
                ls.add(new HoaDonChiTiet(MaHD, MaDV, MaPhong, SoTang, NgayDK, ThoiGianBDSD, SoLanSuDung, TrangThai));
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
    
}
