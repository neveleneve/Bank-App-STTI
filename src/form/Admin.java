package form;
import config.DBConnection;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
public class Admin extends javax.swing.JFrame {
    public String nama, tellerid;
    public String namaNasabah = null;
    public String statNasabah = null;
    public String IDNasabah = null;
    public Admin(String paranama, String paraid) {
        initComponents();
        FunctionClass.dateNow(lbHariIni);
        FunctionClass.fillTableNasabah(tbNasabah);
        tellerid = paraid;
        nama = paranama;
        callAllFunction();
        lbWelcome.setText("Selamat Datang, " + paranama);
    }
    public void callAllFunction(){
        btnChangeStatus.setEnabled(false);
        btnSeeTransaction.setEnabled(false);
        IDNasabah = null;
        tbNasabah.setToolTipText(null);
        FunctionClass.fillTableNasabah(tbNasabah);
        FunctionClass.fillTableSimpanan(tbSimpanan);
        FunctionClass.fillTablePinjaman(tbPeminjaman);
        
        FunctionClass.jumlahNasabahNonAktif(lbJumNasNonAktif);
        FunctionClass.jumlahNasabah(lbTotNas);
        FunctionClass.jumlahNasabahAktif(lbJumNasAktif);        
        FunctionClass.totalSimpanan(lbTotSimpanan);
        FunctionClass.totalPinjaman(lbTotPeminjaman);
        FunctionClass.totalTransaksi(lbTotTransaksi);
        FunctionClass.totalPembayaran(lbTotPembayaran);
        FunctionClass.totalPengambilan(lbTotPengambilan);
        
        FunctionClass.jumlahNasabahNonAktifTeller(lbJumNasNonAktifTeller, tellerid);
        FunctionClass.jumlahNasabahTeller(lbTotNasTeller, tellerid);
        FunctionClass.jumlahNasabahAktifTeller(lbJumNasAktifTeller, tellerid);
        FunctionClass.totalSimpananTeller(lbTotSimpananTeller, tellerid);
        FunctionClass.totalPinjamanTeller(lbTotPeminjamanTeller, tellerid);
        FunctionClass.totalTransaksiTeller(lbTotTransaksiTeller, tellerid);
        FunctionClass.totalPembayaranTeller(lbTotPembayaranTeller, tellerid);
        FunctionClass.totalPengambilanTeller(lbTotPengambilanTeller, tellerid);
    }    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuButton_group = new javax.swing.ButtonGroup();
        windowsBar = new javax.swing.JPanel();
        minimizeButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        windowName = new javax.swing.JLabel();
        lbHariIni = new javax.swing.JLabel();
        menuTab = new javax.swing.JTabbedPane();
        menuTab_home = new javax.swing.JPanel();
        judulStatistik = new javax.swing.JLabel();
        panelTransaksi = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lbTotPengambilan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbTotPembayaran = new javax.swing.JLabel();
        lbTotPeminjaman = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbJumNasAktif = new javax.swing.JLabel();
        lbJumNasNonAktif = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbTotNas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbTotSimpanan = new javax.swing.JLabel();
        lbTotTransaksi = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelTransaksiTeller = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lbTotPengambilanTeller = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbTotPembayaranTeller = new javax.swing.JLabel();
        lbTotPeminjamanTeller = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbJumNasAktifTeller = new javax.swing.JLabel();
        lbJumNasNonAktifTeller = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbTotNasTeller = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbTotSimpananTeller = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbTotTransaksiTeller = new javax.swing.JLabel();
        btnLaporanNasabah = new javax.swing.JButton();
        btnLaporanPinjam = new javax.swing.JButton();
        btnLaporanSimpan = new javax.swing.JButton();
        menuTab_nasabah = new javax.swing.JPanel();
        btnSeeTransaction = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNasabah = new javax.swing.JTable();
        judulNasabah = new javax.swing.JLabel();
        btnAddUser = new javax.swing.JButton();
        btnChangeStatus = new javax.swing.JButton();
        menuTab_simpanan = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSimpanan = new javax.swing.JTable();
        juduTransaksiSimpan = new javax.swing.JLabel();
        kreditNasabah = new javax.swing.JButton();
        depositNasabah = new javax.swing.JButton();
        menuTab_peminjaman = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPeminjaman = new javax.swing.JTable();
        judulTransaksiPinjam = new javax.swing.JLabel();
        buatPinjaman = new javax.swing.JButton();
        bayarPinjaman = new javax.swing.JButton();
        lbLogout = new javax.swing.JLabel();
        lbWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(750, 660));
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
        windowsBar.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 30, 30));

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
        windowsBar.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

        windowName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        windowName.setForeground(new java.awt.Color(255, 255, 255));
        windowName.setText("Dashboard");
        windowsBar.add(windowName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 30));

        getContentPane().add(windowsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        lbHariIni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbHariIni.setText("jLabel14");
        getContentPane().add(lbHariIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 160, 50));

        menuTab.setBackground(new java.awt.Color(102, 102, 102));
        menuTab.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        menuTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTabMouseClicked(evt);
            }
        });

        menuTab_home.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        menuTab_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judulStatistik.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        judulStatistik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulStatistik.setText("Statistik Koperasi CU Jembatan Kasih");
        menuTab_home.add(judulStatistik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 30));

        panelTransaksi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Transaksi Keseluruhan"));
        panelTransaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Total Pengambilan :");
        panelTransaksi.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 20));

        lbTotPengambilan.setText("0");
        panelTransaksi.add(lbTotPengambilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 150, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Total Pembayaran :");
        panelTransaksi.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 150, 20));

        lbTotPembayaran.setText("0");
        panelTransaksi.add(lbTotPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 20));

        lbTotPeminjaman.setText("0");
        panelTransaksi.add(lbTotPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Total Peminjaman :");
        panelTransaksi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Jumlah Nasabah Aktif :");
        panelTransaksi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 20));

        lbJumNasAktif.setText("0");
        panelTransaksi.add(lbJumNasAktif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 20));

        lbJumNasNonAktif.setText("0");
        panelTransaksi.add(lbJumNasNonAktif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Jumlah Nasabah Non-Aktif :");
        panelTransaksi.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 170, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Jumlah Nasabah :");
        panelTransaksi.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 140, 20));

        lbTotNas.setText("0");
        panelTransaksi.add(lbTotNas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 100, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Total Simpanan :");
        panelTransaksi.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, 20));

        lbTotSimpanan.setText("0");
        panelTransaksi.add(lbTotSimpanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 20));

        lbTotTransaksi.setText("0");
        panelTransaksi.add(lbTotTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 100, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Jumlah Transaksi :");
        panelTransaksi.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 140, 20));

        menuTab_home.add(panelTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 300, 450));

        panelTransaksiTeller.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Transaksi Bersama Anda"));
        panelTransaksiTeller.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Total Pengambilan :");
        panelTransaksiTeller.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 20));

        lbTotPengambilanTeller.setText("0");
        panelTransaksiTeller.add(lbTotPengambilanTeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 150, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Total Pembayaran :");
        panelTransaksiTeller.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 20));

        lbTotPembayaranTeller.setText("0");
        panelTransaksiTeller.add(lbTotPembayaranTeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, 20));

        lbTotPeminjamanTeller.setText("0");
        panelTransaksiTeller.add(lbTotPeminjamanTeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Total Peminjaman :");
        panelTransaksiTeller.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Jumlah Nasabah Aktif :");
        panelTransaksiTeller.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 20));

        lbJumNasAktifTeller.setText("0");
        panelTransaksiTeller.add(lbJumNasAktifTeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 20));

        lbJumNasNonAktifTeller.setText("0");
        panelTransaksiTeller.add(lbJumNasNonAktifTeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Jumlah Nasabah Non-Aktif :");
        panelTransaksiTeller.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 170, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Jumlah Nasabah :");
        panelTransaksiTeller.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 140, 20));

        lbTotNasTeller.setText("0");
        panelTransaksiTeller.add(lbTotNasTeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 100, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Total Simpanan :");
        panelTransaksiTeller.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, 20));

        lbTotSimpananTeller.setText("0");
        panelTransaksiTeller.add(lbTotSimpananTeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Jumlah Transaksi :");
        panelTransaksiTeller.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 140, 20));

        lbTotTransaksiTeller.setText("0");
        panelTransaksiTeller.add(lbTotTransaksiTeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 100, 20));

        menuTab_home.add(panelTransaksiTeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 300, 450));

        btnLaporanNasabah.setText("Laporan Nasabah");
        btnLaporanNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanNasabahActionPerformed(evt);
            }
        });
        menuTab_home.add(btnLaporanNasabah, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 140, 30));

        btnLaporanPinjam.setText("Laporan Pinjam");
        btnLaporanPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanPinjamActionPerformed(evt);
            }
        });
        menuTab_home.add(btnLaporanPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 120, 30));

        btnLaporanSimpan.setText("Laporan Simpan");
        btnLaporanSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanSimpanActionPerformed(evt);
            }
        });
        menuTab_home.add(btnLaporanSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 120, 30));

        menuTab.addTab("Home", menuTab_home);

        menuTab_nasabah.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        menuTab_nasabah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSeeTransaction.setBackground(new java.awt.Color(0, 255, 0));
        btnSeeTransaction.setForeground(new java.awt.Color(255, 255, 255));
        btnSeeTransaction.setText("Lihat Transaksi Nasabah");
        btnSeeTransaction.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSeeTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeTransactionActionPerformed(evt);
            }
        });
        menuTab_nasabah.add(btnSeeTransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 170, 30));

        tbNasabah.setModel(new javax.swing.table.DefaultTableModel(
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
        tbNasabah.setUpdateSelectionOnSort(false);
        tbNasabah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNasabahMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNasabah);

        menuTab_nasabah.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 710, 440));

        judulNasabah.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        judulNasabah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulNasabah.setText("Daftar Nasabah Koperasi");
        menuTab_nasabah.add(judulNasabah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 30));

        btnAddUser.setBackground(new java.awt.Color(0, 0, 255));
        btnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUser.setText("Tambah Nasabah");
        btnAddUser.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        menuTab_nasabah.add(btnAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 130, 30));

        btnChangeStatus.setBackground(new java.awt.Color(255, 0, 0));
        btnChangeStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnChangeStatus.setText("Ubah Status Nasabah");
        btnChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeStatusActionPerformed(evt);
            }
        });
        menuTab_nasabah.add(btnChangeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 160, 30));

        menuTab.addTab("Daftar Nasabah", menuTab_nasabah);

        menuTab_simpanan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        menuTab_simpanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbSimpanan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbSimpanan);

        menuTab_simpanan.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 710, 440));

        juduTransaksiSimpan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        juduTransaksiSimpan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        juduTransaksiSimpan.setText("Daftar Transaksi Penyimpanan Nasabah Koperasi");
        menuTab_simpanan.add(juduTransaksiSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 30));

        kreditNasabah.setBackground(new java.awt.Color(0, 255, 0));
        kreditNasabah.setText("Penarikan");
        kreditNasabah.setMargin(new java.awt.Insets(0, 0, 0, 0));
        kreditNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kreditNasabahActionPerformed(evt);
            }
        });
        menuTab_simpanan.add(kreditNasabah, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 130, 30));

        depositNasabah.setBackground(new java.awt.Color(0, 0, 255));
        depositNasabah.setForeground(new java.awt.Color(255, 255, 255));
        depositNasabah.setText("Deposit");
        depositNasabah.setMargin(new java.awt.Insets(0, 0, 0, 0));
        depositNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositNasabahActionPerformed(evt);
            }
        });
        menuTab_simpanan.add(depositNasabah, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 130, 30));

        menuTab.addTab("Simpanan", menuTab_simpanan);

        menuTab_peminjaman.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        menuTab_peminjaman.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbPeminjaman);

        menuTab_peminjaman.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 710, 440));

        judulTransaksiPinjam.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        judulTransaksiPinjam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulTransaksiPinjam.setText("Daftar Transaksi Peminjaman Nasabah Koperasi");
        menuTab_peminjaman.add(judulTransaksiPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 30));

        buatPinjaman.setBackground(new java.awt.Color(0, 255, 0));
        buatPinjaman.setText("Kredit");
        buatPinjaman.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buatPinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buatPinjamanActionPerformed(evt);
            }
        });
        menuTab_peminjaman.add(buatPinjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 130, 30));

        bayarPinjaman.setBackground(new java.awt.Color(0, 0, 255));
        bayarPinjaman.setForeground(new java.awt.Color(255, 255, 255));
        bayarPinjaman.setText("Cicil");
        bayarPinjaman.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bayarPinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarPinjamanActionPerformed(evt);
            }
        });
        menuTab_peminjaman.add(bayarPinjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 130, 30));

        menuTab.addTab("Peminjaman", menuTab_peminjaman);

        getContentPane().add(menuTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 730, 590));

        lbLogout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbLogout.setForeground(new java.awt.Color(0, 0, 255));
        lbLogout.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbLogout.setText("Log Out");
        lbLogout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbLogout.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 255)));
        lbLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(lbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 50, 20));

        lbWelcome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbWelcome.setText("Selamat Datang,");
        getContentPane().add(lbWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed
    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed
    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        String[] options = {"Yes", "No"};
        int x = JOptionPane.showOptionDialog(null, 
                "Anda Akan Log Out", "Log Out?", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        switch (x){
            case 0:
                JOptionPane.showMessageDialog(null, "Anda Telah Log Out", "Terima Kasih, " + nama, JOptionPane.INFORMATION_MESSAGE);
                new Login().setVisible(true);
                this.dispose();
                break;
            case 1:                
                break;
            default:
                break;
        }
    }//GEN-LAST:event_lbLogoutMouseClicked
    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        new addNasabah(nama,tellerid).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddUserActionPerformed
    private void tbNasabahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNasabahMouseClicked
        int baris = tbNasabah.getSelectedRow();
        IDNasabah = tbNasabah.getValueAt(baris, 0).toString();
        statNasabah = tbNasabah.getValueAt(baris, 3).toString();
        namaNasabah = tbNasabah.getValueAt(baris, 1).toString();
        System.out.println(statNasabah);
        if(IDNasabah == null){
            btnSeeTransaction.setEnabled(false);
        }else{
            btnSeeTransaction.setEnabled(true);
            btnChangeStatus.setEnabled(true);
            tbNasabah.setToolTipText("User ID " + namaNasabah + " Selected");
        }
    }//GEN-LAST:event_tbNasabahMouseClicked
    private void btnLaporanPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanPinjamActionPerformed
        java.sql.Connection conn = new DBConnection().connect();
        try {
            File file = new File("src/report/laporan peminjaman.jrxml");
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            String sql = "select kodetransaksi,norekening, tanggaltransaksi, nominal, keterangan from transaksipeminjaman order by right(kodetransaksi, 5) asc";
            JRDesignQuery newquery = new JRDesignQuery();
            newquery.setText(sql);
            jasperdesign.setQuery(newquery);
            JasperReport jasperreport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperprint = JasperFillManager.fillReport(jasperreport, null, conn);
            JasperViewer.viewReport(jasperprint, false);
        } catch (JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnLaporanPinjamActionPerformed
    private void btnLaporanSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanSimpanActionPerformed
        java.sql.Connection conn = new DBConnection().connect();
        try {
            File file = new File("src/report/laporan simpanan.jrxml");
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            String sql = "select kodetransaksi,norekening, tanggaltransaksi, nominal, keterangan from transaksisimpan order by right(kodetransaksi, 5) asc";
            JRDesignQuery newquery = new JRDesignQuery();
            newquery.setText(sql);
            jasperdesign.setQuery(newquery);
            JasperReport jasperreport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperprint = JasperFillManager.fillReport(jasperreport, null, conn);
            JasperViewer.viewReport(jasperprint, false);
        } catch (JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnLaporanSimpanActionPerformed
    private void btnLaporanNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanNasabahActionPerformed
        java.sql.Connection conn = new DBConnection().connect();
        try {
            File file = new File("src/report/laporan daftar nasabah.jrxml");
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            String sql = "select norekening, nama, jeniskelamin, kontak, status, simpanan, pinjaman from nasabah order by right(norekening, 5) asc";
            JRDesignQuery newquery = new JRDesignQuery();
            newquery.setText(sql);
            jasperdesign.setQuery(newquery);
            JasperReport jasperreport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperprint = JasperFillManager.fillReport(jasperreport, null, conn);
            JasperViewer.viewReport(jasperprint, false);
        } catch (JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnLaporanNasabahActionPerformed
    private void btnSeeTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeTransactionActionPerformed
        //int baris = tbNasabah.getSelectedRow();
        new transaksiNasabah(nama, tellerid, IDNasabah).setVisible(true);
        tbNasabah.getSelectionModel().clearSelection();
        transaksiNasabah.lbNamaNasabah.setText("Transaksi Atas Nama "+ namaNasabah);
        tbNasabah.setToolTipText(null);
        btnSeeTransaction.setEnabled(false);
        this.dispose();
    }//GEN-LAST:event_btnSeeTransactionActionPerformed
    private void buatPinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buatPinjamanActionPerformed
        new transaksiSimpan(nama, tellerid).setVisible(true);
        transaksiSimpan.judulTransaksi.setText("Transaksi Peminjaman");
        transaksiSimpan.btnSimpan.setText("Pinjam");
        this.dispose();
    }//GEN-LAST:event_buatPinjamanActionPerformed
    private void bayarPinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarPinjamanActionPerformed
        new transaksiSimpan(nama, tellerid).setVisible(true);
        transaksiSimpan.judulTransaksi.setText("Transaksi Pembayaran");
        transaksiSimpan.btnSimpan.setText("Bayar");
        this.dispose();
    }//GEN-LAST:event_bayarPinjamanActionPerformed
    private void depositNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositNasabahActionPerformed
        new transaksiSimpan(nama, tellerid).setVisible(true);
        transaksiSimpan.judulTransaksi.setText("Transaksi Deposit");
        transaksiSimpan.btnSimpan.setText("Deposit");
        this.dispose();
    }//GEN-LAST:event_depositNasabahActionPerformed
    private void kreditNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kreditNasabahActionPerformed
        new transaksiSimpan(nama, tellerid).setVisible(true);
        transaksiSimpan.judulTransaksi.setText("Transaksi Penarikan");
        transaksiSimpan.btnSimpan.setText("Tarik");
        this.dispose();
    }//GEN-LAST:event_kreditNasabahActionPerformed
    private void btnChangeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeStatusActionPerformed
        FunctionClass.changeStatus(IDNasabah, statNasabah, btnChangeStatus, btnSeeTransaction);
        callAllFunction();
    }//GEN-LAST:event_btnChangeStatusActionPerformed
    private void menuTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTabMouseClicked
        btnChangeStatus.setEnabled(false);
        btnSeeTransaction.setEnabled(false);
        IDNasabah = null;
        tbNasabah.setToolTipText(null);
        tbNasabah.getSelectionModel().clearSelection();
        //callAllFunction();
        System.out.println("tertekan kau ele");
    }//GEN-LAST:event_menuTabMouseClicked
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin("","").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bayarPinjaman;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnChangeStatus;
    private javax.swing.JButton btnLaporanNasabah;
    private javax.swing.JButton btnLaporanPinjam;
    private javax.swing.JButton btnLaporanSimpan;
    private javax.swing.JButton btnSeeTransaction;
    private javax.swing.JButton buatPinjaman;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton depositNasabah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel juduTransaksiSimpan;
    private javax.swing.JLabel judulNasabah;
    private javax.swing.JLabel judulStatistik;
    private javax.swing.JLabel judulTransaksiPinjam;
    private javax.swing.JButton kreditNasabah;
    private javax.swing.JLabel lbHariIni;
    private javax.swing.JLabel lbJumNasAktif;
    private javax.swing.JLabel lbJumNasAktifTeller;
    private javax.swing.JLabel lbJumNasNonAktif;
    private javax.swing.JLabel lbJumNasNonAktifTeller;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbTotNas;
    private javax.swing.JLabel lbTotNasTeller;
    private javax.swing.JLabel lbTotPembayaran;
    private javax.swing.JLabel lbTotPembayaranTeller;
    private javax.swing.JLabel lbTotPeminjaman;
    private javax.swing.JLabel lbTotPeminjamanTeller;
    private javax.swing.JLabel lbTotPengambilan;
    private javax.swing.JLabel lbTotPengambilanTeller;
    private javax.swing.JLabel lbTotSimpanan;
    private javax.swing.JLabel lbTotSimpananTeller;
    private javax.swing.JLabel lbTotTransaksi;
    private javax.swing.JLabel lbTotTransaksiTeller;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.ButtonGroup menuButton_group;
    public static transient javax.swing.JTabbedPane menuTab;
    private javax.swing.JPanel menuTab_home;
    private javax.swing.JPanel menuTab_nasabah;
    private javax.swing.JPanel menuTab_peminjaman;
    private javax.swing.JPanel menuTab_simpanan;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JPanel panelTransaksi;
    private javax.swing.JPanel panelTransaksiTeller;
    private javax.swing.JTable tbNasabah;
    private javax.swing.JTable tbPeminjaman;
    private javax.swing.JTable tbSimpanan;
    private javax.swing.JLabel windowName;
    private javax.swing.JPanel windowsBar;
    // End of variables declaration//GEN-END:variables
}