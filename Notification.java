import java.util.ArrayList;

public class Notification {
    private ArrayList<String> messages = new ArrayList<>();

    public void sendNotification(String message) {
        messages.add(message);
        System.out.println("Notification Sent: " + message);
    }

    public void viewNotifications() {
        System.out.println("All Notifications:");
        for (String msg : messages) {
            System.out.println("- " + msg);
        }
    }
}
