/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.DichVu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class DichVuDAO extends DAO<DichVu, Integer> {

    private static final String SQL_INSERT = "INSERT INTO DICHVU(TenDV, PhiDV, TrangThai) VALUES (?,?,?)";
    private static final String SQL_UPDATE = "UPDATE DICHVU SET TenDV=?, PhiDV=?, TrangThai=? WHERE MaDV=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM DICHVU";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM DICHVU WHERE MaDV=?";
    private static final String SQL_DELETE = "DELETE FROM DICHVU WHERE MaDV=?";

    JdbcHelper jdbc;

    public DichVuDAO() {
        jdbc = new JdbcHelper();
    }

    @Override
    public void insert(DichVu entity) {
        jdbc.update(SQL_INSERT, entity.getTenDV(), entity.getPhiDV(), entity.isTrangThai());
    }

    @Override
    public void update(DichVu entity) {
        jdbc.update(SQL_UPDATE, entity.getTenDV(), entity.getPhiDV(), entity.isTrangThai(), entity.getMaDV());
    }

    @Override
    public void delete(Integer id) {
        jdbc.update(SQL_DELETE, id);
    }

    @Override
    public DichVu selectById(Integer id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<DichVu> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }

    @Override
    protected List<DichVu> selectBySql(String sql, Object... args) {
        List<DichVu> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                int MaDV = rs.getInt(1);
                String TenDV = rs.getString(2);
                double PhiDV = rs.getDouble(3);
                boolean TrangThai = rs.getBoolean(4);
                ls.add(new DichVu(MaDV, TenDV, PhiDV, TrangThai));
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
