/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.YeuCau;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class YeuCauDAO extends DAO<YeuCau, Object> {

    private static final String SQL_INSERT = "INSERT INTO YEUCAU(MaDV, MaHDCT, ThoiGianBD, TrangThai) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE YEUCAU SET MaDV=?, ThoiGianBD=?, TrangThai=? WHERE MaHDCT=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM YEUCAU";
    private static final String SQL_SELECT_YC_BY_HDCT = "select YEUCAU.* from HOADONCHITIET left outer join YEUCAU on HOADONCHITIET.MaHDCT = YEUCAU.MaHDCT \n"
            + "where HOADONCHITIET.TrangThai=? and MaPhong=? and SoTang=? and YEUCAU.MaDV is not null";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM YEUCAU WHERE MaDV=? and MaHDCT=?";
    private static final String SQL_DELETE = "DELETE FROM YEUCAU WHERE MaHDCT=?";

    JdbcHelper jdbc;

    public YeuCauDAO() {
        jdbc = new JdbcHelper();
    }

    @Override
    public void insert(YeuCau entity) {
        jdbc.update(SQL_INSERT, entity.getMaDV(), entity.getMaHDCT(), entity.getThoiGianBDSD(), entity.isTrangThai());
    }

    @Override
    public void update(YeuCau entity) {
        jdbc.update(SQL_UPDATE, entity.getMaDV(), entity.getThoiGianBDSD(), entity.isTrangThai(), entity.getMaHDCT());
    }

    @Override
    public void delete(Object id) {
        jdbc.update(SQL_DELETE, id);
    }

    @Override
    public YeuCau selectById(Object id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<YeuCau> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }

    public List<YeuCau> selectAllMAHDCT(boolean trangThai, String MaPhong, int soTang) {
        return selectBySql(SQL_SELECT_YC_BY_HDCT, trangThai, MaPhong, soTang);
    }

    @Override
    protected List<YeuCau> selectBySql(String sql, Object... args) {
        List<YeuCau> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                int maDV = rs.getInt(1);
                int maHDCT = rs.getInt(2);
                Timestamp ThoiGianBDSD = rs.getTimestamp(3);
                boolean TrangThai = rs.getBoolean(4);
                ls.add(new YeuCau(maDV, maHDCT, ThoiGianBDSD, TrangThai));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (ls.isEmpty()) {
            return null;
        }
        return ls;
    }

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {

        List<Object[]> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                ls.add(vals);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ls;
    }

    public List<Object[]> getDichVuDaDung(int soTang, String maPhong) {
        String sql = "{CALL DichVuDaDung(?,?)}";
        String[] cols = {"TenDV", "ThoiGianBD", "TongPhiDV"};
        return this.getListOfArray(sql, cols, soTang, maPhong);
    }

    public List<Object[]> getTienNhanPSom(Timestamp cusCheckIn, Timestamp HolCheckIn, double giaPhong) {
        String sql = "{CALL TienNhanPhongSom(?,?,?)}";
        String[] cols = {"TienPhongSom"};
        return this.getListOfArray(sql, cols, cusCheckIn, HolCheckIn, giaPhong);
    }

    public List<Object[]> getTienTraPTre(Timestamp cusCheckOut, Timestamp HolCheckOut, double giaPhong) {
        String sql = "{CALL TienTraPhongTre(?,?,?)}";
        String[] cols = {"TienPhongTre"};
        return this.getListOfArray(sql, cols, cusCheckOut, HolCheckOut, giaPhong);
    }

}
