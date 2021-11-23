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
public class YeuCau {

    int maDV;
    int maHDCT;
    Timestamp ThoiGianBDSD;
    boolean TrangThai;

    public YeuCau() {
    }

    public YeuCau(int maDV, int maHDCT, Timestamp ThoiGianBDSD, boolean TrangThai) {
        this.maDV = maDV;
        this.maHDCT = maHDCT;
        this.ThoiGianBDSD = ThoiGianBDSD;
        this.TrangThai = TrangThai;
    }


    public int getMaDV() {
        return maDV;
    }

    public void setMaDV(int maDV) {
        this.maDV = maDV;
    }

    public int getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(int maHDCT) {
        this.maHDCT = maHDCT;
    }

    public Timestamp getThoiGianBDSD() {
        return ThoiGianBDSD;
    }

    public void setThoiGianBDSD(Timestamp ThoiGianBDSD) {
        this.ThoiGianBDSD = ThoiGianBDSD;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
