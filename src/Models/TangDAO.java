/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.Tang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class TangDAO extends DAO<Tang, Integer>{

    private static final String SQL_INSERT = "INSERT INTO TANG(GhiChu,TrangThai) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE TANG SET GhiChu=?, TrangThai=? WHERE SoTang=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM TANG";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM Phong WHERE SoTang=?";
    private static final String SQL_DELETE = "DELETE FROM PHONG WHERE SoTang=?";

    JdbcHelper jdbc;
    
    public TangDAO() {
        jdbc = new JdbcHelper();
    }
    
    @Override
    public void insert(Tang entity) {
        jdbc.update(SQL_INSERT, entity.getGhiChu(), entity.isTrangThai());
    }

    @Override
    public void update(Tang entity) {
        jdbc.update(SQL_UPDATE, entity.getGhiChu(), entity.isTrangThai(), entity.getTang());
    }

    @Override
    public void delete(Integer id) {
        jdbc.update(SQL_DELETE, id);
    }

    @Override
    public Tang selectById(Integer id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<Tang> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }

    @Override
    protected List<Tang> selectBySql(String sql, Object... args) {
        List<Tang> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                int tang = rs.getInt(1);
                String ghiChu = rs.getString(2);
                boolean trangThai=  rs.getBoolean(3);
                ls.add(new Tang(tang, ghiChu, trangThai));
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
