/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.LichSuGD;
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
public class LichSuGDDAO extends DAO<LichSuGD, Integer> {

    private static final String SQL_INSERT = "INSERT INTO LICHSUGD(MaHDCT, ThoiGianBD, ThoiGianKT, TrangThai) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE LICHSUGD SET MaHDCT=?, ThoiGianBD=?, ThoiGianKT=?, TrangThai=? WHERE MaLSGD=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM LICHSUGD";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM LICHSUGD WHERE MaLSGD=?";
    private static final String SQL_DELETE = "DELETE FROM LICHSUGD WHERE MaLSGD=?";

    JdbcHelper jdbc;

    public LichSuGDDAO() {
        jdbc = new JdbcHelper();
    }

    @Override
    public void insert(LichSuGD entity) {
        jdbc.update(SQL_INSERT, entity.getMaHDCT(), entity.getThoiGianBD(), entity.getThoiGianKT(), entity.isTrangThai());
    }

    @Override
    public void update(LichSuGD entity) {
        jdbc.update(SQL_UPDATE, entity.getMaHDCT(), entity.getThoiGianBD(), entity.getThoiGianKT(), entity.isTrangThai(), entity.getMaLSGD());
    }

    @Override
    public void delete(Integer id) {
        jdbc.update(SQL_DELETE, id);
    }

    @Override
    public LichSuGD selectById(Integer id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<LichSuGD> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }

    @Override
    protected List<LichSuGD> selectBySql(String sql, Object... args) {
        List<LichSuGD> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                int MaLSGD = rs.getInt(1);
                int MaHDCT = rs.getInt(2);
                Timestamp ThoiGianBD = rs.getTimestamp(3);
                Timestamp ThoiGianKT = rs.getTimestamp(4);
                boolean TrangThai = rs.getBoolean(5);
                ls.add(new LichSuGD(MaLSGD, MaHDCT, ThoiGianBD, ThoiGianKT, TrangThai));
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
