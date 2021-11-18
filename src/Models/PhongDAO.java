/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.Phong;
import Entities.ThongTinPhong;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author you have to better
 */
public class PhongDAO extends DAO<Phong, Integer> {

    private static final String SQL_INSERT = "INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE PHONG SET MaLP=?, MaTT=?, GhiChu=? WHERE MaPhong=? AND SoTang=?";
    private static final String SQL_UPDATE_TT = "UPDATE PHONG SET MaTT=? WHERE MaPhong=? AND SoTang=?";
    private static final String SQL_UPDATE_STATUS_3 = "UPDATE PHONG SET MaTT=1 WHERE MaTT=3";
    private static final String SQL_SELECT_ALL = "SELECT * FROM PHONG";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM PHONG WHERE MaPhong=? AND SoTang=?";
    private static final String SQL_DELETE = "DELETE FROM PHONG WHERE MaPhong=? AND SoTang=?";
    private static final String SQL_NUMBER_ROOM_PER_FLOOR = "select TANG.SoTang, COUNT(PHONG.SoTang) as so_tang from TANG join PHONG on TANG.SoTang = PHONG.SoTang group by TANG.SoTang";
    private static final String SQL_ROOMCODE_PER_FLOOR = "select * from PHONG where SoTang = ?";
    private static final String SQL_SELECT_THONGTINPHONG_BY_ID = "select MaPhong, PHONG.SoTang, PHONG.MaLP, TenLP, giaPhong, SoGiuong, PHONG.MaTT "
            + "from LOAIPHONG join PHONG on LOAIPHONG.MaLP = PHONG.MaLP join TANG on PHONG.SoTang = TANG.SoTang where MaPhong=? and PHONG.SoTang=?";
    private static final String SQL_SELECT_BY_STATUS = "SELECT * FROM PHONG WHERE MaTT=?";

    JdbcHelper jdbc;

    public PhongDAO() {
        jdbc = new JdbcHelper();
    }

    @Override
    public void insert(Phong entity) {
        jdbc.update(SQL_INSERT, entity.getMaPhong(), entity.getMaLoaiPhong(), entity.getSoTang(), entity.getMaTT(), entity.getGhiChu());
    }

    @Override
    public void update(Phong entity) {
        jdbc.update(SQL_UPDATE, entity.getMaLoaiPhong(), entity.getMaTT(), entity.getGhiChu(), entity.getMaPhong(), entity.getSoTang());
    }
    
    public void updateMaTT(Phong entity) {
        jdbc.update(SQL_UPDATE_TT, entity.getMaTT(), entity.getMaPhong(), entity.getSoTang());
    }
    
    public void updateMaTT3() {
        jdbc.update(SQL_UPDATE_STATUS_3);
    }

    @Override
    public void delete(Integer id) {
//        jdbc.update(SQL_DELETE, id);
    }
    
    public void deletePhong(Integer idTang, Integer idPhong){
        jdbc.update(SQL_DELETE, idPhong, idTang);
    }

    @Override
    public Phong selectById(Integer id) {
        return selectBySql(SQL_SELECT_BY_ID, id).get(0);
    }
    
    public Phong selectByIdd(int soTang, String soPhong) {
        return selectBySql(SQL_SELECT_BY_ID, soPhong, soTang).get(0);
    }

    @Override
    public List<Phong> selectAll() {
        return selectBySql(SQL_SELECT_ALL);
    }

    public List<Phong> selectByMaTT(Integer id) {
        return selectBySql(SQL_SELECT_BY_STATUS, id);
    }
    
    @Override
    protected List<Phong> selectBySql(String sql, Object... args) {
        List<Phong> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);

            while (rs.next()) {
                String maPhong = rs.getString(1);
                int loaiPhong = rs.getInt(2);
                int soTang = rs.getInt(3);
                int MaTT = rs.getInt(4);
                String GhiChu = rs.getString(5);
                ls.add(new Phong(maPhong, soTang, loaiPhong, MaTT, GhiChu));
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

    /**
     * Lay so Phong co tren moi tang
     *
     * @return list
     */
    public List<Integer> RoomPerFloor() {
        List<Integer> ls = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(SQL_NUMBER_ROOM_PER_FLOOR);
            while (rs.next()) {
                int num = rs.getInt(2);
                ls.add(num);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ls.isEmpty()) {
            return null;
        }
        return ls;
    }

    /**
     * lay mang ma so phong tren moi tang
     *
     * @param tang
     * @return List
     */
    public List<Phong> RoomCodePerFloor(Integer tang) {
        return selectBySql(SQL_ROOMCODE_PER_FLOOR, tang);
    }

    /**
     *
     * @param maP
     * @param soT
     * @return
     */
    public ThongTinPhong selectDetailById(Integer maP, Integer soT) {
        ThongTinPhong thongTin = null;
        try {
            ResultSet rs = jdbc.query(SQL_SELECT_THONGTINPHONG_BY_ID, maP, soT);

            while (rs.next()) {
                int maPhong = rs.getInt(1);
                int soTang = rs.getInt(2);
                int loaiPhong = rs.getInt(3);
                String tenLP = rs.getString(4);
                double giaPhong = rs.getDouble(5);
                int soGiuong = rs.getInt(6);
                int MaTT = rs.getInt(7);

                thongTin = new ThongTinPhong(maPhong, soTang, loaiPhong, giaPhong, soGiuong, MaTT, tenLP);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return thongTin;
    }
}
