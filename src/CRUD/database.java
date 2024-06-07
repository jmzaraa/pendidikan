/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection; //mendapatkan koneksi ke database
import java.sql.DriverManager; //deteksi driver dan menghubungkan ke database
import java.sql.PreparedStatement; //untuk perintah sql simpan, ubah, dan hapus

/**
 *
 * @author ASUS
 */
public class database {
    private String databaseName = "jamilatuzzahra_2210010033";
    private String username = "root";
    private String password = "";
    public static Connection koneksiDB;
    
    
    public database() {
        try {
            String lokasi = "jdbc:mysql://localhost/" + databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Berhasil Terkoneksi!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanUji(String nik, String nama, String telp, String alamat) {
        try {
            String sql = "insert into uji (nik, nama, telp, alamat) value(?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nik);
            perintah.setString(2, nama);
            perintah.setString(3, telp);
            perintah.setString(4, alamat);
            perintah.executeUpdate();
            System.err.println("Data Berhasil Disimpan!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahUji(String nik, String nama, String telp, String alamat) {
        try {
            String sql = "update uji set nama = ?, telp = ?, alamat = ? where nik = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, telp);
            perintah.setString(3, alamat);
            perintah.setString(4, nik);
            perintah.executeUpdate();
            System.err.println("Data Berhasil Diubah!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusUji(String nik, String nama, String telp, String alamat) {
        try {
            String sql = "delete from uji where nik = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nik);
            perintah.executeUpdate();
            System.err.println("Data Berhasil Dihapus!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
