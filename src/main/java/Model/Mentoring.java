/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Mentoring {

    private Akun akun;
    private String message;

    public Mentoring(Akun akun, String message) {
        this.akun = akun;
        this.message = message;
    }

    public Akun getAkun() {
        return akun;
    }

    public String getMessage() {
        return message;
    }
}
