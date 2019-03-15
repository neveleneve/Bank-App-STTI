package form;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
public class addNasabah extends javax.swing.JFrame {
    public static String tellerID, nama, idbaru, kodeTransaksiSimpan, kodeTransaksiPinjam;
    DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
    Calendar cal = Calendar.getInstance();
    Date tgl = new Date();
    public addNasabah(String paranama, String paraid) {
        initComponents();
        FunctionClass.dateNow(lbHariIni);
        tellerID = paraid;
        nama = paranama;
        FunctionClass.KodeRekeningOtomatis(idbaru, txtIDNasabah, txtNamaNasabah, tgl, dateFormat);
        FunctionClass.kodeTransaksiPinjam();
        FunctionClass.kodeTransaksiSimpan();
        System.out.println(idbaru);
        System.out.println(kodeTransaksiPinjam);
        System.out.println(kodeTransaksiSimpan);
        txTanggalLahir.setDate(tgl);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windowsBar = new javax.swing.JPanel();
        minimizeButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        windowName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtAlamat = new javax.swing.JTextField();
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
        txtSimpanan = new javax.swing.JTextField();
        txtPinjaman = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboJenisKelamin = new javax.swing.JComboBox<>();
        txTanggalLahir = new com.toedter.calendar.JDateChooser();
        lbHariIni = new javax.swing.JLabel();

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
        windowsBar.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 30, 30));

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
        windowsBar.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 30, 30));

        windowName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        windowName.setForeground(new java.awt.Color(255, 255, 255));
        windowName.setText("Tambah Nasabah");
        windowsBar.add(windowName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 30));

        getContentPane().add(windowsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 170, 30));
        jPanel1.add(txtNamaNasabah, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 170, 30));

        txtIDNasabah.setFocusable(false);
        jPanel1.add(txtIDNasabah, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, 30));
        jPanel1.add(txtKontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 170, 30));
        jPanel1.add(txtTempatLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 170, 30));
        jPanel1.add(txtPekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 170, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID Nasabah");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 40, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Alamat");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 50, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Kontak");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 60, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tempat Lahir");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 90, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tanggal Lahir");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Pekerjaan");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 70, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 90, 40));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 90, 40));
        jPanel1.add(txtSimpanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 170, 30));
        jPanel1.add(txtPinjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 170, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Simpanan Awal");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 130, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Pinjamanan Awal");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 120, 30));

        comboJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        jPanel1.add(comboJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 170, 30));

        txTanggalLahir.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(txTanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 170, 30));

        lbHariIni.setText("jLabel1");
        jPanel1.add(lbHariIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 190, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 490, 470));

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
        if(txtSimpanan.getText().equals("") || txtPinjaman.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan Isi Nominal Penyimpanan atau Peminjaman", "Kesalahan", JOptionPane.INFORMATION_MESSAGE);
        }else if(txtPinjaman.getText().equals("0")){
            FunctionClass.addTransaksiSimpan();
            FunctionClass.addUser();
            new Admin(nama, tellerID).setVisible(true);
            Admin.menuTab.setSelectedIndex(1);
            this.dispose();
        }else if(txtSimpanan.getText().equals("0")){
            FunctionClass.addTransaksiPinjam();
            FunctionClass.addUser();
            new Admin(nama, tellerID).setVisible(true);
            Admin.menuTab.setSelectedIndex(1);
            this.dispose();
        }else if(!txtPinjaman.getText().equals("") && !txtPinjaman.getText().equals("")){
            FunctionClass.addTransaksiPinjam();
            FunctionClass.addTransaksiSimpan();
            FunctionClass.addUser();
            new Admin(nama, tellerID).setVisible(true);
            Admin.menuTab.setSelectedIndex(1);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
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
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNasabah("","").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    public static transient javax.swing.JComboBox<String> comboJenisKelamin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbHariIni;
    private javax.swing.JButton minimizeButton;
    public static transient com.toedter.calendar.JDateChooser txTanggalLahir;
    public static transient javax.swing.JTextField txtAlamat;
    public static transient javax.swing.JTextField txtIDNasabah;
    public static transient javax.swing.JTextField txtKontak;
    public static transient javax.swing.JTextField txtNamaNasabah;
    public static transient javax.swing.JTextField txtPekerjaan;
    public static transient javax.swing.JTextField txtPinjaman;
    public static transient javax.swing.JTextField txtSimpanan;
    public static transient javax.swing.JTextField txtTempatLahir;
    private javax.swing.JLabel windowName;
    private javax.swing.JPanel windowsBar;
    // End of variables declaration//GEN-END:variables
}