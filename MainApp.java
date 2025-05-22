import java.util.Scanner;
import Controller.CustomerController;
import Controller.SellerController;


public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the E-Retail System");
        System.out.println("Select User Type:");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Seller");
        System.out.println("4. Exit");

        int userType = scanner.nextInt();
        scanner.nextLine();

        switch (userType) {
            case 1:
                System.out.println("Welcome, Admin !");
                boolean running = true;
                while (running) {
                    System.out.println("\n--- Admin Dashboard ---");
                    System.out.println("1. User Management");
                    System.out.println("2. Manage Discounts");
                    System.out.println("3. Notifications");
                    System.out.println("4. Contact Support");
                    System.out.println("5. Logout");

                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("User Management (Coming Soon)");
                            break;
                        case 2:
                            System.out.println("Manage Discounts (Coming Soon)");
                            break;
                        case 3:
                            System.out.println("Notifications (Coming Soon)");
                            break;
                        case 4:
                            System.out.println("Contact us at support@e-retail.com");
                            break;
                        case 5:
                            running = false;
                            System.out.println("Logging out...");
                            break;
                        default:
                            System.out.println("Invalid choice. Try again.");
                    }
                }
                break;

            case 2:
                CustomerController customerController = new CustomerController();
                customerController.start();
                break;

            case 3:
                SellerController sellerController = new SellerController();
                sellerController.start();
                break;

            case 4:
                System.out.println("Exiting the system. Goodbye!");
                break;

            default:
                System.out.println("Invalid selection. Please restart the program.");
                break;
        }

        scanner.close();
    }
}
