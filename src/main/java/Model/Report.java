/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Report {

    static void printLaporan(Report isiLaporan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private User username;
    private String isiLaporan;
    private Date tanggalLaporan;
    private String statusLaporan;


    // Constructor

    public Report(String isiLaporan){
        this.isiLaporan = isiLaporan;
        this.tanggalLaporan = new Date();
        this.statusLaporan = "terkirim";
    }
    
    // setter

    public void setNama(User username){
        this.username = username;
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
        return username;
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
