/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author you have to better
 */
public class DichVu {

    int MaDV;
    String TenDV;
    double PhiDV;
    boolean TrangThai;

    public DichVu() {
    }

    public DichVu(int MaDV, String TenDV, double PhiDV, boolean TrangThai) {
        this.MaDV = MaDV;
        this.TenDV = TenDV;
        this.PhiDV = PhiDV;
        this.TrangThai = TrangThai;
    }

    public int getMaDV() {
        return MaDV;
    }

    public void setMaDV(int MaDV) {
        this.MaDV = MaDV;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public double getPhiDV() {
        return PhiDV;
    }

    public void setPhiDV(double PhiDV) {
        this.PhiDV = PhiDV;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
