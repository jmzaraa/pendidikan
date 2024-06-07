/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ASUS
 */
public class haki_crud {
    private String databaseName = "jamilatuzzahra_2210010033";
    private String username = "root";
    private String password = "";
    public static Connection koneksiDB;
    
    public haki_crud() {
        try {
            String lokasi = "jdbc:mysql://localhost/" + databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            System.out.println("Database Has Been Connected Successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void inputHaki(int no_haki, String nidn, String nama_dosen, String prodi, Date tahun, String judul_haki, String haki) {
        try {
        String sql = "insert into haki(no_haki, nidn, nama_dosen, prodi, tahun, judul_haki, haki) value(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setInt(1, no_haki);
        perintah.setString(2, nidn);
        perintah.setString(3, nama_dosen);
        perintah.setString(4, prodi);
        perintah.setDate(5, tahun);
        perintah.setString(6, judul_haki);
        perintah.setString(7, haki);
        perintah.executeUpdate();
        System.err.println("Data Anda Berhasil Disimpan!");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
    
    public void updateHaki(int no_haki, String nidn, String nama_dosen, String prodi, Date tahun, String judul_haki, String haki) {
        try {
            String sql = "update haki set nidn = ?, nama_dosen = ?, prodi = ?, tahun = ?, judul_haki = ?, haki = ? where no_haki = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nidn);
            perintah.setString(2, nama_dosen);
            perintah.setString(3, prodi);
            perintah.setDate(4, tahun);
            perintah.setString(5, judul_haki);
            perintah.setString(6, haki);
            perintah.setInt(7, no_haki);
            perintah.executeUpdate();
            System.err.println("Data Anda Berhasil Diubah!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteHaki(int no_haki) {
        try {
            String sql = "delete from haki where no_haki = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, no_haki);
            perintah.executeUpdate();
            System.err.println("Data Anda Berhasil Dihapus!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariHaki(int paramHaki) {
        try {
            String sql = "select * from haki where no_haki = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, paramHaki);
            ResultSet data = perintah.executeQuery();
            
            while (data.next()) {
                System.out.println("No. Haki: " + data.getInt("no_haki"));
                System.out.println("NIDN: " + data.getString("nidn"));
                System.out.println("Nama Dosen: " + data.getString("nama_dosen"));
                System.out.println("Prodi: " + data.getString("prodi"));
                System.out.println("Tahun Terbit Haki: " + data.getDate("tahun"));
                System.out.println("Judul Haki: " + data.getString("judul_haki"));
                System.out.println("Haki: " + data.getString("haki"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void dataHaki() {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from haki order by no_haki ASC");
            
            while (baris.next()) {
                System.out.println(baris.getInt("no_haki") + " | " +
                        baris.getString("nidn") + " | " +
                        baris.getString("nama_dosen") + " | " +
                        baris.getString("prodi") + " | " + 
                        baris.getDate("tahun") + " | " + 
                        baris.getString("judul_haki") + " | " + 
                        baris.getString("haki"));
            } 
        } catch (Exception e) {
                    System.err.println(e.getMessage());
                    }
        }
    }