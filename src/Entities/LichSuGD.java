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
public class LichSuGD {

    int MaLSGD;
    int MaHDCT;
    Date ThoiGianBD;
    Date ThoiGianKT;
    boolean TrangThai;

    public LichSuGD(int MaLSGD, int MaHDCT, Date ThoiGianBD, Date ThoiGianKT, boolean TrangThai) {
        this.MaLSGD = MaLSGD;
        this.MaHDCT = MaHDCT;
        this.ThoiGianBD = ThoiGianBD;
        this.ThoiGianKT = ThoiGianKT;
        this.TrangThai = TrangThai;
    }

    public LichSuGD() {
    }

    public int getMaLSGD() {
        return MaLSGD;
    }

    public void setMaLSGD(int MaLSGD) {
        this.MaLSGD = MaLSGD;
    }

    public int getMaHDCT() {
        return MaHDCT;
    }

    public void setMaHDCT(int MaHDCT) {
        this.MaHDCT = MaHDCT;
    }

    public Date getThoiGianBD() {
        return ThoiGianBD;
    }

    public void setThoiGianBD(Date ThoiGianBD) {
        this.ThoiGianBD = ThoiGianBD;
    }

    public Date getThoiGianKT() {
        return ThoiGianKT;
    }

    public void setThoiGianKT(Date ThoiGianKT) {
        this.ThoiGianKT = ThoiGianKT;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
