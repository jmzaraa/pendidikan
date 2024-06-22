/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosen;
import datadosen.*;
import java.util.Scanner;
import java.sql.Date;
import CRUD.*;
import GUI.frameUtama;

/**
 *
 * @author ASUS
 */
public class Dosen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new frameUtama().setVisible(true);
        
        //database obj = new database();
        //obj.simpanUji("2210010033", "Jamilatuzzahra", "087737663031", "Jl. Kelayan B");
        //obj.ubahUji("2210010033", "Jamilatuzzahra", "087737", "Jl. Kelayan B");
        //obj.hapusUji("2210010033");
                
        
        //penelitian_crud obj = new penelitian_crud();
        //obj.inputPenelitian(033, "sistem informasi universitas A", "kuantitatif", "rektorat", 9000000, "Jamilatuzzahra", "anggota A", "anggota B", "anggota C");
        //obj.updatePenelitian(033, "sistem informasi universitas A", "kuantitatif", "fakultas", 9000000, "Jamilatuzzahra", "anggota A", "anggota B", "anggota C");
        //obj.deletePenelitian(033);
        //obj.cariPenelitian(033);
        //obj.dataPenelitian();
        
        
        //dosen_crud obj = new dosen_crud();
        //obj.simpanDosen("2210010033", "Jamilatuzzahra", "tenaga ajar", "S2 TI", "TI", "Ya", "Ya");
        //obj.ubahDosen("2210010033", "Jamilatuzzahra", "tenaga ajar", "S2 TI", "TI", "Ya", "Tidak");
        //obj.hapusDosen("2210010033");
        //obj.cariDosen("2210010033");
        //obj.dataDosen();
        
        //haki_crud obj = new haki_crud();
        //Date tahun = Date.valueOf("2024-07-31");
        //obj.inputHaki(022, "2210010033", "Jamilatuzzahra", "TI", tahun, "Hak Cipta 1", "Haki1");
        //obj.updateHaki(022, "2210010033", "Jamilatuzzahra", "TI", tahun, "Hak Cipta Pemrograman", "Haki1");
        //obj.deleteHaki(022);
        //obj.cariHaki(022);
        //obj.dataHaki();
        
        //bukuajar_crud obj = new bukuajar_crud();
        //Date tahun = Date.valueOf("2023-12-02");
        //obj.inputBukuAjar(012, "2210010044", "Araa", "TI", tahun, "3456-7890", "Pemrograman C++", "PDF");
        //obj.updateBukuAjar(011, "2210010033", "Jamilatuzzahra", "TI", tahun, "12345-3456", "Pemrograman Python", "PDF");
        //obj.deleteBukuAjar(011);
        //obj.cariBukuAjar(012);
        //obj.dataBukuAjar();
        
        //obj.simpanUji("2210010033", "Jamilatuzzahra", "087737663031", "Jl. Kelayan B");
        //obj.ubahUji("2210010033", "Jamilatuzzahra", "087737", "Jl. Kelayan B");
        //obj.hapusUji("2210010033", "","","");
                
        
//        bukuajar dosen = new bukuajar(); //[namakelas] [namaobjekbaru] = new [nama konstruktor]
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Formulir Isi Buku Ajar Dosen");
//        System.out.println("============================");
//        System.out.println("[ Biodata Dosen ]");
//        System.out.println("----------------------------");
//        
//        System.out.print("Masukkan NIDN Anda: ");
//        dosen.inputNIDN(input.nextLine());
//        System.out.print("Masukkan Nama Anda: ");
//        dosen.inputNAMA(input.nextLine());
//        System.out.print("Masukkan Jabatan Fungsional Anda: ");
//        dosen.inputJAFUNG(input.nextLine());
//        System.out.print("Masukkan Kualifikasi Anda: ");
//        dosen.inputJAFUNG(input.nextLine());
//        System.out.print("Masukkan Prodi Anda: ");
//        dosen.inputPRODI(input.nextLine());
//        System.out.print("Apa Anda Memiliki akun Simlitabmas? (Y/T): ");
//        dosen.inputSIMLITABMAS(input.nextLine());
//        System.out.print("Apa Anda Memiliki akun SINTA? (Y/T): ");
//        dosen.inputSINTA(input.nextLine());
//        
//        if(dosen.getSIMLITABMAS().equals("Y") && dosen.getSINTA().equals("Y")) {
//        System.out.println("Silakan Isi Formulir Buku Ajar Berikut!");
//        
//        System.out.println("----------------------------");
//        System.out.println("[ Form Isi Buku Ajar ]");
//        System.out.println("----------------------------");
//        
//        System.out.println("Penulis: " + dosen.ambilNAMA());
//        System.out.println("NIDN: " + dosen.ambilNIDN());
//        System.out.println("Prodi Asal: " + dosen.ambilPRODI());
//        System.out.println("----------------------------");
//        
//        System.out.print("Masukkan Nomor Buku Anda: ");
//        dosen.inputNOBUKU(input.nextLine());
//        System.out.print("Masukkan Tahun Terbit Buku Anda: ");
//        dosen.inputNOBUKU(input.nextLine());
//        System.out.print("Masukkan ISSN Buku Anda: ");
//        dosen.inputISSN(input.nextLine());
//        System.out.print("Masukkan Judul Buku Anda: ");
//        dosen.inputJUDUL(input.nextLine());
//        System.out.print("Masukkan Format Upload Buku Anda: ");
//        dosen.inputJUDUL(input.nextLine());
//        System.out.println("Data Anda Telah Dikirim.");
//        
//        } else {System.out.println("Silakan buat akun SIMLITABMAS terlebih dahulu.");
//        dosen.inputPRODI(input.nextLine());
//        }
//        
//        System.out.println("============================");
//        System.out.println("Terima kasih!");
        
    }
    
}
