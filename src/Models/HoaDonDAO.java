/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.HoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class HoaDonDAO extends DAO<HoaDon, Integer> {

    private static final String SQL_INSERT = "INSERT INTO HOADON(MaNV, MaKH, ThoiDiemDatPhong, ThoiDiemTraPhong, TienTraTruoc,GiamGia,PhuThu,ThanhTien, GhiChu, TrangThai) VALUES (?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE HOADON SET MaNV=?, MaKH=?, ThoiDiemDatPhong=?, ThoiDiemTraPhong=?, TienTraTruoc=?,GiamGia=?,PhuThu=?,ThanhTien=?, GhiChu=?, TrangThai=? WHERE MaHD=?";
    private static final String SQL_UPDATE_TRANGTHAI = "UPDATE HOADON SET TrangThai=? WHERE MaHD=?";
    private static final String SQL_UPDATE_TONGTIEN = "UPDATE HOADON SET ThanhTien=? WHERE MaHD=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM HOADON";
    private static final String SQL_SELECT_ID_HOADON = "select * from HOADON where MaKH=? and TrangThai=?";
    private static final String SQL_SELECT_ID_HOADON_TT_FALSE = "select * from HOADON where TrangThai=?";
    private static final String SQL_SELECT_ID_HOADON_MOI = "select TOP 1 * from HOADON where TrangThai=? order by MaHD desc";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM HOADON WHERE MaHD=? and TrangThai=?";
    private static final String SQL_DELETE = "DELETE FROM HOADON WHERE MaHD=?";

    JdbcHelper jdbc;

    public HoaDonDAO() {
        jdbc = new JdbcHelper();
    }

    @Override
    public void insert(HoaDon entity) {
        jdbc.update(SQL_INSERT, entity.getMaNV(), entity.getMaKH(), entity.getThoiDiemDatPhong(), entity.getThoiDiemTraPhong(), entity.getTienTraTruoc(), entity.getGiamGia(), entity.getPhuThu(), entity.getThanhTien(), entity.getGhiChu(), entity.isTrangThai());
    }

    @Override
    public void update(HoaDon entity) {
        jdbc.update(SQL_UPDATE, entity.getMaNV(), entity.getMaKH(), entity.getThoiDiemDatPhong(), entity.getThoiDiemTraPhong(), entity.getTienTraTruoc(), entity.getGiamGia(), entity.getPhuThu(), entity.getThanhTien(), entity.getGhiChu(), entity.isTrangThai(), entity.getMaHD());
    }

    public void updateTT(boolean TrangThai, int maHD) {
        jdbc.update(SQL_UPDATE_TRANGTHAI, TrangThai, maHD);
    }
    
    public void updateTongTien(double tongTien, int maHD) {
        jdbc.update(SQL_UPDATE_TONGTIEN, tongTien, maHD);
    }

    @Override
    public void delete(Integer id) {
        jdbc.update(SQL_DELETE, id);
    }

    @Override
    public HoaDon selectById(Integer id) {
        return null;
    }

    public HoaDon selectByIdd(Integer id, boolean trangthai) {
        return selectBySql(SQL_SELECT_BY_ID, id, trangthai).get(0);
    }

    public HoaDon selectHoaDonByKH(int makh, boolean trangthai) {
        return selectBySql(SQL_SELECT_ID_HOADON, makh, trangthai).get(0);
    }

    public HoaDon selectHoaDonByKHMoi(boolean trangthai) {
        return selectBySql(SQL_SELECT_ID_HOADON_MOI, trangthai).get(0);
    }

    @Override
    public List<HoaDon> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }
    
    public List<HoaDon> selectHD_TT_false(boolean tt) {
        return selectBySql(SQL_SELECT_ID_HOADON_TT_FALSE, tt);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                int MaHD = rs.getInt(1);
                String MaNV = rs.getString(2);
                int MaKH = rs.getInt(3);
                Timestamp ThoiDiemDatPhong = rs.getTimestamp(4);
                Timestamp ThoiDiemTraPhong = rs.getTimestamp(5);
                double TienTraTruoc = rs.getDouble(6);
                double GiamGia = rs.getDouble(7);
                double PhuThu = rs.getDouble(8);
                double ThanhTien = rs.getDouble(9);
                String GhiChu = rs.getString(10);
                boolean TrangThai = rs.getBoolean(11);
                ls.add(new HoaDon(MaHD, MaNV, MaKH, ThoiDiemDatPhong, ThoiDiemTraPhong, TienTraTruoc, GiamGia, PhuThu, ThanhTien, GhiChu, TrangThai));
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
