/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Date;
/**
 *
 * @author ASUS
 */
public class report {
    private User nama;
    private String isiLaporan;
    private Date tanggalLaporan;
    private String statusLaporan;


    // Constructor

    public report(String isiLaporan){
        this.isiLaporan = isiLaporan;
        this.tanggalLaporan = new Date();
        this.statusLaporan = "terkirim";
    }
    
    // setter

    public void setNama(User nama){
        this.nama = nama;
    }

    public void setIsiLaporan(String isiLaporan) {
        this.isiLaporan = isiLaporan;
    }
    
     public void setTanggalLaporan(Date tanggalLaporan){
     this.tanggalLaporan = tanggalLaporan;
     }

    public void setStatusLaporan(String statusLaporan) {
        this.statusLaporan = statusLaporan;
    }
     
     
     
    // getter

    public User getNama() {
        return nama;
    }

    public String getIsiLaporan() {
        return isiLaporan;
    }
    
    public Date getTanggalLaporan(){
        return tanggalLaporan;
    }

    public String getStatusLaporan() {
        return statusLaporan;
    }
        
    // print
    public void printLaporan(){
        System.out.println("Pelapor: " + getNama() + "\n" +
                            "Isi Laporan: " + getIsiLaporan() + "\n" +
                            "Tanggal: " + getTanggalLaporan() + "\n" +
                            "statusLaporan: " + getStatusLaporan()
                            );
    }
}
