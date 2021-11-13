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
public class HoaDonChiTiet {
    int MaHD;
    int MaDV;
    String MaPhong;
    int SoTang;
    Date NgayDK;
    Date ThoiGianBDSD;
    int SoLanSuDung;
    boolean TrangThai;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int MaHD, int MaDV, String MaPhong, int SoTang, Date NgayDK, Date ThoiGianBDSD, int SoLanSuDung, boolean TrangThai) {
        this.MaHD = MaHD;
        this.MaDV = MaDV;
        this.MaPhong = MaPhong;
        this.SoTang = SoTang;
        this.NgayDK = NgayDK;
        this.ThoiGianBDSD = ThoiGianBDSD;
        this.SoLanSuDung = SoLanSuDung;
        this.TrangThai = TrangThai;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getMaDV() {
        return MaDV;
    }

    public void setMaDV(int MaDV) {
        this.MaDV = MaDV;
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

    public Date getNgayDK() {
        return NgayDK;
    }

    public void setNgayDK(Date NgayDK) {
        this.NgayDK = NgayDK;
    }

    public Date getThoiGianBDSD() {
        return ThoiGianBDSD;
    }

    public void setThoiGianBDSD(Date ThoiGianBDSD) {
        this.ThoiGianBDSD = ThoiGianBDSD;
    }

    public int getSoLanSuDung() {
        return SoLanSuDung;
    }

    public void setSoLanSuDung(int SoLanSuDung) {
        this.SoLanSuDung = SoLanSuDung;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    
}
