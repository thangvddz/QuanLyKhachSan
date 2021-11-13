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
public class TrangThai {
    int MaTT;
    String TenTrangThai;

    public TrangThai() {
    }

    public TrangThai(int MaTT, String TenTrangThai) {
        this.MaTT = MaTT;
        this.TenTrangThai = TenTrangThai;
    }

    public int getMaTT() {
        return MaTT;
    }

    public void setMaTT(int MaTT) {
        this.MaTT = MaTT;
    }

    public String getTenTrangThai() {
        return TenTrangThai;
    }

    public void setTenTrangThai(String TenTrangThai) {
        this.TenTrangThai = TenTrangThai;
    }
    
    
}
