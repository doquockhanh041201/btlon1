
package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import javax.swing.JTextField;


public class LoginForm extends javax.swing.JFrame {

    private int JpotionPan;
   

    
    public LoginForm() {
        initComponents();
        KeyListener((JTextField)PassBox);
        KeyListener(UsernameBox);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        User1 = new javax.swing.JLabel();
        Pass1 = new javax.swing.JLabel();
        UsernameBox = new javax.swing.JTextField();
        PassBox = new javax.swing.JPasswordField();
        checkboxRememberMe = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoginForm1");
        setBackground(new java.awt.Color(255, 255, 255));

        btnLogin.setBackground(new java.awt.Color(255, 102, 102));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setActionCommand("");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 204, 255), 1, true));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Quản lý Nhân Khẩu");

        User1.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        User1.setText("Username:");

        Pass1.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        Pass1.setText("Passwords:");

        UsernameBox.setBackground(new java.awt.Color(204, 204, 204));
        UsernameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameBoxActionPerformed(evt);
            }
        });

        PassBox.setBackground(new java.awt.Color(204, 204, 204));
        PassBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassBoxActionPerformed(evt);
            }
        });

        checkboxRememberMe.setForeground(new java.awt.Color(51, 0, 51));
        checkboxRememberMe.setText("Remember me");
        checkboxRememberMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxRememberMeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(User1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkboxRememberMe)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PassBox, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(UsernameBox)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User1)
                    .addComponent(UsernameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pass1)
                    .addComponent(PassBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkboxRememberMe)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        this.login();
        String username = UsernameBox.getText();
        String password = String.valueOf(PassBox.getPassword());
        
        StringBuilder sb = new StringBuilder();
        
        if(username.equals(""))
        {
            sb.append("Username is empty \n");
        }
        
        if(password.equals(""))
        {
            sb.append("Password is empty \n");
        }
        
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        if(username.equals("leduyanhdung") && password.equals("dung"))
        {
            JOptionPane.showMessageDialog(this, "Login Sucess", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        /*else{
            JOptionPane.showMessageDialog(this, "Username hoặc Password nhập sai! Vui lòng nhập lại!", "Failure", JOptionPane.ERROR_MESSAGE);
        }*/
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void UsernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameBoxActionPerformed

    private void PassBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassBoxActionPerformed

    private void checkboxRememberMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxRememberMeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxRememberMeActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
private void login(){
        String username =UsernameBox.getText();
        String password = String.valueOf(PassBox.getPassword());
        try {
            // Tạo kết nối
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
            Statement stm = con.createStatement();
            String sql = "select * from logindatabase where username = '"+username+"' and password ='"+password+"'";
            ResultSet rs = stm.executeQuery(sql);
                if(rs.next()){
                    JOptionPane.showMessageDialog(this,"Đăng nhập thành công");
                    dispose();
                    con.close();
                    TrangChuView luser = new TrangChuView();
                    luser.show();
                }else {
                    JOptionPane.showMessageDialog(rootPane, "Sai thông tin đăng nhập","Warning",JOptionPane.WARNING_MESSAGE);
                }} 
                catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra vui lòng kiểm tra lại","Warning",JOptionPane.ERROR_MESSAGE);
        }
}
private void KeyListener(JTextField jtf){
      jtf.addKeyListener(new KeyAdapter(){
          public void keyTyped(KeyEvent e){}
          @Override
          public void keyPressed(KeyEvent e){
              if(e.getKeyCode()==KeyEvent.VK_ENTER){
                  login();
              }
          }public void keyReleased(KeyEvent e){}
      });
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pass1;
    private javax.swing.JPasswordField PassBox;
    private javax.swing.JLabel User1;
    private javax.swing.JTextField UsernameBox;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox checkboxRememberMe;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
        
}
