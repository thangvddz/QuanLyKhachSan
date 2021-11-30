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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class CaLamDAO extends DAO<CaLam, String> {

    final String insert = "insert into CaLam(TenCaLam,ThoiGianBDHD,ThoiGianKTHD,GhiChu) values (?,?,?,?)";
    final String update = "update CaLam set ThoiGianBDHD = ?,ThoiGianKTHD = ?,GhiChu = ? where TenCaLam = ?";
    final String delete = "delete from CaLam where TenCaLam=? ";
    final String SELECT_ALL = "select * from CaLam";
    final String SELECT_BY_MCL = "SELECT * FROM CaLam where TenCaLam = ?";

    @Override
    public void insert(CaLam entity) {
        JdbcHelper.update(insert,
                entity.getTenCaLam(),
                entity.getThoiGianDBHD(),
                entity.getThoiGianKTHD(),
                entity.getGhiChu());
    }

    @Override
    public void update(CaLam entity) {
        JdbcHelper.update(insert,
                entity.getTenCaLam(),
                entity.getThoiGianDBHD(),
                entity.getThoiGianKTHD(),
                entity.getGhiChu());
    }

    @Override
    public void delete(String id) {
        String sql = "delete from CaLam where TenCaLam = ? ";
        JdbcHelper.update(sql, id);
        JdbcHelper.update(delete, id);
    }

    @Override
    public CaLam selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CaLam> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    protected List<CaLam> selectBySql(String sql, Object... args) {
        List<CaLam> ls = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);

            while (rs.next()) {
                String TenCaLAM = rs.getString(1);
                Time ThoiGianBDHD = rs.getTime(2);
                Time ThoiGianKTHD = rs.getTime(3);
                String GhiChu = rs.getString(4);
                ls.add(new CaLam(TenCaLAM, ThoiGianBDHD, ThoiGianKTHD, GhiChu));
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
