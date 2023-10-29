/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */

    /**
     * @param args the command line arguments
     */

public class main {
    private static ArrayList<Artikel> daftarArtikel = new ArrayList<>();
    private ArrayList<Report> reports = new ArrayList<>();
    private ArrayList<String> pesan = new ArrayList<>();
    private static Report isiLaporan;
    private static Chat chat;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Akun akun = new Akun("", "", "", "", "", ""); 
        User user = new User("", "", "", "", "", "");
        mentor mentor = new mentor("", "", "", "", "", "");
        Chat chat = new Chat(user, mentor);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Daftar Akun");
            System.out.println("2. Login sebagai User");
            System.out.println("3. Login sebagai Mentor");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: "); 
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    akun.daftarAkun();
                    break;
                case 2:
                    if (user == null) {
                        System.out.println("Anda belum login sebagai User. Silakan daftar atau login terlebih dahulu.");
                    } else {
                        menuUser(user, scanner);
                    }
                    break;
                case 3:
                    if (mentor == null) {
                        System.out.println("Anda belum login sebagai Mentor. Silakan daftar atau login terlebih dahulu.");
                    } else {
                        menuMentor(mentor, scanner);
                    }
                    break;
                case 4:
                    System.out.println("Keluar.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        }
    }

private static void menuUser(User user, Scanner scanner) {
        while (true) {
            System.out.println("Menu User:");
            System.out.println("1. Buat Laporan");
            System.out.println("2. Tampilkan Laporan");
            System.out.println("3. Chat dengan Mentor");
            System.out.println("4. Logout");
            System.out.println("5. Artikel");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan isi laporan: ");
                    String isiLaporan = scanner.next();
                    user.createReport(isiLaporan);
                    System.out.println("Laporan berhasil dibuat.");
                    break;
                case 2:
                    System.out.println("Laporan Anda:");
                    for (Report report : user.getReports()) {
                        report.printLaporan();
                        System.out.println();
                    }
                    break;
                case 3:
                     System.out.print("Masukkan pesan: ");
                       String pesanMentor = scanner.next();
                    if (chat != null) {
                        
                    chat.sendMessageFromUser(pesanMentor);
                    chat.displayPesan();
                    } else {
                    System.out.println("Chat belum diinisialisasi. Silakan buat akun terlebih dahulu.");
                    }
                    break;
                case 4:
                    user = null;
                    System.out.println("Logout berhasil.");
                    return;
                case 5:
                    if(daftarArtikel != null){
                        Artikel.tampilanPilihanArtikel(daftarArtikel);
                    } else {
                        System.out.println("Artikel masih kosong");
                    }
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        }
    }

    private static void menuMentor(mentor mentor, Scanner scanner) {
        while (true) {
            System.out.println("Menu Mentor:");
            System.out.println("1. Tambah artikel");
            System.out.println("2. Chat dengan User");
            System.out.println("3. Logout");
            System.out.println("4. Tampilkan laporan");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                Artikel.tambahArtikel(daftarArtikel);
                {
                    Artikel artikelBaru = null;
                    daftarArtikel.add(artikelBaru);
                }
                    break;

                case 2:
                    System.out.print("Masukkan pesan: ");
                       String pesanUser = scanner.next();
                    if (chat != null) {
                    chat.sendMessageFromMentor(pesanUser);
                     chat.displayPesan();
                    } else {
                    System.out.println("Chat belum diinisialisasi. Silakan buat akun terlebih dahulu.");
                    }
                    break;
                case 3:
                    mentor = null;
                    System.out.println("Logout berhasil.");
                    return;
                case 4:
                    if (isiLaporan != null) {
                    Report.printLaporan(isiLaporan);
                    } else {
                        System.out.println("belum ada laporan");
                    }
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        }
    }
}
