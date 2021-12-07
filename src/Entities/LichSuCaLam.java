/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author ACER
 */
public class LichSuCaLam {

    int MaLSCL;
    String MaNV;
    int MaCaLam;
    double TienVaoDauCa;
    double TienCuoiCa;
    Timestamp ThoiGianBD;
    Timestamp ThoiGianKT;
    double TienThucNhan;
    double TienThucThu;
    String GhiChuNhan;
    String GhiChuThu;
    boolean TrangThai;

    public LichSuCaLam() {
    }

    public LichSuCaLam(int MaLSCL, String MaNV, int MaCaLam, double TienVaoDauCa, double TienCuoiCa, Timestamp ThoiGianBD, Timestamp ThoiGianKT, double TienThucNhan, double TienThucThu, String GhiChuNhan, String GhiChuThu, boolean TrangThai) {
        this.MaLSCL = MaLSCL;
        this.MaNV = MaNV;
        this.MaCaLam = MaCaLam;
        this.TienVaoDauCa = TienVaoDauCa;
        this.TienCuoiCa = TienCuoiCa;
        this.ThoiGianBD = ThoiGianBD;
        this.ThoiGianKT = ThoiGianKT;
        this.TienThucNhan = TienThucNhan;
        this.TienThucThu = TienThucThu;
        this.GhiChuNhan = GhiChuNhan;
        this.GhiChuThu = GhiChuThu;
        this.TrangThai = TrangThai;
    }

    public LichSuCaLam(LichSuCaLam lichSuCuoi) {
    }

    public int getMaLSCL() {
        return MaLSCL;
    }

    public void setMaLSCL(int MaLSCL) {
        this.MaLSCL = MaLSCL;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getMaCaLam() {
        return MaCaLam;
    }

    public void setMaCaLam(int MaCaLam) {
        this.MaCaLam = MaCaLam;
    }

    public double getTienVaoDauCa() {
        return TienVaoDauCa;
    }

    public void setTienVaoDauCa(double TienVaoDauCa) {
        this.TienVaoDauCa = TienVaoDauCa;
    }

    public double getTienCuoiCa() {
        return TienCuoiCa;
    }

    public void setTienCuoiCa(double TienCuoiCa) {
        this.TienCuoiCa = TienCuoiCa;
    }

    public Timestamp getThoiGianBD() {
        return ThoiGianBD;
    }

    public void setThoiGianBD(Timestamp ThoiGianBD) {
        this.ThoiGianBD = ThoiGianBD;
    }

    public Timestamp getThoiGianKT() {
        return ThoiGianKT;
    }

    public void setThoiGianKT(Timestamp ThoiGianKT) {
        this.ThoiGianKT = ThoiGianKT;
    }

    public double getTienThucNhan() {
        return TienThucNhan;
    }

    public void setTienThucNhan(double TienThucNhan) {
        this.TienThucNhan = TienThucNhan;
    }

    public double getTienThucThu() {
        return TienThucThu;
    }

    public void setTienThucThu(double TienThucThu) {
        this.TienThucThu = TienThucThu;
    }

    public String getGhiChuNhan() {
        return GhiChuNhan;
    }

    public void setGhiChuNhan(String GhiChuNhan) {
        this.GhiChuNhan = GhiChuNhan;
    }

    public String getGhiChuThu() {
        return GhiChuThu;
    }

    public void setGhiChuThu(String GhiChuThu) {
        this.GhiChuThu = GhiChuThu;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
