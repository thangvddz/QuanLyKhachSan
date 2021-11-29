/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author you have to better
 */
public class LoaiPhong {

    int MaLP;
    String TenLP;
    int SoGiuong;
    double giaGio;
    double GiaNgay;

    public LoaiPhong() {
    }

    public LoaiPhong(int MaLP, String TenLP, int SoGiuong, double giaGio, double GiaNgay) {
        this.MaLP = MaLP;
        this.TenLP = TenLP;
        this.SoGiuong = SoGiuong;
        this.giaGio = giaGio;
        this.GiaNgay = GiaNgay;
    }

    public int getMaLP() {
        return MaLP;
    }

    public void setMaLP(int MaLP) {
        this.MaLP = MaLP;
    }

    public String getTenLP() {
        return TenLP;
    }

    public void setTenLP(String TenLP) {
        this.TenLP = TenLP;
    }

    public int getSoGiuong() {
        return SoGiuong;
    }

    public void setSoGiuong(int SoGiuong) {
        this.SoGiuong = SoGiuong;
    }

    public double getGiaGio() {
        return giaGio;
    }

    public void setGiaGio(double giaGio) {
        this.giaGio = giaGio;
    }

    public double getGiaNgay() {
        return GiaNgay;
    }

    public void setGiaNgay(double GiaNgay) {
        this.GiaNgay = GiaNgay;
    }

    @Override
    public String toString() {
        return TenLP;
    }

}
