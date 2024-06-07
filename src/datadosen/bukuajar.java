/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datadosen;

/**
 *
 * @author ASUS
 */
public class bukuajar extends biodata {
    String noBuku, tahun, issn, judulBuku, upload;
    public bukuajar() {};
    public bukuajar(String noBuku, String tahun, String issn, String judulBuku, String upload) {
        this.noBuku = noBuku;
        this.tahun = tahun;
        this.issn = issn;
        this.judulBuku = judulBuku;
        this.upload = upload;
 
    }
    
    public void inputNOBUKU(String noBuku) {
        this.noBuku = noBuku;
    }
    
    public String ambilNOBUKU() {
        return this.noBuku;
    }
    
        public void inputTAHUN(String tahun) {
        this.tahun = tahun;
    }
    
    public String ambilTAHUN() {
        return this.tahun;
    }
    
        public void inputISSN(String issn) {
        this.issn = issn;
    }
    
    public String ambilISSN() {
        return this.issn;
    }
    
    public void inputJUDUL(String judulBuku) {
        this.judulBuku = judulBuku;
    }
    
    public String ambilJUDUL() {
        return this.judulBuku;
    }
    
        public void inputUPLOAD(String upload) {
        this.upload = upload;
    }
    
    public String ambilUPLOAD() {
        return this.upload;
    }
    
}
