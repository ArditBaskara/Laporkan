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
public class mentoring extends mentor {
    /*
    Class Mentoring(guah)
    Chat
    Anonymous user
    Vn dan kirim gambar
    (finishing aje yeh)
    Hasil report

    */


    private List<ChatMessageUser> chatHistory = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void sendMessage(String message, User username, boolean hideUsername) {
        ChatMessageUser chatMessage = new ChatMessageUser(message, username, hideUsername);
        chatHistory.add(chatMessage);
    }

    public void userChat(){
        boolean pesan = true;
        while (pesan) {
            System.out.print("Massukkan Laporan Anda (or type 'exit' to quit): ");
            String message = scanner.nextLine();
            
            if (message.equalsIgnoreCase("exit")) {
                pesan = false;
            }
        }
    }

    public void displayChatHistory() {
        for (ChatMessageUser message : chatHistory) {
            String displayMessage = message.getMessage();
            if (!message.isHideUsername()) {
                displayMessage = message.getUsername() + ": " + displayMessage;
            }
            System.out.println(displayMessage);
        }
    }

class ChatMessageUser extends User {
    private String message;
    private User username;
    private boolean hideUsername;

    public ChatMessageUser(String message, User username, boolean hideUsername) {
        this.message = message;
        this.username = username;
        this.hideUsername = hideUsername;
    }

    public String getMessage() {
        return message;
    }

    public User getUsername() {
        return username;
    }

    public boolean isHideUsername() {
        return hideUsername;
    }
}
class ChatMessageMentor extends mentor {
    private String message;
    private mentor username;
    private boolean hideUsername;

    public ChatMessageMentor(String message, mentor username, boolean hideUsername) {
        this.message = message;
        this.username = username;
        this.hideUsername = hideUsername;
    }

    public String getMessage() {
        return message;
    }

    public mentor getUsername() {
        return username;
    }

    public boolean isHideUsername() {
        return hideUsername;
    }
}

}
