/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class User extends Akun{
  private Chat chatWithMentor;
  ArrayList<Mentoring> startChatWithMentor;  
/*
    Login/logut
    Buat report
    Nambah atau hapus komen (optional)
    Baca artikel
    Chat dengan mentor
     */
        private ArrayList<Report> reports; // Daftar laporan yang dibuat oleh user
        public User(String username, String password, String phoneNum, String nama, String email, String role) {
        super(username, password, phoneNum, nama, email, role);
        this.reports = new ArrayList<>();
        
        this.startChatWithMentor = new ArrayList<>();
    }
     public void createReport(String isiLaporan) {
        Report report = new Report(isiLaporan);
        report.setNama(this);
        reports.add(report);
    }
        public List<Report> getReports() {
        return reports;
    }
    
}