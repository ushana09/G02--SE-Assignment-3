package Controller;

import java.util.Scanner;

import Model.Admin;
import Model.Authentication;
import Model.Discount;
import Model.Notification;
import View.AdminView;

public class AdminController {
    private Admin admin;
    private AdminView view = new AdminView();
    private Discount discountManager = new Discount();       
    private Notification notificationManager = new Notification();

    public void start() {
        admin = new Admin("admin", "admin123");
        Authentication auth = new Authentication();

        String username = view.promptUsername();
        String password = view.promptPassword();

        if (auth.authenticate(username, password)) {
            view.showLoginSuccess();
            showDashboard();
        } else {
            view.showLoginFailure();
        }
    }

    private void showDashboard() {
        while (true) {
            int choice = view.showDashboardMenu();

            switch (choice) {
                case 1 -> userManagement();
                case 2 -> manageDiscounts();
                case 3 -> manageNotifications();
                case 4 -> contactSupport();
                case 5 -> { return; }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void userManagement() {
        view.showComingSoon("User Management Screen");
    }

    private void manageDiscounts() {
        String code = view.promptDiscountCode();
        double percentage = view.promptDiscountPercentage();
        discountManager.addDiscount(code, percentage);
        discountManager.viewDiscounts();
    }

    private void manageNotifications() {
        String message = view.promptNotificationMessage();
        notificationManager.sendNotification(message);
        notificationManager.viewNotifications();
    }

    private void contactSupport() {
        view.showComingSoon("Contact Us / Support Screen");
    }

    public void showComingSoon(String feature) {
        System.out.println(feature + " (Coming Soon)");
    }
}
