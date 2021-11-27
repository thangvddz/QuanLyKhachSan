/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Timestamp;

/**
 *
 * @author you have to better
 */
public class ThanhToan {

    int MaHD;
    int MaLoaiTT;
    Timestamp ThoiGianThanhToan;
    String GhiChu;

    public ThanhToan() {
    }

    public ThanhToan(int MaHD, int MaLoaiTT, Timestamp ThoiGianThanhToan, String GhiChu) {
        this.MaHD = MaHD;
        this.MaLoaiTT = MaLoaiTT;
        this.ThoiGianThanhToan = ThoiGianThanhToan;
        this.GhiChu = GhiChu;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getMaLoaiTT() {
        return MaLoaiTT;
    }

    public void setMaLoaiTT(int MaLoaiTT) {
        this.MaLoaiTT = MaLoaiTT;
    }

    public Timestamp getThoiGianThanhToan() {
        return ThoiGianThanhToan;
    }

    public void setThoiGianThanhToan(Timestamp ThoiGianThanhToan) {
        this.ThoiGianThanhToan = ThoiGianThanhToan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

}
