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
    String TenCaLam;
    double TienVaoDauCa;
    double TienCuoiCa;
    Date NgayLam;
    Time ThoiGianDB;
    Time ThoiGianKT;
    double TienMatLucVaoCa;
    String GhiChu;

    public LichSuCaLam() {
    }

    public LichSuCaLam(int MaLSCL, String MaNV, String TenCaLam, double TienVaoDauCa, double TienCuoiCa, Date NgayLam, Time ThoiGianDB, Time ThoiGianKT, double TienMatLucVaoCa, String GhiChu) {
        this.MaLSCL = MaLSCL;
        this.MaNV = MaNV;
        this.TenCaLam = TenCaLam;
        this.TienVaoDauCa = TienVaoDauCa;
        this.TienCuoiCa = TienCuoiCa;
        this.NgayLam = NgayLam;
        this.ThoiGianDB = ThoiGianDB;
        this.ThoiGianKT = ThoiGianKT;
        this.TienMatLucVaoCa = TienMatLucVaoCa;
        this.GhiChu = GhiChu;
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

    public String getTenCaLam() {
        return TenCaLam;
    }

    public void setTenCaLam(String TenCaLam) {
        this.TenCaLam = TenCaLam;
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

    public Date getNgayLam() {
        return NgayLam;
    }

    public void setNgayLam(Date NgayLam) {
        this.NgayLam = NgayLam;
    }

    public Time getThoiGianDB() {
        return ThoiGianDB;
    }

    public void setThoiGianDB(Time ThoiGianDB) {
        this.ThoiGianDB = ThoiGianDB;
    }

    public Time getThoiGianKT() {
        return ThoiGianKT;
    }

    public void setThoiGianKT(Time ThoiGianKT) {
        this.ThoiGianKT = ThoiGianKT;
    }

    public double getTienMatLucVaoCa() {
        return TienMatLucVaoCa;
    }

    public void setTienMatLucVaoCa(double TienMatLucVaoCa) {
        this.TienMatLucVaoCa = TienMatLucVaoCa;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    

    

    

    

    

}
