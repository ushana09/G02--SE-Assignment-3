// Admin Module Implementation in Simple Java
// Assigned Classes: Admin, Authentication, Notification, Discount

import java.util.ArrayList;
import java.util.List;

// ---------------- Authentication Class ----------------
class Authentication {
    String username;
    String password;

    Authentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean validateLogin(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}

// ---------------- Admin Class ----------------
class Admin {
    String adminId;
    String name;
    String email;
    String password;
    List<String> users;

    Admin(String adminId, String name, String email, String password) {
        this.adminId = adminId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.users = new ArrayList<>();
    }

    boolean login(Authentication auth, String inputUsername, String inputPassword) {
        return auth.validateLogin(inputUsername, inputPassword);
    }

    List<String> manageUsers(String action, String userId) {
        if (action.equals("add")) {
            users.add(userId);
        } else if (action.equals("remove") && users.contains(userId)) {
            users.remove(userId);
        }
        return users;
    }
}

// ---------------- Notification Class ----------------
class Notification {
    String notificationId;
    String message;
    String userId;

    Notification(String notificationId, String message, String userId) {
        this.notificationId = notificationId;
        this.message = message;
        this.userId = userId;
    }

    String sendNotification() {
        return "Notification sent to user " + userId + ": " + message;
    }

    String viewNotification() {
        return "Notification [" + notificationId + "] for user " + userId + ": " + message;
    }
}

// ---------------- Discount Class ----------------
class Discount {
    String discountId;
    String productId;
    double percentage;
    String validUntil;

    Discount(String discountId, String productId, double percentage, String validUntil) {
        this.discountId = discountId;
        this.productId = productId;
        this.percentage = percentage;
        this.validUntil = validUntil;
    }

    String applyDiscount() {
        return "Discount of " + percentage + "% applied to product " + productId + " until " + validUntil;
    }

    String removeDiscount() {
        return "Discount removed from product " + productId;
    }
}

// ---------------- Screen Simulation ----------------
public class AdminModule {
    public static void main(String[] args) {
        // Setup
        Authentication auth = new Authentication("admin", "admin123");
        Admin admin = new Admin("A01", "John Admin", "admin@example.com", "admin123");
        Notification notif = new Notification("N001", "System update at 10PM", "U123");
        Discount disc = new Discount("D001", "P100", 15.0, "2025-12-31");

        // Admin Login Screen
        System.out.println(admin.login(auth, "admin", "admin123") ? "Login successful." : "Invalid credentials.");

        // Admin Dashboard
        System.out.println("Welcome to Admin Dashboard.");

        // User Management Screen
        System.out.println("Updated Users: " + admin.manageUsers("add", "U123"));

        // Discount Management Screen
        System.out.println(disc.applyDiscount());

        // Notifications Screen
        System.out.println(notif.viewNotification());

        // Contact Us / Support Screen
        System.out.println("For support, contact us at support@example.com");
    }
}