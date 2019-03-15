package form;

import config.DBConnection;
import java.io.File;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class transaksiNasabah extends javax.swing.JFrame {
    public String nama, tellerID, IDnas;
    public transaksiNasabah(String paranama, String paraid, String parareknas){
        initComponents();
        nama = paranama;
        tellerID = paraid;
        IDnas = parareknas;
        System.out.println(IDnas);
        FunctionClass.fillTableTransaksiNasabah(tbTransaksiNasabah, IDnas);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windowsBar = new javax.swing.JPanel();
        minimizeButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        windowName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTransaksiNasabah = new javax.swing.JTable();
        lbNamaNasabah = new javax.swing.JLabel();
        btnBackToDashbord = new javax.swing.JButton();
        btnReportNasabah = new javax.swing.JButton();

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
        windowsBar.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

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
        windowsBar.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 30, 30));

        windowName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        windowName.setForeground(new java.awt.Color(255, 255, 255));
        windowName.setText("Transaksi Nasabah");
        windowsBar.add(windowName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 30));

        getContentPane().add(windowsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbTransaksiNasabah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbTransaksiNasabah.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbTransaksiNasabahFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(tbTransaksiNasabah);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 760, 280));

        lbNamaNasabah.setText("jLabel1");
        jPanel1.add(lbNamaNasabah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 20));

        btnBackToDashbord.setText("Kembali");
        btnBackToDashbord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToDashbordActionPerformed(evt);
            }
        });
        jPanel1.add(btnBackToDashbord, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 100, 30));

        btnReportNasabah.setText("Laporan Transaksi Nasabah");
        btnReportNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportNasabahActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportNasabah, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 780, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed
    private void btnBackToDashbordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToDashbordActionPerformed
        new Admin(nama, tellerID).setVisible(true);
        Admin.menuTab.setSelectedIndex(1);
        this.dispose();
    }//GEN-LAST:event_btnBackToDashbordActionPerformed
    private void tbTransaksiNasabahFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbTransaksiNasabahFocusLost
        tbTransaksiNasabah.getSelectionModel().clearSelection();
    }//GEN-LAST:event_tbTransaksiNasabahFocusLost
    private void btnReportNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportNasabahActionPerformed
        java.sql.Connection conn = new DBConnection().connect();
        try {
            File file = new File("src/report/laporan transaksi nasabah.jrxml");
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            String sql = "select kodetransaksi, norekening, tanggaltransaksi, "
                        + "nominal as nominalpinjam, "
                        + "0 as nominalsimpan, keterangan "
                        + "from transaksipeminjaman "
                        + "where norekening = '" + IDnas + "' "
                        + "union select kodetransaksi, norekening, "
                        + "tanggaltransaksi, 0 as nominalpinjam, "
                        + "nominal as nominalsimpan, keterangan "
                        + "from transaksisimpan "
                        + "where norekening = '" + IDnas + "' "
                        + "order by tanggaltransaksi asc";
            JRDesignQuery newquery = new JRDesignQuery();
            newquery.setText(sql);
            jasperdesign.setQuery(newquery);
            JasperReport jasperreport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperprint = JasperFillManager.fillReport(jasperreport, null, conn);
            JasperViewer.viewReport(jasperprint, false);
        } catch (JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnReportNasabahActionPerformed
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
            java.util.logging.Logger.getLogger(transaksiNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksiNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksiNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksiNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksiNasabah("","","").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToDashbord;
    private javax.swing.JButton btnReportNasabah;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static transient javax.swing.JLabel lbNamaNasabah;
    private javax.swing.JButton minimizeButton;
    public static transient javax.swing.JTable tbTransaksiNasabah;
    private javax.swing.JLabel windowName;
    private javax.swing.JPanel windowsBar;
    // End of variables declaration//GEN-END:variables
}
