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
public class Phong {

    String maPhong;
    int soTang;
    int maLoaiPhong;
    int maTT;
    String GhiChu;

    public Phong() {
    }

    public Phong(String maPhong, int soTang, int maLoaiPhong, int maTT, String GhiChu) {
        this.maPhong = maPhong;
        this.soTang = soTang;
        this.maLoaiPhong = maLoaiPhong;
        this.maTT = maTT;
        this.GhiChu = GhiChu;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public int getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public void setMaLoaiPhong(int maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    public int getMaTT() {
        return maTT;
    }

    public void setMaTT(int maTT) {
        this.maTT = maTT;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

}
