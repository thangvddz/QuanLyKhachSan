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

    private static final String SQL_INSERT = "insert into HOADONCHITIET(MaHD, MaPhong, SoTang, NgayDK, TrangThai) VALUES (?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE HOADONCHITIET SET MaHD=?, MaPhong=?, SoTang=?, NgayDK=?, TrangThai=? WHERE MaHDCT=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM HOADONCHITIET";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM HOADONCHITIET WHERE MaHDCT=?";
    private static final String SQL_DELETE = "DELETE FROM HOADONCHITIET WHERE MaHDCT=?";

    JdbcHelper jdbc;

    public HoaDonChiTietDAO() {
        jdbc = new JdbcHelper();
    }

    @Override
    public void insert(HoaDonChiTiet entity) {
        jdbc.update(SQL_INSERT, entity.getMaHD(), entity.getMaPhong(), entity.getSoTang(), entity.getNgayDK(), entity.isTrangThai());
    }

    @Override
    public void update(HoaDonChiTiet entity) {
        jdbc.update(SQL_UPDATE, entity.getMaHD(), entity.getMaPhong(), entity.getSoTang(), entity.getNgayDK(), entity.isTrangThai(), entity.getMaCTHD());
    }

    @Override
    public void delete(Object id) {
        jdbc.update(SQL_DELETE, id);
    }

    @Override
    public HoaDonChiTiet selectById(Object id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<HoaDonChiTiet> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }

    @Override
    protected List<HoaDonChiTiet> selectBySql(String sql, Object... args) {
        List<HoaDonChiTiet> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                int MaHD = rs.getInt(1);
                String MaPhong = rs.getString(3);
                int SoTang = rs.getInt(4);
                Date NgayDK = rs.getDate(5);
                boolean TrangThai = rs.getBoolean(8);
                ls.add(new HoaDonChiTiet(MaHD, MaHD, MaPhong, SoTang, NgayDK, TrangThai));
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
