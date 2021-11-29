/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entities.LoaiPhong;
import Entities.Phong;
import Entities.Tang;
import Entities.TrangThai;
import static Forms.QuanLyPhongPanel.gbc;
import Models.LoaiPhongDAO;
import Models.PhongDAO;
import Models.TangDAO;
import Models.TrangThaiDAO;
import Utils.ClickMouse;
import Utils.MapRoom;
import Utils.checkText;
import Utils.mgsBox;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import static Forms.QuanLyPhongPanel.pnlQuanLyPhong;

/**
 *
 * @author you have to better
 */
public class ThemPhongJframe extends javax.swing.JFrame {

    PhongDAO pdao;
    LoaiPhongDAO lpdao;
    TrangThaiDAO ttdao;
    TangDAO tdao;
    List<String> lsRoom;
    public static int index;

    public ThemPhongJframe() {
        initComponents();
        setTitle("Thêm phòng");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblTang = new javax.swing.JLabel();
        txtTang = new javax.swing.JTextField();
        lblTrangThai = new javax.swing.JLabel();
        cboTrangThaiPhong = new javax.swing.JComboBox<>();
        lblLoaiPhong = new javax.swing.JLabel();
        cboLoaiPhong = new javax.swing.JComboBox<>();
        lblSoGiuong = new javax.swing.JLabel();
        txtSoGiuong = new javax.swing.JTextField();
        lblPhongCBthem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstZenPhong = new javax.swing.JList<>();
        txtSoPhongThamChieu = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblSoPhong = new javax.swing.JLabel();
        txtSoPhongBatDau = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSoPhongKetThuc = new javax.swing.JTextField();
        btnZenRoom = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnHuyBo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTang.setText("Tầng");

        txtTang.setEditable(false);
        txtTang.setBackground(new java.awt.Color(255, 255, 0));
        txtTang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTang.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblTrangThai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTrangThai.setText("Trạng thái");

        cboTrangThaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblLoaiPhong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoaiPhong.setText("Loại phòng");

        cboLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboLoaiPhong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLoaiPhongItemStateChanged(evt);
            }
        });

        lblSoGiuong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoGiuong.setText("Số Giường");

        txtSoGiuong.setEditable(false);

        lblPhongCBthem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPhongCBthem.setText("Phòng chuẩn bị thêm");

        lstZenPhong.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstZenPhongValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstZenPhong);

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_edit_25px.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_delete_25px.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel2Layout.rowHeights = new int[] {0};
        jPanel2.setLayout(jPanel2Layout);

        lblSoPhong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoPhong.setText("Số phòng bắt đầu từ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel2.add(lblSoPhong, gridBagConstraints);

        txtSoPhongBatDau.setPreferredSize(new java.awt.Dimension(90, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        jPanel2.add(txtSoPhongBatDau, gridBagConstraints);

        jLabel2.setText(">>>>>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel2.add(jLabel2, gridBagConstraints);

        txtSoPhongKetThuc.setPreferredSize(new java.awt.Dimension(90, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        jPanel2.add(txtSoPhongKetThuc, gridBagConstraints);

        btnZenRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Yandex_Zen_25px.png"))); // NOI18N
        btnZenRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZenRoomActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        jPanel2.add(btnZenRoom, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 10, 0};
        jPanel3Layout.rowHeights = new int[] {0};
        jPanel3.setLayout(jPanel3Layout);

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_25px.png"))); // NOI18N
        btnThem.setText("Thêm phòng");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 13, 0);
        jPanel3.add(btnThem, gridBagConstraints);

        btnHuyBo.setBackground(new java.awt.Color(255, 255, 255));
        btnHuyBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_cancel_25px.png"))); // NOI18N
        btnHuyBo.setText("Hủy bỏ");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 12, 13, 0);
        jPanel3.add(btnHuyBo, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Thêm Phòng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblSoGiuong, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSoGiuong, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPhongCBthem, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboLoaiPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboTrangThaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoPhongThamChieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblTang, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboTrangThaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSoGiuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoGiuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhongCBthem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSoPhongThamChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnHuyBoActionPerformed

    private void cboLoaiPhongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLoaiPhongItemStateChanged
        // TODO add your handling code here:
        setSoGiuong();
    }//GEN-LAST:event_cboLoaiPhongItemStateChanged

    private void btnZenRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZenRoomActionPerformed
        // Button zen phong
        initLsRoom();
        fillList();
    }//GEN-LAST:event_btnZenRoomActionPerformed

    private void lstZenPhongValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstZenPhongValueChanged
        // click list
        index = lstZenPhong.getSelectedIndex();
        if (index >= 0) {
            txtSoPhongThamChieu.setText(lsRoom.get(index));
        }
    }//GEN-LAST:event_lstZenPhongValueChanged

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // Xoa so phong co trong list
        if (index < 0) {
            mgsBox.alert(this, "Vui lòng chọn phòng muốn xóa ở danh sách.");
        } else {
            if (mgsBox.confirm(this, "Bạn có chắc muốn xóa phòng đang chọn?")) {
                delete();

            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // Sua phong 
        if (index < 0) {
            mgsBox.alert(this, "Vui lòng chọn phòng muốn cập nhật ở danh sách.");
        } else {
            if (mgsBox.confirm(this, "Bạn có chắc muốn Sửa phòng đang chọn?")) {
                update();

            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // Them phong
        if (mgsBox.confirm(this, "Bạn có chắc muốn thêm phòng đang chọn?")) {
            insert();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    public void init() {
        pdao = new PhongDAO();
        lpdao = new LoaiPhongDAO();
        ttdao = new TrangThaiDAO();
        tdao = new TangDAO();
        lsRoom = new ArrayList<>();
        fillTang();
        fillComboboxLoaiPhong();
        fillComboboxTrangThai();
        index = -1;
    }

    public void update() {
        if (txtSoPhongThamChieu.getText().trim().length() <= 5) {
            lsRoom.set(index, txtSoPhongThamChieu.getText());
            fillList();
            txtSoPhongThamChieu.setText("");
            index = -1;
        } else {
            mgsBox.alert(this, "Vui lòng không nhập quá 5 ký tự.");
            txtSoPhongThamChieu.requestFocus();
        }
    }

    public void delete() {
        lsRoom.remove(index);
        txtSoPhongThamChieu.setText("");
        fillList();
        index = -1;
    }

    public void insert() {
        LoaiPhong Lp = (LoaiPhong) cboLoaiPhong.getSelectedItem();
        System.out.println("jjjj" + Lp);
        int maLp = Lp.getMaLP();
        int soTang = Integer.parseInt(txtTang.getText());

        try {
            int soTangData = tdao.selectAll().size();
            if (soTang > soTangData) {
                tdao.insert(new Tang(soTang, "Tàng này được", true));
            }
        } catch (Exception e) {
            tdao.insert(new Tang(soTang, "Tàng này được", true));
            e.printStackTrace();
        }
        int maTT = cboTrangThaiPhong.getSelectedIndex() + 1;
        System.out.println("MaLP:" + maLp + ", so tang:" + soTang + ", matt:" + maTT);

        for (int i = 0; i < lsRoom.size(); i++) {
            try {
                pdao.insert(new Phong(lsRoom.get(i), soTang, maLp, maTT, "welcome to my heart"));
            } catch (Exception e) {
                System.out.println("hhh");
            }
        }
        MapRoom.updateStatusScreen(QuanLyPhongPanel.pnlMainScreen, gbc, new ClickMouse.MouseClikQuanLyPhong());
        this.setVisible(false);
    }

    public void initLsRoom() {
        if (checkText.issNum(txtSoPhongBatDau.getText())) {
            if (checkText.issNum(txtSoPhongKetThuc.getText())) {
                int start = Integer.parseInt(txtSoPhongBatDau.getText().trim());
                int end = Integer.parseInt(txtSoPhongKetThuc.getText().trim());
                if (txtSoPhongKetThuc.getText().trim().equals("")) {
                    lsRoom.add(String.valueOf(start));
                } else {
                    if (end >= start) {
                        for (int i = start; i <= end; i++) {
                            lsRoom.add(String.valueOf(i));
                        }
                    } else {
                        mgsBox.alert(this, "Số phòng bắt đầu phải nhỏ hơn số phòng kết thúc");
                    }
                }
            } else {
                mgsBox.alert(this, "Vui lòng nhập số phòng theo số!");
                txtSoPhongKetThuc.requestFocus();
            }
        } else {
            mgsBox.alert(this, "Vui lòng nhập số phòng bắt đầu.!!!");
            txtSoPhongBatDau.requestFocus();
        }
    }

    public void fillList() {
        if (!lsRoom.isEmpty()) {
            DefaultListModel model = new DefaultListModel();
            model.removeAllElements();
            for (String string : lsRoom) {
                model.addElement(string);
            }
            lstZenPhong.setModel(model);
        }
    }

    public void fillTang() {
        txtTang.setText(String.valueOf(MapRoom.posTang));
    }

    public void fillComboboxTrangThai() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTrangThaiPhong.getModel();
        model.removeAllElements();
        List<TrangThai> ls = ttdao.selectAll();
        for (TrangThai l : ls) {
            model.addElement(l.getTenTrangThai());
        }
    }

    public void fillComboboxLoaiPhong() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboLoaiPhong.getModel();
        model.removeAllElements();
        List<LoaiPhong> ls = lpdao.selectAll();
        for (int i = 0; i < ls.size(); i++) {
            model.addElement(ls.get(i));
        }
    }

    public void setSoGiuong() {
        try {
            LoaiPhong maLP = (LoaiPhong) cboLoaiPhong.getSelectedItem();
            System.out.println("malp:" + maLP.getSoGiuong());
            LoaiPhong lp = lpdao.selectById(maLP.getMaLP());
            txtSoGiuong.setText(String.valueOf(lp.getSoGiuong()));
        } catch (NullPointerException e) {
//            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnZenRoom;
    private javax.swing.JComboBox<String> cboLoaiPhong;
    private javax.swing.JComboBox<String> cboTrangThaiPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLoaiPhong;
    private javax.swing.JLabel lblPhongCBthem;
    private javax.swing.JLabel lblSoGiuong;
    private javax.swing.JLabel lblSoPhong;
    private javax.swing.JLabel lblTang;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JList<String> lstZenPhong;
    private javax.swing.JTextField txtSoGiuong;
    private javax.swing.JTextField txtSoPhongBatDau;
    private javax.swing.JTextField txtSoPhongKetThuc;
    private javax.swing.JTextField txtSoPhongThamChieu;
    private javax.swing.JTextField txtTang;
    // End of variables declaration//GEN-END:variables
}
