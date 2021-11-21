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
public class NhanVienDAO extends DAO<NhanVien, String> {

    final String insert = "insert into NHANVIEN(MaNV,HoTen,Username,Pass_word,SoCmt,NgaySinh,SDT,Emai,GioiTinh,VaiTro)"
            + "values(?,?,?,?,?,?,?,?,?,?)";
    final String update = "update NHANVIEN set HoTen=?,Username=?,Pass_word=?,SoCmt=?,GioiTinh=?,NgaySinh=?,SDT=?,Emai=?,VaiTro=? where MaNV=?";
    final String delete = "delete from NHANVIEN where MaNV=? ";
    final String SELECT_ALL = "SELECT*FROM NHANVIEN";
    final String SELECT_BY_ID = "SELECT*FROM NHANVIEN WHERE MaNV = ?";

    @Override
    public void insert(NhanVien entity) {
        JdbcHelper.update(insert,
                entity.getMaNV(),
                entity.getHoTen(),
                entity.getUsername(),
                entity.getPasswd(),
                entity.getSoCMT(),
                entity.getNgaySinh(),
                entity.getSoDT(),
                entity.getEmail(),
                entity.isGioiTinh(),
                entity.isVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(update,
                entity.getHoTen(),
                entity.getUsername(),
                entity.getPasswd(),
                entity.getSoCMT(),
                entity.isGioiTinh(),
                entity.getNgaySinh(), 
                entity.getSoDT(),
                entity.getEmail(),               
                entity.isVaiTro(),
                entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        String sql = "delete from NHANVIEN where MaNV = ? ";
        JdbcHelper.update(sql, id);
        JdbcHelper.update(delete, id);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> lst = selectBySql(SELECT_BY_ID, id);
        if (lst.isEmpty()) {
            return null;
        }
        return lst.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> lst = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setUsername(rs.getString("Username"));
                entity.setPasswd(rs.getString("Pass_word"));
                entity.setSoCMT(rs.getString("SoCmt"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setSoDT(rs.getString("SDT"));
                entity.setEmail(rs.getString("Emai"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                lst.add(entity);
            }
            rs.getStatement().getConnection().close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return lst;
    }

}
