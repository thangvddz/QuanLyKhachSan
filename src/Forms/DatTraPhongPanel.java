/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entities.ChiTietPhongVaDichVu;
import Entities.DichVu;
import Entities.HoaDon;
import Entities.HoaDonChiTiet;
import Entities.KhachHang;
import Entities.LichSuGD;
import Entities.LoaiPhong;
import Entities.Phong;
import Entities.ThongTinPhongDaThue;
import Entities.YeuCau;
import Models.DichVuDAO;
import Models.HoaDonChiTietDAO;
import Models.HoaDonDAO;
import Models.KhachHangDAO;
import Models.LichSuGDDAO;
import Models.LoaiPhongDAO;
import Models.PhongDAO;
import Models.YeuCauDAO;
import Utils.ClickMouse;
import Utils.MapRoom;
import Utils.mgsBox;
import Utils.xDate;
import Utils.xTime;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author you have to better
 */
public class DatTraPhongPanel extends javax.swing.JPanel {

    /**
     * Creates new form DatTraPhongPanel
     */
    KhachHangDAO khachHangDAO;
    HoaDonDAO hoaDonDAO;
    HoaDonChiTietDAO hoaDonChiTietDAO;
    LoaiPhongDAO loaiPhongDAO;
    DichVuDAO dichVuDAO;
    PhongDAO phongDAO;
    LichSuGDDAO lsgddao;
    YeuCauDAO yeuCauDAO;
    private static final int CHECK_IN = 14;
    private static final int CHECK_OUT = 12;
    private static final int LIMIT_CHANGE = 6;
    public static int numSelected;
    public static String maPhong;
    public static int soTang;
    public static String CMT;
    public static KhachHang khachMucTieu;

    public DatTraPhongPanel() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtHinhThucThue = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jdcCheckIn = new com.toedter.calendar.JDateChooser();
        lblNgayChkIn = new javax.swing.JLabel();
        txtGioCheckIn = new javax.swing.JTextField();
        txtGioCheckOut = new javax.swing.JTextField();
        jdcCheckOut = new com.toedter.calendar.JDateChooser();
        lblTenKH = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        lblSoCMT = new javax.swing.JLabel();
        txtSoCMT = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        lblSoDT = new javax.swing.JLabel();
        txtQueQuan = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblQuocTich = new javax.swing.JLabel();
        txtQuocTich = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        cboGioiTinh = new javax.swing.JComboBox<>();
        lblNgaySinh = new javax.swing.JLabel();
        jdcNgaySinh = new com.toedter.calendar.JDateChooser();
        lblPhiPhuThu = new javax.swing.JLabel();
        txtPhiPhuThu = new javax.swing.JTextField();
        lblGiamGia = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPhutCheckIn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPhutCheckOut = new javax.swing.JTextField();
        lblEmail1 = new javax.swing.JLabel();
        cboKhachHangCu = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        lblSoPhongDaThue = new javax.swing.JLabel();
        txtSoPhongDaThue = new javax.swing.JTextField();
        txtTraTruoc = new javax.swing.JTextField();
        lblTraTruoc = new javax.swing.JLabel();
        lblHinhThucThue = new javax.swing.JLabel();
        chkThueTheoNgay = new javax.swing.JCheckBox();
        chkThueTheoGio = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblThongTinPhongDaThue = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTietPhongVaDV = new javax.swing.JTable();
        btnXoaCTP = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        cboDichVu = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jdcThoiGianSDDV = new com.toedter.calendar.JDateChooser();
        btnThemDV = new javax.swing.JButton();
        txtGioDV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPhutDV = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPhongDuocChon = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        btnTraPhong = new javax.swing.JButton();
        btnDatPhong = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Đặt trả phòng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblNgayChkIn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNgayChkIn.setText("Ngày check-in");

        txtGioCheckIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGioCheckIn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGioCheckIn.setToolTipText("");
        txtGioCheckIn.setPreferredSize(new java.awt.Dimension(68, 27));

        txtGioCheckOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGioCheckOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGioCheckOut.setPreferredSize(new java.awt.Dimension(68, 27));

        lblTenKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenKH.setText("Tên khách hàng");

        lblSoCMT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoCMT.setText("Số cmt/Hộ chiếu");

        txtSoCMT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSoCMTKeyPressed(evt);
            }
        });

        lblSoDT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoDT.setText("Số diện thoại");

        lblDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiaChi.setText("Quê Quán/ Địa chỉ");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setText("Email");

        lblQuocTich.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuocTich.setText("Khách hàng:");

        lblGioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGioiTinh.setText("Giới tính");

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblNgaySinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNgaySinh.setText("Ngày sinh");

        lblPhiPhuThu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPhiPhuThu.setText("Phí phụ thu");

        txtPhiPhuThu.setText("0");

        lblGiamGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGiamGia.setText("Giảm giá");

        txtGiamGia.setText("0");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(":");

        txtPhutCheckIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPhutCheckIn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhutCheckIn.setPreferredSize(new java.awt.Dimension(6, 27));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(":");

        txtPhutCheckOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPhutCheckOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblEmail1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail1.setText("Quốc tịch");

        cboKhachHangCu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboKhachHangCuItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQuocTich))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQueQuan))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSoDT))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblSoCMT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSoCMT))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenKhachHang))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNgayChkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdcCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGioCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhutCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblPhiPhuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPhiPhuThu))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGiamGia)))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jdcCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGioCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhutCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboKhachHangCu, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGioCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtGioCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtPhutCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgayChkIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(txtPhutCheckOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboKhachHangCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoCMT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoCMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhiPhuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhiPhuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jdcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết phòng thuê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblSoPhongDaThue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoPhongDaThue.setText("Số phòng đã thuê");

        txtSoPhongDaThue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoPhongDaThue.setText("0");

        txtTraTruoc.setText("0");

        lblTraTruoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTraTruoc.setText("Trả trước");

        lblHinhThucThue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHinhThucThue.setText("Hình thức thuê");

        chkThueTheoNgay.setBackground(new java.awt.Color(255, 255, 255));
        gbtHinhThucThue.add(chkThueTheoNgay);
        chkThueTheoNgay.setText("Thuê theo ngày");

        chkThueTheoGio.setBackground(new java.awt.Color(255, 255, 255));
        gbtHinhThucThue.add(chkThueTheoGio);
        chkThueTheoGio.setText("Thuê theo giờ");

        tblThongTinPhongDaThue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tầng", "Số phòng", "Loại phòng", "Số giường"
            }
        ));
        tblThongTinPhongDaThue.setShowHorizontalLines(false);
        tblThongTinPhongDaThue.setShowVerticalLines(false);
        jScrollPane5.setViewportView(tblThongTinPhongDaThue);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHinhThucThue, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTraTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoPhongDaThue, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(chkThueTheoNgay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkThueTheoGio))
                            .addComponent(txtTraTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoPhongDaThue, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHinhThucThue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkThueTheoNgay)
                    .addComponent(chkThueTheoGio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTraTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTraTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoPhongDaThue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoPhongDaThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết phòng và dịch vụ ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tblChiTietPhongVaDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Số phòng", "Số tầng", "Dịch vụ", "Phi DV", "thời gian gọi", "Check-in", "Check-Out"
            }
        ));
        tblChiTietPhongVaDV.setGridColor(new java.awt.Color(255, 255, 255));
        tblChiTietPhongVaDV.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblChiTietPhongVaDV.setShowHorizontalLines(false);
        tblChiTietPhongVaDV.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tblChiTietPhongVaDV);

        btnXoaCTP.setBackground(new java.awt.Color(102, 102, 255));
        btnXoaCTP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaCTP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_delete_25px.png"))); // NOI18N
        btnXoaCTP.setText("Xóa dịch vụ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnXoaCTP))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoaCTP)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thêm dịch vụ cho phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Chọn Dịch Vụ"));

        cboDichVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Thời gian");

        btnThemDV.setBackground(new java.awt.Color(102, 102, 255));
        btnThemDV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_25px.png"))); // NOI18N
        btnThemDV.setText("Thêm dịch vụ");
        btnThemDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDVActionPerformed(evt);
            }
        });

        txtGioDV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGioDV.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText(":");

        txtPhutDV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboDichVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdcThoiGianSDDV, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtGioDV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhutDV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboDichVu)
                    .addComponent(btnThemDV, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcThoiGianSDDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGioDV, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPhutDV, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin phòng dược chọn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tblPhongDuocChon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblPhongDuocChon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tầng", "Số phòng", "Loại phòng", "Số giường", "Giá ngày", "Giá giờ"
            }
        ));
        tblPhongDuocChon.setGridColor(new java.awt.Color(255, 255, 255));
        tblPhongDuocChon.setShowHorizontalLines(false);
        tblPhongDuocChon.setShowVerticalLines(false);
        tblPhongDuocChon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhongDuocChonMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblPhongDuocChon);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_cancel_25px.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnTraPhong.setBackground(new java.awt.Color(255, 255, 255));
        btnTraPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTraPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_checkout_25px.png"))); // NOI18N
        btnTraPhong.setText("Trả phòng");
        btnTraPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraPhongActionPerformed(evt);
            }
        });

        btnDatPhong.setBackground(new java.awt.Color(255, 255, 255));
        btnDatPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_save_25px.png"))); // NOI18N
        btnDatPhong.setText("Lưu");
        btnDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnTraPhong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnTraPhong)
                    .addComponent(btnDatPhong))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatPhongActionPerformed
        // TODO add your handling code here:
        if (mgsBox.confirm(this, "Bạn có chắc muốn lưu phòng")) {
            DatPhong();
        }
    }//GEN-LAST:event_btnDatPhongActionPerformed

    private void tblPhongDuocChonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhongDuocChonMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblPhongDuocChonMouseClicked

    private void btnThemDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDVActionPerformed
        // TODO add your handling code here:
        insertHDCT();
        fillTableCTPhongDV();
    }//GEN-LAST:event_btnThemDVActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        DatTraPhongJFrame frame = (DatTraPhongJFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtSoCMTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoCMTKeyPressed
        // TODO add your handling code here:
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                CMT = txtSoCMT.getText().trim();
                try {
                    khachMucTieu = khachHangDAO.selectMaKHNew(CMT);
                    clearForm();
                    fillForm(khachMucTieu);
                } catch (Exception e) {
                    khachMucTieu = null;
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_txtSoCMTKeyPressed

    private void btnTraPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraPhongActionPerformed
        // TODO add your handling code here:
        if (mgsBox.confirm(this, "Bạn có chắc muốn trả phòng?")) {
            TraPhong();
        }
    }//GEN-LAST:event_btnTraPhongActionPerformed

    private void cboKhachHangCuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboKhachHangCuItemStateChanged
        // TODO add your handling code here:
        try {
            KhachHang kh = (KhachHang) cboKhachHangCu.getSelectedItem();
            clearForm();
            fillForm(kh);
        } catch (Exception e) {
            clearForm();
        }
    }//GEN-LAST:event_cboKhachHangCuItemStateChanged

    public void init() {
        khachHangDAO = new KhachHangDAO();
        hoaDonDAO = new HoaDonDAO();
        hoaDonChiTietDAO = new HoaDonChiTietDAO();
        phongDAO = new PhongDAO();
        loaiPhongDAO = new LoaiPhongDAO();
        dichVuDAO = new DichVuDAO();
        yeuCauDAO = new YeuCauDAO();
        khachMucTieu = new KhachHang();
        lsgddao = new LichSuGDDAO();
        numSelected = 0;
        maPhong = MapRoom.posPhong;
        soTang = MapRoom.posTang;
        CMT = "";
        txtGioCheckOut.setText("14");
        txtPhutCheckOut.setText("00");
        Date localDate = new Date(System.currentTimeMillis());
        jdcCheckIn.setDate(localDate);
        fillTableChonPhong();
        fillGioiTinh();
        fillComboboxDichVu();
        fillComboboxKhachHangCu();
        fillKhachHangField();
        fillTablePhongDaThue();
        fillTableCTPhongDV();
        if (MapRoom.maKH == 0) {
            xTime.setTimeNow(txtGioCheckIn, txtPhutCheckIn);
        }
    }

    public void DatPhong() {

        //phong khong co nguoi thue makh = 0
        if (MapRoom.maKH == 0) {
            if (checkHinhThuc()) {

                insertKhachHang();
                insertHoaDon();
                insertHDCT();
                insertLSGD();
                mgsBox.alert(this, "Đặt phòng thành công !!!");
                DatTraPhongJFrame frame = (DatTraPhongJFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
            } else {
                mgsBox.alert(this, "Vui lòng chọn hình thức thuê");
            }
        } else {
            System.out.println("da co khach hang thue phong nay");
            int maHDCT = hoaDonChiTietDAO.selectByNewIDReserve(false, MapRoom.posTang, MapRoom.posPhong).getMaCTHD();
            List<LichSuGD> ls = lsgddao.selectByMaHDCT(maHDCT);
            // trang thai bang 0 thue theo ngay, 1 thue theo gio
            if (ls.get(0).isTrangThai() == false) {
                if (chkThueTheoNgay.isSelected()) {
                    // khong oo su thay doi
                    updateLSGD();
                    System.out.println("Cap nhat lai lich su khi khong co su thay doi tu ngay sang gio");
                } else {
                    Object[] lsGio = lsgddao.getHoursRented(maHDCT).get(0);
                    int soGioDaThue = Integer.parseInt(lsGio[0].toString());
                    System.out.println("So gio da thue: " + soGioDaThue);
                    if (soGioDaThue < LIMIT_CHANGE) {
                        mgsBox.alert(this, "Cập nhật từ ngày sang giờ thành công.");
                        updateLSGD();
                    } else {
                        mgsBox.alert(this, "Chuyển đổi ngày sang giờ thất bại vì quá thời gian cho phép đổi.");
                    }
                }
            } else if (ls.get(0).isTrangThai() == true) {
                if (chkThueTheoGio.isSelected()) {
                    // khong oo su thay doi
                    updateLSGD();
                    System.out.println("Cap nhat lai lich su khi khong co su thay doi tu gio sang ngay");
                } else {
                    Object[] lsGio = lsgddao.getHoursRented(maHDCT).get(0);
                    int soGioDaThue = Integer.parseInt(lsGio[0].toString());
                    System.out.println("so. gio da thue: " + soGioDaThue);
                    if (soGioDaThue < LIMIT_CHANGE * 2) {
                        updateLSGD();
                        mgsBox.alert(this, "Cập nhật hình thức giờ sang ngày thành công");
                    } else {
                        if (mgsBox.confirm(this, "Đã quá thời gian được phép cập hình thức thuê(" + LIMIT_CHANGE * 2 + " h), Nếu đồng ý bạn sẽ phải chịu thêm cả phí ngày lẫn phí giờ trong cùng một ngày.")) {
                            updateLSGD();
                            insertLSGD();
                            mgsBox.alert(this, "Chuyển đổi giờ sang ngày thành công");
                            DatTraPhongJFrame frame = (DatTraPhongJFrame) SwingUtilities.getWindowAncestor(this);
                            frame.dispose();
                        }
                    }
                }
            }

        }

    }

    public void TraPhong() {

        if (MapRoom.maKH != 0) {
            updateLSGD();
            TraPhongJframe traPhongJframe = new TraPhongJframe(MapRoom.maKH);
            traPhongJframe.setVisible(true);
            DatTraPhongJFrame frame = (DatTraPhongJFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
        } else {
            mgsBox.alert(this, "Phòng này đã có ai thuê đâu mà trả phòng. nhấn ok đi");
        }
    }

    public void insertKhachHang() {
        CMT = txtSoCMT.getText().trim();
        if (!CMT.equals("")) {
            try {
                khachMucTieu = khachHangDAO.selectMaKHNew(CMT);
                MapRoom.maKH = khachMucTieu.getMaKH();
                khachHangDAO.update(new KhachHang(MapRoom.maKH, CMT, txtTenKhachHang.getText(), txtSoDT.getText(), jdcNgaySinh.getDate(), txtQueQuan.getText(), txtQuocTich.getText(), txtEmail.getText(), (cboGioiTinh.getSelectedIndex() == 0) ? true : false));
            } catch (Exception e) {
                khachHangDAO.insert(new KhachHang(-1, CMT, txtTenKhachHang.getText(), txtSoDT.getText(), jdcNgaySinh.getDate(), txtQueQuan.getText(), txtQuocTich.getText(), txtEmail.getText(), (cboGioiTinh.getSelectedIndex() == 0) ? true : false));
                MapRoom.maKH = khachHangDAO.selectMaKHNew(txtSoCMT.getText()).getMaKH();
            }
        }
    }

    public void updateKhachHang() {
        khachHangDAO.update(new KhachHang(MapRoom.maKH, CMT, txtTenKhachHang.getText(), txtSoDT.getText(), jdcNgaySinh.getDate(), txtQueQuan.getText(), txtQuocTich.getText(), txtEmail.getText(), (cboGioiTinh.getSelectedIndex() == 0) ? true : false));
    }

    public void insertHoaDon() {
        int hoursChkIn = Integer.parseInt(txtGioCheckIn.getText());
        int minutesChkIn = Integer.parseInt(txtPhutCheckIn.getText());
        int hoursChkOut = Integer.parseInt(txtGioCheckOut.getText());
        int minutesChkOut = Integer.parseInt(txtPhutCheckOut.getText());
        try {
            hoaDonDAO.insert(new HoaDon(-1, "NV01", MapRoom.maKH, xTime.getTimeStamp(jdcCheckIn, hoursChkIn, minutesChkIn),
                    xTime.getTimeStamp(jdcCheckOut, hoursChkOut, minutesChkOut), Double.parseDouble(txtTraTruoc.getText()),
                    Double.parseDouble(txtGiamGia.getText()), Double.parseDouble(txtPhiPhuThu.getText()), 0, "Khách này ngầu lắm", false));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertHDCT() {
        try {
            int MaHD = hoaDonDAO.selectHoaDonByKH(MapRoom.maKH, false).getMaHD();
            hoaDonChiTietDAO.insert(new HoaDonChiTiet(-1, MaHD, maPhong, soTang, xDate.toDate(xDate.timeNow(), "dd-MM-yyyy"), false));
            int maDV = cboDichVu.getSelectedIndex();
            if (maDV != 0) {
                insertYeuCauDV();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertLSGD() {
        Timestamp localDate = new Timestamp(System.currentTimeMillis());
        jdcCheckIn.setDate(localDate);
        xTime.getTimeFromDatabase(localDate, txtGioCheckIn, txtPhutCheckIn);
        try {
            int maHDCT = hoaDonChiTietDAO.selectByNewIDReserve(false, MapRoom.posTang, MapRoom.posPhong).getMaCTHD();
            // trang thai true thue theo ngay false thue theo gio
            lsgddao.insert(new LichSuGD(-1, maHDCT,
                    xTime.getTimeStamp(jdcCheckIn, Integer.parseInt(txtGioCheckIn.getText()), Integer.parseInt(txtPhutCheckIn.getText())),
                    xTime.getTimeStamp(jdcCheckOut, Integer.parseInt(txtGioCheckOut.getText()), Integer.parseInt(txtPhutCheckOut.getText())), chkThueTheoNgay.isSelected() ? false : true));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateLSGD() {
        updateKhachHang();
        Timestamp localDate = new Timestamp(System.currentTimeMillis());
        jdcCheckOut.setDate(localDate);
        xTime.getTimeFromDatabase(localDate, txtGioCheckOut, txtPhutCheckOut);
        try {
            int maHDCT = hoaDonChiTietDAO.selectByNewIDReserve(false, MapRoom.posTang, MapRoom.posPhong).getMaCTHD();
            List<LichSuGD> ls = lsgddao.selectByMaHDCT(maHDCT);
            if (ls.size() <= 1) {
                lsgddao.update(new LichSuGD(ls.get(0).getMaLSGD(), maHDCT,
                        xTime.getTimeStamp(jdcCheckIn, Integer.parseInt(txtGioCheckIn.getText()), Integer.parseInt(txtPhutCheckIn.getText())),
                        xTime.getTimeStamp(jdcCheckOut, Integer.parseInt(txtGioCheckOut.getText()), Integer.parseInt(txtPhutCheckOut.getText())), chkThueTheoNgay.isSelected() ? false : true));
            } else {
                lsgddao.update(new LichSuGD(ls.get(0).getMaLSGD(), maHDCT,
                        ls.get(1).getThoiGianKT(),
                        xTime.getTimeStamp(jdcCheckOut, Integer.parseInt(txtGioCheckOut.getText()), Integer.parseInt(txtPhutCheckOut.getText())), chkThueTheoNgay.isSelected() ? false : true));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        HoaDon hd = hoaDonDAO.selectHoaDonByKH(MapRoom.maKH, false);
        Object[] lss = lsgddao.checkOverCheckOut(localDate, hd.getThoiDiemTraPhong(), hd.getMaHD()).get(0);
        jdcCheckOut.setDate(hd.getThoiDiemTraPhong());
        xTime.getTimeFromDatabase(hd.getThoiDiemDatPhong(), txtGioCheckOut, txtPhutCheckOut);
    }

    public void insertYeuCauDV() {
        int maDV = cboDichVu.getSelectedIndex();
        int gioDV = Integer.parseInt(txtGioDV.getText());
        int phutDV = Integer.parseInt(txtPhutDV.getText());
        try {
            System.out.println("maKH : " + MapRoom.maKH);
            int maHDCT = hoaDonChiTietDAO.selectByNewID(hoaDonDAO.selectHoaDonByKH(MapRoom.maKH, false).getMaHD(), false).getMaCTHD();
            yeuCauDAO.insert(new YeuCau(maDV, maHDCT, xTime.getTimeStamp(jdcThoiGianSDDV, gioDV, phutDV), false));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillGioiTinh() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboGioiTinh.getModel();
        model.removeAllElements();
        model.addElement("Nam");
        model.addElement("Nữ");
    }

    public void fillForm(KhachHang kh) {
        txtSoCMT.setText(kh.getSoCMT());
        txtTenKhachHang.setText(kh.getHoTen());
        txtSoDT.setText(kh.getSoDT());
        jdcNgaySinh.setDate(kh.getNgaySinh());
        txtQueQuan.setText(kh.getQueQuan());
        txtQuocTich.setText(kh.getQuocTich());
        txtEmail.setText(kh.getEmail());
        if (kh.isGioiTinh()) {
            cboGioiTinh.setSelectedIndex(0);
        } else {
            cboGioiTinh.setSelectedIndex(1);
        }
    }

    public void fillComboboxKhachHangCu() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhachHangCu.getModel();
        model.removeAllElements();
        model.addElement("none");
        try {
            List<HoaDon> lsHD = hoaDonDAO.selectHD_TT_false(false);

            for (HoaDon hoaDon : lsHD) {
                System.out.println(hoaDon);
                KhachHang kh = khachHangDAO.selectById(hoaDon.getMaKH());
                model.addElement(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillKhachHangField() {
        int makh = MapRoom.maKH;
        if (makh != 0) {
            KhachHang kh = khachHangDAO.selectById(makh);
            fillForm(kh);
            fillHoaDonField(makh);
        }
    }

    public void fillHoaDonField(int maKH) {
        try {

            int maHDCT = hoaDonChiTietDAO.selectByNewIDReserve(false, MapRoom.posTang, MapRoom.posPhong).getMaCTHD();
            List<LichSuGD> ls = lsgddao.selectByMaHDCT(maHDCT);
            HoaDon hd = hoaDonDAO.selectHoaDonByKH(maKH, false);
            jdcCheckIn.setDate(ls.get(ls.size() - 1).getThoiGianBD());
            xTime.getTimeFromDatabase(ls.get(ls.size() - 1).getThoiGianBD(), txtGioCheckIn, txtPhutCheckIn);
            jdcCheckOut.setDate(ls.get(0).getThoiGianKT());
            xTime.getTimeFromDatabase(ls.get(0).getThoiGianKT(), txtGioCheckOut, txtPhutCheckOut);
            txtTraTruoc.setText(String.valueOf(hd.getTienTraTruoc()));
            try {

                if (ls.get(0).isTrangThai()) {
                    chkThueTheoGio.setSelected(true);
                } else {
                    chkThueTheoNgay.setSelected(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
                chkThueTheoNgay.setSelected(true);
            }
            txtPhiPhuThu.setText(String.valueOf(hd.getPhuThu()));
            txtGiamGia.setText(String.valueOf(hd.getGiamGia()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearForm() {
        txtSoCMT.setText("");
        txtTenKhachHang.setText("");
        txtSoDT.setText("");
        jdcNgaySinh.setDate(null);
        txtQueQuan.setText("");
        txtQuocTich.setText("");
        txtEmail.setText("");
        cboGioiTinh.setSelectedIndex(0);
    }

    public void fillTableChonPhong() {
        Phong lsPhong = phongDAO.selectByIdd(MapRoom.posTang, MapRoom.posPhong);
        LoaiPhong lp = loaiPhongDAO.selectById(lsPhong.getMaLoaiPhong());
        DefaultTableModel model = (DefaultTableModel) tblPhongDuocChon.getModel();
        model.setRowCount(0);
        if (lsPhong != null) {
            model.addRow(new Object[]{
                lsPhong.getSoTang(), lsPhong.getMaPhong(), lp.getTenLP(), lp.getSoGiuong(), lp.getGiaNgay(), lp.getGiaGio()
            });
        }
    }

    public void fillComboboxDichVu() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboDichVu.getModel();
        List<DichVu> lsDichVu = dichVuDAO.selectAll();
        model.removeAllElements();
        model.addElement("none");
        try {
            for (DichVu dichVu : lsDichVu) {
                model.addElement(dichVu.getTenDV() + ", Phi: " + dichVu.getPhiDV());
            }
        } catch (Exception e) {
        }
        xTime.setTimeNow(txtGioDV, txtPhutDV);
        Date localDate = new Date(System.currentTimeMillis());
        jdcThoiGianSDDV.setDate(localDate);
    }

    public void clearTableChonPhong() {
        DefaultTableModel model = (DefaultTableModel) tblPhongDuocChon.getModel();
        model.setRowCount(0);
    }

    public void fillTablePhongDaThue() {
        DefaultTableModel model = (DefaultTableModel) tblThongTinPhongDaThue.getModel();
        model.setRowCount(0);
        try {
            List<ThongTinPhongDaThue> lshdct = hoaDonChiTietDAO.selectAllPhongDaThue(hoaDonDAO.selectHoaDonByKH(MapRoom.maKH, false).getMaHD(), false);
            txtSoPhongDaThue.setText(String.valueOf(lshdct.size()));
            for (ThongTinPhongDaThue hoaDonChiTiet : lshdct) {
                int maLp = phongDAO.selectByIdd(hoaDonChiTiet.getSoTang(), hoaDonChiTiet.getMaPhong()).getMaLoaiPhong();
                model.addRow(new Object[]{
                    hoaDonChiTiet.getSoTang(), hoaDonChiTiet.getMaPhong(), loaiPhongDAO.selectById(maLp).getTenLP(), loaiPhongDAO.selectById(maLp).getSoGiuong()
                });
            }
        } catch (Exception e) {
        }
    }

    public void fillTableCTPhongDV() {
        DefaultTableModel model = (DefaultTableModel) tblChiTietPhongVaDV.getModel();
        model.setRowCount(0);
        try {
            List<ChiTietPhongVaDichVu> lsHDCT = hoaDonChiTietDAO.selectAllChiTietPhongVaDichVu(hoaDonDAO.selectHoaDonByKH(MapRoom.maKH, false).getMaHD(), false);
            for (ChiTietPhongVaDichVu chiTietPhongVaDichVu : lsHDCT) {
                model.addRow(new Object[]{
                    chiTietPhongVaDichVu.getMaPhong(),
                    chiTietPhongVaDichVu.getSoTang(),
                    chiTietPhongVaDichVu.getTenDV(),
                    chiTietPhongVaDichVu.getPhiDV(),
                    chiTietPhongVaDichVu.getThoiGianBD(),
                    chiTietPhongVaDichVu.getThoiDiemDatPhong(),
                    chiTietPhongVaDichVu.getThoiDiemTraPhong()
                });
            }
        } catch (Exception e) {
        }

    }

    public boolean checkHinhThuc() {
        if (chkThueTheoGio.isSelected() == false && chkThueTheoNgay.isSelected() == false) {
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDatPhong;
    private javax.swing.JButton btnThemDV;
    private javax.swing.JButton btnTraPhong;
    private javax.swing.JButton btnXoaCTP;
    private javax.swing.JComboBox<String> cboDichVu;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private javax.swing.JComboBox<String> cboKhachHangCu;
    private javax.swing.JCheckBox chkThueTheoGio;
    private javax.swing.JCheckBox chkThueTheoNgay;
    private javax.swing.ButtonGroup gbtHinhThucThue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private com.toedter.calendar.JDateChooser jdcCheckIn;
    private com.toedter.calendar.JDateChooser jdcCheckOut;
    private com.toedter.calendar.JDateChooser jdcNgaySinh;
    private com.toedter.calendar.JDateChooser jdcThoiGianSDDV;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblGiamGia;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHinhThucThue;
    private javax.swing.JLabel lblNgayChkIn;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblPhiPhuThu;
    private javax.swing.JLabel lblQuocTich;
    private javax.swing.JLabel lblSoCMT;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblSoPhongDaThue;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTraTruoc;
    private javax.swing.JTable tblChiTietPhongVaDV;
    private javax.swing.JTable tblPhongDuocChon;
    private javax.swing.JTable tblThongTinPhongDaThue;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtGioCheckIn;
    private javax.swing.JTextField txtGioCheckOut;
    private javax.swing.JTextField txtGioDV;
    private javax.swing.JTextField txtPhiPhuThu;
    private javax.swing.JTextField txtPhutCheckIn;
    private javax.swing.JTextField txtPhutCheckOut;
    private javax.swing.JTextField txtPhutDV;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtQuocTich;
    private javax.swing.JTextField txtSoCMT;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtSoPhongDaThue;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTraTruoc;
    // End of variables declaration//GEN-END:variables
}
