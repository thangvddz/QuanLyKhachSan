/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.LoaiThanhToan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class LoaiThanhToanDAO extends DAO<LoaiThanhToan, Integer> {

    private static final String SQL_INSERT = "INSERT INTO LOAITHANHTOAN(TenLoaiThanhToan, TrangThai) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE LOAITHANHTOAN SET TenLoaiThanhToan=?, TrangThai=? WHERE MaLoaiTT=?";
    private static final String SQL_SELECT_ALL = "select * from LOAITHANHTOAN";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM LOAITHANHTOAN WHERE MaLoaiTT=?";
    private static final String SQL_DELETE = "DELETE FROM LOAITHANHTOAN WHERE MaLoaiTT=?";

    JdbcHelper jdbc;

    public LoaiThanhToanDAO() {
        jdbc = new JdbcHelper();
    }

    @Override
    public void insert(LoaiThanhToan entity) {
        jdbc.update(SQL_INSERT, entity.getTenLoaiThanhToan(), entity.isTrangThai());
    }

    @Override
    public void update(LoaiThanhToan entity) {
        jdbc.update(SQL_UPDATE, entity.getTenLoaiThanhToan(), entity.isTrangThai(), entity.getLoaiThanhToan());
    }

    @Override
    public void delete(Integer id) {
        jdbc.update(SQL_DELETE, id);
    }

    @Override
    public LoaiThanhToan selectById(Integer id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<LoaiThanhToan> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }

    @Override
    protected List<LoaiThanhToan> selectBySql(String sql, Object... args) {
        List<LoaiThanhToan> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                int loaiThanhToan = rs.getInt(1);
                String TenLoaiThanhToan = rs.getString(2);
                boolean TrangThai = rs.getBoolean(3);
                ls.add(new LoaiThanhToan(loaiThanhToan, TenLoaiThanhToan, TrangThai));
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
