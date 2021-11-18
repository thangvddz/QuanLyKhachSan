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
public class ThongTinPhongDaThue {

    String maPhong;
    int soTang;
    int soLanYC;

    public ThongTinPhongDaThue() {
    }

    public ThongTinPhongDaThue(String maPhong, int soTang, int soLanYC) {
        this.maPhong = maPhong;
        this.soTang = soTang;
        this.soLanYC = soLanYC;
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

    public int getSoLanYC() {
        return soLanYC;
    }

    public void setSoLanYC(int soLanYC) {
        this.soLanYC = soLanYC;
    }

}
