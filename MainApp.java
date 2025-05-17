import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Authentication auth = new Authentication();
        Admin admin = auth.login();

        if (admin == null) return;

        Notification notification = new Notification();
        Discount discount = new Discount();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Admin Dashboard ===");
            System.out.println("1. User Management");
            System.out.println("2. Manage Discounts");
            System.out.println("3. Notifications");
            System.out.println("4. Contact Us / Support");
            System.out.println("5. Logout");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("User Management Screen (Placeholder)");
                    break;
                case 2:
                    System.out.println("1. Add Discount\n2. View Discounts");
                    int dChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (dChoice == 1) {
                        System.out.print("Enter Code: ");
                        String code = scanner.nextLine();
                        System.out.print("Enter Discount %: ");
                        int percent = scanner.nextInt();
                        discount.addDiscount(code, percent);
                    } else {
                        discount.viewDiscounts();
                    }
                    break;
                case 3:
                    System.out.println("1. Send Notification\n2. View Notifications");
                    int nChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (nChoice == 1) {
                        System.out.print("Enter Message: ");
                        String msg = scanner.nextLine();
                        notification.sendNotification(msg);
                    } else {
                        notification.viewNotifications();
                    }
                    break;
                case 4:
                    System.out.println("Contact Us at: support@e-retail.com");
                    break;
                case 5:
                    running = false;
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }

        scanner.close();
    }
}
