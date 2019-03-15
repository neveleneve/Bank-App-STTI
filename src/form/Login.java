package form;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    public Login(){
        initComponents();
        txtUser.requestFocus();
    }    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windowsBar = new javax.swing.JPanel();
        minimizeButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        windowName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        windowsBar.setBackground(new java.awt.Color(102, 102, 102));
        windowsBar.setMaximumSize(new java.awt.Dimension(540, 100));
        windowsBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizeButton.setBackground(new java.awt.Color(120, 120, 120));
        minimizeButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        minimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        minimizeButton.setText("_");
        minimizeButton.setBorder(null);
        minimizeButton.setFocusable(false);
        minimizeButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        minimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeButtonActionPerformed(evt);
            }
        });
        windowsBar.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 30));

        closeButton.setBackground(new java.awt.Color(255, 0, 0));
        closeButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("X");
        closeButton.setBorder(null);
        closeButton.setFocusable(false);
        closeButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        windowsBar.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 30));

        windowName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        windowName.setForeground(new java.awt.Color(255, 255, 255));
        windowName.setText("Login");
        windowsBar.add(windowName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 30));

        getContentPane().add(windowsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 200, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("U s e r n a m e");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("P a s s w o r d");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 200, 30));

        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 30));

        btnLogin.setBackground(new java.awt.Color(0, 255, 0));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 90, -1));

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        FunctionClass.loginUser(txtUser,txtPass, this);
    }//GEN-LAST:event_btnLoginActionPerformed
    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            FunctionClass.loginUser(txtUser,txtPass, this);
        }
    }//GEN-LAST:event_txtPassKeyPressed
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        String[] options = {"Yes", "No"};
        int x = JOptionPane.showOptionDialog(null, 
                "Anda Akan Menutup Aplikasi", "Tutup Aplikasi?", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        switch (x){
            case 0:
                JOptionPane.showMessageDialog(null, "Anda Telah Menutup Aplikasi", "Terima Kasih", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            case 1:
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnCancelActionPerformed
    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if(txtUser.getText().equals("")){
        
        }else{
            String id = new String(txtUser.getText());
            StringBuilder capsId = new StringBuilder(id);
            capsId.setCharAt(0, Character.toUpperCase(capsId.charAt(0)));
            txtUser.setText(capsId.toString());
        }        
    }//GEN-LAST:event_txtUserFocusLost
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel windowName;
    private javax.swing.JPanel windowsBar;
    // End of variables declaration//GEN-END:variables
}
