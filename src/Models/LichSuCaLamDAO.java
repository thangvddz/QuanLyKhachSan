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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ACER
 */
public class LichSuCaLamDAO extends DAO<LichSuCaLam, Object> {

    private static final String SQL_INSERT = "insert into LSCaLam(MaNV,TenCaLam,TienVaoDauCa,NgayLam,ThoiGianBD,TienMatLucVaoCa,GhiChu) values (?,?,?,?,?,?,?)";
    private static final String SQL_SELECT_BYTime = "select * from LSCaLam where MaNV = ? AND NgayLam = ?";
    private static final String SQL_SELECT_ALL = "select * from LSCaLam";
    
    public LichSuCaLam selectByTime(String MaNV, String NgayLam) {
        return selectBySql(SQL_SELECT_BYTime, MaNV, NgayLam).get(0);
    }

    @Override
    public void insert(LichSuCaLam entity) {
        JdbcHelper.update(SQL_INSERT,entity.getMaNV(),entity.getTenCaLam(),entity.getTienVaoDauCa(),entity.getNgayLam(),entity.getThoiGianDB(),entity.getTienMatLucVaoCa(),entity.getGhiChu());
    }

    @Override
    public void update(LichSuCaLam entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LichSuCaLam selectById(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                String TenCaLam = rs.getString(3);
                double TienVaoDauCa = rs.getDouble(4);
                double TienCuoiCa = rs.getDouble(5);
                Date NgayLam = rs.getDate(6);
                Time ThoiGianBD = rs.getTime(7);
                Time ThoiGianKT = rs.getTime(8);
                double TienMatLucVaoCa = rs.getDouble(9);
                String GhiChu = rs.getString(10);
                ls.add(new LichSuCaLam(MaLSCL, MaNV, TenCaLam, TienVaoDauCa, TienCuoiCa, NgayLam, ThoiGianBD,ThoiGianKT,TienMatLucVaoCa,GhiChu));
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
