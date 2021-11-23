/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author you have to better
 */
public class LichSuGD {

    int MaLSGD;
    int MaHDCT;
    Timestamp ThoiGianBD;
    Timestamp ThoiGianKT;
    boolean TrangThai;

    public LichSuGD(int MaLSGD, int MaHDCT, Timestamp ThoiGianBD, Timestamp ThoiGianKT, boolean TrangThai) {
        this.MaLSGD = MaLSGD;
        this.MaHDCT = MaHDCT;
        this.ThoiGianBD = ThoiGianBD;
        this.ThoiGianKT = ThoiGianKT;
        this.TrangThai = TrangThai;
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

    public Timestamp getThoiGianBD() {
        return ThoiGianBD;
    }

    public void setThoiGianBD(Timestamp ThoiGianBD) {
        this.ThoiGianBD = ThoiGianBD;
    }

    public Timestamp getThoiGianKT() {
        return ThoiGianKT;
    }

    public void setThoiGianKT(Timestamp ThoiGianKT) {
        this.ThoiGianKT = ThoiGianKT;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
