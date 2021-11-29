/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;

/**
 *
 * @author you have to better
 */
public class Config implements Serializable{

    int gioChkIn;
    int phutChkIn;
    int gioChkOut;
    int phutChkOut;

    public Config() {
    }

    public Config(int gioChkIn, int phutChkIn, int gioChkOut, int phutChkOut) {
        this.gioChkIn = gioChkIn;
        this.phutChkIn = phutChkIn;
        this.gioChkOut = gioChkOut;
        this.phutChkOut = phutChkOut;
    }

    public int getGioChkIn() {
        return gioChkIn;
    }

    public void setGioChkIn(int gioChkIn) {
        this.gioChkIn = gioChkIn;
    }

    public int getPhutChkIn() {
        return phutChkIn;
    }

    public void setPhutChkIn(int phutChkIn) {
        this.phutChkIn = phutChkIn;
    }

    public int getGioChkOut() {
        return gioChkOut;
    }

    public void setGioChkOut(int gioChkOut) {
        this.gioChkOut = gioChkOut;
    }

    public int getPhutChkOut() {
        return phutChkOut;
    }

    public void setPhutChkOut(int phutChkOut) {
        this.phutChkOut = phutChkOut;
    }

    @Override
    public String toString() {
        return "Config{" + "gioChkIn=" + gioChkIn + ", phutChkIn=" + phutChkIn + ", gioChkOut=" + gioChkOut + ", phutChkOut=" + phutChkOut + '}';
    }

}
