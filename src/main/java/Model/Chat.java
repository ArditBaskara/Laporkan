package Model;

import java.util.ArrayList;
import java.util.List;

public class Chat{
    private User user;
    private mentor mentor;
    private List<String> messages;

    public Chat(User user, mentor mentor) {
        this.user = user;
        this.mentor = mentor;
        this.messages = new ArrayList<>();
    }

    public void sendMessageFromUser(String message) {
        messages.add("User " + user.getUsername() + ": " + message);
        // Add the chat to the user's chat list
        user.startChatWithMentor.add(new Mentoring(mentor, message));
    }

    public void sendMessageFromMentor(String message) {
        messages.add("Mentor " + mentor.getUsername() + ": " + message);
        // Add the chat to the mentor's chat list
        mentor.startChatWithUser.add(new Mentoring(user, message));
    }

    public List<String> getMessages() {
        return messages;
    }

    // menampilkan pesan
    public void displayPesan() {
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
