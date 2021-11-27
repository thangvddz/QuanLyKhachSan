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
public class LoaiThanhToan {

    int loaiThanhToan;
    String TenLoaiThanhToan;
    boolean TrangThai;

    public LoaiThanhToan() {
    }

    public LoaiThanhToan(int loaiThanhToan, String TenLoaiThanhToan, boolean TrangThai) {
        this.loaiThanhToan = loaiThanhToan;
        this.TenLoaiThanhToan = TenLoaiThanhToan;
        this.TrangThai = TrangThai;
    }

    public int getLoaiThanhToan() {
        return loaiThanhToan;
    }

    public void setLoaiThanhToan(int loaiThanhToan) {
        this.loaiThanhToan = loaiThanhToan;
    }

    public String getTenLoaiThanhToan() {
        return TenLoaiThanhToan;
    }

    public void setTenLoaiThanhToan(String TenLoaiThanhToan) {
        this.TenLoaiThanhToan = TenLoaiThanhToan;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
