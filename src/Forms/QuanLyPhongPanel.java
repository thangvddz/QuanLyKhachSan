/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Utils.ClickMouse;
import Utils.MapRoom;
import java.awt.GridBagConstraints;

/**
 *
 * @author you have to better
 */
public class QuanLyPhongPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyPhongPanel
     */
    public static boolean quanlyphong;
    public static GridBagConstraints gbc;
    
    public QuanLyPhongPanel() {
        initComponents();
        init();
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGhiChu = new javax.swing.JPanel();
        pnlPhongTRong = new javax.swing.JPanel();
        txtPhongTrong = new javax.swing.JLabel();
        pnlDango = new javax.swing.JPanel();
        txtDangO = new javax.swing.JLabel();
        pnlDangSua = new javax.swing.JPanel();
        txtDangSua = new javax.swing.JLabel();
        pnlDangDonDep = new javax.swing.JPanel();
        txtDangDonDep = new javax.swing.JLabel();
        pnlDangXuLy = new javax.swing.JPanel();
        txtDangXuLy = new javax.swing.JLabel();
        pnlMainScreen = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnLamMoi = new javax.swing.JButton();
        btnRemoveAll = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));

        pnlGhiChu.setBackground(new java.awt.Color(0, 51, 51));
        pnlGhiChu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        pnlPhongTRong.setBackground(new java.awt.Color(8, 27, 135));
        pnlPhongTRong.setPreferredSize(new java.awt.Dimension(118, 42));

        txtPhongTrong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPhongTrong.setForeground(new java.awt.Color(255, 255, 255));
        txtPhongTrong.setText("Phòng Trống");

        javax.swing.GroupLayout pnlPhongTRongLayout = new javax.swing.GroupLayout(pnlPhongTRong);
        pnlPhongTRong.setLayout(pnlPhongTRongLayout);
        pnlPhongTRongLayout.setHorizontalGroup(
            pnlPhongTRongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhongTRongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPhongTrong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPhongTRongLayout.setVerticalGroup(
            pnlPhongTRongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPhongTRongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPhongTrong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlGhiChu.add(pnlPhongTRong);

        pnlDango.setBackground(new java.awt.Color(112, 7, 6));
        pnlDango.setPreferredSize(new java.awt.Dimension(118, 42));

        txtDangO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDangO.setForeground(new java.awt.Color(255, 255, 255));
        txtDangO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDangO.setText("Đang ở");

        javax.swing.GroupLayout pnlDangoLayout = new javax.swing.GroupLayout(pnlDango);
        pnlDango.setLayout(pnlDangoLayout);
        pnlDangoLayout.setHorizontalGroup(
            pnlDangoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDangO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDangoLayout.setVerticalGroup(
            pnlDangoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDangoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDangO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlGhiChu.add(pnlDango);

        pnlDangSua.setBackground(new java.awt.Color(59, 11, 2));
        pnlDangSua.setPreferredSize(new java.awt.Dimension(118, 42));

        txtDangSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDangSua.setForeground(new java.awt.Color(255, 255, 255));
        txtDangSua.setText("Đang sửa chữa");

        javax.swing.GroupLayout pnlDangSuaLayout = new javax.swing.GroupLayout(pnlDangSua);
        pnlDangSua.setLayout(pnlDangSuaLayout);
        pnlDangSuaLayout.setHorizontalGroup(
            pnlDangSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDangSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDangSuaLayout.setVerticalGroup(
            pnlDangSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDangSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDangSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlGhiChu.add(pnlDangSua);

        pnlDangDonDep.setBackground(new java.awt.Color(252, 121, 28));

        txtDangDonDep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDangDonDep.setForeground(new java.awt.Color(255, 255, 255));
        txtDangDonDep.setText("Đang dọn phòng");

        javax.swing.GroupLayout pnlDangDonDepLayout = new javax.swing.GroupLayout(pnlDangDonDep);
        pnlDangDonDep.setLayout(pnlDangDonDepLayout);
        pnlDangDonDepLayout.setHorizontalGroup(
            pnlDangDonDepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangDonDepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDangDonDep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDangDonDepLayout.setVerticalGroup(
            pnlDangDonDepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDangDonDepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDangDonDep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlGhiChu.add(pnlDangDonDep);

        pnlDangXuLy.setBackground(new java.awt.Color(164, 166, 164));
        pnlDangXuLy.setPreferredSize(new java.awt.Dimension(118, 42));

        txtDangXuLy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDangXuLy.setForeground(new java.awt.Color(255, 255, 255));
        txtDangXuLy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDangXuLy.setText("Đang xử lý");

        javax.swing.GroupLayout pnlDangXuLyLayout = new javax.swing.GroupLayout(pnlDangXuLy);
        pnlDangXuLy.setLayout(pnlDangXuLyLayout);
        pnlDangXuLyLayout.setHorizontalGroup(
            pnlDangXuLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangXuLyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDangXuLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDangXuLyLayout.setVerticalGroup(
            pnlDangXuLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDangXuLyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDangXuLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlGhiChu.add(pnlDangXuLy);

        pnlMainScreen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlMainScreenLayout = new javax.swing.GroupLayout(pnlMainScreen);
        pnlMainScreen.setLayout(pnlMainScreenLayout);
        pnlMainScreenLayout.setHorizontalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlMainScreenLayout.setVerticalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btnLamMoi.setText("Làm mới");
        jPanel1.add(btnLamMoi);

        btnRemoveAll.setText("Remove All");
        jPanel1.add(btnRemoveAll);
        jPanel1.add(jSlider1);

        jLabel1.setText("30%");
        jPanel1.add(jLabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGhiChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMainScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(pnlGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    public void init(){
        quanlyphong = true;
        gbc = new GridBagConstraints();
        fillPanel();
    }
    
    public void fillPanel(){
        MapRoom.updateStatusScreen(pnlMainScreen, gbc, new ClickMouse.MouseClikQuanLyPhong());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnRemoveAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JPanel pnlDangDonDep;
    private javax.swing.JPanel pnlDangSua;
    private javax.swing.JPanel pnlDangXuLy;
    private javax.swing.JPanel pnlDango;
    private javax.swing.JPanel pnlGhiChu;
    public static javax.swing.JPanel pnlMainScreen;
    private javax.swing.JPanel pnlPhongTRong;
    private javax.swing.JLabel txtDangDonDep;
    private javax.swing.JLabel txtDangO;
    private javax.swing.JLabel txtDangSua;
    private javax.swing.JLabel txtDangXuLy;
    private javax.swing.JLabel txtPhongTrong;
    // End of variables declaration//GEN-END:variables
}
