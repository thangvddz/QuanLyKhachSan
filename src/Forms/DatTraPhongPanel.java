/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entities.ChiTietPhongVaDichVu;
import Entities.Config;
import Entities.DichVu;
import Entities.HoaDon;
import Entities.HoaDonChiTiet;
import Entities.KhachHang;
import Entities.LichSuGD;
import Entities.LoaiPhong;
import Entities.LoaiThanhToan;
import Entities.Phong;
import Entities.ThanhToan;
import Entities.ThongTinPhongDaThue;
import Entities.YeuCau;
import Models.DichVuDAO;
import Models.HoaDonChiTietDAO;
import Models.HoaDonDAO;
import Models.KhachHangDAO;
import Models.LichSuGDDAO;
import Models.LoaiPhongDAO;
import Models.LoaiThanhToanDAO;
import Models.PhongDAO;
import Models.ThanhToanDAO;
import Models.YeuCauDAO;
import Utils.Auth;
import Utils.MapRoom;
import Utils.checkText;
import Utils.mgsBox;
import Utils.xDate;
import Utils.xFile;
import Utils.xMoney;
import Utils.xTime;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
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
    LoaiThanhToanDAO loaiThanhToanDAO;
    LichSuGDDAO lsgddao;
    ThanhToanDAO thanhToanDAO;
    YeuCauDAO yeuCauDAO;
    public static int CHECK_IN = 14;
    public static int CHECK_OUT = 12;
    public static int LIMIT_CHANGE = 6;
    public static int numSelected;
    public static String maPhong;
    public static int soTang;
    public static String CMT;
    public static KhachHang khachMucTieu;
    List<ChiTietPhongVaDichVu> lsCTPVDV;
    public static int index_tbl_dvdsd;
    int makh_dathue;
    
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
        jPanel7 = new javax.swing.JPanel();
        lblNgayChkIn = new javax.swing.JLabel();
        jdcCheckIn = new com.toedter.calendar.JDateChooser();
        txtGioCheckIn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPhutCheckIn = new javax.swing.JTextField();
        jdcCheckOut = new com.toedter.calendar.JDateChooser();
        txtGioCheckOut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPhutCheckOut = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        lblTenKH = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        lblQuocTich = new javax.swing.JLabel();
        cboKhachHangCu = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        lblSoCMT = new javax.swing.JLabel();
        txtSoCMT = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        cboGioiTinh = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        lblSoDT = new javax.swing.JLabel();
        txtSoDT = new javax.swing.JTextField();
        lblNgaySinh = new javax.swing.JLabel();
        jdcNgaySinh = new com.toedter.calendar.JDateChooser();
        jPanel13 = new javax.swing.JPanel();
        lblDiaChi = new javax.swing.JLabel();
        txtQueQuan = new javax.swing.JTextField();
        lblPhiPhuThu = new javax.swing.JLabel();
        txtPhiPhuThu = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblGiamGia = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        lblEmail1 = new javax.swing.JLabel();
        txtQuocTich = new javax.swing.JTextField();
        lblThanhToan = new javax.swing.JLabel();
        cboThanhToan = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblThongTinPhongDaThue = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        lblSoPhongDaThue = new javax.swing.JLabel();
        txtSoPhongDaThue = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        lblHinhThucThue = new javax.swing.JLabel();
        chkThueTheoNgay = new javax.swing.JCheckBox();
        chkThueTheoGio = new javax.swing.JCheckBox();
        jPanel18 = new javax.swing.JPanel();
        lblTraTruoc = new javax.swing.JLabel();
        txtTraTruoc = new javax.swing.JTextField();
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
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        lblNgayChkIn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNgayChkIn.setText("Ngày check-in :");
        jPanel7.add(lblNgayChkIn);

        jdcCheckIn.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel7.add(jdcCheckIn);

        txtGioCheckIn.setEditable(false);
        txtGioCheckIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGioCheckIn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGioCheckIn.setToolTipText("");
        txtGioCheckIn.setMinimumSize(new java.awt.Dimension(33, 33));
        txtGioCheckIn.setPreferredSize(new java.awt.Dimension(33, 33));
        jPanel7.add(txtGioCheckIn);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(":");
        jPanel7.add(jLabel1);

        txtPhutCheckIn.setEditable(false);
        txtPhutCheckIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPhutCheckIn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhutCheckIn.setPreferredSize(new java.awt.Dimension(33, 33));
        jPanel7.add(txtPhutCheckIn);

        jdcCheckOut.setPreferredSize(new java.awt.Dimension(130, 33));
        jPanel7.add(jdcCheckOut);

        txtGioCheckOut.setEditable(false);
        txtGioCheckOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGioCheckOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGioCheckOut.setPreferredSize(new java.awt.Dimension(33, 33));
        jPanel7.add(txtGioCheckOut);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(":");
        jPanel7.add(jLabel2);

        txtPhutCheckOut.setEditable(false);
        txtPhutCheckOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPhutCheckOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhutCheckOut.setPreferredSize(new java.awt.Dimension(33, 33));
        jPanel7.add(txtPhutCheckOut);

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 640, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        lblTenKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenKH.setText("Tên khách hàng :");
        jPanel10.add(lblTenKH);

        txtTenKhachHang.setPreferredSize(new java.awt.Dimension(320, 33));
        jPanel10.add(txtTenKhachHang);

        lblQuocTich.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuocTich.setText(" Khách hàng :");
        jPanel10.add(lblQuocTich);

        cboKhachHangCu.setPreferredSize(new java.awt.Dimension(150, 33));
        cboKhachHangCu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboKhachHangCuItemStateChanged(evt);
            }
        });
        jPanel10.add(cboKhachHangCu);

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 680, 40));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        lblSoCMT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoCMT.setText(" Số cmt/Hộ chiếu :");
        jPanel11.add(lblSoCMT);

        txtSoCMT.setPreferredSize(new java.awt.Dimension(320, 33));
        txtSoCMT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSoCMTKeyPressed(evt);
            }
        });
        jPanel11.add(txtSoCMT);

        lblGioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGioiTinh.setText("        Giới tính :");
        jPanel11.add(lblGioiTinh);

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboGioiTinh.setPreferredSize(new java.awt.Dimension(150, 33));
        jPanel11.add(cboGioiTinh);

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 700, 40));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 5));

        lblSoDT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoDT.setText(" Số diện thoại :");
        jPanel12.add(lblSoDT);

        txtSoDT.setPreferredSize(new java.awt.Dimension(320, 33));
        jPanel12.add(txtSoDT);

        lblNgaySinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNgaySinh.setText("   Ngày sinh :");
        jPanel12.add(lblNgaySinh);

        jdcNgaySinh.setPreferredSize(new java.awt.Dimension(150, 33));
        jPanel12.add(jdcNgaySinh);

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 680, 40));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 5));

        lblDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiaChi.setText(" Quê Quán/ Địa chỉ :");
        jPanel13.add(lblDiaChi);

        txtQueQuan.setPreferredSize(new java.awt.Dimension(320, 33));
        jPanel13.add(txtQueQuan);

        lblPhiPhuThu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPhiPhuThu.setText("Phí Phụ Thu :");
        jPanel13.add(lblPhiPhuThu);

        txtPhiPhuThu.setText("0");
        txtPhiPhuThu.setPreferredSize(new java.awt.Dimension(150, 33));
        jPanel13.add(txtPhiPhuThu);

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 180, 730, 40));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 5));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setText(" Email :");
        jPanel14.add(lblEmail);

        txtEmail.setPreferredSize(new java.awt.Dimension(320, 33));
        jPanel14.add(txtEmail);

        lblGiamGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGiamGia.setText("      Giảm giá :");
        jPanel14.add(lblGiamGia);

        txtGiamGia.setText("0");
        txtGiamGia.setPreferredSize(new java.awt.Dimension(150, 33));
        jPanel14.add(txtGiamGia);

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 650, -1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 5));

        lblEmail1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail1.setText("Quốc tịch :");
        jPanel15.add(lblEmail1);

        txtQuocTich.setPreferredSize(new java.awt.Dimension(320, 33));
        jPanel15.add(txtQuocTich);

        lblThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblThanhToan.setText("  Thanh toán :");
        jPanel15.add(lblThanhToan);

        cboThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboThanhToan.setPreferredSize(new java.awt.Dimension(150, 33));
        jPanel15.add(cboThanhToan);

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 670, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết phòng thuê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

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
        tblThongTinPhongDaThue.setRowHeight(30);
        tblThongTinPhongDaThue.setShowHorizontalLines(false);
        tblThongTinPhongDaThue.setShowVerticalLines(false);
        jScrollPane5.setViewportView(tblThongTinPhongDaThue);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblSoPhongDaThue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoPhongDaThue.setText("Số phòng đã thuê :");
        lblSoPhongDaThue.setPreferredSize(new java.awt.Dimension(130, 33));
        jPanel16.add(lblSoPhongDaThue);

        txtSoPhongDaThue.setEditable(false);
        txtSoPhongDaThue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoPhongDaThue.setText("0");
        txtSoPhongDaThue.setPreferredSize(new java.awt.Dimension(33, 33));
        jPanel16.add(txtSoPhongDaThue);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblHinhThucThue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHinhThucThue.setText("Hình thức thuê :");
        lblHinhThucThue.setPreferredSize(new java.awt.Dimension(130, 33));
        jPanel17.add(lblHinhThucThue);

        chkThueTheoNgay.setBackground(new java.awt.Color(255, 255, 255));
        gbtHinhThucThue.add(chkThueTheoNgay);
        chkThueTheoNgay.setText("Thuê theo ngày");
        jPanel17.add(chkThueTheoNgay);

        chkThueTheoGio.setBackground(new java.awt.Color(255, 255, 255));
        gbtHinhThucThue.add(chkThueTheoGio);
        chkThueTheoGio.setText("Thuê theo giờ");
        jPanel17.add(chkThueTheoGio);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblTraTruoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTraTruoc.setText("Trả trước :");
        lblTraTruoc.setPreferredSize(new java.awt.Dimension(130, 33));
        jPanel18.add(lblTraTruoc);

        txtTraTruoc.setText("0");
        txtTraTruoc.setPreferredSize(new java.awt.Dimension(150, 33));
        jPanel18.add(txtTraTruoc);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết phòng và dịch vụ ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tblChiTietPhongVaDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Số phòng", "Số tầng", "Dịch vụ", "Phi DV", "thời gian gọi"
            }
        ));
        tblChiTietPhongVaDV.setGridColor(new java.awt.Color(255, 255, 255));
        tblChiTietPhongVaDV.setRowHeight(30);
        tblChiTietPhongVaDV.setSelectionBackground(new java.awt.Color(0, 102, 204));
        tblChiTietPhongVaDV.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblChiTietPhongVaDV.setShowHorizontalLines(false);
        tblChiTietPhongVaDV.setShowVerticalLines(false);
        tblChiTietPhongVaDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietPhongVaDVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblChiTietPhongVaDV);

        btnXoaCTP.setBackground(new java.awt.Color(102, 102, 255));
        btnXoaCTP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaCTP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_delete_25px.png"))); // NOI18N
        btnXoaCTP.setText("Xóa dịch vụ");
        btnXoaCTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCTPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
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
        cboDichVu.setPreferredSize(new java.awt.Dimension(64, 33));
        cboDichVu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDichVuItemStateChanged(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Thời gian");

        jdcThoiGianSDDV.setPreferredSize(new java.awt.Dimension(100, 33));

        btnThemDV.setBackground(new java.awt.Color(102, 102, 255));
        btnThemDV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_25px.png"))); // NOI18N
        btnThemDV.setText("Thêm dịch vụ");
        btnThemDV.setEnabled(false);

        txtGioDV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGioDV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGioDV.setPreferredSize(new java.awt.Dimension(33, 33));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(":");

        txtPhutDV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPhutDV.setPreferredSize(new java.awt.Dimension(33, 33));

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
                        .addGap(5, 5, 5)
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
                    .addComponent(cboDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemDV, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPhutDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGioDV, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jdcThoiGianSDDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
        tblPhongDuocChon.setRowHeight(30);
        tblPhongDuocChon.setShowHorizontalLines(false);
        tblPhongDuocChon.setShowVerticalLines(false);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                KhachHang kh = (KhachHang) cboKhachHangCu.getSelectedItem();
                clearForm();
                makh_dathue = kh.getMaKH();
                fillForm(kh);
                
            } catch (Exception e) {
                clearForm();
            }
        }
    }//GEN-LAST:event_cboKhachHangCuItemStateChanged

    private void cboDichVuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDichVuItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                addDV();
                fillTableCTPhongDV();
                cboDichVu.setSelectedIndex(0);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_cboDichVuItemStateChanged

    private void tblChiTietPhongVaDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietPhongVaDVMouseClicked
        // TODO add your handling code here:
        index_tbl_dvdsd = tblChiTietPhongVaDV.getSelectedRow();
    }//GEN-LAST:event_tblChiTietPhongVaDVMouseClicked

    private void btnXoaCTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCTPActionPerformed
        // TODO add your handling code here:
        deleteDV();
    }//GEN-LAST:event_btnXoaCTPActionPerformed
    
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
        loaiThanhToanDAO = new LoaiThanhToanDAO();
        thanhToanDAO = new ThanhToanDAO();
        numSelected = 0;
        makh_dathue = 0;
        index_tbl_dvdsd = -1;
        maPhong = MapRoom.posPhong;
        soTang = MapRoom.posTang;
        CMT = "";
        setTimeHoll();
        lsCTPVDV = new ArrayList<>();
        Date localDate = new Date(System.currentTimeMillis());
        jdcCheckIn.setDate(localDate);
        fillTableChonPhong();
        fillGioiTinh();
        fillComboboxDichVu();
        fillComboboxThanhToan();
        fillComboboxKhachHangCu();
        fillKhachHangField();
        fillTablePhongDaThue();
        fillLsCTPVDV();
        fillTableCTPhongDV();
        if (MapRoom.maKH == 0) {
            xTime.setTimeNow(txtGioCheckIn, txtPhutCheckIn);
        }
    }
    
    public void setTimeHoll() {
        Config c = (Config) xFile.readFile();
        txtGioCheckOut.setText(String.valueOf(c.getGioChkOut()));
        if (c.getPhutChkOut() >= 0 && c.getPhutChkOut() < 10) {
            txtPhutCheckOut.setText(String.valueOf(c.getPhutChkOut()) + "0");
        } else {
            txtPhutCheckOut.setText(String.valueOf(c.getPhutChkOut()));
        }
        
    }
    
    public void DatPhong() {

        //phong khong co nguoi thue makh = 0
        if (MapRoom.maKH == 0) {
            if (checkHinhThuc()) {
                if (checkThongTinKhachNhapVao()) {
                    try {
                        // chon khách cũ
                        System.out.println("ma kh dat thue: " + makh_dathue);
                        HoaDon hd = hoaDonDAO.selectHoaDonByKH(makh_dathue, false);
                        MapRoom.maKH = makh_dathue;
                        insertHDCT();
                        insertLSGD();
                        mgsBox.alert(this, "Đặt phòng thành công !!!");
                        DatTraPhongJFrame frame = (DatTraPhongJFrame) SwingUtilities.getWindowAncestor(this);
                        frame.dispose();
                    } catch (Exception e) {
                        // khong chon khach cu
//                        e.printStackTrace();
                        insertKhachHang();
                        insertHoaDon();
                        insertHDCT();
                        insertLSGD();
                        mgsBox.alert(this, "Đặt phòng thành công !!!");
                        DatTraPhongJFrame frame = (DatTraPhongJFrame) SwingUtilities.getWindowAncestor(this);
                        frame.dispose();
                    }
                }
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
                            try {
                                int maHDCTT = hoaDonChiTietDAO.selectByNewIDReserve(false, MapRoom.posTang, MapRoom.posPhong).getMaCTHD();
                                List<LichSuGD> lss = lsgddao.selectByMaHDCT(maHDCT);
                                int siz = lss.size();
                                lsgddao.update(new LichSuGD(lss.get(siz - 1).getMaLSGD(), maHDCTT,
                                        xTime.getTimeStamp(jdcCheckIn, Integer.parseInt(txtGioCheckIn.getText()), Integer.parseInt(txtPhutCheckIn.getText())),
                                        xTime.getTimeStamp(jdcCheckOut, Integer.parseInt(txtGioCheckOut.getText()), Integer.parseInt(txtPhutCheckOut.getText())),
                                        true));
                                xTime.setTimeNow(txtGioDV, txtPhutDV);
                                Date localDate = new Date(System.currentTimeMillis());
                                jdcCheckIn.setDate(localDate);
                                insertLSGD();
                                mgsBox.alert(this, "Chuyển đổi giờ sang ngày thành công");
                                DatTraPhongJFrame frame = (DatTraPhongJFrame) SwingUtilities.getWindowAncestor(this);
                                frame.dispose();
                            } catch (Exception e) {
                                mgsBox.alert(this, "Có lỗi xảy ra !");
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
            
        }
        
    }
    
    public boolean checkThongTinKhachNhapVao() {
        if (checkText.issEmpty(txtTenKhachHang.getText())) {
            mgsBox.alert(this, "Tên khách hàng không được để trống");
        } else {
            if (checkText.CheckNumChar(txtSoCMT.getText(), 15)) {
                if (checkText.isPhoneNumber(txtSoDT.getText().trim())) {
                    if (checkText.isValidEmailAddress(txtEmail.getText().trim()) || txtEmail.getText().trim().equals("")) {
                        if (checkText.issNum(txtPhiPhuThu.getText())) {
                            if (checkText.issNum(txtGiamGia.getText())) {
                                if (checkText.issNum(txtTraTruoc.getText())) {
                                    return true;
                                } else {
                                    mgsBox.alert(this, "Phí Trả trước phải nhập số");
                                }
                            } else {
                                mgsBox.alert(this, "Phí giảm giá phải nhập số");
                            }
                        } else {
                            mgsBox.alert(this, "Phí phụ thu phải nhập số");
                        }
                    } else {
                        mgsBox.alert(this, "Địa chỉ Email không đúng định dạng");
                    }
                } else {
                    mgsBox.alert(this, "Số điện thoại không đúng định dạng");
                }
            } else {
                mgsBox.alert(this, "Số chứng minh thư không quá 15 ký tự");
            }
        }
        return false;
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
        try {
            khachHangDAO.update(new KhachHang(MapRoom.maKH, txtSoCMT.getText(), txtTenKhachHang.getText(), txtSoDT.getText(), jdcNgaySinh.getDate(), txtQueQuan.getText(), txtQuocTich.getText(), txtEmail.getText(), (cboGioiTinh.getSelectedIndex() == 0) ? true : false));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void insertHoaDon() {
        int hoursChkIn = Integer.parseInt(txtGioCheckIn.getText());
        int minutesChkIn = Integer.parseInt(txtPhutCheckIn.getText());
        int hoursChkOut = Integer.parseInt(txtGioCheckOut.getText());
        int minutesChkOut = Integer.parseInt(txtPhutCheckOut.getText());
        try {
            if (jdcCheckOut.getDate() != null) {
                hoaDonDAO.insert(new HoaDon(-1, Auth.user.getMaNV(), MapRoom.maKH, xTime.getTimeStamp(jdcCheckIn, hoursChkIn, minutesChkIn),
                        xTime.getTimeStamp(jdcCheckOut, hoursChkOut, minutesChkOut), Double.parseDouble(txtTraTruoc.getText()),
                        Double.parseDouble(txtGiamGia.getText()), Double.parseDouble(txtPhiPhuThu.getText()), 0, "Khách này ngầu lắm", false));
            } else {
                hoaDonDAO.insert(new HoaDon(-1, Auth.user.getMaNV(), MapRoom.maKH, xTime.getTimeStamp(jdcCheckIn, hoursChkIn, minutesChkIn),
                        null, Double.parseDouble(txtTraTruoc.getText()),
                        Double.parseDouble(txtGiamGia.getText()), Double.parseDouble(txtPhiPhuThu.getText()), 0, "Khách này ngầu lắm", false));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        insertThanhToan();
    }
    
    public void updateHoaDon() {
        int hoursChkIn = Integer.parseInt(txtGioCheckIn.getText());
        int minutesChkIn = Integer.parseInt(txtPhutCheckIn.getText());
        int hoursChkOut = Integer.parseInt(txtGioCheckOut.getText());
        int minutesChkOut = Integer.parseInt(txtPhutCheckOut.getText());
        HoaDon hd = hoaDonDAO.selectHoaDonByKH(MapRoom.maKH, false);
        if (jdcCheckOut.getDate() != null) {
            hoaDonDAO.update(new HoaDon(hd.getMaHD(), Auth.user.getMaNV(), MapRoom.maKH, xTime.getTimeStamp(jdcCheckIn, hoursChkIn, minutesChkIn),
                    xTime.getTimeStamp(jdcCheckOut, hoursChkOut, minutesChkOut),
                    xMoney.VNDongToDouble(txtTraTruoc.getText()),
                    xMoney.VNDongToDouble(txtGiamGia.getText()),
                    xMoney.VNDongToDouble(txtPhiPhuThu.getText()), 0, "Khách này ngầu lắm", false));
        } else {
            hoaDonDAO.update(new HoaDon(hd.getMaHD(), Auth.user.getMaNV(), MapRoom.maKH, xTime.getTimeStamp(jdcCheckIn, hoursChkIn, minutesChkIn),
                    null,
                    xMoney.VNDongToDouble(txtTraTruoc.getText()),
                    xMoney.VNDongToDouble(txtGiamGia.getText()),
                    xMoney.VNDongToDouble(txtPhiPhuThu.getText()), 0, "Khách này ngầu lắm", false));
        }
        updateThanhToan();
    }
    
    public void insertHDCT() {
        try {
            addAfterRent();
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
            if (jdcCheckOut.getDate() != null) {
                lsgddao.insert(new LichSuGD(-1, maHDCT,
                        xTime.getTimeStamp(jdcCheckIn, Integer.parseInt(txtGioCheckIn.getText()), Integer.parseInt(txtPhutCheckIn.getText())),
                        xTime.getTimeStamp(jdcCheckOut, Integer.parseInt(txtGioCheckOut.getText()), Integer.parseInt(txtPhutCheckOut.getText())),
                        chkThueTheoNgay.isSelected() ? false : true));
            } else {
                lsgddao.insert(new LichSuGD(-1, maHDCT,
                        xTime.getTimeStamp(jdcCheckIn, Integer.parseInt(txtGioCheckIn.getText()), Integer.parseInt(txtPhutCheckIn.getText())),
                        null,
                        chkThueTheoNgay.isSelected() ? false : true));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateLSGD() {
        updateKhachHang();
        updateHoaDon();
        Timestamp localDate = new Timestamp(System.currentTimeMillis());
        jdcCheckOut.setDate(localDate);
        xTime.getTimeFromDatabase(localDate, txtGioCheckOut, txtPhutCheckOut);
        try {
            int maHDCT = hoaDonChiTietDAO.selectByNewIDReserve(false, MapRoom.posTang, MapRoom.posPhong).getMaCTHD();
            List<LichSuGD> ls = lsgddao.selectByMaHDCT(maHDCT);
            int siz = ls.size();
            if (siz <= 1) {
                lsgddao.update(new LichSuGD(ls.get(0).getMaLSGD(), maHDCT,
                        xTime.getTimeStamp(jdcCheckIn, Integer.parseInt(txtGioCheckIn.getText()), Integer.parseInt(txtPhutCheckIn.getText())),
                        xTime.getTimeStamp(jdcCheckOut, Integer.parseInt(txtGioCheckOut.getText()), Integer.parseInt(txtPhutCheckOut.getText())),
                        chkThueTheoNgay.isSelected() ? false : true));
            } else {
                lsgddao.update(new LichSuGD(ls.get(0).getMaLSGD(), maHDCT,
                        ls.get(1).getThoiGianKT(),
                        xTime.getTimeStamp(jdcCheckOut, Integer.parseInt(txtGioCheckOut.getText()), Integer.parseInt(txtPhutCheckOut.getText())),
                        chkThueTheoNgay.isSelected() ? false : true));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            HoaDon hd = hoaDonDAO.selectHoaDonByKH(MapRoom.maKH, false);
            jdcCheckOut.setDate(hd.getThoiDiemTraPhong());
            xTime.getTimeFromDatabase(hd.getThoiDiemDatPhong(), txtGioCheckIn, txtPhutCheckIn);
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
    
    public void fillComboboxThanhToan() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboThanhToan.getModel();
        model.removeAllElements();
        try {
            List<LoaiThanhToan> ls = loaiThanhToanDAO.selectAll();
            for (LoaiThanhToan l : ls) {
                model.addElement(l);
            }
        } catch (Exception e) {
        }
    }
    
    public void insertThanhToan() {
        try {
            HoaDon hd = hoaDonDAO.selectHoaDonByKH(MapRoom.maKH, false);
            LoaiThanhToan tt = (LoaiThanhToan) cboThanhToan.getSelectedItem();
            Timestamp ThoiGianThanhToan = new Timestamp(System.currentTimeMillis());
            thanhToanDAO.insert(new ThanhToan(hd.getMaHD(), tt.getLoaiThanhToan(), ThoiGianThanhToan, "Thanh toan tra truoc"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateThanhToan() {
        try {
            HoaDon hd = hoaDonDAO.selectHoaDonByKH(MapRoom.maKH, false);
            LoaiThanhToan tt = (LoaiThanhToan) cboThanhToan.getSelectedItem();
            Timestamp ThoiGianThanhToan = new Timestamp(System.currentTimeMillis());
            thanhToanDAO.update(new ThanhToan(hd.getMaHD(), tt.getLoaiThanhToan(), ThoiGianThanhToan, "Thanh toan tra truoc"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void fillComboboxKhachHangCu() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhachHangCu.getModel();
        model.removeAllElements();
        model.addElement("none");
        try {
            List<HoaDon> lsHD = hoaDonDAO.selectHD_TT_false(false);
            
            for (HoaDon hoaDon : lsHD) {
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
            if (ls.get(0).getThoiGianKT() != null) {
                jdcCheckOut.setDate(ls.get(0).getThoiGianKT());
                xTime.getTimeFromDatabase(ls.get(0).getThoiGianKT(), txtGioCheckOut, txtPhutCheckOut);
            }
            
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
            txtTraTruoc.setText(xMoney.doubleToVNDong(hd.getTienTraTruoc()));
            txtPhiPhuThu.setText(xMoney.doubleToVNDong(hd.getPhuThu()));
            txtGiamGia.setText(xMoney.doubleToVNDong(hd.getGiamGia()));
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
                lsPhong.getSoTang(), lsPhong.getMaPhong(), lp.getTenLP(), lp.getSoGiuong(), xMoney.doubleToVNDong(lp.getGiaNgay()), xMoney.doubleToVNDong(lp.getGiaGio())
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
                model.addElement(dichVu);
            }
        } catch (Exception e) {
            e.printStackTrace();
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
            for (ChiTietPhongVaDichVu chiTietPhongVaDichVu : lsCTPVDV) {
                model.addRow(new Object[]{
                    chiTietPhongVaDichVu.getMaPhong(),
                    chiTietPhongVaDichVu.getSoTang(),
                    chiTietPhongVaDichVu.getTenDV(),
                    xMoney.doubleToVNDong(chiTietPhongVaDichVu.getPhiDV()),
                    chiTietPhongVaDichVu.getThoiGianBD()
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void fillLsCTPVDV() {
        try {
            List<YeuCau> lsyc = yeuCauDAO.selectAllMAHDCT(false, maPhong, soTang);
            for (YeuCau yeuCau : lsyc) {
                DichVu dv = dichVuDAO.selectById(yeuCau.getMaDV());
                ChiTietPhongVaDichVu ct = new ChiTietPhongVaDichVu(maPhong, soTang, dv.getTenDV(), dv.getPhiDV(), yeuCau.getThoiGianBDSD(), yeuCau.getMaDV());
                lsCTPVDV.add(ct);
            }
        } catch (Exception e) {
            System.out.println("Chua yeu cau dich vu");
        }
    }
    
    public void addDV() {
        DichVu dv = (DichVu) cboDichVu.getSelectedItem();
        int gioDV = Integer.parseInt(txtGioDV.getText());
        int phutDV = Integer.parseInt(txtPhutDV.getText());
        if (MapRoom.maKH == 0) {
            lsCTPVDV.add(new ChiTietPhongVaDichVu(MapRoom.posPhong, MapRoom.posTang, dv.getTenDV(), dv.getPhiDV(), xTime.getTimeStamp(jdcThoiGianSDDV, gioDV, phutDV), dv.getMaDV()));
        } else {
            int MaHD = hoaDonDAO.selectHoaDonByKH(MapRoom.maKH, false).getMaHD();
            hoaDonChiTietDAO.insert(new HoaDonChiTiet(-1, MaHD, maPhong, soTang, xDate.toDate(xDate.timeNow(), "dd-MM-yyyy"), false));
            int maHDCT = hoaDonChiTietDAO.selectByNewID(MaHD, false).getMaCTHD();
            yeuCauDAO.insert(new YeuCau(dv.getMaDV(), maHDCT, xTime.getTimeStamp(jdcThoiGianSDDV, gioDV, phutDV), false));
            ChiTietPhongVaDichVu ct = new ChiTietPhongVaDichVu(maPhong, soTang, dv.getTenDV(), dv.getPhiDV(), xTime.getTimeStamp(jdcThoiGianSDDV, gioDV, phutDV), dv.getMaDV());
            lsCTPVDV.add(ct);
            fillTableCTPhongDV();
            mgsBox.alert(this, "Thêm dịch vụ thành công nha...");
        }
    }
    
    public void deleteDV() {
        if (mgsBox.confirm(this, "Bạn có chắc muốn xóa dịch vụ này không ?")) {
            if (index_tbl_dvdsd != -1) {
                try {
                    if (MapRoom.maKH == 0) {
                        lsCTPVDV.remove(index_tbl_dvdsd);
                        fillTableCTPhongDV();
                        mgsBox.alert(this, "Xóa thành công dịch vụ");
                        index_tbl_dvdsd = -1;
                    } else {
                        List<HoaDonChiTiet> lshdct = hoaDonChiTietDAO.selectListDVDSD(false, soTang, maPhong);
                        int mahdct = lshdct.get(index_tbl_dvdsd).getMaCTHD();
                        yeuCauDAO.delete(mahdct);
                        hoaDonChiTietDAO.delete(mahdct);
                        lsCTPVDV.remove(index_tbl_dvdsd);
                        fillTableCTPhongDV();
                        mgsBox.alert(this, "Xóa thành công dịch vụ");
                        index_tbl_dvdsd = -1;
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                mgsBox.alert(this, "Vui lòng chọn dịch vụ trên bảng rồi mới nhấn xóa.");
            }
        }
    }
    
    public void addAfterRent() {
        int MaHD = hoaDonDAO.selectHoaDonByKH(MapRoom.maKH, false).getMaHD();
        try {
            if (lsCTPVDV.isEmpty()) {
                hoaDonChiTietDAO.insert(new HoaDonChiTiet(-1, MaHD, maPhong, soTang, xDate.toDate(xDate.timeNow(), "dd-MM-yyyy"), false));
            } else {
                for (int i = 0; i < lsCTPVDV.size(); i++) {
                    hoaDonChiTietDAO.insert(new HoaDonChiTiet(-1, MaHD, maPhong, soTang, xDate.toDate(xDate.timeNow(), "dd-MM-yyyy"), false));
                    int maHDCT = hoaDonChiTietDAO.selectByNewID(MaHD, false).getMaCTHD();
                    yeuCauDAO.insert(new YeuCau(lsCTPVDV.get(i).getMaDV(), maHDCT, lsCTPVDV.get(i).getThoiGianBD(), false));
                }
            }
            
        } catch (Exception e) {
            System.out.println("thue dau tien");
            e.printStackTrace();
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
    private javax.swing.JComboBox<String> cboThanhToan;
    private javax.swing.JCheckBox chkThueTheoGio;
    private javax.swing.JCheckBox chkThueTheoNgay;
    private javax.swing.ButtonGroup gbtHinhThucThue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
    private javax.swing.JLabel lblThanhToan;
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
