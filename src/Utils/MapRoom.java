/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Models.PhongDAO;
import Models.TrangThaiDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
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

    public static void DisplayMapRoom(JPanel box, GridBagConstraints gbc, int floors, int rooms, MouseAdapter ac) {

        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.gridx = 0;
        gbc.gridy = floors;
        gbc.ipady = 5;

        JPanel tang = new JPanel();
        initTang(tang, floors, rooms);

        JLabel TenTang = new JLabel("Tầng " + (floors + 1));
        TenTang.setPreferredSize(new Dimension(sizeWith / 2, sizeHeight));
        TenTang.setOpaque(true);
        TenTang.setFont(new Font("Arial", Font.BOLD, 24));
        JPanel bx = new JPanel();
        bx.add(TenTang);
        tang.add(bx);

        if (rooms != 0) {
            for (int i = 0; i < rooms; i++) {
                int numRoom = dao.RoomCodePerFloor(floors + 1).get(i).getMaPhong();
                int numStatus = dao.RoomCodePerFloor(floors + 1).get(i).getMaTT();
                String info = "<html><center>" + numRoom + "</center><br>" + trangThaiDao.selectById(numStatus).getTenTrangThai() + "</html>";
                tang.add(addRoomToFloor(floors, ac, info, numStatus, numRoom));
            }
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
    }

    public static void initTang(JPanel tang, int floors, int rooms) {
        tang.setToolTipText("" + (floors + 1));
        tang.setPreferredSize(new Dimension(sizeWith * rooms + sizeWith * 2, sizeHeight + 30));
//            tang.setLayout(new BoxLayout(tang, BoxLayout.X_AXIS));
        tang.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        tang.setAlignmentX(Component.LEFT_ALIGNMENT);
        tang.setBorder(outline);
    }

    public static JPanel addRoomToFloor(int floors, MouseAdapter ac, String nameLabel, int numStatus, int numRoom) {

        JPanel box = new JPanel();
        JLabel room = new JLabel(nameLabel);
        room.putClientProperty("Tang", new Integer(floors + 1));
        room.putClientProperty("Phong", new Integer(numRoom));
        room.setPreferredSize(new Dimension(sizeWith, sizeHeight - 50));
        room.addMouseListener(ac);
        room.setBorder(outline);
        room.setFont(new Font("Arial", Font.BOLD, 10));
        switch (numStatus) {
            case 1:
                room.setOpaque(true);
                room.setBackground(Color.GREEN);
                break;
            case 2:
                room.setOpaque(true);
                room.setBackground(Color.RED);
                break;
            case 3:
                room.setOpaque(true);
                room.setBackground(Color.PINK);
                break;
            default:
                room.setOpaque(true);
                room.setBackground(Color.DARK_GRAY);
                break;
        }
        box.add(room);
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
