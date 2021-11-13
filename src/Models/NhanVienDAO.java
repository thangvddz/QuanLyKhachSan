/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class NhanVienDAO extends DAO<NhanVien, Integer> {

    private static final String SQL_INSERT = "INSERT INTO NHANVIEN(HoTen, SoCMT,GioiTinh,QueQuan,NgaySinh,NgayVaoLam, SoDT, Email,username, passwd, VaiTro, TrangThai) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE NHANVIEN SET HoTen=?, SoCMT=?,GioiTinh=?,QueQuan=?,NgaySinh=?,NgayVaoLam=?, SoDT=?, Email=?,username=?, passwd=?, VaiTro=?, TrangThai=? WHERE MaNV=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM NHANVIEN";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM NHANVIEN WHERE MaNV=?";
    private static final String SQL_DELETE = "DELETE FROM NHANVIEN WHERE MaNV=?";

    JdbcHelper jdbc;

    public NhanVienDAO() {
        jdbc = new JdbcHelper();
    }

    @Override
    public void insert(NhanVien entity) {
        jdbc.update(SQL_INSERT, entity.getHoTen(), entity.getSoCMT(), entity.isGioiTinh(), entity.getQueQuan(), entity.getNgaySinh(), entity.getNgayVaoLam(), entity.getSoDT(), entity.getEmail(),entity.getUsername(),entity.getPasswd(), entity.isVaiTro(), entity.isTrangThai());
    }

    @Override
    public void update(NhanVien entity) {
        jdbc.update(SQL_UPDATE, entity.getHoTen(), entity.getSoCMT(), entity.isGioiTinh(), entity.getQueQuan(), entity.getNgaySinh(), entity.getNgayVaoLam(), entity.getSoDT(), entity.getEmail(),entity.getUsername(),entity.getPasswd(), entity.isVaiTro(), entity.isTrangThai(), entity.getMaNV());
    }

    @Override
    public void delete(Integer id) {
        jdbc.update(SQL_DELETE, id);
    }

    @Override
    public NhanVien selectById(Integer id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                int MaNV = rs.getInt(1);
                String HoTen = rs.getString(2);
                String SoCMT = rs.getString(3);
                boolean GioiTinh = rs.getBoolean(4);
                String QueQuan = rs.getString(5);
                Date NgaySinh = rs.getDate(6);
                Date NgayVaoLam = rs.getDate(7);
                String SoDT = rs.getString(8);
                String Email = rs.getString(9);
                String username = rs.getString(10);
                String passwd = rs.getString(11);
                boolean VaiTro = rs.getBoolean(12);
                boolean TrangThai = rs.getBoolean(13);
                ls.add(new NhanVien(MaNV, HoTen, SoCMT, GioiTinh, QueQuan, NgaySinh, NgayVaoLam, SoDT, Email, username, passwd, VaiTro, TrangThai));
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
