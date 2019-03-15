/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import config.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author NEVE
 */
public class transaksiSimpan extends javax.swing.JFrame {
    private String SQL;
    public String tellerID, nama, idbaru;
    DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
    Calendar cal = Calendar.getInstance();
    Date tgl = new Date();
    public String kod = null;
    public transaksiSimpan(String paranama, String paraid) {
        initComponents();
        nama = paranama;
        tellerID = paraid;
    }
    
    public void KodeOtomatisDBSimpan(final String kode){
        String todayDate = dateFormat.format(tgl);
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select max(right(kodetransaksi, 5)) as jj from transaksisimpan";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    idbaru = kode+todayDate+"00001";
                    txtKodeTransaksi.setText(idbaru);
                    txtKodeTransaksi.setEditable(false);
                    txtNoRekening.requestFocus();
                }else{
                    res.last();
                    int autoid = res.getInt("jj")+1;
                    String nomor = String.valueOf(autoid);
                    int noLong = nomor.length();
                    for(int a = 0; a < 5 - noLong; a++){
                        nomor = "0" + nomor;
                    }
                    idbaru = kode+todayDate+nomor;
                    txtKodeTransaksi.setText(idbaru);
                    txtKodeTransaksi.setEditable(false);
                    txtNoRekening.requestFocus();
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getCause());
        }
    }
    public void KodeOtomatisDBPinjam(final String kode){
        String todayDate = dateFormat.format(tgl);
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select max(right(kodetransaksi, 5)) as jj from transaksipeminjaman";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    idbaru = kod+todayDate+"00001";
                    txtKodeTransaksi.setText(idbaru);
                    txtKodeTransaksi.setEditable(false);
                    txtNoRekening.requestFocus();
                }else{
                    res.last();
                    int autoid = res.getInt("jj")+1;
                    String nomor = String.valueOf(autoid);
                    int noLong = nomor.length();
                    for(int a = 0; a < 5 - noLong; a++){
                        nomor = "0" + nomor;
                    }
                    idbaru = kod+todayDate+nomor;
                    txtKodeTransaksi.setText(idbaru);
                    txtKodeTransaksi.setEditable(false);
                    txtNoRekening.requestFocus();
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getCause());
        }
    }
    
    public void deposit(){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            SQL = "insert into transaksisimpan values(?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
            try {
                stmt.setString(1, txtKodeTransaksi.getText());
                stmt.setString(2, txtNoRekening.getText());
                stmt.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(tgl));
                stmt.setString(4, tellerID);
                stmt.setInt(5, Integer.valueOf(txtNominal.getText()));
                stmt.setString(6, "Deposit");
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Transaksi Deposit Berhasil. Anda Akan Anda Akan Dialihkan", "Transaksi Telah Dilakukan", JOptionPane.INFORMATION_MESSAGE);
                new Admin(nama, tellerID).setVisible(true);
                Admin.menuTab.setSelectedIndex(2);
                this.dispose();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Transaksi Deposit Tidak Berhasil. Silahkan Ulangi", "Transaksi Tidak Dapat Dilakukan", JOptionPane.WARNING_MESSAGE);
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void tambahSimpanan(final int nominal, final JTextField textrekening){
        java.sql.Connection conn = new DBConnection().connect();
            try {
                SQL = "update nasabah set simpanan = simpanan + '"+ nominal +"' where norekening='" + textrekening.getText() + "'";
                java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
                try {
                    stmt.executeUpdate();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            } catch (Exception e) {
            
            }
    }
    
    public void kredit(){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            SQL = "insert into transaksisimpan values(?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
            try {
                stmt.setString(1, txtKodeTransaksi.getText());
                stmt.setString(2, txtNoRekening.getText());
                stmt.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(tgl));
                stmt.setString(4, tellerID);
                stmt.setInt(5, Integer.valueOf(txtNominal.getText()));
                stmt.setString(6, "Pengambilan");
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Transaksi Pengambilan Berhasil. Anda Akan Anda Akan Dialihkan", "Transaksi Telah Dilakukan", JOptionPane.INFORMATION_MESSAGE);
                new Admin(nama, tellerID).setVisible(true);
                Admin.menuTab.setSelectedIndex(2);
                this.dispose();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Transaksi Pengambilan Tidak Berhasil. Silahkan Ulangi", "Transaksi Tidak Dapat Dilakukan", JOptionPane.WARNING_MESSAGE);
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void kurangSimpanan(final int nominal, final JTextField textrekening){
        java.sql.Connection conn = new DBConnection().connect();
            try {
                SQL = "update nasabah set simpanan = simpanan - '"+ nominal +"' where norekening='" + textrekening.getText() + "'";
                java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
                try {
                    stmt.executeUpdate();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            } catch (Exception e) {
            
            }
    }
    
    public void pinjam(){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            SQL = "insert into transaksipeminjaman values(?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
            try {
                stmt.setString(1, txtKodeTransaksi.getText());
                stmt.setString(2, txtNoRekening.getText());
                stmt.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(tgl));
                stmt.setString(4, tellerID);
                stmt.setInt(5, Integer.valueOf(txtNominal.getText()));
                stmt.setString(6, "Peminjaman");
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Transaksi Peminjaman Berhasil. Anda Akan Anda Akan Dialihkan", "Transaksi Telah Dilakukan", JOptionPane.INFORMATION_MESSAGE);
                new Admin(nama, tellerID).setVisible(true);
                Admin.menuTab.setSelectedIndex(3);
                this.dispose();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Transaksi Peminjaman Tidak Berhasil. Silahkan Ulangi", "Transaksi Tidak Dapat Dilakukan", JOptionPane.WARNING_MESSAGE);
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void tambahPinjaman(final int nominal, final JTextField textrekening){
        java.sql.Connection conn = new DBConnection().connect();
            try {
                SQL = "update nasabah set pinjaman = pinjaman + '"+ nominal +"' where norekening='" + textrekening.getText() + "'";
                java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
                try {
                    stmt.executeUpdate();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            } catch (Exception e) {
            
            }
    }
    
    public void bayar(){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            SQL = "insert into transaksipeminjaman values(?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
            try {
                stmt.setString(1, txtKodeTransaksi.getText());
                stmt.setString(2, txtNoRekening.getText());
                stmt.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(tgl));
                stmt.setString(4, tellerID);
                stmt.setInt(5, Integer.valueOf(txtNominal.getText()));
                stmt.setString(6, "Pembayaran");
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Transaksi Pembayaran Berhasil. Anda Akan Anda Akan Dialihkan", "Transaksi Telah Dilakukan", JOptionPane.INFORMATION_MESSAGE);
                new Admin(nama, tellerID).setVisible(true);
                Admin.menuTab.setSelectedIndex(3);
                this.dispose();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Transaksi Pembayaran Tidak Berhasil. Silahkan Ulangi", "Transaksi Tidak Dapat Dilakukan", JOptionPane.WARNING_MESSAGE);
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void kurangPinjaman(final int nominal, final JTextField textrekening){
        java.sql.Connection conn = new DBConnection().connect();
            try {
                SQL = "update nasabah set pinjaman = pinjaman - '"+ nominal +"' where norekening='" + textrekening.getText() + "'";
                java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
                try {
                    stmt.executeUpdate();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            } catch (Exception e) {
            
            }
    }
    
    public void cekNoRek(){
        java.sql.Connection conn = new DBConnection().connect();
        try {
                SQL = "select * from nasabah where binary norekening = ?";
                java.sql.PreparedStatement nimstate = conn.prepareStatement(SQL);
                nimstate.setString(1, txtNoRekening.getText());
                ResultSet nimrs = nimstate.executeQuery();
                if(nimrs.next()){
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Nomor Rekening Tidak Ada Di Database", "Error", JOptionPane.ERROR_MESSAGE);
                    txtNoRekening.setText("");
                    txtNoRekening.requestFocus();
                }    
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windowsBar = new javax.swing.JPanel();
        minimizeButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        windowName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        judulTransaksi = new javax.swing.JLabel();
        txtKodeTransaksi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNoRekening = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNominal = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
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
        windowsBar.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 30, 30));

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
        windowsBar.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 30));

        windowName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        windowName.setForeground(new java.awt.Color(255, 255, 255));
        windowName.setText("Transaction Name");
        windowsBar.add(windowName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 230, 30));

        getContentPane().add(windowsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judulTransaksi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        judulTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulTransaksi.setText("Daftar Nasabah Koperasi");
        jPanel1.add(judulTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 30));

        txtKodeTransaksi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtKodeTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 220, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kode Transaksi");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 220, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nomor Rekening");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 220, 30));

        txtNoRekening.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoRekening.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNoRekeningFocusLost(evt);
            }
        });
        jPanel1.add(txtNoRekening, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 220, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nominal");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 220, 30));

        txtNominal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 220, 30));

        btnCancel.setText("Kembali");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 110, 40));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        switch (btnSimpan.getText()) {
            case "Deposit":
                tambahSimpanan(Integer.valueOf(txtNominal.getText()), txtNoRekening);
                deposit();
                break;
            case "Tarik":
                kurangSimpanan(Integer.valueOf(txtNominal.getText()), txtNoRekening);
                kredit();
                break;
            case "Pinjam":
                tambahPinjaman(Integer.valueOf(txtNominal.getText()), txtNoRekening);
                pinjam();
                break;
            case "Bayar":
                kurangPinjaman(Integer.valueOf(txtNominal.getText()), txtNoRekening);
                bayar();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnSimpanActionPerformed
    private void txtNoRekeningFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoRekeningFocusLost
        if(txtNoRekening.getText().equals("")){
            
        }else{
            String id = new String(txtNoRekening.getText());
            StringBuilder capsId = new StringBuilder(id);
            capsId.setCharAt(0, Character.toUpperCase(capsId.charAt(0)));
            txtNoRekening.setText(capsId.toString());
            cekNoRek();
        }
    }//GEN-LAST:event_txtNoRekeningFocusLost
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        switch (btnSimpan.getText()) {
            case "Deposit":
                new Admin(nama, tellerID).setVisible(true);
                Admin.menuTab.setSelectedIndex(2);
                this.dispose();
                break;
            case "Tarik":
                new Admin(nama, tellerID).setVisible(true);
                Admin.menuTab.setSelectedIndex(2);
                this.dispose();
                break;
            case "Pinjam":
                new Admin(nama, tellerID).setVisible(true);
                Admin.menuTab.setSelectedIndex(3);
                this.dispose();
                break;
            case "Bayar":
                new Admin(nama, tellerID).setVisible(true);
                Admin.menuTab.setSelectedIndex(3);
                this.dispose();
                break;
            default:
                break;
        }    
    }//GEN-LAST:event_btnCancelActionPerformed
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        switch (btnSimpan.getText()) {
            case "Deposit":
                kod = "S";
                KodeOtomatisDBSimpan(kod);
                break;
            case "Tarik":
                kod = "T";
                KodeOtomatisDBSimpan(kod);
                break;
            case "Pinjam":
                kod="P";
                KodeOtomatisDBPinjam(kod);
                break;
            case "Bayar":
                kod="B";
                KodeOtomatisDBPinjam(kod);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_formWindowActivated
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
            java.util.logging.Logger.getLogger(transaksiSimpan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksiSimpan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksiSimpan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksiSimpan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksiSimpan("","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    public static transient javax.swing.JButton btnSimpan;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static transient javax.swing.JLabel judulTransaksi;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JTextField txtKodeTransaksi;
    private javax.swing.JTextField txtNoRekening;
    private javax.swing.JTextField txtNominal;
    public static transient javax.swing.JLabel windowName;
    private javax.swing.JPanel windowsBar;
    // End of variables declaration//GEN-END:variables
}
