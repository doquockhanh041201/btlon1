
package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class TrangChuView extends javax.swing.JFrame implements ActionListener{

    
    public TrangChuView() {
        initComponents();
        setLocationRelativeTo(null);
        NhanKhaubtn.addActionListener(this);
        HoKhaubtn.addActionListener(this);
        KhoanPhibtn.addActionListener(this);
        DongPhibtn.addActionListener(this);
        ThongKebtn.addActionListener(this);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NhanKhaubtn = new javax.swing.JButton();
        HoKhaubtn = new javax.swing.JButton();
        KhoanPhibtn = new javax.swing.JButton();
        DongPhibtn = new javax.swing.JButton();
        ThongKebtn = new javax.swing.JButton();
        ThongKebtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 153, 0));
        jLabel2.setText("QLNhanKhau");

        NhanKhaubtn.setBackground(new java.awt.Color(255, 153, 0));
        NhanKhaubtn.setForeground(new java.awt.Color(255, 255, 255));
        NhanKhaubtn.setText("Nhân Khẩu");
        NhanKhaubtn.setBorder(null);
        NhanKhaubtn.setBorderPainted(false);
        NhanKhaubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhanKhaubtnActionPerformed(evt);
            }
        });

        HoKhaubtn.setBackground(new java.awt.Color(255, 153, 0));
        HoKhaubtn.setForeground(new java.awt.Color(255, 255, 255));
        HoKhaubtn.setText("Hộ Khẩu");
        HoKhaubtn.setBorderPainted(false);
        HoKhaubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoKhaubtnActionPerformed(evt);
            }
        });

        KhoanPhibtn.setBackground(new java.awt.Color(255, 153, 0));
        KhoanPhibtn.setForeground(new java.awt.Color(255, 255, 255));
        KhoanPhibtn.setText("Khoản phí");
        KhoanPhibtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        KhoanPhibtn.setBorderPainted(false);

        DongPhibtn.setBackground(new java.awt.Color(255, 153, 0));
        DongPhibtn.setForeground(new java.awt.Color(255, 255, 255));
        DongPhibtn.setText("Đóng phí");
        DongPhibtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DongPhibtn.setBorderPainted(false);
        DongPhibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DongPhibtnActionPerformed(evt);
            }
        });

        ThongKebtn.setBackground(new java.awt.Color(255, 153, 0));
        ThongKebtn.setForeground(new java.awt.Color(255, 255, 255));
        ThongKebtn.setText("Thống kê");
        ThongKebtn.setBorder(null);
        ThongKebtn.setBorderPainted(false);

        ThongKebtn1.setBackground(new java.awt.Color(255, 153, 0));
        ThongKebtn1.setForeground(new java.awt.Color(255, 255, 255));
        ThongKebtn1.setText("Thoát");
        ThongKebtn1.setBorder(null);
        ThongKebtn1.setBorderPainted(false);
        ThongKebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongKebtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addComponent(NhanKhaubtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HoKhaubtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(KhoanPhibtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DongPhibtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ThongKebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ThongKebtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(NhanKhaubtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HoKhaubtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(KhoanPhibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DongPhibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ThongKebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ThongKebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 36)); // NOI18N
        jLabel1.setText("HomePage");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DongPhibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DongPhibtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DongPhibtnActionPerformed

    private void HoKhaubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoKhaubtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoKhaubtnActionPerformed

    private void NhanKhaubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhanKhaubtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NhanKhaubtnActionPerformed

    private void ThongKebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongKebtn1ActionPerformed
       NhanKhauView thoat =new NhanKhauView();
       if(JOptionPane.showConfirmDialog(thoat,"Bạn muốn thoát?","Thoát",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
       {System.exit(0);}
    }//GEN-LAST:event_ThongKebtn1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(TrangChuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DongPhibtn;
    private javax.swing.JButton HoKhaubtn;
    private javax.swing.JButton KhoanPhibtn;
    private javax.swing.JButton NhanKhaubtn;
    private javax.swing.JButton ThongKebtn;
    private javax.swing.JButton ThongKebtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(NhanKhaubtn))
       {
           NhanKhaubtnClick();
       }
       else if(e.getSource().equals(HoKhaubtn))
       {
           HoKhaubtnClick();
       }
       else if(e.getSource().equals(KhoanPhibtn))
       {
           KhoanPhibtnClick();
       }
       else if(e.getSource().equals(DongPhibtn))
       {
           DongPhibtnClick();
       }
       else
       {
           ThongKebtnClick();
       }
        
    }
    
    public void NhanKhaubtnClick(){
        new NhanKhauView().setVisible(true);
        this.dispose();
    }
    public void HoKhaubtnClick(){
        
    }
    
    public void KhoanPhibtnClick(){
        
    }
    public void DongPhibtnClick(){
        
    }
    public void ThongKebtnClick(){
        
    }
}
