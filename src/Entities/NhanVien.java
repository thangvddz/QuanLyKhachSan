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
public class NhanVien {

    int MaNV;
    String HoTen;
    String SoCMT;
    boolean GioiTinh;
    String QueQuan;
    Date NgaySinh;
    Date NgayVaoLam;
    String SoDT;
    String Email;
    String username;
    String passwd;
    boolean VaiTro;
    boolean TrangThai;

    public NhanVien() {
    }

    public NhanVien(int MaNV, String HoTen, String SoCMT, boolean GioiTinh, String QueQuan, Date NgaySinh, Date NgayVaoLam, String SoDT, String Email, String username, String passwd, boolean VaiTro, boolean TrangThai) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.SoCMT = SoCMT;
        this.GioiTinh = GioiTinh;
        this.QueQuan = QueQuan;
        this.NgaySinh = NgaySinh;
        this.NgayVaoLam = NgayVaoLam;
        this.SoDT = SoDT;
        this.Email = Email;
        this.username = username;
        this.passwd = passwd;
        this.VaiTro = VaiTro;
        this.TrangThai = TrangThai;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSoCMT() {
        return SoCMT;
    }

    public void setSoCMT(String SoCMT) {
        this.SoCMT = SoCMT;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public Date getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(Date NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
