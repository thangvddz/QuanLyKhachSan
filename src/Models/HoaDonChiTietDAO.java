/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.ChiTietPhongVaDichVu;
import Entities.HoaDonChiTiet;
import Entities.ThongTinPhongDaThue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class HoaDonChiTietDAO extends DAO<HoaDonChiTiet, Object> {

    private static final String SQL_INSERT = "insert into HOADONCHITIET(MaHD, MaPhong, SoTang, NgayDK, TrangThai) VALUES (?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE HOADONCHITIET SET MaHD=?, MaPhong=?, SoTang=?, NgayDK=?, TrangThai=? WHERE MaHDCT=?";
    private static final String SQL_UPDATE_V1 = "UPDATE HOADONCHITIET SET TrangThai=? WHERE MaPhong=? and SoTang=? and TrangThai=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM HOADONCHITIET";
    private static final String SQL_SELECT_PHONG_DATHUE = "select MaPhong, SoTang, count(*) as soyeucau from HOADONCHITIET where MaHD=? and TrangThai=? group by MaPhong, SoTang";
    private static final String SQL_SELECT_MAHD = "select top 1 * from HOADONCHITIET where MaPhong=? and SoTang=? and TrangThai=?";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM HOADONCHITIET WHERE MaHDCT=?";
    private static final String SQL_SELECT_NEW_ID = "SELECT TOP 1 * FROM HOADONCHITIET where MaHD=? and TrangThai=? order by MaHDCT desc";
    private static final String SQL_SELECT_NEW_ID_RESERVE = "select top 1 * from HOADONCHITIET where TrangThai=? and SoTang=? and MaPhong=?";
    private static final String SQL_SELECT_HDCT_A_ROOM = "select * from HOADONCHITIET where TrangThai=? and SoTang=? and MaPhong=?";
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

    public void updateV1(boolean newTrangThai, String maPhong, int soTang, boolean oldTrangThai) {
        jdbc.update(SQL_UPDATE_V1, newTrangThai, maPhong, soTang, oldTrangThai);
    }

    @Override
    public void delete(Object id) {
        jdbc.update(SQL_DELETE, id);
    }

    @Override
    public HoaDonChiTiet selectById(Object id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }

    public HoaDonChiTiet selectByNewID(int maHD, boolean TrangThai) {
        return selectBySql(SQL_SELECT_NEW_ID, maHD, TrangThai).get(0);
    }

    public HoaDonChiTiet selectByNewIDReserve(boolean TrangThai, int soTang, String maPhong) {
        return selectBySql(SQL_SELECT_NEW_ID_RESERVE, TrangThai, soTang, maPhong).get(0);
    }

    @Override
    public List<HoaDonChiTiet> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }
    
    public List<HoaDonChiTiet> selectAllARoom(boolean TrangThai, int SoTang, String maPhong) {
        return selectBySql(SQL_SELECT_HDCT_A_ROOM, TrangThai, SoTang, maPhong);
    }

    public List<ThongTinPhongDaThue> selectAllPhongDaThue(int maHD, boolean trangThai) {
        List<ThongTinPhongDaThue> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(SQL_SELECT_PHONG_DATHUE, maHD, trangThai);
            while (rs.next()) {
                String maPhong = rs.getString(1);
                int soTang = rs.getInt(2);
                int soLanYC = rs.getInt(3);
                ls.add(new ThongTinPhongDaThue(maPhong, soTang, soLanYC));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ls.isEmpty()) {
            return null;
        }
        return ls;
    }

    @Override
    protected List<HoaDonChiTiet> selectBySql(String sql, Object... args) {
        List<HoaDonChiTiet> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                int MaCTHD = rs.getInt(1);
                int MaHD = rs.getInt(2);
                String MaPhong = rs.getString(3);
                int SoTang = rs.getInt(4);
                Date NgayDK = rs.getDate(5);
                boolean TrangThai = rs.getBoolean(6);
                ls.add(new HoaDonChiTiet(MaCTHD, MaHD, MaPhong, SoTang, NgayDK, TrangThai));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (ls.isEmpty()) {
            return null;
        }
        return ls;
    }

    public HoaDonChiTiet getMaHDFromHDCT(int soTang, String maPhong, boolean trangThai) {
        try {
            return selectBySql(SQL_SELECT_MAHD, maPhong, soTang, trangThai).get(0);
        } catch (Exception e) {
            return null;
        }
    }

}
