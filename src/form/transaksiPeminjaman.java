package form;

import config.DBConnection;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class transaksiPeminjaman extends javax.swing.JFrame {

    String SQL, nama, tellerID, kodetransaksipinjam, kodejaminan, namanasabah;

    public transaksiPeminjaman(String paranama, String paraid) {
        initComponents();
        nama = paranama;
        tellerID = paraid;
        FunctionClass.kodeTransaksiPinjam(kodetransaksipinjam, txtxkodepinjam);
        FunctionClass.kodeJaminan(kodejaminan, txtKodeTransaksi);
        txtNoRekening.requestFocus();
        kodetransaksipinjam = txtKodeTransaksi.getText();
    }

    public void cekNoRek() {
        java.sql.Connection conn = new DBConnection().connect();
        try {
            SQL = "select * from nasabah where binary norekening = ?";
            java.sql.PreparedStatement nimstate = conn.prepareStatement(SQL);
            nimstate.setString(1, txtNoRekening.getText());
            ResultSet nimrs = nimstate.executeQuery();
            if (nimrs.next()) {
                namanasabah = nimrs.getString("nama");
                System.out.println(namanasabah);
            } else {
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

        jPanel1 = new javax.swing.JPanel();
        windowName = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        judulTransaksi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtKodeTransaksi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNoRekening = new javax.swing.JTextField();
        txtNominal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtFotoJaminan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBrowseJaminan = new javax.swing.JButton();
        fotoJaminan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbJenisJaminan = new javax.swing.JComboBox<>();
        txtxkodepinjam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        windowName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        windowName.setForeground(new java.awt.Color(255, 255, 255));
        windowName.setText("Transaction Name");
        jPanel1.add(windowName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 230, 30));

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
        jPanel1.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 30));

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
        jPanel1.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judulTransaksi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        judulTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulTransaksi.setText("Pendaftaran Peminjaman Nasabah");
        jPanel2.add(judulTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Kode Barang Jaminan");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 220, 30));

        txtKodeTransaksi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(txtKodeTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nomor Anggota");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 30));

        txtNoRekening.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNoRekening.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNoRekeningFocusLost(evt);
            }
        });
        jPanel2.add(txtNoRekening, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 220, 30));

        txtNominal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(txtNominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Jenis Jaminan");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 30));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel2.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 110, 40));

        btnCancel.setText("Kembali");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 110, 40));

        txtFotoJaminan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(txtFotoJaminan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 135, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Foto Jaminan");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 220, 30));

        btnBrowseJaminan.setText("Browse");
        btnBrowseJaminan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseJaminanActionPerformed(evt);
            }
        });
        jPanel2.add(btnBrowseJaminan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 80, 30));

        fotoJaminan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fotoJaminan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoJaminan.setText("FOTO JAMINAN");
        fotoJaminan.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(fotoJaminan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 220, 130));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Nominal Peminjaman");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 220, 30));

        cmbJenisJaminan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BPKB", "SERTIFIKAT", "LAINNYA" }));
        jPanel2.add(cmbJenisJaminan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 30));

        txtxkodepinjam.setText("jLabel5");
        jPanel2.add(txtxkodepinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 220, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoRekeningFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoRekeningFocusLost
        if (txtNoRekening.getText().equals("")) {

        } else {
            String id = txtNoRekening.getText();
            StringBuilder capsId = new StringBuilder(id);
            capsId.setCharAt(0, Character.toUpperCase(capsId.charAt(0)));
            txtNoRekening.setText(capsId.toString());
            cekNoRek();            
        }
    }//GEN-LAST:event_txtNoRekeningFocusLost

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            FunctionClass.addDataJaminan(txtFotoJaminan,
                    kodejaminan,
                    txtNoRekening,
                    namanasabah,
                    txtNominal,
                    cmbJenisJaminan,
                    tellerID);
            FunctionClass.addTransaksiPinjam(txtNoRekening,
                    txtNominal,
                    kodetransaksipinjam,
                    tellerID);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new Admin(nama, tellerID).setVisible(true);
        Admin.menuTab.setSelectedIndex(4);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBrowseJaminanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseJaminanActionPerformed
        FileNameExtensionFilter fileext = new FileNameExtensionFilter("File .jpg / .png", "jpg", "png");
        JFileChooser jfc = new JFileChooser("D:");
        jfc.addChoosableFileFilter(fileext);
        int r = jfc.showOpenDialog(jPanel2);
        if (r == JFileChooser.APPROVE_OPTION) {
            txtFotoJaminan.setText(jfc.getSelectedFile().getAbsolutePath());
            ImageIcon icon = new ImageIcon(jfc.getSelectedFile().getAbsolutePath());
            Image img1 = icon.getImage();
            Image img2 = img1.getScaledInstance(fotoJaminan.getWidth(), fotoJaminan.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon img = new ImageIcon(img2);
            fotoJaminan.setIcon(img);
            fotoJaminan.setText("");
            fotoJaminan.setBorder(null);
        } else {
            txtFotoJaminan.setText("");
            fotoJaminan.setIcon(null);
            fotoJaminan.setText("FOTO JAMINAN");
            fotoJaminan.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));
        }
    }//GEN-LAST:event_btnBrowseJaminanActionPerformed

    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(transaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksiPeminjaman("", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseJaminan;
    private javax.swing.JButton btnCancel;
    public static transient javax.swing.JButton btnSimpan;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox<String> cmbJenisJaminan;
    private javax.swing.JLabel fotoJaminan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static transient javax.swing.JLabel judulTransaksi;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JTextField txtFotoJaminan;
    private javax.swing.JTextField txtKodeTransaksi;
    private javax.swing.JTextField txtNoRekening;
    private javax.swing.JTextField txtNominal;
    private javax.swing.JLabel txtxkodepinjam;
    public static transient javax.swing.JLabel windowName;
    // End of variables declaration//GEN-END:variables
}
