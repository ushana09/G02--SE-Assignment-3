package Model;

import java.util.ArrayList;
import java.util.List;

public class Notification {
    private List<String> messages;

    public Notification() {
        messages = new ArrayList<>();
    }

    public void sendNotification(String message) {
        messages.add(message);
        System.out.println("Notification Sent: " + message);
    }

    public void viewNotifications() {
        if (messages.isEmpty()) {
            System.out.println("No notifications available.");
            return;
        }

        System.out.println("All Notifications:");
        for (String msg : messages) {
            System.out.println("- " + msg);
        }
    }

    public List<String> getMessages() {
        return messages;
    }
}
