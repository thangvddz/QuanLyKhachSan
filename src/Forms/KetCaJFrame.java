/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entities.CaLam;
import Entities.HoaDon;
import Entities.LichSuCaLam;
import Entities.ThanhToan;
import Models.CaLamDAO;
import Models.HoaDonDAO;
import Utils.Auth;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import Models.LichSuCaLamDAO;
import Models.LoaiThanhToanDAO;
import Models.NhanVienDAO;
import Models.ThanhToanDAO;
import Utils.mgsBox;
import Utils.xDate;
import Utils.xMoney;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author ACER
 */
public class KetCaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form KetCaJFrame
     */
    LichSuCaLamDAO lscldao;
    HoaDonDAO hddao;
    CaLamDAO caLamDAO;
    ThanhToanDAO thanhToanDAO;
    NhanVienDAO nhanVienDAO;
    LoaiThanhToanDAO loaiThanhToanDAO;
    Timer timer;
    public static double tienCuoiCa;
    public static double tienThucThu;
    public static double tienThe;
    public static double tienMat;
    public static LichSuCaLam lichSuCuoi;
    ManHinhChinhGUI manHinhChinhGUI;

    public KetCaJFrame(ManHinhChinhGUI manHc) {
        initComponents();
        this.manHinhChinhGUI = manHc;
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

        lblTenNhanVien = new javax.swing.JLabel();
        lblDongHoKetCa = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTienDauCa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTienMat = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTienTheNganHang = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtTienCuoiCa = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblThoiGianBD = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTienThucThu = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnKetCa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblThoiGianKT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BÁO CÁO KẾT CA");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenNhanVien.setText("Vu Van A");
        getContentPane().add(lblTenNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 210, 40));

        lblDongHoKetCa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDongHoKetCa.setForeground(new java.awt.Color(204, 0, 0));
        lblDongHoKetCa.setText("12:00:00");
        getContentPane().add(lblDongHoKetCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 250, 30));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 11, 5));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tiền đầu ca:");
        jPanel1.add(jLabel2);

        txtTienDauCa.setEditable(false);
        txtTienDauCa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTienDauCa.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txtTienDauCa);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 470, -1));

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 19, 5));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tiền mặt:");
        jPanel2.add(jLabel6);

        txtTienMat.setEditable(false);
        txtTienMat.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTienMat.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel2.add(txtTienMat);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 470, 40));

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 21, 5));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Tiền thẻ:");
        jPanel3.add(jLabel7);

        txtTienTheNganHang.setEditable(false);
        txtTienTheNganHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTienTheNganHang.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel3.add(txtTienTheNganHang);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 470, 40));

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 8, 5));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Tiền cuối ca :");
        jPanel4.add(jLabel8);

        txtTienCuoiCa.setEditable(false);
        txtTienCuoiCa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTienCuoiCa.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel4.add(txtTienCuoiCa);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 470, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Thời gian bắt đầu :");
        jPanel5.add(jLabel9);

        lblThoiGianBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel5.add(lblThoiGianBD);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 470, 30));

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tiền Phát sinh:");
        jPanel6.add(jLabel1);

        txtTienThucThu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTienThucThu.setText("0");
        txtTienThucThu.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel6.add(txtTienThucThu);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 470, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnKetCa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKetCa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Accept.png"))); // NOI18N
        btnKetCa.setText("KẾT CA");
        btnKetCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetCaActionPerformed(evt);
            }
        });
        jPanel7.add(btnKetCa);

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_cancel_25px.png"))); // NOI18N
        btnThoat.setText("TRỞ VỀ");
        btnThoat.setToolTipText("");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel7.add(btnThoat);

        btnReset.setBackground(new java.awt.Color(255, 102, 102));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_refresh_25px.png"))); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel7.add(btnReset);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 470, 50));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Thời gian kêt thúc :");
        jPanel8.add(jLabel3);

        lblThoiGianKT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel8.add(lblThoiGianKT);

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 470, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ghi chú :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 30));

        txtGhiChu.setColumns(20);
        txtGhiChu.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 370, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnKetCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetCaActionPerformed
        if (mgsBox.confirm(this, "Bạn có muốn kết ca, hệ thống sẽ đăng xuất")) {
            try {
                setLsCuoi();
                lscldao.update(lichSuCuoi);
                mgsBox.alert(this, "Kết ca thành công");
                timer.stop();

                manHinhChinhGUI.dispose();
                
                DangNhapJFrame dangNhapJFrame = new DangNhapJFrame();
                dangNhapJFrame.setVisible(true);
                
                this.dispose();

                Auth.user = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnKetCaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        if (mgsBox.confirm(this, "Bạn có chắc muốn reset lại tổng tiền?")) {
            reset();
        }
    }//GEN-LAST:event_btnResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKetCa;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDongHoKetCa;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblThoiGianBD;
    private javax.swing.JLabel lblThoiGianKT;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtTienCuoiCa;
    private javax.swing.JTextField txtTienDauCa;
    private javax.swing.JTextField txtTienMat;
    private javax.swing.JTextField txtTienTheNganHang;
    private javax.swing.JTextField txtTienThucThu;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lscldao = new LichSuCaLamDAO();
        hddao = new HoaDonDAO();
        thanhToanDAO = new ThanhToanDAO();
        nhanVienDAO = new NhanVienDAO();
        loaiThanhToanDAO = new LoaiThanhToanDAO();
        caLamDAO = new CaLamDAO();
        tienCuoiCa = 0;
        tienMat = 0;
        tienThe = 0;
        tienThucThu = 0;
        lichSuCuoi = new LichSuCaLam();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                String text = formater.format(now);
                lblDongHoKetCa.setText("Giờ hiện tại: " + text);
            }
        });
        timer.start();

        fillForm();
    }

    private void fillForm() {
        try {
            Timestamp localDate = new Timestamp(System.currentTimeMillis());
            List<LichSuCaLam> lslscl = lscldao.selectAll();
            lichSuCuoi = lslscl.get(lslscl.size() - 1);
            CaLam cl = caLamDAO.selectById(lichSuCuoi.getMaCaLam());
            List<Object[]> lsHD = hddao.getHoaDonTheoCa(lichSuCuoi.getThoiGianBD(), localDate, lichSuCuoi.getMaNV());
            for (Object[] objects : lsHD) {
                int mahd = (int) objects[0];
                BigDecimal bd1 = (BigDecimal) objects[5];
                double tienTraTruoc = bd1.doubleValue();
                BigDecimal bd2 = (BigDecimal) objects[8];
                double tienTongTien = bd2.doubleValue();
                ThanhToan tt = thanhToanDAO.selectById(mahd);
                if (tt.getMaLoaiTT() == 1) {
                    if (tienTongTien == 0) {
                        tienMat += tienTraTruoc;
                    } else {
                        tienMat += tienTongTien;
                    }
                } else if (tt.getMaLoaiTT() == 2) {
                    if (tienTongTien == 0) {
                        tienThe += tienTraTruoc;
                    } else {
                        tienThe += tienTongTien;
                    }
                } else {
                    if (tienTongTien == 0) {
                        tienMat += tienTraTruoc;
                    } else {
                        tienMat += tienTongTien;
                    }
                }
            }

            lblTenNhanVien.setText("Nhân viên: " + nhanVienDAO.selectById(lichSuCuoi.getMaNV()).getHoTen());
            txtTienDauCa.setText(xMoney.doubleToVNDong(lichSuCuoi.getTienThucNhan()));
            txtTienMat.setText(xMoney.doubleToVNDong(tienMat));
            txtTienTheNganHang.setText(xMoney.doubleToVNDong(tienThe));
            tienCuoiCa = tienMat + tienThe + lichSuCuoi.getTienThucNhan();
            txtTienCuoiCa.setText(xMoney.doubleToVNDong(tienCuoiCa));

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String stringTGBD = dateFormat.format(lichSuCuoi.getThoiGianBD());
            lblThoiGianBD.setText(stringTGBD);

            String stringTGKT = dateFormat.format(localDate);
            lblThoiGianKT.setText(stringTGKT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setLsCuoi() {
        Timestamp localDate = new Timestamp(System.currentTimeMillis());
        lichSuCuoi.setTienCuoiCa(tienCuoiCa);
        lichSuCuoi.setTienThucThu(Double.parseDouble(txtTienThucThu.getText()));
        lichSuCuoi.setGhiChuThu(txtGhiChu.getText());
        lichSuCuoi.setTrangThai(false);
        lichSuCuoi.setThoiGianKT(localDate);
    }

    public void reset() {
        if (txtGhiChu.getText().isEmpty()) {
            mgsBox.alert(this, "Chưa có ghi chú xác nhận reset của quản lý");
        } else {
            lichSuCuoi.setTienCuoiCa(0);
            lichSuCuoi.setGhiChuThu(txtGhiChu.getText());
            txtTienCuoiCa.setText("0");
        }
    }

}
