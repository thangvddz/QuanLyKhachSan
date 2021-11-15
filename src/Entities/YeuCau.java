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
public class YeuCau {

    int maDV;
    int maHDCT;
    Date ThoiGianBDSD;
    boolean TrangThai;

    public YeuCau() {
    }

    public YeuCau(int maDV, int maHDCT, Date ThoiGianBDSD, boolean TrangThai) {
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

    public Date getThoiGianBDSD() {
        return ThoiGianBDSD;
    }

    public void setThoiGianBDSD(Date ThoiGianBDSD) {
        this.ThoiGianBDSD = ThoiGianBDSD;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
