package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import javax.swing.*;

public class DBConnection {
    public Connection koneksi;
    public Connection connect(){
    //koneksi ke driver mysql
    try{
        Class.forName("com.mysql.jdbc.Driver");
        //System.out.println("Berhasil Koneksi Ke JDBC Driver MySQL");
    }catch (ClassNotFoundException ex){
        //System.out.println("Tidak Berhasil Koneksi Ke JDBC Driver MySQL");
    }
    //koneksi ke database
    try{
        String url = "jdbc:mysql://localhost:3306/koperasi";
        koneksi= DriverManager.getConnection(url,"root","");
        //System.out.println("Berhasil Koneksi Ke Database");
    }catch(SQLException e){
        //System.out.println("Tidak Berhasil Koneksi Ke Database");
    }
    return koneksi;
    }
    public static void main(String [] args){
        java.sql.Connection conn = new DBConnection().connect();
    }
}