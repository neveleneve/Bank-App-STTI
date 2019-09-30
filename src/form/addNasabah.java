package form;

import java.awt.Color;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class addNasabah extends javax.swing.JFrame {

    public static String tellerID, nama, idbaru, kodeTransaksiSimpan, kodeTransaksiPinjam;
    Calendar cal = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
    Date tgl = new Date();

    public addNasabah(String paranama, String paraid) {
        initComponents();
        FunctionClass.dateNow(lbHariIni);
        tellerID = paraid;
        nama = paranama;
        FunctionClass.KodeRekeningOtomatis(idbaru, txtIDNasabah, txtNamaNasabah, tgl, dateFormat);
        System.out.println(idbaru);
        txTanggalLahir.setDate(tgl);
        txtNamaNasabah.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windowsBar = new javax.swing.JPanel();
        minimizeButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        windowName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNamaNasabah = new javax.swing.JTextField();
        txtIDNasabah = new javax.swing.JTextField();
        txtKontak = new javax.swing.JTextField();
        txtTempatLahir = new javax.swing.JTextField();
        txtPekerjaan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtnamafile = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboJenisKelamin = new javax.swing.JComboBox<>();
        txTanggalLahir = new com.toedter.calendar.JDateChooser();
        lbHariIni = new javax.swing.JLabel();
        txtNIK = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnBrowseKTP = new javax.swing.JButton();
        fotoKTP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();

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
        windowsBar.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 30, 30));

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
        windowsBar.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 30, 30));

        windowName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        windowName.setForeground(new java.awt.Color(255, 255, 255));
        windowName.setText("Tambah Nasabah");
        windowsBar.add(windowName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 30));

        getContentPane().add(windowsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtNamaNasabah, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 170, 30));

        txtIDNasabah.setFocusable(false);
        jPanel1.add(txtIDNasabah, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, 30));
        jPanel1.add(txtKontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 170, 30));
        jPanel1.add(txtTempatLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 170, 30));
        jPanel1.add(txtPekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 170, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nomor Nasabah");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 40, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Alamat");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 50, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Kontak");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 60, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tempat Lahir");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tanggal Lahir");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 90, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Pekerjaan");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 70, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 80, 40));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 80, 40));
        jPanel1.add(txtnamafile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 170, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Fotocopy KTP");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, 30));

        comboJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        jPanel1.add(comboJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 170, 30));

        txTanggalLahir.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(txTanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 170, 30));

        lbHariIni.setText("jLabel1");
        jPanel1.add(lbHariIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 190, 20));
        jPanel1.add(txtNIK, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 170, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Nomor Induk Kependudukan");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 180, 30));

        btnBrowseKTP.setBackground(new java.awt.Color(0, 0, 255));
        btnBrowseKTP.setForeground(new java.awt.Color(255, 255, 255));
        btnBrowseKTP.setText("Browse");
        btnBrowseKTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseKTPActionPerformed(evt);
            }
        });
        jPanel1.add(btnBrowseKTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 80, 40));

        fotoKTP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fotoKTP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoKTP.setText("FOTO KTP");
        fotoKTP.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(fotoKTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 215, 135));

        txtAlamat.setColumns(9);
        txtAlamat.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtAlamat.setLineWrap(true);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 170, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Admin(nama, tellerID).setVisible(true);
        Admin.menuTab.setSelectedIndex(1);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            FunctionClass.addUser(txtnamafile, txtNIK, txtIDNasabah, txtNamaNasabah, txtAlamat, comboJenisKelamin, txtKontak, txtTempatLahir, txTanggalLahir, txtPekerjaan, tellerID);
            new Admin(nama, tellerID).setVisible(true);
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addNasabah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBrowseKTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseKTPActionPerformed
        FileNameExtensionFilter fileext = new FileNameExtensionFilter("File .jpg / .png", "jpg", "png");
        JFileChooser jfc = new JFileChooser("D:");
        jfc.addChoosableFileFilter(fileext);
        int r = jfc.showOpenDialog(jPanel1);
        if (r == JFileChooser.APPROVE_OPTION) {
            txtnamafile.setText(jfc.getSelectedFile().getAbsolutePath());
            ImageIcon icon = new ImageIcon(jfc.getSelectedFile().getAbsolutePath());
            Image img1 = icon.getImage();
            Image img2 = img1.getScaledInstance(fotoKTP.getWidth(), fotoKTP.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon img = new ImageIcon(img2);
            fotoKTP.setIcon(img);
            fotoKTP.setText("");
            fotoKTP.setBorder(null);
        } else {
            txtnamafile.setText("");
            fotoKTP.setIcon(null);
            fotoKTP.setText("FOTO KTP");
            fotoKTP.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));
        }
    }//GEN-LAST:event_btnBrowseKTPActionPerformed
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNasabah("", "").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseKTP;
    private javax.swing.JButton closeButton;
    public static transient javax.swing.JComboBox<String> comboJenisKelamin;
    private javax.swing.JLabel fotoKTP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHariIni;
    private javax.swing.JButton minimizeButton;
    public static transient com.toedter.calendar.JDateChooser txTanggalLahir;
    private javax.swing.JTextArea txtAlamat;
    public static transient javax.swing.JTextField txtIDNasabah;
    public static transient javax.swing.JTextField txtKontak;
    public static transient javax.swing.JTextField txtNIK;
    public static transient javax.swing.JTextField txtNamaNasabah;
    public static transient javax.swing.JTextField txtPekerjaan;
    public static transient javax.swing.JTextField txtTempatLahir;
    public static transient javax.swing.JTextField txtnamafile;
    private javax.swing.JLabel windowName;
    private javax.swing.JPanel windowsBar;
    // End of variables declaration//GEN-END:variables
}
