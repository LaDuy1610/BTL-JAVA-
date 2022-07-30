/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.quantri;

import controller.SinhVienController;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import controller.DanhGiaController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modul.DanhGia;
import controller.TaiKhoanController;
import modul.TaiKhoan;

/**
 *
 * @author User
 */
public class XemDanhGiaForm extends javax.swing.JFrame {

    private String taiKhoan;
    static DanhGiaController dg = new DanhGiaController();
    static TaiKhoanController tkcrl = new TaiKhoanController();
    static DefaultTableModel tblModel = new DefaultTableModel();

    /**
     * Creates new form XemDanhGiaForm
     */
    public XemDanhGiaForm(String taiKhoan) throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.taiKhoan = taiKhoan;
        ViewInforAdmin();
        initTable();
        fillTable();
    }

    public void ViewInforAdmin() throws IOException {
        TaiKhoan tk = tkcrl.getTaiKhoan(taiKhoan);
        txtTenTKAD.setText(tk.getTenTK());

    }

    private void initTable() {
        //Tạo bảng có các cột tiêu đề 
        String[] columns = new String[]{"STT", "Mã đánh giá", "Chất lượng đồng phục", "Chất lượng hệ thống", "Điểm đánh giá", "Góp ý", "Nhận xét"};
        tblModel.setColumnIdentifiers(columns);
        tbdsdanhgia.setModel(tblModel);

        JScrollPane scrollPane = new JScrollPane();
        tbdsdanhgia.setFillsViewportHeight(true);

    }

    public void ShowDetail() throws IOException {
        ArrayList<DanhGia> listdgs = dg.getListDanhGia();
        int i = tbdsdanhgia.getSelectedRow();
        DanhGia d = listdgs.get(i);
        txtdetailma.setText(d.getMaDG());
    }

    //  Ghi dữ liệu vào bảng theo các trường, dữ liệu được gọi từ DanhGiaController
    private void fillTable() throws IOException {
        tblModel.setRowCount(0);
        ArrayList<DanhGia> list = dg.getListDanhGia();
        int index = 1;
        for (DanhGia x : list) {
            tblModel.addRow(new Object[]{index++, x.getMaDG(), x.getChatLuongDongPhuc(), x.getChatLuongHeThong(), x.getDiemDG(), x.getGopY(), x.getNhanXet()});
        }
        tblModel.fireTableDataChanged();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdsdanhgia = new javax.swing.JTable();
        btn_xoa = new javax.swing.JButton();
        btn_timkiem = new javax.swing.JButton();
        btn_Xemchitiet = new javax.swing.JButton();
        btn_Dong = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtdetailma = new javax.swing.JTextField();
        btn_tailai = new javax.swing.JButton();
        txtTenTKAD = new javax.swing.JTextField();
        btn_Thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("XEM ĐÁNH GIÁ ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("DANH SÁCH ĐÁNH GIÁ");

        tbdsdanhgia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã đánh giá ", "Điểm đánh giá ", "Nhận xét ", "Góp ý "
            }
        ));
        tbdsdanhgia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdsdanhgiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdsdanhgia);

        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icondelete16.png"))); // NOI18N
        btn_xoa.setText("Xóa ");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.jpg"))); // NOI18N
        btn_timkiem.setText("Tìm kiếm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        btn_Xemchitiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lgdg.jpg"))); // NOI18N
        btn_Xemchitiet.setText(" Xem chi tiết");
        btn_Xemchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XemchitietActionPerformed(evt);
            }
        });

        btn_Dong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconthoat16.png"))); // NOI18N
        btn_Dong.setText("Đóng");
        btn_Dong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DongActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Mã đánh giá");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtdetailma, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdetailma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_tailai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images.jpg"))); // NOI18N
        btn_tailai.setText("Tải lại");
        btn_tailai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tailaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btn_xoa)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btn_tailai)
                                .addGap(55, 55, 55)
                                .addComponent(btn_timkiem)
                                .addGap(43, 43, 43)
                                .addComponent(btn_Xemchitiet)
                                .addGap(28, 28, 28)
                                .addComponent(btn_Dong))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xoa)
                    .addComponent(btn_timkiem)
                    .addComponent(btn_Xemchitiet)
                    .addComponent(btn_Dong)
                    .addComponent(btn_tailai))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btn_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3596149.png"))); // NOI18N
        btn_Thoat.setText("Thoát");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(txtTenTKAD, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Thoat)
                .addGap(11, 11, 11))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenTKAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Thoat))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        //Tìm kiếm đánh giá qua mã đánh giá
        if (txtdetailma.getText() != "") {
            // Lấy dữ liệu của mã ghi vào biến ma
            String ma = txtdetailma.getText();
            try {
                tblModel.setRowCount(0);
                //Tìm kiếm đánh giá bằng biên mã vừa lưu
                DanhGia d = dg.getDanhGiaByMa(ma);
                //d null nếu không tìm thấy
                if (d == null) {
                    JOptionPane.showMessageDialog(rootPane, "Không tìm thấy mã DG ", "Thông báo", JOptionPane.CLOSED_OPTION);
                    return;
                }
                int index = 1;
                //Xuất đánh giá tìm được vào table
                tblModel.addRow(new Object[]{index++, d.getMaDG(), d.getChatLuongDongPhuc(), d.getChatLuongHeThong(), d.getDiemDG(), d.getGopY(), d.getNhanXet()});

                tblModel.fireTableDataChanged();

            } catch (IOException ex) {
                Logger.getLogger(XemDanhGiaForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần tìm điền một mã đánh giá ", "Thông báo", JOptionPane.CLOSED_OPTION);
            return;
        }


    }//GEN-LAST:event_btn_timkiemActionPerformed

    private void tbdsdanhgiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdsdanhgiaMouseClicked
        try {
            ShowDetail();
        } catch (Exception e) {

        }

    }//GEN-LAST:event_tbdsdanhgiaMouseClicked

    private void btn_XemchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XemchitietActionPerformed
        // TODO add your handling code here:

        try {
            ShowDetail();
            String maDG = txtdetailma.getText();
            //Truyền mã đánh giá qua form xemCTDanhGiaForm
            XemCTDanhGiaForm xemCTDanhGiaForm = new XemCTDanhGiaForm(maDG);
            xemCTDanhGiaForm.setVisible(true);

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_XemchitietActionPerformed

    private void btn_DongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DongActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_DongActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        int choice = JOptionPane.showConfirmDialog(this,
                "Bạn có muốn thoát?",
                "xÁC NHẬN", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION) {
            return;
        }
        System.exit(0);
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        try {
            //Chọn mã đánh giá trong bảng 
            ShowDetail();
            String maDG = txtdetailma.getText();
            int choice = JOptionPane.showConfirmDialog(this,
                    "Bạn có chắc chắn xóa đánh giá có mã " + maDG + " trên hệ thống?",
                    "Hỏi", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                //Gọi phương thức xóa đánh giá theo mã trong DanhGiaController
                dg.xoaDanhGia(maDG);
            } else {
                return;
            }
            tblModel.setRowCount(0);
            ArrayList<DanhGia> list = dg.getListDanhGia();
            int index = 1;
            //Xuất lại danh sách
            for (DanhGia x : list) {
                tblModel.addRow(new Object[]{index++, x.getMaDG(), x.getChatLuongDongPhuc(), x.getChatLuongHeThong(), x.getDiemDG(), x.getGopY(), x.getNhanXet()});
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_tailaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tailaiActionPerformed
        // TODO add your handling code here:
        try {

            tblModel.setRowCount(0);
            ArrayList<DanhGia> list = dg.getListDanhGia();
            int index = 1;
            for (DanhGia x : list) {
                tblModel.addRow(new Object[]{index++, x.getMaDG(), x.getChatLuongDongPhuc(), x.getChatLuongHeThong(), x.getDiemDG(), x.getGopY(), x.getNhanXet()});
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_tailaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XemDanhGiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemDanhGiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemDanhGiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemDanhGiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Dong;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_Xemchitiet;
    private javax.swing.JButton btn_tailai;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdsdanhgia;
    private javax.swing.JTextField txtTenTKAD;
    private javax.swing.JTextField txtdetailma;
    // End of variables declaration//GEN-END:variables
}
