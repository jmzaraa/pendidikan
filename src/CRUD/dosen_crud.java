/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; //untuk menangkap record pada tabel mysql
import java.sql.Statement; //untuk mengambil seluruh data 

/**
 *
 * @author ASUS
 */
public class dosen_crud {
    private String databaseName = "jamilatuzzahra_2210010033";
    private String username = "root";
    private String password = "";
    public static Connection koneksiDB;
    
    public dosen_crud() {
        try {
            String lokasi = "jdbc:mysql://localhost/" + databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Berhasil Terkoneksi!");
    } catch (Exception e) {
            System.out.println(e.getMessage());
    }
    }
    public void simpanDosen(String nidn, String nama_dosen, String jafung, String kualifikasi, String prodi, String simlitabmas, String sinta) {
        try {
            String sql = "insert into dosen (nidn, nama_dosen, jafung, kualifikasi, prodi, simlitabmas, sinta) value(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nidn);
            perintah.setString(2, nama_dosen);
            perintah.setString(3, jafung);
            perintah.setString(4, kualifikasi);
            perintah.setString(5, prodi);
            perintah.setString(6, simlitabmas);
            perintah.setString(7, sinta);
            perintah.executeUpdate();
            System.err.println("Data Berhasil Disimpan!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahDosen(String nidn, String nama_dosen, String jafung, String kualifikasi, String prodi, String simlitabmas, String sinta) {
        try {
            String sql = "update dosen set nama_dosen = ?, jafung = ?, kualifikasi = ?, prodi = ?, simlitabmas = ?, sinta = ? where nidn = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql); 
            perintah.setString(1, nama_dosen);
            perintah.setString(2, jafung);
            perintah.setString(3, kualifikasi);
            perintah.setString(4, prodi);
            perintah.setString(5, simlitabmas);
            perintah.setString(6, sinta);
            perintah.setString(7, nidn);
            perintah.executeUpdate();
            System.err.println("Data Berhasil Diubah!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusDosen(String nidn) {
        try {
            String sql = "delete from dosen where nidn = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nidn);
            perintah.executeUpdate();
            System.err.println("Data Berhasil Dihapus!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariDosen(String paramNIDN) {
        try {
            String sql = "select * from dosen where nidn = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, paramNIDN);
            ResultSet data = perintah.executeQuery();
            while(data.next()) {
                System.out.println("NIDN: "+data.getString("nidn"));
                System.out.println("Nama Dosen: "+data.getString("nama_dosen"));
                System.out.println("Jabatan Fungsional: "+data.getString("jafung"));
                System.out.println("Kualifikasi: "+data.getString("kualifikasi"));
                System.out.println("Prodi: "+data.getString("prodi"));
                System.out.println("Simlitabmas: "+data.getString("simlitabmas"));
                System.out.println("Sinta: "+data.getString("sinta"));
            }
            } catch (Exception e) {
                    System.err.println(e.getMessage());
                    }
        }
    
    public void dataDosen() {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from dosen order by nidn ASC");
            while (baris.next()) {
                System.out.println(baris.getString("nidn") + " | " +
                        baris.getString("nama_dosen") + " | " +
                        baris.getString("jafung") + " | " +
                        baris.getString("kualifikasi") + " | " +
                        baris.getString("prodi") + " | " +
                        baris.getString("simlitabmas") + " | " +
                        baris.getString("sinta"));
                        }
            } catch (Exception e) {
                System.err.println(e.getMessage());
        }
    }
    
    }
    
