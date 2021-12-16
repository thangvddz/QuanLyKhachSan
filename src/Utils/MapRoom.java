/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Entities.HoaDonChiTiet;
import Entities.LichSuGD;
import Entities.LoaiPhong;
import Entities.Phong;
import Forms.HomePanel;
import Forms.ManHinhChinhGUI;
import Forms.ManHinhTrongJpanel;
import Forms.QuanLyPhongPanel;
import Models.HoaDonChiTietDAO;
import Models.HoaDonDAO;
import Models.KhachHangDAO;
import Models.LichSuGDDAO;
import Models.LoaiPhongDAO;
import Models.PhongDAO;
import Models.TangDAO;
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
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
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
    public static LoaiPhongDAO lpdao = new LoaiPhongDAO();
    public static HoaDonChiTietDAO daohdct = new HoaDonChiTietDAO();
    public static LichSuGDDAO lsgddao = new LichSuGDDAO();
    public static KhachHangDAO daokh = new KhachHangDAO();
    public static HoaDonDAO daohd = new HoaDonDAO();
    public static TangDAO tangDAO = new TangDAO();
    public static TrangThaiDAO trangThaiDao = new TrangThaiDAO();
    public static int maKH = 0;
    public static int sizeWith = 200;
    public static int sizeHeight = 200;
    public static int posTang = 0;
    public static int posStatus = 0;
    public static String posPhong = null;
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

                try {
                    int numStatus = dao.RoomCodePerFloor(floors + 1).get(i).getMaTT();
                    String numRoom = dao.RoomCodePerFloor(floors + 1).get(i).getMaPhong();
                    String hinhThuc = "";
                    String strDateCheckIn = "";
                    String strDateCheckOut = "";
                    try {
                        int maHDCT = daohdct.selectByNewIDReserve(false, floors + 1, numRoom).getMaCTHD();
                        List<LichSuGD> ls = lsgddao.selectByMaHDCT(maHDCT);
                        hinhThuc = ls.get(0).isTrangThai() ? "Thuê Theo giờ" : "Thuê theo ngày";
                        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
                        strDateCheckIn = "NGày check-In: " + dateFormat.format(ls.get(ls.size() - 1).getThoiGianBD());
                        if (ls.get(0).getThoiGianKT() != null) {
                            strDateCheckOut = "NGày check-Out: " + dateFormat.format(ls.get(0).getThoiGianKT());
                        } else {
                            strDateCheckOut = "NGày check-Out: Chưa biết ngày nào ra";
                        }

                    } catch (Exception e) {

                    }

                    String tenKH = "";
                    HoaDonChiTiet mahd = null;
                    try {
                        mahd = daohdct.getMaHDFromHDCT(floors + 1, numRoom, false);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (mahd != null) {
                        System.out.println("maHD: " + mahd.getMaHD());
                        maKH = daohd.selectByIdd(mahd.getMaHD(), false).getMaKH();
                        tenKH = daokh.selectById(maKH).getHoTen();
                        numStatus = 2;
                    } else {
                        maKH = 0;
                    }

                    String info = "<html><center><h4>" + numRoom + "</h4></center><br>"
                            + "<center>" + trangThaiDao.selectById(numStatus).getTenTrangThai() + "</center>"
                            + "<center><h3>" + tenKH + "</h3></center>"
                            + "<center>" + hinhThuc + "</center>"
                            + "<center>" + strDateCheckIn + "</center>"
                            + "<center>" + strDateCheckOut + "</center>"
                            + "</html>";
                    posStatus = numStatus;
                    tang.add(addRoomToFloor(floors, ac, info, numStatus, numRoom));
                } catch (Exception e) {
                    System.out.println("Tang nay chang co phong nao gi");
                }
            }
        }
        if (QuanLyPhongPanel.quanlyphong) {
            JPanel boxx = new JPanel();
            boxx.setLayout(new BorderLayout());
            boxx.putClientProperty("Tang", new Integer(floors + 1));
            boxx.setBackground(new Color(255, 255, 255));
            boxx.addMouseListener(new ClickMouse.MouseClikThemPhong());
            JLabel roomm;
            try {
                roomm = new JLabel(new ImageIcon((ImageIO.read(new File("src/image/icons8_add_100px.png")))));
                roomm.setHorizontalAlignment(JLabel.CENTER);
                roomm.setVerticalAlignment(JLabel.CENTER);
                roomm.setFont(new Font("Arial", Font.BOLD, 10));
                roomm.setForeground(Color.WHITE);
                boxx.add(roomm, BorderLayout.CENTER);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            tang.add(boxx);
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
        tang.setPreferredSize(new Dimension(sizeWith * rooms + sizeWith * 2, sizeHeight - 50));
        tang.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        tang.setAlignmentX(Component.LEFT_ALIGNMENT);
        tang.setBackground(Color.WHITE);
    }

    public static JPanel addRoomToFloor(int floors, MouseAdapter ac, String nameLabel, int numStatus, String numRoom) {

        JPanel box = new JPanel();
        box.setLayout(new BorderLayout());
        box.putClientProperty("Tang", new Integer(floors + 1));
        box.putClientProperty("Phong", new String(numRoom));
        box.putClientProperty("MaKH", new Integer(maKH));
        box.addMouseListener(ac);
        JLabel room = new JLabel(nameLabel);
        room.setHorizontalAlignment(JLabel.CENTER);
        room.setVerticalAlignment(JLabel.CENTER);
        room.setPreferredSize(new Dimension(sizeWith, sizeHeight - 50));
        room.setBorder(outline);
        room.setFont(new Font("Arial", Font.BOLD, 10));
        room.setForeground(Color.WHITE);
        if (numStatus != 2) {
            try {
                int malpp = dao.selectByIdd(floors + 1, numRoom).getMaLoaiPhong();
                LoaiPhong lp = lpdao.selectById(malpp);
                String infooo = "<html><center><h4>" + numRoom + "</h4></center><br>"
                        + "<center>" + trangThaiDao.selectById(numStatus).getTenTrangThai() + "</center>"
                        + "<center><h3>" + lp.getTenLP() + "</h3></center>";
                room.setText(infooo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        switch (numStatus) {
            case 1:
                dao.updateMaTT(new Phong(numRoom, floors + 1, -1, numStatus, null));
                box.setBackground(new Color(8, 27, 135));
                break;
            case 2:
                dao.updateMaTT(new Phong(numRoom, floors + 1, -1, numStatus, null));
                box.setBackground(new Color(112, 7, 6));
                break;
            case 3:
                dao.updateMaTT(new Phong(numRoom, floors + 1, -1, numStatus, null));
                box.setBackground(new Color(164, 166, 164));

                break;
            case 4:
                dao.updateMaTT(new Phong(numRoom, floors + 1, -1, numStatus, null));
                box.setBackground(new Color(59, 11, 2));
                break;
            default:
                dao.updateMaTT(new Phong(numRoom, floors + 1, -1, numStatus, null));
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
        try {
            List<Integer> ls = dao.RoomPerFloor();
            if (!ls.isEmpty()) {
                for (int i = 0; i < ls.size(); i++) {
                    DisplayMapRoom(panel, gbc, i, ls.get(i), ac);
                    panel.revalidate();
                    panel.repaint();
                }
                if (QuanLyPhongPanel.quanlyphong) {
                    DisplayMapRoom(panel, gbc, ls.size(), 0, new ClickMouse.MouseClikThemPhong());
                }
            } else {
                if (QuanLyPhongPanel.quanlyphong) {
                    DisplayMapRoom(panel, gbc, 1, 0, new ClickMouse.MouseClikThemPhong());
                }
            }
        } catch (Exception e) {

            if (QuanLyPhongPanel.quanlyphong) {
                DisplayMapRoom(panel, gbc, 0, 0, new ClickMouse.MouseClikThemPhong());
            } else {
                ManHinhTrongJpanel mht = new ManHinhTrongJpanel();
                mht.setVisible(true);
                HomePanel.pnlScreen.add(mht);
            }
        }
    }
}
