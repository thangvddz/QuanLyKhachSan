/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entities.Config;
import Models.PhongDAO;
import Utils.Auth;
import Utils.ClickMouse;
import Utils.MapRoom;
import Utils.mgsBox;
import Utils.xFile;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;

/**
 *
 * @author you have to better
 */
public class ManHinhChinhGUI extends javax.swing.JFrame {

    /**
     * Creates new form ManHinhChinhGUI
     */
    public static double tienDichVu;
    public static boolean switchSize;
    public static GridBagConstraints gbc;
    PhongDAO phongDAO;

    public ManHinhChinhGUI() {
        initComponents();
        setTitle("Quản lý khách sạn");
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlSlider = new javax.swing.JPanel();
        lblQuanLyKhacSan = new javax.swing.JLabel();
        pnlSeparator = new javax.swing.JPanel();
        btnHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnQuanLyPhong = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnNhanVien = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDichVu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnThongKe = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnKhachHang = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnCaiDat = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtGioCheckOutKS = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtThongTinNhanVien = new javax.swing.JLabel();
        btnThanhToan = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtGioCheckInKS = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ScpScreenDisplay = new javax.swing.JScrollPane();
        pnlScreen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(247, 22, 52));

        pnlSlider.setBackground(new java.awt.Color(247, 22, 52));
        pnlSlider.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQuanLyKhacSan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblQuanLyKhacSan.setForeground(new java.awt.Color(204, 204, 204));
        lblQuanLyKhacSan.setText("QUẢN LÝ KHÁCH SẠN");
        pnlSlider.add(lblQuanLyKhacSan, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 23, -1, -1));

        pnlSeparator.setBackground(new java.awt.Color(204, 204, 204));
        pnlSeparator.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout pnlSeparatorLayout = new javax.swing.GroupLayout(pnlSeparator);
        pnlSeparator.setLayout(pnlSeparatorLayout);
        pnlSeparatorLayout.setHorizontalGroup(
            pnlSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlSeparatorLayout.setVerticalGroup(
            pnlSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        pnlSlider.add(pnlSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 88, 301, -1));

        btnHome.setBackground(new java.awt.Color(247, 22, 52));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHomeMousePressed(evt);
            }
        });
        btnHome.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 24, 5));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_home_50px_1.png"))); // NOI18N
        btnHome.add(jLabel1);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HOME");
        btnHome.add(jLabel2);

        pnlSlider.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 360, 70));

        btnQuanLyPhong.setBackground(new java.awt.Color(247, 22, 52));
        btnQuanLyPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuanLyPhongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuanLyPhongMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnQuanLyPhongMousePressed(evt);
            }
        });
        btnQuanLyPhong.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 24, 5));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_room_50px_1_1.png"))); // NOI18N
        btnQuanLyPhong.add(jLabel5);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("QUẢN LÝ PHÒNG");
        btnQuanLyPhong.add(jLabel6);

        pnlSlider.add(btnQuanLyPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 360, 70));

        btnNhanVien.setBackground(new java.awt.Color(247, 22, 52));
        btnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNhanVienMousePressed(evt);
            }
        });
        btnNhanVien.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 24, 5));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_staff_50px_1.png"))); // NOI18N
        btnNhanVien.add(jLabel7);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NHÂN VIÊN");
        btnNhanVien.add(jLabel8);

        pnlSlider.add(btnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 360, 60));

        btnDichVu.setBackground(new java.awt.Color(247, 22, 52));
        btnDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDichVuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDichVuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDichVuMousePressed(evt);
            }
        });
        btnDichVu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 24, 5));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_bell_service_50px.png"))); // NOI18N
        btnDichVu.add(jLabel9);

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DỊCH VỤ");
        btnDichVu.add(jLabel10);

        pnlSlider.add(btnDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 360, 60));

        btnThongKe.setBackground(new java.awt.Color(247, 22, 52));
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongKeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThongKeMousePressed(evt);
            }
        });
        btnThongKe.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 24, 5));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_file_50px.png"))); // NOI18N
        btnThongKe.add(jLabel11);

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("THỐNG KÊ");
        btnThongKe.add(jLabel12);

        pnlSlider.add(btnThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 360, 60));

        btnKhachHang.setBackground(new java.awt.Color(247, 22, 52));
        btnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKhachHangMousePressed(evt);
            }
        });
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 24, 5);
        flowLayout1.setAlignOnBaseline(true);
        btnKhachHang.setLayout(flowLayout1);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_customer_50px.png"))); // NOI18N
        btnKhachHang.add(jLabel15);

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("KHÁCH HÀNG");
        btnKhachHang.add(jLabel16);

        pnlSlider.add(btnKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 360, 60));

        btnCaiDat.setBackground(new java.awt.Color(247, 22, 52));
        btnCaiDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCaiDatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCaiDatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCaiDatMousePressed(evt);
            }
        });
        btnCaiDat.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 24, 5));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_settings_50px_1.png"))); // NOI18N
        btnCaiDat.add(jLabel17);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("CÀI ĐẶT");
        btnCaiDat.add(jLabel18);

        pnlSlider.add(btnCaiDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 360, 60));

        btnDangXuat.setBackground(new java.awt.Color(247, 22, 52));
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDangXuatMousePressed(evt);
            }
        });
        btnDangXuat.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 24, 5));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Logout_50px.png"))); // NOI18N
        btnDangXuat.add(jLabel19);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("ĐĂNG XUẤT");
        btnDangXuat.add(jLabel20);

        pnlSlider.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 360, 60));

        jPanel3.setBackground(new java.awt.Color(247, 22, 52));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Giờ Check- Out : ");
        jPanel3.add(jLabel4);

        txtGioCheckOutKS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtGioCheckOutKS.setPreferredSize(new java.awt.Dimension(100, 18));
        jPanel3.add(txtGioCheckOutKS);

        pnlSlider.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 360, 30));

        jPanel5.setBackground(new java.awt.Color(247, 22, 52));

        txtThongTinNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtThongTinNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtThongTinNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtThongTinNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        pnlSlider.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 360, 30));

        btnThanhToan.setBackground(new java.awt.Color(247, 22, 52));
        btnThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThanhToanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThanhToanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThanhToanMousePressed(evt);
            }
        });
        btnThanhToan.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 24, 5));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_payment_history_50px_2.png"))); // NOI18N
        btnThanhToan.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("THANH TOÁN");
        btnThanhToan.add(jLabel14);

        pnlSlider.add(btnThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 360, 70));

        jPanel2.setBackground(new java.awt.Color(247, 22, 52));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Giờ Check-In :");
        jPanel2.add(jLabel3);

        txtGioCheckInKS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtGioCheckInKS.setPreferredSize(new java.awt.Dimension(100, 18));
        jPanel2.add(txtGioCheckInKS);

        pnlSlider.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 360, 30));

        jPanel4.setBackground(new java.awt.Color(212, 34, 51));

        pnlScreen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlScreenLayout = new javax.swing.GroupLayout(pnlScreen);
        pnlScreen.setLayout(pnlScreenLayout);
        pnlScreenLayout.setHorizontalGroup(
            pnlScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1167, Short.MAX_VALUE)
        );
        pnlScreenLayout.setVerticalGroup(
            pnlScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 842, Short.MAX_VALUE)
        );

        ScpScreenDisplay.setViewportView(pnlScreen);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScpScreenDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScpScreenDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        // TODO add your handling code here:
        changeColor(btnHome);
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        // TODO add your handling code here:
        resetColor(btnHome);
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnQuanLyPhongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyPhongMouseEntered
        // TODO add your handling code here:
        changeColor(btnQuanLyPhong);
    }//GEN-LAST:event_btnQuanLyPhongMouseEntered

    private void btnQuanLyPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyPhongMouseExited
        // TODO add your handling code here:
        resetColor(btnQuanLyPhong);
    }//GEN-LAST:event_btnQuanLyPhongMouseExited

    private void btnNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseEntered
        // TODO add your handling code here:
        changeColor(btnNhanVien);
    }//GEN-LAST:event_btnNhanVienMouseEntered

    private void btnNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseExited
        // TODO add your handling code here:
        resetColor(btnNhanVien);
    }//GEN-LAST:event_btnNhanVienMouseExited

    private void btnDichVuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDichVuMouseEntered
        // TODO add your handling code here:
        changeColor(btnDichVu);
    }//GEN-LAST:event_btnDichVuMouseEntered

    private void btnDichVuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDichVuMouseExited
        // TODO add your handling code here:
        resetColor(btnDichVu);
    }//GEN-LAST:event_btnDichVuMouseExited

    private void btnThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseEntered
        // TODO add your handling code here:
        changeColor(btnThongKe);
    }//GEN-LAST:event_btnThongKeMouseEntered

    private void btnThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseExited
        // TODO add your handling code here:
        resetColor(btnThongKe);
    }//GEN-LAST:event_btnThongKeMouseExited

    private void btnDichVuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDichVuMousePressed
        // TODO add your handling code here:
        JPanel dichvu = new DichVuPanel();
        SwitchPanel(dichvu);
    }//GEN-LAST:event_btnDichVuMousePressed

    private void btnThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMousePressed
        // TODO add your handling code here:
        JPanel lichsuGD = new LichSuGDPanel();
        SwitchPanel(lichsuGD);
    }//GEN-LAST:event_btnThongKeMousePressed

    private void btnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMousePressed
        // TODO add your handling code here:
        QuanLyPhongPanel.quanlyphong = false;
        fillToHome();
    }//GEN-LAST:event_btnHomeMousePressed

    private void btnQuanLyPhongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyPhongMousePressed
        // TODO add your handling code here:
        if (Auth.isLogin() && Auth.isManager()) {
            JPanel quanLyPhong = new QuanLyPhongPanel();
            SwitchPanel(quanLyPhong);
        } else {
            mgsBox.alert(this, "Bạn không có quyền quản lý phòng");
        }
    }//GEN-LAST:event_btnQuanLyPhongMousePressed

    private void btnNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMousePressed
        // TODO add your handling code here:
        if (Auth.isLogin() && Auth.isManager()) {
            JPanel nhanvien = new NhanVienJPanel();
            SwitchPanel(nhanvien);
        } else {
            mgsBox.alert(this, "Bạn không có quyền quản lý Nhân viên");
        }
    }//GEN-LAST:event_btnNhanVienMousePressed

    private void btnKhachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseEntered
        // TODO add your handling code here:
        changeColor(btnKhachHang);
    }//GEN-LAST:event_btnKhachHangMouseEntered

    private void btnKhachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseExited
        // TODO add your handling code here:
        resetColor(btnKhachHang);
    }//GEN-LAST:event_btnKhachHangMouseExited

    private void btnCaiDatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaiDatMouseEntered
        // TODO add your handling code here:
        changeColor(btnCaiDat);
    }//GEN-LAST:event_btnCaiDatMouseEntered

    private void btnCaiDatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaiDatMouseExited
        // TODO add your handling code here:
        resetColor(btnCaiDat);
    }//GEN-LAST:event_btnCaiDatMouseExited

    private void btnDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseEntered
        // TODO add your handling code here:
        changeColor(btnDangXuat);
    }//GEN-LAST:event_btnDangXuatMouseEntered

    private void btnDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseExited
        // TODO add your handling code here:
        resetColor(btnDangXuat);
    }//GEN-LAST:event_btnDangXuatMouseExited

    private void btnKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMousePressed
        // TODO add your handling code here:
        JPanel khachhang = new KhachHangJPanel();
        SwitchPanel(khachhang);
    }//GEN-LAST:event_btnKhachHangMousePressed

    private void btnCaiDatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaiDatMousePressed
        // TODO add your handling code here:
        CaiDatJpanel cd = new CaiDatJpanel();
        SwitchPanel(cd);
    }//GEN-LAST:event_btnCaiDatMousePressed

    private void btnDangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMousePressed
        // TODO add your handling code here:
        KetCaJFrame ketCaJFrame = new KetCaJFrame(this);
        ketCaJFrame.setVisible(true);
