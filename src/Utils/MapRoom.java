/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Forms.QuanLyPhongPanel;
import Models.PhongDAO;
import Models.TrangThaiDAO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author you have to better
 */
public class MapRoom {

    public static Border outline = BorderFactory.createLineBorder(Color.BLACK);
    public static PhongDAO dao = new PhongDAO();
    public static TrangThaiDAO trangThaiDao = new TrangThaiDAO();
    public static int sizeWith = 200;
    public static int sizeHeight = 200;
    public static int posTang = 0;
    public static int posPhong = 0;
    public static Color colorRoom;

    public static void DisplayMapRoom(JPanel box, GridBagConstraints gbc, int floors, int rooms, MouseAdapter ac) {

        
        gbc.gridx = 0;
        gbc.gridy = floors;
        gbc.ipady = 5;

        JPanel tang = new JPanel();
        initTang(tang, floors, rooms);

        JLabel TenTang = new JLabel("Tầng " + (floors + 1));
        TenTang.setPreferredSize(new Dimension(sizeWith / 2 - 10, sizeHeight - 50));
        TenTang.setHorizontalAlignment(JLabel.CENTER);
        TenTang.setVerticalAlignment(JLabel.CENTER);
        TenTang.setFont(new Font("Arial", Font.BOLD, 20));
        TenTang.setForeground(Color.WHITE);
        JPanel bx = new JPanel();
        bx.setLayout(new BorderLayout());
        bx.add(TenTang, BorderLayout.CENTER);
        bx.setBorder(outline);
        bx.setBackground(new Color(60, 60, 61));
        tang.add(bx);

        if (rooms != 0) {
            for (int i = 0; i < rooms; i++) {
                int numRoom = dao.RoomCodePerFloor(floors + 1).get(i).getMaPhong();
                int numStatus = dao.RoomCodePerFloor(floors + 1).get(i).getMaTT();
                String info = "<html><center>" + numRoom + "</center><br>" + trangThaiDao.selectById(numStatus).getTenTrangThai() + "</html>";

                tang.add(addRoomToFloor(floors, ac, info, numStatus, numRoom));
            }
        }
        if (QuanLyPhongPanel.quanlyphong) {
            JLabel room = new JLabel("Thêm phòng");
            room.setFont(new Font("Arial", Font.BOLD, 20));
            room.putClientProperty("Tang", new Integer(floors + 1));
            room.setPreferredSize(new Dimension(sizeWith, sizeHeight - 50));
            room.addMouseListener(ac);
            tang.add(room);
        }
        box.add(tang, gbc);
        box.revalidate();
        box.repaint();
    }

    // setbox
    public static void setGridBagLayout(GridBagConstraints gbc, JPanel panel) {
        panel.setLayout(new GridBagLayout());
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
    }

    public static void initTang(JPanel tang, int floors, int rooms) {
        tang.setPreferredSize(new Dimension(sizeWith * rooms + sizeWith * 2, sizeHeight-50));
        tang.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        tang.setAlignmentX(Component.LEFT_ALIGNMENT);
        tang.setBackground(Color.WHITE);
    }

    public static JPanel addRoomToFloor(int floors, MouseAdapter ac, String nameLabel, int numStatus, int numRoom) {

        JPanel box = new JPanel();
        box.setLayout(new BorderLayout());
        box.putClientProperty("Tang", new Integer(floors + 1));
        box.putClientProperty("Phong", new Integer(numRoom));
        box.addMouseListener(ac);
        JLabel room = new JLabel(nameLabel);
        room.setHorizontalAlignment(JLabel.CENTER);
        room.setVerticalAlignment(JLabel.CENTER);
        room.setPreferredSize(new Dimension(sizeWith, sizeHeight - 50));
        room.setBorder(outline);
        room.setFont(new Font("Arial", Font.BOLD, 10));
        room.setForeground(Color.WHITE);
        switch (numStatus) {
            case 1:
                box.setBackground(new Color(24, 24, 214));
                break;
            case 2:
                box.setBackground(new Color(176, 13, 11));
                break;
            case 3:
                box.setBackground(new Color(164, 166, 164));
                break;
            default:
                box.setBackground(new Color(252, 121, 28));

                break;
        }

        box.add(room, BorderLayout.CENTER);
        return box;
    }

    public static void updateStatusScreen(JPanel panel, GridBagConstraints gbc, MouseAdapter ac) {
        panel.removeAll();
        setGridBagLayout(gbc, panel);
        PhongDAO dao = new PhongDAO();
        List<Integer> ls = dao.RoomPerFloor();
        if (!ls.isEmpty()) {
            for (int i = 0; i < ls.size(); i++) {
                DisplayMapRoom(panel, gbc, i, ls.get(i), ac);
                panel.revalidate();
                panel.repaint();
            }
        }
    }
}
