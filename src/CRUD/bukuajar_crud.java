/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date; // Import untuk tipe data Date
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ASUS
 */
public class bukuajar_crud {
    private String databaseName = "jamilatuzzahra_2210010033";
    private String username = "root";
    private String password = "";
    public static Connection koneksiDB;
    
    public bukuajar_crud() {
        try {
            String lokasi = "jdbc:mysql://localhost/" + databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            System.out.println("Database Has Been Connected Successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void inputBukuAjar(int no_buku, String nidn, String nama_dosen, String prodi, Date tahun, String issn, String judul_buku, String upload) {
        try {
            String sql = "insert into buku_ajar (no_buku, nidn, nama_dosen, prodi, tahun, issn, judul_buku, upload) value(?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, no_buku);
            perintah.setString(2, nidn);
            perintah.setString(3, nama_dosen);
            perintah.setString(4, prodi);
            perintah.setDate(5, tahun);
            perintah.setString(6, issn);
            perintah.setString(7, judul_buku);
            perintah.setString(8, upload);
            perintah.executeUpdate();
            System.err.println("Data Anda Berhasil Disimpan!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateBukuAjar(int no_buku, String nidn, String nama_dosen, String prodi, Date tahun, String issn, String judul_buku, String upload) {
        try {
        String sql = "update buku_ajar set nidn = ?, nama_dosen = ?, prodi = ?, tahun = ?, issn = ?, judul_buku = ?, upload = ? where no_buku = ?";
        PreparedStatement perintah = koneksiDB.prepareStatement(sql);
        perintah.setString(1, nidn);
        perintah.setString(2, nama_dosen);
        perintah.setString(3, prodi);
        perintah.setDate(4, tahun);
        perintah.setString(5, issn);
        perintah.setString(6, judul_buku);
        perintah.setString(7, upload);
        perintah.setInt(8, no_buku);
        perintah.executeUpdate();
        System.err.println("Data Anda Berhasil Diubah!");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

    public void deleteBukuAjar(int no_buku) {
        try {
            String sql = "delete from buku_ajar where no_buku = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, no_buku);
            perintah.executeUpdate();
            System.err.println("Data Anda Berhasil Dihapus!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariBukuAjar(int paramNoBuku) {
        try {
            String sql = "select * from buku_ajar where no_buku = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, paramNoBuku);
            ResultSet data = perintah.executeQuery();
            
            while(data.next()) {
                System.out.println("Nomor Buku: " + data.getInt("no_buku"));
                System.out.println("NIDN: " + data.getString("nidn"));
                System.out.println("Nama Dosen: " + data.getString("nama_dosen"));
                System.out.println("Prodi: " + data.getString("prodi"));
                System.out.println("Tahun Terbit: " + data.getDate("tahun"));
                System.out.println("ISSN: " + data.getString("issn"));
                System.out.println("Judul Buku: " + data.getString("judul_buku"));
                System.out.println("Format Upload: " + data.getString("upload"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void dataBukuAjar() {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from buku_ajar order by no_buku ASC;");
            while (baris.next()) {
                System.out.println(baris.getInt("no_buku") + " | " +
                        baris.getString("nidn") + " | " +
                        baris.getString("nama_dosen") + " | " +
                        baris.getString("prodi") + " | " +
                        baris.getDate("tahun") + " | " +
                        baris.getString("issn") + " | " +
                        baris.getString("judul_buku") + " | " +
                        baris.getString("upload"));
            }
            } catch (Exception e) {
                    System.err.println(e.getMessage());
                    }
        }
    }