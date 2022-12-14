/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.quantri;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import modul.HoaDonThue;
import modul.DongPhucTon;
import controller.DongPhucController;
import controller.HoaDonController;
import controller.HoaDonThueController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.login.LoginForm;
import modul.TaiKhoan;
import controller.TaiKhoanController;
import modul.HoaDon;

/**
 *
 * @author db939
 */
public class QuanTriForm extends javax.swing.JFrame {

    //tạo ra các controller để insert dữ liệu
    static DongPhucController tkdp = new DongPhucController();
    static HoaDonController tkdpd = new HoaDonController();
    //tạo ra dữ liệu cho bảng
    static DefaultTableModel tblModel = new DefaultTableModel();
    static DefaultTableModel tblModel1 = new DefaultTableModel();
    static DefaultTableModel tblModel2 = new DefaultTableModel();
    static TaiKhoanController tkctrl = new TaiKhoanController();
    private String taiKhoan;

    /**
     * Creates new form QuanTriForm
     */
    public QuanTriForm(String taiKhoan) throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.taiKhoan = taiKhoan;
        ViewInforAdmin();
        initTable();
        fillTable();

    }

    public void ViewInforAdmin() throws IOException {
        //tạo ra class tài khoản và lấy ra tên tk sau đó settext vào ô mã quản trị viên
        TaiKhoan tk = tkctrl.getTaiKhoan(taiKhoan);
        txtTenAD.setText(tk.getTenTK());

    }

    private void initTable() {
        //tạo tiêu đề cho bảng
        String[] columns = new String[]{"Size", "Số lượng"};
        //set số lượng cột cho bảng bằng cách truyền vào biến colums
        tblModel.setColumnIdentifiers(columns);
        //set cấu trúc và dữ liệu cho bảng
        tnTonKho.setModel(tblModel);

        tblModel1.setColumnIdentifiers(columns);
        tbDaBan.setModel(tblModel1);

        tblModel2.setColumnIdentifiers(columns);
        tbDaThue.setModel(tblModel2);
        //cung cấp cơ chế cuộn cho 1 component
        JScrollPane scrollPane = new JScrollPane();
        tnTonKho.setFillsViewportHeight(true);
        tbDaBan.setFillsViewportHeight(true);
        tbDaThue.setFillsViewportHeight(true);

    }

    private void fillTable() throws IOException {
        tblModel.setRowCount(0);
        tblModel1.setRowCount(0);
        tblModel2.setRowCount(0);
        //tạo arraylist list để get ra dữ liệu từ class DongPhucTon bằng phương thức getListDPT trong controller DongPhuc
        ArrayList<DongPhucTon> list = tkdp.getListDPT();
        //duyệt vòng for và add dữ liệu vào table
        for (DongPhucTon x : list) {
            tblModel.addRow(new Object[]{x.getSize(), x.getsL()});
        }
        //tạo arraylist list để get ra dữ liệu từ class HoaDon bằng phương thức getListHD trong controller HoaDon

        ArrayList<HoaDon> listD = tkdpd.getListHD();
        //duyệt vòng for và add dữ liệu vào table
        for (HoaDon y : listD) {
            tblModel1.addRow(new Object[]{y.getSize(), y.getSl()});
        }
        //tạo arraylist list để get ra dữ liệu từ class HoaDonThue bằng phương thức getListHoaDonThue trong controller HoaDonThueController

        ArrayList<HoaDonThue> listT = HoaDonThueController.getListHoaDonThue();
        //duyệt vòng for và add dữ liệu vào table
        for (HoaDonThue z : listT) {
            tblModel2.addRow(new Object[]{z.getSize(), z.getsL()});
        }
        //để có thể xử lí dữ liệu trong bảng
        tblModel.fireTableDataChanged();
        tblModel1.fireTableDataChanged();
        tblModel2.fireTableDataChanged();

    }

    public QuanTriForm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tnTonKho = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDaBan = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbDaThue = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtTenAD = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuXincap = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuhoadondat = new javax.swing.JMenuItem();
        hoadonthue = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu_xemdanhgia = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("THỐNG KÊ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel2.setText("TỒN KHO");

        tnTonKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Size", "Số lượng"
            }
        ));
        jScrollPane1.setViewportView(tnTonKho);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel3.setText("ĐÃ BÁN");

        tbDaBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Size", "Số lượng"
            }
        ));
        jScrollPane2.setViewportView(tbDaBan);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel4.setText("ĐÃ THUÊ");

        tbDaThue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Size", "Số lượng"
            }
        ));
        jScrollPane4.setViewportView(tbDaThue);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconthoat16.png"))); // NOI18N
        jButton1.setText("Thoát");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1thoat(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3596149.png"))); // NOI18N
        jButton2.setText("Đăng xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorderPainted(false);

        menuXincap.setText("Xin Cấp Thêm");
        menuXincap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hienthi_XinCapForm(evt);
            }
        });
        jMenuBar1.add(menuXincap);

        jMenu2.setText("Đơn hàng");

        menuhoadondat.setText("Đơn đặt");
        menuhoadondat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuhoadondatMouseClicked(evt);
            }
        });
        menuhoadondat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuhoadondatActionPerformed(evt);
            }
        });
        jMenu2.add(menuhoadondat);

        hoadonthue.setText("Đơn thuê");
        hoadonthue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoadonthueActionPerformed(evt);
            }
        });
        jMenu2.add(hoadonthue);

        jMenuItem3.setText("Đơn đổi");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        menu_xemdanhgia.setText("Xem đánh giá");
        menu_xemdanhgia.setBorderPainted(true);
        menu_xemdanhgia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_xemdanhgiaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_xemdanhgia);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTenAD, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1thoat(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1thoat
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1thoat

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int choice = JOptionPane.showConfirmDialog(this,
                "Bạn có chắc muốn đăng xuất?",
                "Hỏi", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            LoginForm lg = new LoginForm();
            lg.setVisible(true);
        } else {
            return;
        }
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void menu_xemdanhgiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_xemdanhgiaMouseClicked
        // TODO add your handling code here:
        String tenTKAD = txtTenAD.getText();
        try {
            XemDanhGiaForm xemDanhGiaForm = new XemDanhGiaForm(tenTKAD);
            xemDanhGiaForm.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_menu_xemdanhgiaMouseClicked

    private void menuhoadondatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuhoadondatMouseClicked


    }//GEN-LAST:event_menuhoadondatMouseClicked

    private void hoadonthueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoadonthueActionPerformed
        String tentkad = txtTenAD.getText();
        QuanTriThueForm qtft;
        try {
            qtft = new QuanTriThueForm(tentkad);
            qtft.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(QuanTriForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_hoadonthueActionPerformed

    private void menuhoadondatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuhoadondatActionPerformed
        // TODO add your handling code here
        String tentkad = txtTenAD.getText(); 
        try { 
            XemDonHangForm xem = new XemDonHangForm(tentkad);
            xem.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(QuanTriForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_menuhoadondatActionPerformed

    private void hienthi_XinCapForm(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hienthi_XinCapForm
        String tentkad = txtTenAD.getText();
        XinCapForm xc;
        try {
            xc = new XinCapForm(tentkad);
            xc.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(QuanTriForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_hienthi_XinCapForm

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        String tentkad = txtTenAD.getText();
        QuanTriFormDoi qtfd;
        try {
            qtfd = new QuanTriFormDoi(tentkad);
            qtfd.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(QuanTriForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanTriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanTriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanTriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanTriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanTriForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem hoadonthue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenu menuXincap;
    private javax.swing.JMenu menu_xemdanhgia;
    private javax.swing.JMenuItem menuhoadondat;
    private javax.swing.JTable tbDaBan;
    private javax.swing.JTable tbDaThue;
    private javax.swing.JTable tnTonKho;
    private javax.swing.JTextField txtTenAD;
    // End of variables declaration//GEN-END:variables
}
