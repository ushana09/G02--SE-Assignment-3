package Model;

import java.util.ArrayList;
import java.util.List;

class Authentication {
    private String username;
    private String password;

    public Authentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean validateLogin(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}

public class AdminModule {
    private String adminId;
    private String name;
    private String email;
    private String password;
    private List<String> users;

    public AdminModule(String adminId, String name, String email, String password) {
        this.adminId = adminId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.users = new ArrayList<>();
    }

    public boolean login(Authentication auth, String inputUsername, String inputPassword) {
        return auth.validateLogin(inputUsername, inputPassword);
    }

    public List<String> manageUsers(String action, String userId) {
        if (action.equals("add")) {
            users.add(userId);
        } else if (action.equals("remove") && users.contains(userId)) {
            users.remove(userId);
        }
        return users;
    }

    public static void main(String[] args) {
        Authentication auth = new Authentication("admin", "admin123");
        AdminModule admin = new AdminModule("A01", "John Admin", "admin@example.com", "admin123");
        Notification notif = new Notification("N001", "System update at 10PM", "U123");
        Discount disc = new Discount("D001", "P100", 15.0, "2025-12-31");

        boolean loggedIn = admin.login(auth, "admin", "admin123");
        System.out.println(loggedIn ? "Login successful." : "Invalid credentials.");

        if (loggedIn) {
            System.out.println("Welcome to Admin Dashboard.");
            System.out.println("Updated Users: " + admin.manageUsers("add", "U123"));
            System.out.println(disc.applyDiscount());
            System.out.println(notif.viewNotification());
            System.out.println("For support, contact us at support@example.com");
        }
    }
}

class Notification {
    private String notificationId;
    private String message;
    private String userId;

    public Notification(String notificationId, String message, String userId) {
        this.notificationId = notificationId;
        this.message = message;
        this.userId = userId;
    }

    public String sendNotification() {
        return "Notification sent to user " + userId + ": " + message;
    }

    public String viewNotification() {
        return "Notification [" + notificationId + "] for user " + userId + ": " + message;
    }
}

class Discount {
    private String discountId;
    private String productId;
    private double percentage;
    private String validUntil;

    public Discount(String discountId, String productId, double percentage, String validUntil) {
        this.discountId = discountId;
        this.productId = productId;
        this.percentage = percentage;
        this.validUntil = validUntil;
    }

    public String applyDiscount() {
        return "Discount of " + percentage + "% applied to product " + productId + " until " + validUntil;
    }

    public String removeDiscount() {
        return "Discount removed from product " + productId;
    }
}
