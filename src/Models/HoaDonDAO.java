/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.HoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class HoaDonDAO extends DAO<HoaDon, Integer> {

    private static final String SQL_INSERT = "INSERT INTO HOADON(MaNV, MaKH, ThoiDiemDatPhong, ThoiDiemTraPhong, TienTraTruoc, GhiChu, TrangThai) VALUES (?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE HOADON SET MaNV=?, MaKH=?, ThoiDiemDatPhong=?, ThoiDiemTraPhong=?, TienTraTruoc=?, GhiChu=?, TrangThai=? WHERE MaHD=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM HOADON";
    private static final String SQL_SELECT_TOP1 = "select top 1 * from HOADON order by MaHD desc";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM HOADON WHERE MaHD=?";
    private static final String SQL_DELETE = "DELETE FROM HOADON WHERE MaHD=?";

    JdbcHelper jdbc;

    public HoaDonDAO() {
        jdbc = new JdbcHelper();
    }

    @Override
    public void insert(HoaDon entity) {
        jdbc.update(SQL_INSERT, entity.getMaNV(), entity.getMaKH(), entity.getThoiDiemDatPhong(), entity.getThoiDiemTraPhong(), entity.getTienTraTruoc(), entity.getGhiChu(), entity.isTrangThai());
    }

    @Override
    public void update(HoaDon entity) {
        jdbc.update(SQL_UPDATE, entity.getMaNV(), entity.getMaKH(), entity.getThoiDiemDatPhong(), entity.getThoiDiemTraPhong(), entity.getTienTraTruoc(), entity.getGhiChu(), entity.isTrangThai(), entity.getMaHD());
    }

    @Override
    public void delete(Integer id) {
        jdbc.update(SQL_DELETE, id);
    }

    @Override
    public HoaDon selectById(Integer id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }

    public HoaDon selectTop1() {
        return selectBySql(SQL_SELECT_TOP1).get(0);
    }

    @Override
    public List<HoaDon> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                int MaHD = rs.getInt(1);
                int MaNV = rs.getInt(2);
                int MaKH = rs.getInt(3);
                Date ThoiDiemDatPhong = rs.getDate(4);
                Date ThoiDiemTraPhong = rs.getDate(5);
                double TienTraTruoc = rs.getDouble(6);
                String GhiChu = rs.getString(7);
                boolean TrangThai = rs.getBoolean(8);
                ls.add(new HoaDon(MaHD, MaNV, MaKH, ThoiDiemDatPhong, ThoiDiemTraPhong, TienTraTruoc, GhiChu, TrangThai));
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
