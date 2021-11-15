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

    int MaCTHD;
    int MaHD;
    String MaPhong;
    int SoTang;
    Date NgayDK;
    boolean TrangThai;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int MaCTHD, int MaHD, String MaPhong, int SoTang, Date NgayDK, boolean TrangThai) {
        this.MaCTHD = MaCTHD;
        this.MaHD = MaHD;
        this.MaPhong = MaPhong;
        this.SoTang = SoTang;
        this.NgayDK = NgayDK;
        this.TrangThai = TrangThai;
    }

    public int getMaCTHD() {
        return MaCTHD;
    }

    public void setMaCTHD(int MaCTHD) {
        this.MaCTHD = MaCTHD;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
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

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
