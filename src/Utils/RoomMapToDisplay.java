/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Entities.Phong;
import Forms.FormQLTTPhong;
import Forms.ManHinhChinh;
import Forms.ManHinhQuanLyPhong;
import static Forms.ManHinhChinh.heightContainer;
import static Forms.ManHinhChinh.widthContainer;
import Models.PhongDAO;
import Models.TrangThaiDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.Border;

/**
 *
 * @author you have to better
 */
public class RoomMapToDisplay {
    private static final int DXLSTATUS = 3;
    public static void createMapRoom(JPanel box, GridBagConstraints gbc, int floors, int rooms, ActionListener ac) {

        PhongDAO dao = new PhongDAO();
        TrangThaiDAO trangThaiDao = new TrangThaiDAO();
        Border outline = BorderFactory.createLineBorder(Color.BLACK);
//        box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));

        // khoi tao jpanel chua jlabel va jtoolbar
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.gridx = 0;
        gbc.gridy = floors;
        gbc.ipady = 5;

        JPanel tang = new JPanel();
        tang.setToolTipText("" + (floors + 1));
        int width = widthContainer * rooms + 500;
        int height = heightContainer;
        tang.setPreferredSize(new Dimension(width, height));
//            tang.setLayout(new BoxLayout(tang, BoxLayout.X_AXIS));
        tang.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        tang.setAlignmentX(Component.LEFT_ALIGNMENT);
        tang.setBorder(outline);
        // khoi tao JLabel sau do them vao Jpanel
        JButton btnTangs = new JButton("Tầng " + (floors + 1));
        btnTangs.setPreferredSize(new Dimension(widthContainer + 100, heightContainer));
        btnTangs.setOpaque(true);
        btnTangs.setFont(new Font("Arial", Font.BOLD, 24));
        tang.add(btnTangs);
        // khoi tao JToolBar sau do them vao Jpanel
        JToolBar jtb = new JToolBar();
        tang.add(jtb);
        // Them Button phong vao jToolBar
        if (rooms != 0) {
            for (int j = 0; j < rooms; j++) {
                int numRoom = dao.RoomCodePerFloor(floors + 1).get(j).getMaPhong();
                int numStatus = dao.RoomCodePerFloor(floors + 1).get(j).getMaTT();
                String info = "<html><center>" + numRoom + "</center><br>"+ trangThaiDao.selectById(numStatus).getTenTrangThai() + "</html>";
                JButton room = new JButton(info);
                room.putClientProperty("Tang", new Integer(floors + 1));
                room.putClientProperty("Phong", new Integer(numRoom));
                room.setPreferredSize(new Dimension(widthContainer, heightContainer));
                room.addActionListener(ac);
                room.setBorder(outline);
                room.setFont(new Font("Arial", Font.BOLD, 12));
                if (numStatus == 1) {
                    room.setOpaque(true);
                    room.setBackground(Color.GREEN);
                } else if (numStatus == 2) {
                    room.setOpaque(true);
                    room.setBackground(Color.RED);
                } else if (numStatus == DXLSTATUS) {
                    room.setOpaque(true);
                    room.setBackground(Color.PINK);
                } else {
                    room.setOpaque(true);
                    room.setBackground(Color.DARK_GRAY);
                }
                jtb.add(room);
            }
        }
        // Them Jpanel tang vao trong Jpanel jpnAreaRoomMap
        box.add(tang, gbc);
        box.revalidate();
        box.repaint();
    }

    public static class MouseClikXemThongTin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton button = (JButton) ae.getSource();
            ManHinhChinh.posTang = (int) button.getClientProperty("Tang");
            ManHinhChinh.posPhong = (int) button.getClientProperty("Phong");
            System.out.println("Tang: " + ManHinhQuanLyPhong.posTang + ", Phong:" + ManHinhQuanLyPhong.posPhong);
            PhongDAO dao = new PhongDAO();
            // nếu trạng thái đã là đang xử lý thì nó sẽ chuyển về trạng thái 1 (trạng thái sẵn sàng cho thuê phòng)
            ManHinhChinh.numStatus = dao.selectByIdd(ManHinhChinh.posTang, ManHinhChinh.posPhong).getMaTT();
            if (ManHinhChinh.numStatus == DXLSTATUS) {
                dao.updateMaTT(new Phong(ManHinhChinh.posPhong, ManHinhChinh.posTang, 1, ManHinhChinh.numStatusBanDau, null));
                updateStatusScreen();
            } else {
                ManHinhChinh.numStatusBanDau = ManHinhChinh.numStatus;
                dao.updateMaTT(new Phong(ManHinhChinh.posPhong, ManHinhChinh.posTang, 1, DXLSTATUS, null));
                updateStatusScreen();
            }
        }
    }

    public static void updateStatusScreen() {
        ManHinhChinh.jpnAreaMapRoom.removeAll();
        ManHinhChinh.setBox();
        PhongDAO dao = new PhongDAO();
        List<Integer> ls = dao.RoomPerFloor();
        for (int i = 0; i < ls.size(); i++) {
            createMapRoom(ManHinhChinh.jpnAreaMapRoom, ManHinhChinh.gbc, i, ls.get(i));
            ManHinhChinh.jpnAreaMapRoom.revalidate();
            ManHinhChinh.jpnAreaMapRoom.repaint();
        }
    }

    public static void resetStatus(){
        PhongDAO dao = new PhongDAO();
        dao.updateMaTT3();
    }
}
