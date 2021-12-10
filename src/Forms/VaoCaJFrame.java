package Forms;

import Entities.CaLam;
import Entities.LichSuCaLam;
import Models.CaLamDAO;
import Models.LichSuCaLamDAO;
import Utils.Auth;
import Utils.checkText;
import Utils.mgsBox;
import Utils.xDate;
import Utils.xMoney;
import Utils.xTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Timer;

/**
 *
 * @author ACER
 */
public class VaoCaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form VaoCaJFrame
     */
    LichSuCaLamDAO daoLSCL = new LichSuCaLamDAO();
    CaLamDAO cldao = new CaLamDAO();
    public static List<Object[]> ls;
    Timer timer;
    boolean status = true;

    public VaoCaJFrame() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        txtTienDauCa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cboTenCa = new javax.swing.JComboBox<>();
        txtTienThucNhan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnLuu = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setUndecorated(true);
        setResizable(false);

        jLabel1.setText("Nhân Viên:");

        lblHoTen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHoTen.setText("a");

        lblDongHo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDongHo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtTienDauCa.setEditable(false);
        txtTienDauCa.setText("0");

        jLabel12.setText("Tiền đầu ca:");

        jLabel13.setText("Ca Làm: ");

        txtTienThucNhan.setText("0");

        jLabel2.setText("Tiền thực nhận");

        jLabel3.setText("Ghi chú:");

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 45, 5));

        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Accept.png"))); // NOI18N
        btnLuu.setText("VÀO CA");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu);

        btnQuayLai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_back_to_25px.png"))); // NOI18N
        btnQuayLai.setText("QUAY LẠI");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuayLai);

        jLabel4.setText("Trạng thái :");

        lblTrangThai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienDauCa)
                            .addComponent(cboTenCa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienThucNhan)
                            .addComponent(txtGhiChu))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienDauCa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cboTenCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTienThucNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGhiChu)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboTenCa, txtGhiChu, txtTienDauCa, txtTienThucNhan});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (status == false) {
            luu();
        } else {

            try {
                List<LichSuCaLam> lscl = daoLSCL.selectAll();
                LichSuCaLam lscll = lscl.get(lscl.size() - 1);
                if (lscll.getMaNV().equals(Auth.user.getMaNV())) {
                    fillTienDauCa();
                    timer.stop();
                    ManHinhChinhGUI manHinhChinhGUI = new ManHinhChinhGUI();
                    manHinhChinhGUI.setVisible(true);
                    this.setVisible(false);
                } else {
                    mgsBox.alert(this, "Ca Trước chưa kết thúc, chưa đến lượt bạn.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DangNhapJFrame dn = new DangNhapJFrame();
        dn.setVisible(true);
    }//GEN-LAST:event_btnQuayLaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JComboBox<String> cboTenCa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtTienDauCa;
    private javax.swing.JTextField txtTienThucNhan;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        fillTienDauCa();
        configCa();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                String text = formater.format(now);
                lblDongHo.setText(text);
            }
        });
        timer.start();
        lblHoTen.setText(Auth.user.getHoTen());
        updateCa();
        fillComboBoxCa();
        setCA();
    }

    private void luu() {
        try {
            daoLSCL.insert(getModel());
            mgsBox.alert(this, "Lưu thành công");
            timer.stop();
            ManHinhChinhGUI manHinhChinhGUI = new ManHinhChinhGUI();
            manHinhChinhGUI.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            mgsBox.alert(this, "Lưu thất bại");
            e.printStackTrace();
        }
    }

    public void fillTienDauCa() {
        try {
            List<LichSuCaLam> lscl = daoLSCL.selectAll();
            LichSuCaLam lscll = lscl.get(lscl.size() - 1);

            status = lscll.isTrangThai();
            lblTrangThai.setText(status ? "Chưa kết ca" : "Đã kết ca");
            if (status) {
                txtTienDauCa.setText(xMoney.doubleToVNDong(lscll.getTienVaoDauCa()));
                txtTienThucNhan.setText(xMoney.doubleToVNDong(lscll.getTienThucNhan()));
            } else {
                txtTienDauCa.setText(xMoney.doubleToVNDong(lscll.getTienCuoiCa()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    LichSuCaLam getModel() {
        LichSuCaLam lscl = null;
        try {
            int MaLSCL = -1;
            String MaNV = Auth.user.getMaNV();
            CaLam cl = (CaLam) cboTenCa.getSelectedItem();
            int MaCaLam = cl.getMaCaLam();
            double TienVaoDauCa = xMoney.VNDongToDouble(txtTienDauCa.getText());
            double TienCuoiCa = 0;
            Timestamp ThoiGianBD = new Timestamp(System.currentTimeMillis());
//        Timestamp ThoiGianKT = null;
            double TienThucNhan = Double.parseDouble(txtTienThucNhan.getText());
            double TienThucThu = 0;
            String GhiChuNhan = txtGhiChu.getText();
            String GhiChuThu = null;
            boolean TrangThai = true;
            lscl = new LichSuCaLam(MaLSCL, MaNV, MaCaLam, TienVaoDauCa, TienCuoiCa, ThoiGianBD, null, TienThucNhan, TienThucThu, GhiChuNhan, GhiChuThu, TrangThai);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lscl;
    }

    private void fillComboBoxCa() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTenCa.getModel();
        model.removeAllElements();
        try {
            List<CaLam> lsCaLam = cldao.selectAll();
            for (CaLam caLam : lsCaLam) {
                model.addElement(caLam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateCa() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTenCa.getModel();
        model.removeAllElements();
        try {
            List<CaLam> lsCaLam = cldao.selectAll();
            for (int i = 0; i < lsCaLam.size(); i++) {
                Object[] ob = ls.get(i);

                int hour_begin = (int) ob[0];
                int minute_begin = (int) ob[1];
                int hour_end = (int) ob[2];
                int minute_end = (int) ob[3];
                if (i == 2) {
                    Timestamp localDate = new Timestamp(System.currentTimeMillis() + (24 * 3600 * 1000));
                    Timestamp t_begin = xTime.getTimeHol(localDate, hour_begin, minute_begin);
                    Timestamp t_end = xTime.getTimeHol(localDate, hour_end, minute_end);
                    cldao.update(new CaLam(lsCaLam.get(i).getMaCaLam(), lsCaLam.get(i).getTenCaLam(), t_begin, t_end, "hihi"));
                } else {
                    Timestamp localDate = new Timestamp(System.currentTimeMillis());
                    Timestamp t_begin = xTime.getTimeHol(localDate, hour_begin, minute_begin);
                    Timestamp t_end = xTime.getTimeHol(localDate, hour_end, minute_end);
                    cldao.update(new CaLam(lsCaLam.get(i).getMaCaLam(), lsCaLam.get(i).getTenCaLam(), t_begin, t_end, "hihi"));
                }
            }
        } catch (Exception e) {
        }
    }

    public void configCa() {
        ls = new ArrayList<>();
        //ca sang
        Object[] obj1 = new Object[4];
        obj1[0] = 6;
        obj1[1] = 00;
        obj1[2] = 14;
        obj1[3] = 00;
        ls.add(obj1);
        //ca chieu
        Object[] obj2 = new Object[4];
        obj2[0] = 14;
        obj2[1] = 00;
        obj2[2] = 22;
        obj2[3] = 00;
        ls.add(obj2);
        // ca toi
        Object[] obj3 = new Object[4];
        obj3[0] = 22;
        obj3[1] = 00;
        obj3[2] = 6;
        obj3[3] = 00;
        ls.add(obj3);
    }

    public void setCA() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        if (hour >= 22 || (hour >= 0 && hour < 6)) {
            cboTenCa.setSelectedIndex(2);
        } else if (hour >= 14) {
            cboTenCa.setSelectedIndex(1);
        } else {
            cboTenCa.setSelectedIndex(0);
        }
    }
}
