
package view.quantri;

import controller.DongPhucController;
import javax.swing.JOptionPane;
import  controller.TaiKhoanController; 
import java.io.IOException;
import modul.TaiKhoan; 

public class XinCapForm extends javax.swing.JFrame {
     private String taiKhoan; 
     static  TaiKhoanController tkcrl = new TaiKhoanController(); 
    
    public XinCapForm(String taiKhoan) throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.taiKhoan=taiKhoan; 
        ViewInforAdmin(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cbSize = new javax.swing.JComboBox<>();
        txtSoLuong = new javax.swing.JTextField();
        txttentkadmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(463, 353));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("XIN CẤP THÊM ĐỒNG PHỤC");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Size");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Số lượng");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Xin cấp thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XinCapThem(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icondelete16.png"))); // NOI18N
        jButton2.setText("Xóa trắng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoatrang(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconthoat16.png"))); // NOI18N
        jButton3.setText("Đóng");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDong(evt);
            }
        });

        cbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "chọn Size", "X", "XS", "S", "M", "L", "XL", "XXL" }));

        txttentkadmin.setToolTipText("");
        txttentkadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttentkadminActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/in-ao-dep-181130212332.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(cbSize, 0, 241, Short.MAX_VALUE)
                        .addComponent(txttentkadmin)
                        .addComponent(txtSoLuong))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(40, 40, 40)
                        .addComponent(jButton3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txttentkadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      public void ViewInforAdmin() throws IOException{
        TaiKhoan tk = tkcrl.getTaiKhoan(taiKhoan);
        txttentkadmin.setText(tk.getTenTK());
        
    } 
    private void btnDong(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDong
        dispose();
    }//GEN-LAST:event_btnDong

    private void btn_XinCapThem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XinCapThem
        String size = (String)cbSize.getSelectedItem(); 
        String soLuong = txtSoLuong.getText();
        if(soLuong.isBlank()){
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhap so luong!", "Thông báo", JOptionPane.CLOSED_OPTION);
        }
        else if(size.contains("Chọn size") == true){
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chon size!", "Thông báo", JOptionPane.CLOSED_OPTION);    
        }
        else{
            try {        
                DongPhucController.congDPTon(size, Integer.parseInt(soLuong));
                JOptionPane.showMessageDialog(rootPane, "Đã cấp thêm đồng phục", "Thông báo", JOptionPane.CLOSED_OPTION);
            } 
            catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btn_XinCapThem

    private void btn_xoatrang(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoatrang
        cbSize.setSelectedIndex(0);
        txtSoLuong.setText("");
    }//GEN-LAST:event_btn_xoatrang

    private void txttentkadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttentkadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttentkadminActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XinCapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XinCapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XinCapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XinCapForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbSize;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txttentkadmin;
    // End of variables declaration//GEN-END:variables
}
