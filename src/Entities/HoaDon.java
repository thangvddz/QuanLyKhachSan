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
public class HoaDon {
    int MaHD; 
    int MaNV;
    int MaKH;
    Date ThoiDiemDatPhong;
    Date ThoiDiemTraPhong;
    double TienTraTruoc;
    String GhiChu;
    boolean TrangThai;

    public HoaDon() {
        
    }

    public HoaDon(int MaHD, int MaNV, int MaKH, Date ThoiDiemDatPhong, Date ThoiDiemTraPhong, double TienTraTruoc, String GhiChu, boolean TrangThai) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.ThoiDiemDatPhong = ThoiDiemDatPhong;
        this.ThoiDiemTraPhong = ThoiDiemTraPhong;
        this.TienTraTruoc = TienTraTruoc;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
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

    public double getTienTraTruoc() {
        return TienTraTruoc;
    }

    public void setTienTraTruoc(double TienTraTruoc) {
        this.TienTraTruoc = TienTraTruoc;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
    
}
