/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ASUS
 */
public class penelitian_crud {
    private String databaseName = "jamilatuzzahra_2210010033";
    private String username = "root";
    private String password = "";
    public static Connection koneksiDB;
    
    public penelitian_crud() {
        try {
            String lokasi = "jdbc:mysql://localhost/" + databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            System.out.println("Database Has Been Connected Successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void inputPenelitian(int no_penelitian, String judul_penelitian, String jenis_penelitian, String sumber_dana, int jumlah, String nama_dosen, String anggota1, String anggota2, String anggota3) {
        try {String sql = "insert into penelitian (no_penelitian, judul_penelitian, jenis_penelitian, sumber_dana, jumlah, nama_dosen, anggota1, anggota2, anggota3) value(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setInt(1, no_penelitian);
        perintah.setString(2, judul_penelitian);
        perintah.setString(3, jenis_penelitian);
        perintah.setString(4, sumber_dana);
        perintah.setInt(5, jumlah);
        perintah.setString(6, nama_dosen);
        perintah.setString(7, anggota1);
        perintah.setString(8, anggota2);
        perintah.setString(9, anggota3);
        perintah.executeUpdate();
        System.err.println("Data Anda Berhasil Disimpan!");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
        
    public void updatePenelitian(int no_penelitian, String judul_penelitian, String jenis_penelitian, String sumber_dana, int jumlah, String nama_dosen, String anggota1, String anggota2, String anggota3) {
        try {
            String sql = "update penelitian set judul_penelitian = ?, jenis_penelitian = ?, sumber_dana = ?, jumlah = ?, nama_dosen = ?, anggota1 = ?, anggota2 = ?, anggota3 = ? where no_penelitian = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, judul_penelitian);
            perintah.setString(2, jenis_penelitian);
            perintah.setString(3, sumber_dana);
            perintah.setInt(4, jumlah);
            perintah.setString(5, nama_dosen);
            perintah.setString(6, anggota1);
            perintah.setString(7, anggota2);
            perintah.setString(8, anggota3);
            perintah.setInt(9, no_penelitian);
            perintah.executeUpdate();
            System.err.println("Data Anda berhasil Diubah!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    
    public void deletePenelitian(int no_penelitian) {
        try {
            String sql = "delete from penelitian where no_penelitian = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, no_penelitian);
            perintah.executeUpdate();
            System.err.println("Data Anda Berhasil Dihapus!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariPenelitian(int paramPen) {
        try {
            String sql = "select * from penelitian where no_penelitian = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, paramPen);
            ResultSet data = perintah.executeQuery();
            
            while(data.next()) {
                System.out.println("No. Penelitian:" + data.getInt("no_penelitian"));
                System.out.println("Judul Penelitian: " + data.getString("judul_penelitian"));
                System.out.println("Jenis Penelitian: " + data.getString("jenis_penelitian"));
                System.out.println("Sumber Dana: " + data.getString("sumber_dana"));
                System.out.println("Jumlah Penelitian: " + data.getInt("jumlah"));
                System.out.println("Nama Dosen: " + data.getString("nama_dosen"));
                System.out.println("Anggota 1: " + data.getString("anggota1"));
                System.out.println("Anggota 2: " + data.getString("anggota2"));
                System.out.println("Anggota 3: " + data.getString("anggota3"));
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void dataPenelitian() {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from penelitian order by no_penelitian ASC");
            
            while (baris.next()) {
                System.out.println(baris.getInt("no_penelitian") + " | " + 
                        baris.getString("judul_penelitian") + " | " +
                        baris.getString("jenis_penelitian") + " | " +
                        baris.getString("sumber_dana") + " | " +
                        baris.getInt("jumlah") + " | " +
                        baris.getString("nama_dosen") + " | " +
                        baris.getString("anggota1") + " | " +
                        baris.getString("anggota2") + " | " +
                        baris.getString("anggota3"));
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    }
   