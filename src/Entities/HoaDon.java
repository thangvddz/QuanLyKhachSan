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
public class HoaDon {

    int MaHD;
    String MaNV;
    int MaKH;
    Timestamp ThoiDiemDatPhong;
    Timestamp ThoiDiemTraPhong;
    double TienTraTruoc;
    double GiamGia;
    double PhuThu;
    double ThanhTien;
    String GhiChu;
    boolean TrangThai;

    public HoaDon() {

    }

    public HoaDon(int MaHD, String MaNV, int MaKH, Timestamp ThoiDiemDatPhong, Timestamp ThoiDiemTraPhong, double TienTraTruoc, double GiamGia, double PhuThu, double ThanhTien, String GhiChu, boolean TrangThai) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.ThoiDiemDatPhong = ThoiDiemDatPhong;
        this.ThoiDiemTraPhong = ThoiDiemTraPhong;
        this.TienTraTruoc = TienTraTruoc;
        this.GiamGia = GiamGia;
        this.PhuThu = PhuThu;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public Timestamp getThoiDiemDatPhong() {
        return ThoiDiemDatPhong;
    }

    public void setThoiDiemDatPhong(Timestamp ThoiDiemDatPhong) {
        this.ThoiDiemDatPhong = ThoiDiemDatPhong;
    }

    public Timestamp getThoiDiemTraPhong() {
        return ThoiDiemTraPhong;
    }

    public void setThoiDiemTraPhong(Timestamp ThoiDiemTraPhong) {
        this.ThoiDiemTraPhong = ThoiDiemTraPhong;
    }

    public double getTienTraTruoc() {
        return TienTraTruoc;
    }

    public void setTienTraTruoc(double TienTraTruoc) {
        this.TienTraTruoc = TienTraTruoc;
    }

    public double getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(double GiamGia) {
        this.GiamGia = GiamGia;
    }

    public double getPhuThu() {
        return PhuThu;
    }

    public void setPhuThu(double PhuThu) {
        this.PhuThu = PhuThu;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
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
