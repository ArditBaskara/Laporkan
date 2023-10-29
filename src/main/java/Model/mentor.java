/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */

public class mentor extends Akun{
     private Chat chatWithUser;
     ArrayList<Mentoring> startChatWithUser;
/*      
    Method login/out
    Nambah dan hapus 
    Artikel
    Chat dengan user
    Baca laporan user
     */
        public mentor(String username, String password, String phoneNum, String nama, String email, String role) {
        super(username, password, phoneNum, nama, email, role);
        this.startChatWithUser = new ArrayList<>();
    }

}