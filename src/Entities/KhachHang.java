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
public class KhachHang {

    int maKH;
    String soCMT;
    String HoTen;
    String soHoChieu;
    String soDT;
    Date ngaySinh;
    String QueQuan;
    boolean gioiTinh;

    public KhachHang() {
    }

    public KhachHang(int maKH, String soCMT, String HoTen, String soHoChieu, String soDT, Date ngaySinh, String QueQuan, boolean gioiTinh) {
        this.maKH = maKH;
        this.soCMT = soCMT;
        this.HoTen = HoTen;
        this.soHoChieu = soHoChieu;
        this.soDT = soDT;
        this.ngaySinh = ngaySinh;
        this.QueQuan = QueQuan;
        this.gioiTinh = gioiTinh;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSoHoChieu() {
        return soHoChieu;
    }

    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
