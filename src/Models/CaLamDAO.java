/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.CaLam;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class CaLamDAO extends DAO<CaLam, Integer> {

    private static final String SQL_INSERT = "insert into CaLam(TenCaLam,ThoiGianBDHD,ThoiGianKTHD,GhiChu) values (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE CaLam SET TenCaLam=?,ThoiGianBDHD=?,ThoiGianKTHD=?,GhiChu=? WHERE MaCaLam=?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM CaLam";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM CaLam WHERE MaCaLam=?";
    private static final String SQL_DELETE = "DELETE FROM CaLam WHERE MaCaLam=?";

    @Override
    public void insert(CaLam entity) {
        JdbcHelper.update(SQL_INSERT,
                entity.getTenCaLam(),
                entity.getThoiGianDBHD(),
                entity.getThoiGianKTHD(),
                entity.getGhiChu());
    }

    @Override
    public void update(CaLam entity) {
        JdbcHelper.update(SQL_UPDATE,
                entity.getTenCaLam(),
                entity.getThoiGianDBHD(),
                entity.getThoiGianKTHD(),
                entity.getGhiChu(),
                entity.getMaCaLam());
    }

    @Override
    public void delete(Integer id) {
        JdbcHelper.update(SQL_DELETE, id);
    }

    @Override
    public CaLam selectById(Integer id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<CaLam> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }

    @Override
    protected List<CaLam> selectBySql(String sql, Object... args) {
        List<CaLam> ls = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);

            while (rs.next()) {
                int maCaLam = rs.getInt(1);
                String TenCaLAM = rs.getString(2);
                Timestamp ThoiGianBDHD = rs.getTimestamp(3);
                Timestamp ThoiGianKTHD = rs.getTimestamp(4);
                String GhiChu = rs.getString(5);
                ls.add(new CaLam(maCaLam, TenCaLAM, ThoiGianBDHD, ThoiGianKTHD, GhiChu));
            }
        } catch (SQLException ex) {
            System.out.println("Error selectbySQL in CaLamDao");
            ex.printStackTrace();
        }
        if (ls.isEmpty()) {
            return null;
        }
        return ls;
    }

}
