/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Forms.DatTraPhongJFrame;
import Forms.DatTraPhongPanel;
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

    public static class MouseClikXemThongTin extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent me) {
            JPanel title = (JPanel) me.getSource();
            MapRoom.posTang = (int) title.getClientProperty("Tang");
            MapRoom.posPhong = (int) title.getClientProperty("Phong");
            System.out.println("tang:" + MapRoom.posTang + ", phong:" + MapRoom.posPhong);
            DatTraPhongJFrame jf = new DatTraPhongJFrame();
            jf.setVisible(true);
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
        panel.setBackground(new Color(6, 145, 83));
    }

    public static void resetColor(JPanel panel) {
        panel.setBackground(MapRoom.colorRoom);
    }

}
