/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Timestamp;

/**
 *
 * @author ACER
 */
public class CaLam {

    int maCaLam;
    String TenCaLam;
    Timestamp ThoiGianDBHD;
    Timestamp ThoiGianKTHD;
    String GhiChu;

    public CaLam() {
    }

    public CaLam(int maCaLam, String TenCaLam, Timestamp ThoiGianDBHD, Timestamp ThoiGianKTHD, String GhiChu) {
        this.maCaLam = maCaLam;
        this.TenCaLam = TenCaLam;
        this.ThoiGianDBHD = ThoiGianDBHD;
        this.ThoiGianKTHD = ThoiGianKTHD;
        this.GhiChu = GhiChu;
    }

    public int getMaCaLam() {
        return maCaLam;
    }

    public void setMaCaLam(int maCaLam) {
        this.maCaLam = maCaLam;
    }

    public String getTenCaLam() {
        return TenCaLam;
    }

    public void setTenCaLam(String TenCaLam) {
        this.TenCaLam = TenCaLam;
    }

    public Timestamp getThoiGianDBHD() {
        return ThoiGianDBHD;
    }

    public void setThoiGianDBHD(Timestamp ThoiGianDBHD) {
        this.ThoiGianDBHD = ThoiGianDBHD;
    }

    public Timestamp getThoiGianKTHD() {
        return ThoiGianKTHD;
    }

    public void setThoiGianKTHD(Timestamp ThoiGianKTHD) {
        this.ThoiGianKTHD = ThoiGianKTHD;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    @Override
    public String toString() {
        return  TenCaLam;
    }

}
