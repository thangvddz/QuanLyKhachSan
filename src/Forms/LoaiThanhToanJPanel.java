/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entities.LoaiThanhToan;
import Models.LoaiThanhToanDAO;
import Utils.Auth;
import Utils.mgsBox;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class LoaiThanhToanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoaiThanhToanJPanel
     */
    int row = -1;
    LoaiThanhToanDAO lttdao = new LoaiThanhToanDAO();

    public LoaiThanhToanJPanel() {
        initComponents();
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdoDangSD = new javax.swing.JRadioButton();
        rdoTamNgung = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLoaiThanhToan = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Quản lý loại thanh toán"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("QUẢN LÝ LOẠI THANH TOÁN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Mã loại thanh toán:");

        txtMa.setEditable(false);

        jLabel3.setText("Tên loại thanh toán:");

        jLabel4.setText("Trạng thái: ");

        buttonGroup1.add(rdoDangSD);
        rdoDangSD.setSelected(true);
        rdoDangSD.setText("Đang sử dụng");

        buttonGroup1.add(rdoTamNgung);
        rdoTamNgung.setText("Tạm ngưng");

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setEnabled(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMa)
                    .addComponent(txtTen)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoDangSD)
                                    .addComponent(btnXoa)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMoi)
                                    .addComponent(btnSua)
                                    .addComponent(rdoTamNgung))))
                        .addGap(0, 162, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMoi, btnSua, btnThem, btnXoa});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoDangSD)
                    .addComponent(rdoTamNgung))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSua)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, txtMa, txtTen});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnMoi, btnSua, btnThem, btnXoa});

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblLoaiThanhToan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã loại thanh toán", "Tên loại thanh toán", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLoaiThanhToan.setRowHeight(30);
        tblLoaiThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblLoaiThanhToanMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblLoaiThanhToan);
        if (tblLoaiThanhToan.getColumnModel().getColumnCount() > 0) {
            tblLoaiThanhToan.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clear();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if(Auth.isManager()){
            delete();
        }else{
            mgsBox.alert(this, "Bạn không có quyền xóa");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tblLoaiThanhToanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiThanhToanMousePressed
        if (evt.getClickCount() == 2) {
            this.row = tblLoaiThanhToan.rowAtPoint(evt.getPoint());
            edit();
        }
    }//GEN-LAST:event_tblLoaiThanhToanMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoDangSD;
    private javax.swing.JRadioButton rdoTamNgung;
    private javax.swing.JTable tblLoaiThanhToan;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
   private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblLoaiThanhToan.getModel();
        model.setRowCount(0);
        try {
            List<LoaiThanhToan> list = lttdao.selectAll();
            for (LoaiThanhToan ltt : list) {
                Object[] row = {
                    ltt.getLoaiThanhToan(),
                    ltt.getTenLoaiThanhToan(),
                    ltt.isTrangThai() ? "Đang được sử dụng" : "Tạm ngưng"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            mgsBox.alert(this, "Lỗi đổ dữ liệu vào bảng");
        }
    }

    private void clear() {
        txtTen.setText("");
        txtMa.setText("");
    }

    private void insert() {
        if (txtTen.getText().isEmpty()) {
            mgsBox.alert(this, "Tên loại thanh toán không được để trống");
            txtTen.requestFocus();
            return;
        }
        if (mgsBox.confirm(this, "Bạn có muốn thêm loại thanh toán mới này?")) {
            LoaiThanhToan model = getForm();
            try {
                lttdao.insert(model);
                System.out.println("model");
                this.fillTable();
                this.clear();
                mgsBox.alert(this, "Thêm mới thành công");
            } catch (Exception e) {
                e.printStackTrace();
                mgsBox.alert(this, "Thêm mới thất bại");
            }
        }
    }

    private void delete() {
        if (mgsBox.confirm(this, "Bạn có muốn xóa loại thanh toán này?")) {
            int maLTT = Integer.valueOf(txtMa.getText());
            try {
                lttdao.delete(maLTT);
                this.fillTable();
                this.clear();
                mgsBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                e.printStackTrace();
                mgsBox.alert(this, "Xóa thất bại!");
            }
        }
    }

    private void update() {
        if (txtTen.getText().isEmpty()) {
            mgsBox.alert(this, "Tên loại thanh toán không được để trống");
            txtTen.requestFocus();
            return;
        }
        if (mgsBox.confirm(this, "Bạn có muốn sửa loại thanh toán này?")) {
            LoaiThanhToan model = getForm();
            if (txtMa.getText() == null) {
                mgsBox.alert(this, "Vui lòng điền mã loại thanh toán cần sửa");
            } else {
                try {
                    lttdao.update(model);
                    System.out.println(model);
                    fillTable();
                    mgsBox.alert(this, "Cập nhật thành công!");
                } catch (Exception e) {
                    e.printStackTrace();
                    mgsBox.alert(this, "Cập nhật thất bại!");
                }
            }
        }
    }

    private void edit() {
        try {
            int maLTT = (int) tblLoaiThanhToan.getValueAt(this.row, 0);
            LoaiThanhToan model = lttdao.selectById(maLTT);
            if (model != null) {
                setForm(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
            mgsBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    private void setForm(LoaiThanhToan model) {
        txtMa.setText(String.valueOf(model.getLoaiThanhToan()));
        txtTen.setText(model.getTenLoaiThanhToan());
        if (model.isTrangThai()) {
            rdoDangSD.setSelected(true);
        } else {
            rdoTamNgung.setSelected(true);
        }
    }

    LoaiThanhToan getForm() {
        LoaiThanhToan model = new LoaiThanhToan();
        model.setLoaiThanhToan(Integer.valueOf(txtMa.getText()));
        model.setTenLoaiThanhToan(txtTen.getText());
        model.setTrangThai(rdoDangSD.isSelected());
        return model;
    }
}
