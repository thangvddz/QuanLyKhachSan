/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Timestamp;
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
    Timestamp ThoiGianBD;
    int maDV;

    public ChiTietPhongVaDichVu() {
    }

    public ChiTietPhongVaDichVu(String MaPhong, int SoTang, String TenDV, double PhiDV, Timestamp ThoiGianBD, int maDV) {
        this.MaPhong = MaPhong;
        this.SoTang = SoTang;
        this.TenDV = TenDV;
        this.PhiDV = PhiDV;
        this.ThoiGianBD = ThoiGianBD;
        this.maDV = maDV;
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

    public Timestamp getThoiGianBD() {
        return ThoiGianBD;
    }

    public void setThoiGianBD(Timestamp ThoiGianBD) {
        this.ThoiGianBD = ThoiGianBD;
    }

    public int getMaDV() {
        return maDV;
    }

    public void setMaDV(int maDV) {
        this.maDV = maDV;
    }

}
