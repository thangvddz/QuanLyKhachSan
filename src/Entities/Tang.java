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
public class Tang {
    int Tang;
    String ghiChu;
    boolean trangThai;

    public Tang() {
    }

    public Tang(int Tang, String ghiChu, boolean trangThai) {
        this.Tang = Tang;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
    }

    public int getTang() {
        return Tang;
    }

    public void setTang(int Tang) {
        this.Tang = Tang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
