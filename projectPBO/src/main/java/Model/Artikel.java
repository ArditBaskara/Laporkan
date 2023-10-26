/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
import java.util.Date;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Artikel {
    private String judul;
    private String isi;
    private String penulis;
    private Date tanggal;
    private ArrayList<String> komentar;

    // Konstruktor untuk inisialisasi objek Artikel
    public Artikel(String judul, String isi, String penulis) {
        this.judul = judul;
        this.isi = isi;
        this.penulis = penulis;
        this.tanggal = new Date(); // Mengambil tanggal saat objek dibuat
        this.komentar = new ArrayList<>(); // Inisialisasi daftar komentar sebagai ArrayList kosong
    }

    // Method untuk menambahkan komentar baru ke daftar komentar
    public void tambahKomentar(String komentar) {
        this.komentar.add(komentar);
        System.out.println("Komentar berhasil ditambahkan");
    }

    // Method untuk menghapus komentar dari daftar berdasarkan indeks
    public void hapusKomentar(int indeks) {
        if (indeks >= 0 && indeks < this.komentar.size()) {
            this.komentar.remove(indeks);
            System.out.println("Komentar berhasil dihapus");
        } else {
            System.out.println("Indeks komentar tidak valid");
        }
    }

    // Method untuk membalas komentar berdasarkan indeks
    public void balasKomentar(int indeks, String balasan) {
        if (indeks >= 0 && indeks < this.komentar.size()) {
            String existingComment = this.komentar.get(indeks); // Mengambil komentar yang sudah ada berdasarkan indeks
            existingComment += "\n" + balasan; // Menambahkan balasan ke komentar yang sudah ada
            this.komentar.set(indeks, existingComment); // Memperbarui komentar yang sudah ada dengan balasan baru
            System.out.println("Komentar berhasil dibalas");
        } else {
            System.out.println("Indeks komentar tidak valid");
        }
    }

    // Method untuk menampilkan pilihan artikel dari daftar artikel yang ada
    public static void tampilanPilihanArtikel(ArrayList<Artikel> daftarArtikel) {
        if (daftarArtikel == null || daftarArtikel.isEmpty()) {
            System.out.println("Tidak ada artikel yang tersedia.");
            return;
        }
        System.out.println("Pilih salah satu artikel berikut:");
        for (int i = 0; i < daftarArtikel.size(); i++) {
            Artikel artikel = daftarArtikel.get(i);
            System.out.println((i + 1) + ". " + artikel.getJudul());
        }
        System.out.println("Masukkan nomor artikel yang ingin dibaca atau ketik '0' untuk kembali");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int pilihan = Integer.parseInt(br.readLine());

            if (pilihan > 0 && pilihan <= daftarArtikel.size()) {
                Artikel artikel = daftarArtikel.get(pilihan - 1);
                artikel.tampilanArtikel();
            } else if (pilihan == 0) {
                System.out.println("Anda kembali ke menu utama");
            } else {
                System.out.println("Pilihan tidak valid");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input/output: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka");
        }
    }

    // Method untuk menampilkan informasi lengkap tentang artikel
    public void tampilanArtikel() {
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("Tanggal: " + this.tanggal);
        System.out.println("Isi: " + this.isi);
        System.out.println("Komentar: ");
        for (int i = 0; i < this.komentar.size(); i++) {
            String comment = this.komentar.get(i);
            System.out.println((i + 1) + ". " + comment);
        }
        System.out.println("Masukkan '1' untuk menambahkan komentar, '2' untuk menghapus komentar, '3' untuk membalas komentar, atau '0' untuk kembali");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1 : {
                    System.out.println("Masukkan komentar Anda:");
                    String comment = br.readLine();
                    this.tambahKomentar(comment);
                    this.tampilanArtikel();
                    break;
                }
                case 2 : {
                    System.out.println("Masukkan nomor komentar yang ingin dihapus:");
                    int indeks = Integer.parseInt(br.readLine());
                    this.hapusKomentar(indeks - 1);
                    this.tampilanArtikel();
                    break;
                }
                case 3 : {
                    System.out.println("Masukkan nomor komentar yang ingin dibalas:");
                    int indeksBalas = Integer.parseInt(br.readLine());
                    System.out.println("Masukkan balasan Anda:");
                    String balasan = br.readLine();
                    this.balasKomentar(indeksBalas - 1, balasan);
                    this.tampilanArtikel();
                    break;
                }
                case 0 : {
                    System.out.println("Anda kembali ke pilihan artikel");
                    tampilanPilihanArtikel(new ArrayList<>());
                    break;
                }
                default : {
                    System.out.println("Pilihan tidak valid");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input/output: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka");
        }
    }

    // Method getter dan setter untuk setiap atribut
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public ArrayList<String> getKomentar() {
        return komentar;
    }

    public void setKomentar(ArrayList<String> komentar) {
        this.komentar = komentar;
    }
}
