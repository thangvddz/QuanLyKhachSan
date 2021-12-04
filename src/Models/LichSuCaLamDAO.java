/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.LichSuCaLam;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ACER
 */
public class LichSuCaLamDAO extends DAO<LichSuCaLam, Object> {
    
    private static final String SQL_INSERT = "insert into LSCaLam(MaNV, MaCaLam, TienVaoDauCa, TienCuoiCa, ThoiGianBD, ThoiGianKT, TienThucNhan, TienThucThu, GhiChuNhan, GhiChuThu, TrangThai) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE LSCaLam SET MaNV=?, MaCaLam=?, TienVaoDauCa=?, TienCuoiCa=?, ThoiGianBD=?, ThoiGianKT=?, TienThucNhan=?, TienThucThu=?, GhiChuNhan=?, GhiChuThu=?, TrangThai=? WHERE MaLSCL=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM LSCaLam";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM LSCaLam WHERE MaLSCL=?";
    private static final String SQL_DELETE = "DELETE FROM LSCaLam WHERE MaLSCL=?";
    
    @Override
    public void insert(LichSuCaLam entity) {
        JdbcHelper.update(SQL_INSERT, entity.getMaNV(), entity.getMaCaLam(),
                entity.getTienVaoDauCa(), entity.getTienCuoiCa(), entity.getThoiGianBD(), entity.getThoiGianKT(), entity.getTienThucNhan(), entity.getTienThucThu(),
                entity.getGhiChuNhan(),
                entity.getGhiChuThu(), entity.isTrangThai());
    }
    
    @Override
    public void update(LichSuCaLam entity) {
        JdbcHelper.update(SQL_UPDATE, entity.getMaNV(), entity.getMaCaLam(),
                entity.getTienVaoDauCa(), entity.getTienCuoiCa(), entity.getThoiGianBD(), entity.getThoiGianKT(), entity.getTienThucNhan(), entity.getTienThucThu(),
                entity.getGhiChuNhan(),
                entity.getGhiChuThu(), entity.isTrangThai());
    }
    
    @Override
    public void delete(Object id) {
        JdbcHelper.update(SQL_DELETE, id);
    }
    
    @Override
    public LichSuCaLam selectById(Object id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }
    
    @Override
    public List<LichSuCaLam> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }
    
    @Override
    protected List<LichSuCaLam> selectBySql(String sql, Object... args) {
        List<LichSuCaLam> ls = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            
            while (rs.next()) {
                int MaLSCL = rs.getInt(1);
                String MaNV = rs.getString(2);
                int MaCaLam = rs.getInt(3);
                double TienVaoDauCa = rs.getDouble(4);
                double TienCuoiCa = rs.getDouble(5);
                Timestamp ThoiGianBD = rs.getTimestamp(6);
                Timestamp ThoiGianKT = rs.getTimestamp(7);
                double TienThucNhan = rs.getDouble(8);
                double TienThucThu = rs.getDouble(9);
                String GhiChuNhan = rs.getString(10);
                String GhiChuThu = rs.getString(11);
                boolean TrangThai = rs.getBoolean(12);
                ls.add(new LichSuCaLam(MaLSCL, MaNV, MaCaLam, TienVaoDauCa, TienCuoiCa, ThoiGianBD, ThoiGianKT, TienThucNhan, TienThucThu, GhiChuNhan, GhiChuThu, TrangThai));
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
