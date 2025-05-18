package Model;

public class Notification {
    private String message;

    public Notification(String message) {
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Notification sent: " + message);
    }
}
