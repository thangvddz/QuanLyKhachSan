/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Time;

/**
 *
 * @author ACER
 */
public class CaLam {
    String TenCaLam;
    Time ThoiGianDBHD;
    Time ThoiGianKTHD;
    String GhiChu;

    public CaLam() {
    }

    public CaLam(String TenCaLam, Time ThoiGianDBHD, Time ThoiGianKTHD, String GhiChu) {
        this.TenCaLam = TenCaLam;
        this.ThoiGianDBHD = ThoiGianDBHD;
        this.ThoiGianKTHD = ThoiGianKTHD;
        this.GhiChu = GhiChu;
    }

    public String getTenCaLam() {
        return TenCaLam;
    }

    public void setTenCaLam(String TenCaLam) {
        this.TenCaLam = TenCaLam;
    }

    public Time getThoiGianDBHD() {
        return ThoiGianDBHD;
    }

    public void setThoiGianDBHD(Time ThoiGianDBHD) {
        this.ThoiGianDBHD = ThoiGianDBHD;
    }

    public Time getThoiGianKTHD() {
        return ThoiGianKTHD;
    }

    public void setThoiGianKTHD(Time ThoiGianKTHD) {
        this.ThoiGianKTHD = ThoiGianKTHD;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    
    
}
