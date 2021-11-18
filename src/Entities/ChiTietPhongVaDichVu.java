/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author you have to better
 */
public class ChiTietPhongVaDichVu {

    String MaPhong;
    int SoTang;
    String TenDV;
    double PhiDV;
    Date ThoiGianBD;
    Date ThoiDiemDatPhong;
    Date ThoiDiemTraPhong;

    public ChiTietPhongVaDichVu() {
    }

    public ChiTietPhongVaDichVu(String MaPhong, int SoTang, String TenDV, double PhiDV, Date ThoiGianBD, Date ThoiDiemDatPhong, Date ThoiDiemTraPhong) {
        this.MaPhong = MaPhong;
        this.SoTang = SoTang;
        this.TenDV = TenDV;
        this.PhiDV = PhiDV;
        this.ThoiGianBD = ThoiGianBD;
        this.ThoiDiemDatPhong = ThoiDiemDatPhong;
        this.ThoiDiemTraPhong = ThoiDiemTraPhong;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public int getSoTang() {
        return SoTang;
    }

    public void setSoTang(int SoTang) {
        this.SoTang = SoTang;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public double getPhiDV() {
        return PhiDV;
    }

    public void setPhiDV(double PhiDV) {
        this.PhiDV = PhiDV;
    }

    public Date getThoiGianBD() {
        return ThoiGianBD;
    }

    public void setThoiGianBD(Date ThoiGianBD) {
        this.ThoiGianBD = ThoiGianBD;
    }

    public Date getThoiDiemDatPhong() {
        return ThoiDiemDatPhong;
    }

    public void setThoiDiemDatPhong(Date ThoiDiemDatPhong) {
        this.ThoiDiemDatPhong = ThoiDiemDatPhong;
    }

    public Date getThoiDiemTraPhong() {
        return ThoiDiemTraPhong;
    }

    public void setThoiDiemTraPhong(Date ThoiDiemTraPhong) {
        this.ThoiDiemTraPhong = ThoiDiemTraPhong;
    }

}
