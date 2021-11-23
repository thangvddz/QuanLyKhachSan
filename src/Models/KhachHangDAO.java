/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class KhachHangDAO extends DAO<KhachHang, Integer> {

    private static final String SQL_INSERT = "INSERT INTO KHACHHANG(SoCMT, HoTen, SoHoChieu, SoDienThoai, NgaySinh, QueQuan,QuocTich, Email, GioiTinh) VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE KHACHHANG SET SoCMT=?, HoTen=?, SoHoChieu=?, SoDienThoai=?, NgaySinh=?, QueQuan=?,QuocTich=?, Email=?, GioiTinh=? WHERE MaKH=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM KHACHHANG";
    private static final String SQL_SELECT_ID_CUSTOMER = "select * from KHACHHANG where SoCMT=?";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM KHACHHANG WHERE MaKH=?";
    private static final String SQL_DELETE = "DELETE FROM KHACHHANG WHERE MaKH=?";

    JdbcHelper jdbc;

    public KhachHangDAO() {
        jdbc = new JdbcHelper();
    }

    @Override
    public void insert(KhachHang entity) {
        jdbc.update(SQL_INSERT, entity.getSoCMT(), entity.getHoTen(), entity.getSoHoChieu(), entity.getSoDT(), entity.getNgaySinh(), entity.getQueQuan(),entity.getQuocTich(), entity.getEmail(), entity.isGioiTinh());
    }

    @Override
    public void update(KhachHang entity) {
        jdbc.update(SQL_UPDATE, entity.getSoCMT(), entity.getHoTen(), entity.getSoHoChieu(), entity.getSoDT(), entity.getNgaySinh(), entity.getQueQuan(),entity.getQuocTich(), entity.getEmail(), entity.isGioiTinh(), entity.getMaKH());
    }

    @Override
    public void delete(Integer id) {
        jdbc.update(SQL_DELETE, id);
    }

    @Override
    public KhachHang selectById(Integer id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }
    
    public KhachHang selectMaKHNew(String soCMT) {
        return selectBySql(SQL_SELECT_ID_CUSTOMER, soCMT).get(0);
    }

    @Override
    public List<KhachHang> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                int maKH = rs.getInt(1);
                String soCMT = rs.getString(2);
                String HoTen = rs.getString(3);
                String soHoChieu = rs.getString(4);
                String soDT = rs.getString(5);
                Date ngaySinh = rs.getDate(6);
                String QueQuan = rs.getString(7);
                String QuocTich = rs.getString(8);
                String Email = rs.getString(9);
                boolean gioiTinh = rs.getBoolean(10);
                ls.add(new KhachHang(maKH, soCMT, HoTen, soHoChieu, soDT, ngaySinh, QueQuan, QuocTich, Email, gioiTinh));
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

    public KhachHang selectById(String maKh) {
        return selectBySql(SQL_SELECT_BY_ID, maKh).get(0);
    }

}
