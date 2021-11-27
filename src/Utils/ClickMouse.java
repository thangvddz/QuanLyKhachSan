/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Entities.Phong;
import Forms.DatTraPhongJFrame;
import Forms.DatTraPhongPanel;
import Forms.HomePanel;
import Forms.ManHinhChinhGUI;
import Forms.ThemPhongJframe;
import Models.PhongDAO;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.print.attribute.DateTimeSyntax;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author you have to better
 */
public class ClickMouse {

    public static PhongDAO phongDAO = new PhongDAO();

    public static class MouseClikXemThongTin extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent me) {
            JPanel title = (JPanel) me.getSource();
            MapRoom.posTang = (int) title.getClientProperty("Tang");
            MapRoom.posPhong = (String) title.getClientProperty("Phong");
            MapRoom.maKH = (int) title.getClientProperty("MaKH");
            System.out.println("tang:" + MapRoom.posTang + ", phong:" + MapRoom.posPhong + ", maKH: " + MapRoom.maKH);
            MapRoom.posStatus = phongDAO.selectByIdd(MapRoom.posTang, MapRoom.posPhong).getMaTT();
            if (MapRoom.posStatus == 5) {
                phongDAO.updateMaTT(new Phong(MapRoom.posPhong, MapRoom.posTang, -1, 1, null));
                HomePanel h = new HomePanel();
                ManHinhChinhGUI.SwitchPanel(h);
            } else {
                DatTraPhongJFrame jf = new DatTraPhongJFrame();
                jf.setVisible(true);
            }

        }

        @Override
        public void mouseEntered(MouseEvent me) {
            JPanel title = (JPanel) me.getSource();
            MapRoom.colorRoom = title.getBackground();
            changeColor(title);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            JPanel title = (JPanel) me.getSource();
            resetColor(title);
        }
    }
    
    public static class MouseClikQuanLyPhong extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent me) {
            JPanel title = (JPanel) me.getSource();
            MapRoom.posTang = (int) title.getClientProperty("Tang");
            MapRoom.posPhong = (String) title.getClientProperty("Phong");
            MapRoom.maKH = (int) title.getClientProperty("MaKH");
            System.out.println("tang:" + MapRoom.posTang + ", phong:" + MapRoom.posPhong + ", maKH: " + MapRoom.maKH);
            MapRoom.posStatus = phongDAO.selectByIdd(MapRoom.posTang, MapRoom.posPhong).getMaTT();
//            if (MapRoom.posStatus == 5) {
//                phongDAO.updateMaTT(new Phong(MapRoom.posPhong, MapRoom.posTang, -1, 1, null));
//                HomePanel h = new HomePanel();
//                ManHinhChinhGUI.SwitchPanel(h);
//            } else {
//                DatTraPhongJFrame jf = new DatTraPhongJFrame();
//                jf.setVisible(true);
//            }

        }

        @Override
        public void mouseEntered(MouseEvent me) {
            JPanel title = (JPanel) me.getSource();
            MapRoom.colorRoom = title.getBackground();
            changeColor(title);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            JPanel title = (JPanel) me.getSource();
            resetColor(title);
        }
    }
    
    public static class MouseClikThemPhong extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent me) {
            JPanel title = (JPanel) me.getSource();
            MapRoom.posTang = (int) title.getClientProperty("Tang");
            ThemPhongJframe themPhongJframe = new ThemPhongJframe();
            themPhongJframe.setVisible(true);
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            JPanel title = (JPanel) me.getSource();
            MapRoom.colorRoom = title.getBackground();
            changeColor(title);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            JPanel title = (JPanel) me.getSource();
            resetColor(title);
        }
    }

    public static void changeColor(JPanel panel) {
        panel.setBackground(new Color(104, 136, 150));
    }

    public static void resetColor(JPanel panel) {
        panel.setBackground(MapRoom.colorRoom);
    }

}
