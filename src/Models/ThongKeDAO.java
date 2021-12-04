package Models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoNgay() {
        String sql = "select SUM(ThanhTien) DoanhThu from HOADON where (DATEDIFF(DAY, ThoiDiemTraPhong,GETDATE()) <= 0)";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Integer> selectDoanhThuTheoThang() {
        String sql = "select SUM(ThanhTien) DoanhThu from HOADON where (DATEDIFF(DAY, ThoiDiemTraPhong,GETDATE()) <= 30)";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getLichSuGD() {
        String sql = "{CALL sp_LichSu}";
        String[] cols = {"NgayGD", "MaHD", "TenKH", "MaPhong", "TongTien", "HoTenNV"};
        return getListOfArray(sql, cols);
    }
    
    public List<Object[]> getLichSuGD1Ngay() {
        String sql = "{CALL sp_LichSuToday}";
        String[] cols = {"NgayGD", "MaHD", "TenKH", "MaPhong", "TongTien", "HoTenNV"};
        return getListOfArray(sql, cols);
    }
    
    public List<Object[]> getLichSuGD30Ngay() {
        String sql = "{CALL sp_LichSu30day}";
        String[] cols = {"NgayGD", "MaHD", "TenKH", "MaPhong", "TongTien", "HoTenNV"};
        return getListOfArray(sql, cols);
    }
    
    public List<Object[]> getDoanhThu(Integer nam){
        String sql = "{CALL sp_ThongKeNam(?)}";
        String[] cols = {"DoanhThu", "TongHoaDon", "TongSoKhach", "HoaDonThapNhat", "HoaDonCaoNhat", "HoaDonTrungBinh"};
        return getListOfArray(sql, cols, nam);
    }

}
