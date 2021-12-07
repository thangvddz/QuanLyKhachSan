/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entities.DichVu;
import Models.DichVuDAO;
import Utils.mgsBox;
import Utils.xMoney;
import java.awt.GridBagConstraints;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hungp
 */
public class DichVuPanel extends javax.swing.JPanel {

    int row = -1;
    DichVuDAO dvDAO = new DichVuDAO();
    /**
     * Creates new form DichVuPanel
     */
    GridBagConstraints gbc;
    
    public DichVuPanel() {
        initComponents();
        fillTable();
    }
    
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblBang.getModel();
        model.setRowCount(0);
        try {
            List<DichVu> list = dvDAO.selectAll();
            for (DichVu dv : list) {
                Object[] row = {
                    dv.getMaDV(),
                    dv.getTenDV(),
                    xMoney.doubleToVNDong(dv.getPhiDV()),
                    dv.isTrangThai() ? "Hỗ trợ" : "Tạm ngưng"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            mgsBox.alert(this, "Lỗi đổ dữ liệu vào bảng");
        }
    }
    
    void fillTableTim() {
        DefaultTableModel model = (DefaultTableModel) tblBang.getModel();
        model.setRowCount(0);
        try {
            String key = txtTimKiem.getText();
            List<DichVu> list = dvDAO.selectByKey(key);
            for (DichVu dv : list) {
                Object[] row = {
                    dv.getMaDV(),
                    dv.getTenDV(),
                    dv.getPhiDV(),
                    dv.isTrangThai() ? "Hỗ trợ" : "Tạm ngưng"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            mgsBox.alert(this, "Không có dịch vụ này!");
        }
    }
    
    private void insert() {
        if (txtTenDV.getText().isEmpty()) {
            mgsBox.alert(this, "Tên dịch vụ không được để trống");
            txtTenDV.requestFocus();
            return;
        }
        if (txtPhiDV.getText().isEmpty()) {
            mgsBox.alert(this, "Phí dịch vụ không được để trống");
            txtPhiDV.requestFocus();
            return;
        }
        double phidv;
        try {
            phidv = Double.parseDouble(txtPhiDV.getText());
        } catch (Exception e) {
            mgsBox.alert(this, "Phí dịch vụ phải là số");
            e.printStackTrace();
            txtPhiDV.requestFocus();
            return;
        }
        if (phidv < 0) {
            mgsBox.alert(this, "Phí dịch vụ phải lớn hơn hoặc bằng 0");
            txtPhiDV.requestFocus();
            return;
        }
        DichVu model = getform();
        try {
            dvDAO.insert(model);
            System.out.println("model");
            this.fillTable();
            this.clearForm();
            mgsBox.alert(this, "Thêm mới thành công");
        } catch (Exception e) {
            e.printStackTrace();
            mgsBox.alert(this, "Thêm mới thất bại");
        }
    }
    
    DichVu getform() {
        DichVu model = new DichVu();
        //model.setMaDV(Integer.valueOf(txtMaDV.getText()));
        model.setTenDV(txtTenDV.getText());
        model.setPhiDV(Double.valueOf(txtPhiDV.getText()));
        model.setTrangThai(rdoHoTro.isSelected());
        return model;
    }
    
    void clearForm() {
        txtMaDV.setText("");
        txtPhiDV.setText("");
        txtTenDV.setText("");
        txtTimKiem.setText("");
    }
    
    void setForm(DichVu model) {
        txtMaDV.setText(String.valueOf(model.getMaDV()));
        txtTenDV.setText(model.getTenDV());
        txtPhiDV.setText(String.valueOf(model.getPhiDV()));
        if (model.isTrangThai()) {
            rdoHoTro.setSelected(true);
        } else {
            rdoTamNgung.setSelected(true);
        }
    }
    
    void delete() {
        if (mgsBox.confirm(this, "Bạn có muốn xóa dịch vụ này?")) {
            int maDV = Integer.valueOf(txtMaDV.getText());
            try {
                dvDAO.delete(maDV);
                this.fillTable();
                this.clearForm();
                mgsBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                e.printStackTrace();
                mgsBox.alert(this, "Xóa thất bại!");
            }
        }
    }
    
    void edit() {
        try {
            int maDV = (int) tblBang.getValueAt(this.row, 0);
            DichVu model = dvDAO.selectById(maDV);
            if (model != null) {
                setForm(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
            mgsBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    
    DichVu getform1() {
        DichVu model = new DichVu();
        model.setMaDV(Integer.valueOf(txtMaDV.getText()));
        model.setTenDV(txtTenDV.getText());
        model.setPhiDV(Double.valueOf(txtPhiDV.getText()));
        model.setTrangThai(rdoHoTro.isSelected());
        return model;
    }
    
    void update() {
        if (txtTenDV.getText().isEmpty()) {
            mgsBox.alert(this, "Tên dịch vụ không được để trống");
            txtTenDV.requestFocus();
            return;
        }
        if (txtPhiDV.getText().isEmpty()) {
            mgsBox.alert(this, "Phí dịch vụ không được để trống");
            txtPhiDV.requestFocus();
            return;
        }
        double phidv;
        try {
            phidv = Double.parseDouble(txtPhiDV.getText());
        } catch (Exception e) {
            mgsBox.alert(this, "Phí dịch vụ phải là số");
            e.printStackTrace();
            txtPhiDV.requestFocus();
            return;
        }
        if (phidv < 0) {
            mgsBox.alert(this, "Phí dịch vụ phải lớn hơn hoặc bằng 0");
            txtPhiDV.requestFocus();
            return;
        }
        DichVu model = getform1();
        if (txtMaDV.getText() == null) {
            mgsBox.alert(this, "Vui lòng điền mã dịch vụ cần sửa");
        } else {
            try {
                dvDAO.update(model);
                System.out.println(model);
                fillTable();
                mgsBox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                e.printStackTrace();
                mgsBox.alert(this, "Cập nhật thất bại!");
            }
        }
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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTenDV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPhiDV = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMaDV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdoHoTro = new javax.swing.JRadioButton();
        rdoTamNgung = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Quản lý dịch vụ"));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Tên dịch vụ:");

        jLabel4.setText("Phí dịch vụ:");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Refresh.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã dịch vụ:");

        txtMaDV.setEditable(false);

        jLabel6.setText("Trạng thái:");

        buttonGroup1.add(rdoHoTro);
        rdoHoTro.setSelected(true);
        rdoHoTro.setText("Hỗ trợ");

        buttonGroup1.add(rdoTamNgung);
        rdoTamNgung.setText("Tạm ngưng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPhiDV)
                    .addComponent(txtMaDV, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSua)))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdoHoTro)
                                .addGap(18, 18, 18)
                                .addComponent(rdoTamNgung)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTenDV, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhiDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoHoTro)
                    .addComponent(rdoTamNgung))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi))
                .addContainerGap(277, Short.MAX_VALUE))
        );

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaDV", "TenDV", "PhiDV", "TrangThai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblBangMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblBang);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Tìm kiếm dịch vụ:");

        btnTim.setBackground(new java.awt.Color(255, 255, 255));
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Search.png"))); // NOI18N
        btnTim.setText("Tìm kiếm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(255, 255, 255));
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Delete.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimKiem)
                .addGap(18, 18, 18)
                .addComponent(btnTim)
                .addGap(18, 18, 18)
                .addComponent(btnHuy)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim)
                    .addComponent(btnHuy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("QUẢN LÝ DỊCH VỤ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 272, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        fillTableTim();
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        txtTimKiem.setText("");
        fillTable();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
        txtTenDV.requestFocus();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblBangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMousePressed
        if (evt.getClickCount() == 2) {
            this.row = tblBang.rowAtPoint(evt.getPoint());
            edit();
        }
    }//GEN-LAST:event_tblBangMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoHoTro;
    private javax.swing.JRadioButton rdoTamNgung;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtMaDV;
    private javax.swing.JTextField txtPhiDV;
    private javax.swing.JTextField txtTenDV;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
