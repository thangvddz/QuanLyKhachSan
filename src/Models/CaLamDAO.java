/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.CaLam;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class CaLamDAO extends DAO<CaLam, String>{

    final String insert = "insert into CaLam(MaCaLam,ThoiGianDauVao,ThoiGianKetCa,TrangThai) values (?,?,?,?)";
    final String update = "update CaLam set ThoiGianDauVao = ?,ThoiGianKetCa = ?,TrangThai = ? where MaCaLam = ?";
    final String delete = "delete from CaLam where MaCaLam=? ";
    final String SELECT_ALL = "SELECT*FROM CaLam";
    final String SELECT_BY_MCL = "SELECT * FROM CaLam where MaCaLam = ?";

    @Override
    public void insert(CaLam entity) {
        JdbcHelper.update(insert,
                entity.getMaCaLam(),
                entity.getThoiDiemDauVao(),
                entity.getThoiDiemKetCa(),
                entity.getTrangThai());
    }

    @Override
    public void update(CaLam entity) {
        JdbcHelper.update(insert,
                entity.getMaCaLam(),
                entity.getThoiDiemDauVao(),
                entity.getThoiDiemKetCa(),
                entity.getTrangThai());
    }

    @Override
    public void delete(String id) {
        String sql = "delete from CaLam where MaCaLam = ? ";
        JdbcHelper.update(sql, id);
        JdbcHelper.update(delete, id);
    }

    @Override
    public CaLam selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CaLam> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<CaLam> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