//        this.setVisible(false);
//        DangNhapJFrame dnjf = new DangNhapJFrame();
//        dnjf.setVisible(true);
    }//GEN-LAST:event_btnDangXuatMousePressed

    private void btnThanhToanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMouseEntered
        // TODO add your handling code here:
        changeColor(btnThanhToan);
    }//GEN-LAST:event_btnThanhToanMouseEntered

    private void btnThanhToanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMouseExited
        // TODO add your handling code here:
        resetColor(btnThanhToan);
    }//GEN-LAST:event_btnThanhToanMouseExited

    private void btnThanhToanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMousePressed
        JPanel loaithanhtoan = new LoaiThanhToanJPanel();
        SwitchPanel(loaithanhtoan);
    }//GEN-LAST:event_btnThanhToanMousePressed

    public void init() {
        tienDichVu = 0;
        phongDAO = new PhongDAO();
        gbc = new GridBagConstraints();
        switchSize = true;
        ScpScreenDisplay.getVerticalScrollBar().setUnitIncrement(16);
//        MapRoom.setGridBagLayout(gbc, pnlScreen);
        pnlScreen.setLayout(new FlowLayout(FlowLayout.LEFT));
        fillToHome();
        fillCheckInCheckOut();
        fillNhanVien();
    }

    public void fillToHome() {
        resetStatus();
        JPanel home = new HomePanel();
        SwitchPanel(home);
    }

    public void resetStatus() {
        phongDAO.updateMaTT3();
    }

    // thay đổi giao diện hiển thị trong panel pnlScreen
    public static void SwitchPanel(JPanel panel) {

        pnlScreen.removeAll();

        panel.setVisible(true);
//        MapRoom.setGridBagLayout(gbc, pnlScreen);
        pnlScreen.setLayout(new FlowLayout(FlowLayout.LEFT));
//        panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        pnlScreen.add(panel);
        pnlScreen.revalidate();
        pnlScreen.repaint();
    }

    public void changeColor(JPanel panel) {
        panel.setBackground(new Color(224, 70, 84));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new Color(247, 22, 52));
    }

    public static void fillCheckInCheckOut() {
        Config c = (Config) xFile.readFile();
        if (c == null) {
            txtGioCheckInKS.setText("Chưa cài đặt");
            txtGioCheckOutKS.setText("Chưa cài đặt");
        } else {
            if (c.getPhutChkIn() >= 0 && c.getPhutChkIn() < 10) {
                txtGioCheckInKS.setText(c.getGioChkIn() + " : 0" + c.getPhutChkIn());
            }
            if (c.getPhutChkOut() >= 0 && c.getPhutChkOut() < 10) {
                txtGioCheckOutKS.setText(c.getGioChkOut() + " : 0" + c.getPhutChkOut());
            }
            if (c.getPhutChkIn() >= 10 && c.getPhutChkOut() >= 10) {
                txtGioCheckInKS.setText(c.getGioChkIn() + " : " + c.getPhutChkIn());
                txtGioCheckOutKS.setText(c.getGioChkOut() + " : " + c.getPhutChkOut());
            }
        }
    }

    public void fillNhanVien() {
        txtThongTinNhanVien.setText("Nhân viên: " + Auth.user.getHoTen());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScpScreenDisplay;
    private javax.swing.JPanel btnCaiDat;
    private javax.swing.JPanel btnDangXuat;
    private javax.swing.JPanel btnDichVu;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnKhachHang;
    private javax.swing.JPanel btnNhanVien;
    private javax.swing.JPanel btnQuanLyPhong;
    private javax.swing.JPanel btnThanhToan;
    private javax.swing.JPanel btnThongKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblQuanLyKhacSan;
    public static javax.swing.JPanel pnlScreen;
    private javax.swing.JPanel pnlSeparator;
    private javax.swing.JPanel pnlSlider;
    public static javax.swing.JLabel txtGioCheckInKS;
    public static javax.swing.JLabel txtGioCheckOutKS;
    private javax.swing.JLabel txtThongTinNhanVien;
    // End of variables declaration//GEN-END:variables
}
