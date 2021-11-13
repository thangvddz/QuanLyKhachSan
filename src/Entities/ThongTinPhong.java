/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 * cái này tạo ra phục vụ cho quản lý phòng nó join từ 2 bảng
 * @author you have to better
 */
public class ThongTinPhong {

    int MaPhong;
    int SoTang;
    int MaLP;
    double giaPhong;
    int SoGiuong;
    int MaTT;
    String TenLP;

    public ThongTinPhong() {
    }

    public ThongTinPhong(int MaPhong, int SoTang, int MaLP, double giaPhong, int SoGiuong, int MaTT, String TenLP) {
        this.MaPhong = MaPhong;
        this.SoTang = SoTang;
        this.MaLP = MaLP;
        this.giaPhong = giaPhong;
        this.SoGiuong = SoGiuong;
        this.MaTT = MaTT;
        this.TenLP = TenLP;
    }

    public int getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(int MaPhong) {
        this.MaPhong = MaPhong;
    }

    public int getSoTang() {
        return SoTang;
    }

    public void setSoTang(int SoTang) {
        this.SoTang = SoTang;
    }

    public int getMaLP() {
        return MaLP;
    }

    public void setMaLP(int MaLP) {
        this.MaLP = MaLP;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public int getSoGiuong() {
        return SoGiuong;
    }

    public void setSoGiuong(int SoGiuong) {
        this.SoGiuong = SoGiuong;
    }

    public int getMaTT() {
        return MaTT;
    }

    public void setMaTT(int MaTT) {
        this.MaTT = MaTT;
    }

    public String getTenLP() {
        return TenLP;
    }

    public void setTenLP(String TenLP) {
        this.TenLP = TenLP;
    }

}
