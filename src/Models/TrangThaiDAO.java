/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.TrangThai;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrangThaiDAO extends DAO<TrangThai, Integer> {

    private static final String SQL_INSERT = "INSERT INTO TRANGTHAI(TenTT) VALUES(?)";
    private static final String SQL_UPDATE = "UPDATE TRANGTHAI SET TenTT=? WHERE MaTT=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM TRANGTHAI";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM TRANGTHAI WHERE MaTT=?";
    private static final String SQL_DELETE = "DELETE FROM TRANGTHAI WHERE MaTT=?";

    JdbcHelper jdbc;

    public TrangThaiDAO() {
        jdbc = new JdbcHelper();
    }

    @Override
    public void insert(TrangThai entity) {
        jdbc.update(SQL_INSERT, entity.getTenTrangThai());
    }

    @Override
    public void update(TrangThai entity) {
        jdbc.update(SQL_UPDATE, entity.getTenTrangThai(), entity.getMaTT());
    }

    @Override
    public void delete(Integer id) {
        jdbc.update(SQL_DELETE, id);
    }

    @Override
    public TrangThai selectById(Integer id) {
        return (TrangThai) selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<TrangThai> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }

    @Override
    protected List<TrangThai> selectBySql(String sql, Object... args) {
        List<TrangThai> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                int MaTT = rs.getInt(1);
                String TenTrangThai = rs.getString(2);
                ls.add(new TrangThai(MaTT, TenTrangThai));
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
