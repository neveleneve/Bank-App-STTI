package form;
import config.DBConnection; 
import java.awt.HeadlessException;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.text.DateFormat; 
import java.text.NumberFormat; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.Locale; 
import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JOptionPane; 
import javax.swing.JPasswordField; 
import javax.swing.JTable;
import javax.swing.JTextField; 
import javax.swing.ListSelectionModel; 
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
public class FunctionClass {
    public static String SQL, nama, tellerid, noreknasabah;
    public static DefaultTableModel tb_Nasabah, tb_Simpan, tb_Pinjam;
    public static DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
    public static Date tgl = new Date();
//...........................................................................................................//
//Admin punya function
    public static void dateNow(final JLabel lbl){
        Locale id = new Locale("in", "ID");
        String pattern = "EEEE, dd MMMM yyyy";
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, id);
        String before = sdf.format(today);
        lbl.setText(before);        
    }
    
    public static void totalPinjaman(final JLabel lbl){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select sum(pinjaman) as tbl from nasabah";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    lbl.setText("Rp. 0,00");
                }else{
                    String a = NumberFormat.getInstance().format(res.getFloat("tbl")).replace(",", ".")+",00";
                    lbl.setText("Rp. " + a);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void totalPinjamanTeller(final JLabel lbl, final String idteller){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select sum(pinjaman) as tbl from nasabah where tellerid = '" + idteller + "'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    lbl.setText("Rp. 0,00");
                }else{
                    String a = NumberFormat.getInstance().format(res.getFloat("tbl")).replace(",", ".")+",00";
                    lbl.setText("Rp. " + a);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }        
    }

    public static void totalSimpanan(final JLabel lbl){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select sum(simpanan) as tbl from nasabah";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    lbl.setText("Rp. 0,00");
                }else{
                    String a = NumberFormat.getInstance().format(res.getFloat("tbl")).replace(",", ".")+",00";
                    lbl.setText("Rp. " + a);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void totalSimpananTeller(final JLabel lbl, final String idteller){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select sum(simpanan) as tbl from nasabah where tellerid = '" + idteller + "'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    lbl.setText("Rp. 0,00");
                }else{
                    String a = NumberFormat.getInstance().format(res.getFloat("tbl")).replace(",", ".")+",00";
                    lbl.setText("Rp. " + a);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void jumlahNasabah(final JLabel lbl){
        java.sql.Connection conn = new DBConnection().connect();
        String a;
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select count(status) as tbl from nasabah";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                a = res.getString("tbl");
                lbl.setText(a + " Orang");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void jumlahNasabahTeller(final JLabel lbl, final String idteller){
        java.sql.Connection conn = new DBConnection().connect();
        String a;
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select count(status) as tbl from nasabah where tellerid = '" + idteller + "'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                a = res.getString("tbl");
                lbl.setText(a + " Orang");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }        
    }

    public static void jumlahNasabahNonAktif(final JLabel lbl){
        java.sql.Connection conn = new DBConnection().connect();
        String a;
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select count(status) as tbl from nasabah where status='Tidak Aktif'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                a = res.getString("tbl");
                lbl.setText(a + " Orang");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void jumlahNasabahNonAktifTeller(final JLabel lbl, final String idteller){
        java.sql.Connection conn = new DBConnection().connect();
        String a;
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select count(status) as tbl from nasabah where status='Tidak Aktif' and tellerid='" + idteller + "'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                a = res.getString("tbl");
                lbl.setText(a + " Orang");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void jumlahNasabahAktif(final JLabel lbl){
        java.sql.Connection conn = new DBConnection().connect();
        String a;
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select count(status) as tbl from nasabah where status='Aktif'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                a = res.getString("tbl");
                lbl.setText(a + " Orang");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void jumlahNasabahAktifTeller(final JLabel lbl, final String idteller){
        java.sql.Connection conn = new DBConnection().connect();
        String a;
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select count(status) as tbl from nasabah where status='Aktif' and tellerid = '" + idteller + "'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                a = res.getString("tbl");
                lbl.setText(a + " Orang");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void totalPembayaran(final JLabel lbl){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select sum(nominal) as tbl from transaksipeminjaman where keterangan = '"+"Pembayaran"+"'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    lbl.setText("Rp. 0,00");
                }else{
                    String a = NumberFormat.getInstance().format(res.getFloat("tbl")).replace(",", ".")+",00";
                    lbl.setText("Rp. " + a);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }        
    }
    public static void totalPembayaranTeller(final JLabel lbl, final String idteller){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select sum(nominal) as tbl from transaksipeminjaman where tellerid = '" + idteller + "' && keterangan = '"+"Pembayaran"+"'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    lbl.setText("Rp. 0,00");
                }else{
                    String a = NumberFormat.getInstance().format(res.getFloat("tbl")).replace(",", ".")+",00";
                    lbl.setText("Rp. " + a);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }        
    }

    public static void totalPengambilan(final JLabel lbl){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select sum(nominal) as tbl from transaksisimpan where keterangan = '"+"Pengambilan"+"'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    lbl.setText("Rp. 0,00");
                }else{
                    String a = NumberFormat.getInstance().format(res.getFloat("tbl")).replace(",", ".")+",00";
                    lbl.setText("Rp. " + a);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void totalPengambilanTeller(final JLabel lbl, final String idteller){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select sum(nominal) as tbl from transaksisimpan where tellerid = '" + idteller + "' && keterangan = '"+"Pengambilan"+"'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    lbl.setText("Rp. 0,00");
                }else{
                    String a = NumberFormat.getInstance().format(res.getFloat("tbl")).replace(",", ".")+",00";
                    lbl.setText("Rp. " + a);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void totalTransaksi(final JLabel lbl){
        java.sql.Connection conn = new DBConnection().connect();
        int a;
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select sum(a) as m from  (select count(kodetransaksi) as a from transaksisimpan union all select count(kodetransaksi) as a from transaksipeminjaman) as c";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                a = res.getInt("m");
                lbl.setText(a + " Transaksi");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void totalTransaksiTeller(final JLabel lbl, final String idteller){
        java.sql.Connection conn = new DBConnection().connect();
        int a;
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select sum(a) as m from  (select count(kodetransaksi) as a from transaksisimpan where tellerid = '" + idteller + "' union all select count(kodetransaksi) as a from transaksipeminjaman where tellerid='" + idteller + "') as c ";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                a = res.getInt("m");
                lbl.setText(a + " Transaksi");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void changeStatus(final String norek, final String stat, final JButton btntukar, final JButton btnlihat){
        if("Aktif".equals(stat)){
            java.sql.Connection conn = new DBConnection().connect();
            try {
                SQL = "update nasabah set status='"+"Tidak Aktif"+"' where norekening='" + norek + "'";
                java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
                try {
                    stmt.executeUpdate();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            } catch (SQLException e) {
            
            }
        }else if("Tidak Aktif".equals(stat)){
            java.sql.Connection conn = new DBConnection().connect();
            try {
                SQL = "update nasabah set status='"+"Aktif"+"' where norekening='" + norek + "'";
                java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
                try {
                    stmt.executeUpdate();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            } catch (SQLException e) {
            
            }
        }
    }
//...........................................................................................................//
//Admin dan transaksiNasabah punya table function
    public static void fillTableNasabah(final JTable tbl){
        tb_Nasabah = new DefaultTableModel();
        tb_Nasabah.addColumn("No. Rekening");
        tb_Nasabah.addColumn("Nama");
        tb_Nasabah.addColumn("Kontak");
        tb_Nasabah.addColumn("Status");
        tb_Nasabah.addColumn("Total Simpanan");
        tb_Nasabah.addColumn("Total Pinjaman");
        tbl.setModel(tb_Nasabah);
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select norekening, nama, kontak, status, simpanan, pinjaman from nasabah order by right(norekening, 5) asc";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                tb_Nasabah.addRow(new Object[]{
                    res.getString("norekening"),
                    res.getString("nama"),
                    res.getString("kontak"),
                    res.getString("status"),
                    "Rp. "+NumberFormat.getInstance().format(Float.parseFloat(res.getString("simpanan"))).replace(",", ".")+",00",
                    "Rp. "+NumberFormat.getInstance().format(Float.parseFloat(res.getString("pinjaman"))).replace(",", ".")+",00"
                });
            }
            
            DefaultTableCellRenderer midAligment = new DefaultTableCellRenderer();
            DefaultTableCellRenderer rightAligment = new DefaultTableCellRenderer();
            midAligment.setHorizontalAlignment(JLabel.CENTER);
            rightAligment.setHorizontalAlignment(JLabel.RIGHT);
            tbl.getColumnModel().getColumn(0).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(1).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(2).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(3).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(4).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(5).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(0).setPreferredWidth(40);
            tbl.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbl.getColumnModel().getColumn(2).setPreferredWidth(40);
            tbl.getColumnModel().getColumn(3).setPreferredWidth(20);
            tbl.getColumnModel().getColumn(0).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(1).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(2).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(3).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(4).setCellRenderer(rightAligment);
            tbl.getColumnModel().getColumn(5).setCellRenderer(rightAligment);
            tbl.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);                
            tbl.getTableHeader().setReorderingAllowed(false);
            tbl.setDefaultEditor(Object.class, null);
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }
    public static void fillTableSimpanan(final JTable tbl){
        tb_Simpan = new DefaultTableModel();
        tb_Simpan.addColumn("Kode Transaksi");
        tb_Simpan.addColumn("No. Rekening");
        tb_Simpan.addColumn("Tanggal");
        tb_Simpan.addColumn("Nominal");
        tb_Simpan.addColumn("Keterangan");
        tbl.setModel(tb_Simpan);
        java.sql.Connection conn = new DBConnection().connect();
        try {
            Locale id = new Locale("in", "ID");
            String pattern = "dd MMMM yyyy";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, id);
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select kodetransaksi,norekening, tanggaltransaksi, nominal, keterangan from transaksisimpan order by right(kodetransaksi, 5) asc";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                tb_Simpan.addRow(new Object[]{
                    res.getString("kodetransaksi"),
                    res.getString("norekening"),
                    sdf.format(res.getDate("tanggaltransaksi")),
                    "Rp. "+NumberFormat.getInstance().format(Float.parseFloat(res.getString("nominal"))).replace(",", ".")+",00",
                    res.getString("keterangan")
                });
            }
            DefaultTableCellRenderer midAligment = new DefaultTableCellRenderer();
            DefaultTableCellRenderer rightAligment = new DefaultTableCellRenderer();
            tbl.getColumnModel().getColumn(0).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(1).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(2).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(3).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(4).setHeaderRenderer(midAligment);
            midAligment.setHorizontalAlignment(JLabel.CENTER);
            rightAligment.setHorizontalAlignment(JLabel.RIGHT);
            tbl.getColumnModel().getColumn(0).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(1).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(2).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(3).setCellRenderer(rightAligment);
            tbl.getColumnModel().getColumn(4).setCellRenderer(midAligment);
            tbl.getTableHeader().setReorderingAllowed(false);
            tbl.setDefaultEditor(Object.class, null);
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }
    public static void fillTablePinjaman(final JTable tbl){
        tb_Pinjam = new DefaultTableModel();
        tb_Pinjam.addColumn("Kode Transaksi");
        tb_Pinjam.addColumn("No. Rekening");
        tb_Pinjam.addColumn("Tanggal");
        tb_Pinjam.addColumn("Nominal");
        tb_Pinjam.addColumn("Keterangan");
        tbl.setModel(tb_Pinjam);
        java.sql.Connection conn = new DBConnection().connect();
        try {
            Locale id = new Locale("in", "ID");
            String pattern = "dd MMMM yyyy";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, id);
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select kodetransaksi,norekening, tanggaltransaksi, nominal, keterangan from transaksipeminjaman order by right(kodetransaksi, 5) asc";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                tb_Pinjam.addRow(new Object[]{
                    res.getString("kodetransaksi"),
                    res.getString("norekening"),
                    sdf.format(res.getDate("tanggaltransaksi")),
                    "Rp. "+NumberFormat.getInstance().format(Float.parseFloat(res.getString("nominal"))).replace(",", ".")+",00",
                    res.getString("keterangan")
                });
            }
            DefaultTableCellRenderer midAligment = new DefaultTableCellRenderer();
            DefaultTableCellRenderer rightAligment = new DefaultTableCellRenderer();
            tbl.getColumnModel().getColumn(0).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(1).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(2).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(3).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(4).setHeaderRenderer(midAligment);
            midAligment.setHorizontalAlignment(JLabel.CENTER);
            rightAligment.setHorizontalAlignment(JLabel.RIGHT);
            tbl.getColumnModel().getColumn(0).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(1).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(2).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(3).setCellRenderer(rightAligment);
            tbl.getColumnModel().getColumn(4).setCellRenderer(midAligment);
            tbl.getTableHeader().setReorderingAllowed(false);
            tbl.setDefaultEditor(Object.class, null);
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }
    public static void fillTableTransaksiNasabah(final JTable tbl, final String norek){
        tb_Simpan = new DefaultTableModel();
        tb_Simpan.addColumn("Kode Transaksi");
        tb_Simpan.addColumn("No. Rekening");
        tb_Simpan.addColumn("Tanggal");
        tb_Simpan.addColumn("Jumlah Pinjaman");
        tb_Simpan.addColumn("Jumlah Simpanan");
        tb_Simpan.addColumn("Keterangan");
        tbl.setModel(tb_Simpan);
        java.sql.Connection conn = new DBConnection().connect();
        try {
            Locale id = new Locale("in", "ID");
            String pattern = "dd MMMM yyyy";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, id);
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select kodetransaksi, norekening, tanggaltransaksi, "
                    + "nominal as nominalpinjam, "
                    + "0 as nominalsimpan, keterangan "
                    + "from transaksipeminjaman "
                    + "where norekening = '" + norek + "' "
                    + "union select kodetransaksi, norekening, "
                    + "tanggaltransaksi, 0 as nominalpinjam, "
                    + "nominal as nominalsimpan, keterangan "
                    + "from transaksisimpan "
                    + "where norekening = '" + norek + "' "
                    + "order by tanggaltransaksi asc";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                tb_Simpan.addRow(new Object[]{
                    res.getString("kodetransaksi"),
                    res.getString("norekening"),
                    sdf.format(res.getDate("tanggaltransaksi")),
                    "Rp. "+NumberFormat.getInstance().format(Float.parseFloat(res.getString("nominalpinjam"))).replace(",", ".")+",00",
                    "Rp. "+NumberFormat.getInstance().format(Float.parseFloat(res.getString("nominalsimpan"))).replace(",", ".")+",00",
                    res.getString("keterangan")
                });
            }
            tbl.getColumnModel().getColumn(0).setPreferredWidth(50);
            DefaultTableCellRenderer midAligment = new DefaultTableCellRenderer();
            DefaultTableCellRenderer rightAligment = new DefaultTableCellRenderer();
            tbl.getColumnModel().getColumn(0).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(1).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(2).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(3).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(4).setHeaderRenderer(midAligment);
            tbl.getColumnModel().getColumn(5).setHeaderRenderer(midAligment);
            midAligment.setHorizontalAlignment(JLabel.CENTER);
            rightAligment.setHorizontalAlignment(JLabel.RIGHT);
            tbl.getColumnModel().getColumn(0).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(1).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(2).setCellRenderer(midAligment);
            tbl.getColumnModel().getColumn(3).setCellRenderer(rightAligment);
            tbl.getColumnModel().getColumn(4).setCellRenderer(rightAligment);
            tbl.getColumnModel().getColumn(5).setCellRenderer(midAligment);
            tbl.getTableHeader().setReorderingAllowed(false);
            tbl.setDefaultEditor(Object.class, null);
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }
//...........................................................................................................//
//loginUser punya function
    public static void loginUser(final JTextField txt, final JPasswordField txt1, final JFrame fr){
        String pass = new String(txt1.getPassword());
        String password = "";
        java.sql.Connection conn = new DBConnection().connect();
        if(txt.getText().equals("") || pass.equals(password)){
            JOptionPane.showMessageDialog(null, "Silahkan Lengkapi Data Login Anda", "Data Login Kurang", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                SQL = "select * from userlogin where binary tellerid = ?";
                java.sql.PreparedStatement nimstate = conn.prepareStatement(SQL);
                nimstate.setString(1, txt.getText());
                ResultSet nimrs = nimstate.executeQuery();
                if(nimrs.next()){
                    String tellerID = nimrs.getString("tellerid");
                    nama = nimrs.getString("namateller");
                    SQL = "select * from userlogin where binary tellerid = ? and binary password = ?";
                    java.sql.PreparedStatement passtate = conn.prepareStatement(SQL);
                    passtate.setString(1, String.valueOf(txt.getText()));
                    passtate.setString(2, String.valueOf(txt1.getPassword()));
                    ResultSet pasrs = passtate.executeQuery();
                    if(pasrs.next()){
                        JOptionPane.showMessageDialog(null, "Anda Telah Login. Selamat Datang, " + nama, "Logged In", JOptionPane.INFORMATION_MESSAGE);
                        new Admin(nama, tellerID).setVisible(true);
                        Admin.menuTab.requestFocus();
                        fr.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Password Anda Salah. Silahkan Ulangi", "Wrong Password", JOptionPane.ERROR_MESSAGE);
                        txt1.setText("");
                        txt1.requestFocus();
                    }                        
                }else{
                    JOptionPane.showMessageDialog(null, "Username Anda Tidak Ada Di Database", "Username Not Found", JOptionPane.ERROR_MESSAGE);
                    txt.setText("");
                    txt.requestFocus();
                }    
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
//...........................................................................................................//
//addNasabah punya function
    public static void KodeRekeningOtomatis(String newid, final JTextField idnasabah, final JTextField namanasabah, final Date dt, final DateFormat df){
        String todayDate = df.format(dt);
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select max(right(norekening, 5)) as jj from nasabah";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    newid = "A"+todayDate+"00001";
                    idnasabah.setText(newid);
                    idnasabah.setEditable(false);
                    namanasabah.requestFocus();
                }else{
                    res.last();
                    int autoid = res.getInt("jj")+1;
                    String nomor = String.valueOf(autoid);
                    int noLong = nomor.length();
                    for(int a = 0; a < 5 - noLong; a++){
                        nomor = "0" + nomor;
                    }
                    newid = "A"+todayDate+nomor;
                    idnasabah.setText(newid);
                    idnasabah.setEditable(false);
                    namanasabah.requestFocus();
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getCause());
        }
    }
    public static void addUser(){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            SQL = "insert into nasabah values(?,?,?,?,?,?,?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
            try {
                stmt.setString(1, addNasabah.txtIDNasabah.getText());
                stmt.setString(2, addNasabah.txtNamaNasabah.getText());
                stmt.setString(3, addNasabah.txtAlamat.getText());
                stmt.setString(4, addNasabah.comboJenisKelamin.getSelectedItem().toString());
                stmt.setString(5, addNasabah.txtKontak.getText());
                stmt.setString(6, addNasabah.txtTempatLahir.getText());
                stmt.setString(7, new SimpleDateFormat("yyyy-MM-dd").format(addNasabah.txTanggalLahir.getDate()));
                stmt.setString(8, addNasabah.txtPekerjaan.getText());
                stmt.setString(9, addNasabah.tellerID);
                stmt.setString(10, "Aktif");
                stmt.setInt(11, Integer.valueOf(addNasabah.txtSimpanan.getText()));
                stmt.setInt(12, Integer.valueOf(addNasabah.txtPinjaman.getText()));
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Nasabah Baru Sudah Dibuat. Anda Akan Anda Akan Dialihkan", "Data Telah Dibuat", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ditemukan Kesalahan. Silahkan Ulangi", "Data Tidak Dapat Dibuat", JOptionPane.WARNING_MESSAGE);
                System.out.println(e);
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void kodeTransaksiSimpan(){
        String todayDate = dateFormat.format(tgl);
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select max(right(kodetransaksi, 5)) as jj from transaksisimpan";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    addNasabah.kodeTransaksiSimpan = "R"+todayDate+"00001";
                }else{
                    res.last();
                    int autoid = res.getInt("jj")+1;
                    String nomor = String.valueOf(autoid);
                    int noLong = nomor.length();
                    for(int a = 0; a < 5 - noLong; a++){
                        nomor = "0" + nomor;
                    }
                    addNasabah.kodeTransaksiSimpan = "R"+todayDate+nomor;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getCause());
        }
    }
    public static void addTransaksiSimpan(){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            SQL = "insert into transaksisimpan values(?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
            try {
                stmt.setString(1, addNasabah.kodeTransaksiSimpan);
                stmt.setString(2, addNasabah.txtIDNasabah.getText());
                stmt.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(tgl));
                stmt.setString(4, addNasabah.tellerID);
                stmt.setInt(5, Integer.valueOf(addNasabah.txtSimpanan.getText()));
                stmt.setString(6, "Registrasi");
                stmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void kodeTransaksiPinjam(){
        String todayDate = dateFormat.format(tgl);
        java.sql.Connection conn = new DBConnection().connect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select max(right(kodetransaksi, 5)) as jj from transaksipeminjaman";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    addNasabah.kodeTransaksiPinjam = "R"+todayDate+"00001";    
                }else{
                    res.last();
                    int autoid = res.getInt("jj")+1;
                    String nomor = String.valueOf(autoid);
                    int noLong = nomor.length();
                    for(int a = 0; a < 5 - noLong; a++){
                        nomor = "0" + nomor;
                    }
                    addNasabah.kodeTransaksiPinjam = "R"+todayDate+nomor;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getCause());
        }
    }
    public static void addTransaksiPinjam(){
        java.sql.Connection conn = new DBConnection().connect();
        try {
            SQL = "insert into transaksipeminjaman values(?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt = conn.prepareStatement(SQL);
            try {
                stmt.setString(1, addNasabah.kodeTransaksiPinjam);
                stmt.setString(2, addNasabah.txtIDNasabah.getText());
                stmt.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(tgl));
                stmt.setString(4, addNasabah.tellerID);
                stmt.setInt(5, Integer.valueOf(addNasabah.txtPinjaman.getText()));
                stmt.setString(6, "Registrasi");
                stmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }
//...........................................................................................................//
//transaksiSimpan punya function
    
}