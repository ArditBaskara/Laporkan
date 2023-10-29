/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Akun {
    private String username;
    private String password;
    private String nama;
    private String phoneNum;
    private String email;
    private String role;
    Scanner scanner = new Scanner(System.in);
    String value;


public Akun(String username, String password, String phoneNum, String nama, String email, String role){
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.phoneNum = phoneNum;
        this.email = email;
        this.role = role;
        this.value = "(" + "'"+ username + "', " + "'" + password + "', " + "'" + nama + "', " + "'" + phoneNum + "', " + "'" + email + "', " + "'" + role +"')";
        
}

    public void daftarAkun() {
        String usn, pass, phone, mail, name, peran;
        System.out.println("Daftar Akun:");
        System.out.print("Masukkan username: ");
        usn = scanner.nextLine();
        System.out.print("Masukkan password: ");
        pass = scanner.nextLine();
        System.out.print("Masukkan nama: ");
        name = scanner.nextLine();
        System.out.print("Masukkan nomor telepon: ");
        phone = scanner.nextLine();
        System.out.print("Masukkan email: ");
        mail = scanner.nextLine();
        System.out.print("Masukkan peran (user/mentor): ");
        peran = scanner.nextLine();

        if (role.equalsIgnoreCase("user")) {
            role = "user";
            System.out.println("Akun User berhasil didaftarkan!");
        } else if (role.equalsIgnoreCase("mentor")) {
            role = "mentor";
            System.out.println("Akun Mentor berhasil didaftarkan!");
        } else {
            System.out.println("Peran yang Anda masukkan tidak valid. Akun tidak berhasil didaftarkan.");
        }
       
        this.value = "(" + "'"+ usn + "', " + "'" + pass + "', " + "'" + name + "', " + "'" + phone + "', " + "'" + mail + "', " + "'" + peran +"')";
        this.username = username; this.password = pass; this.phoneNum = phone; this.role = peran; this.email = mail; this.nama = name;
    }
    
 
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    

    public boolean login(String inputUsername, String inputPassword) {
        if (this.username.equals(inputUsername) && this.password.equals(inputPassword)) {
            System.out.println("Login berhasil!");
            return true;
        } else {
            System.out.println("Login gagal. Cek kembali username dan password.");
            return false;
        }
    }
}


