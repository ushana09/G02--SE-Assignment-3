package View;

import java.util.List;
import java.util.Scanner;
import Controller.CustomerController;

public class CustomerView {
    private Scanner scanner = new Scanner(System.in);
    private CustomerController controller;

    public CustomerView(CustomerController controller) {
        this.controller = controller;
    }

    public void start() {
        System.out.println("E-Retail Platform");
        while (true) {
            System.out.println("1. Sign Up\n2. Log In\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    controller.signup();
                    break;
                case 2:
                    controller.login();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

public void showMenu() {
    while (true) {
        System.out.println("\n1. View Profile\n2. Manage Cart\n3. Write Review\n4. View Recommendations\n5. View Order History\n6. Browse Products\n7. Logout");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Name: " + controller.getCustomerName());
                System.out.println("Email: " + controller.getCustomerEmail());
                break;
            case 2:
                manageCart();
                break;
            case 3:
                writeReview();
                break;
            case 4:
                List<String> recs = controller.getRecommendations();
                System.out.println("Recommended Products: " + recs);
                break;
            case 5:
                System.out.println("Order history feature coming soon.");
                break;
            case 6:
                browseProducts();
                break;
            case 7:
                controller.logout();
                return;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }
}


    private void manageCart() {
        while (true) {
            System.out.println("\n1. Add Product\n2. Remove Product\n3. View Cart\n4. Back");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    controller.addProductToCart(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    controller.removeProductFromCart(scanner.nextLine());
                    break;
                case 3:
                    List<String> products = controller.viewCart();
                    System.out.println("Cart: " + products);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void writeReview() {
        System.out.print("Enter product name: ");
        String product = scanner.nextLine();
        System.out.print("Enter review: ");
        String reviewText = scanner.nextLine();
        System.out.print("Enter rating (1-5): ");
        int rating = scanner.nextInt();
        scanner.nextLine();
        controller.addReview(product, reviewText, rating);
    }

    public Scanner getScanner() {
        return scanner;
    }

    private void browseProducts() {
    List<String> products = controller.getAllProducts(); 
    if (products.isEmpty()) {
        System.out.println("No products available.");
        return;
    }

    System.out.println("\nAvailable Products:");
    for (int i = 0; i < products.size(); i++) {
        System.out.println((i + 1) + ". " + products.get(i));
    }

    System.out.print("Enter the number of the product to add to cart (or 0 to cancel): ");
    int choice = scanner.nextInt();
    scanner.nextLine();

    if (choice > 0 && choice <= products.size()) {
        String selectedProduct = products.get(choice - 1);
        controller.addProductToCart(selectedProduct);
        System.out.println("Added to cart: " + selectedProduct);
    } else if (choice != 0) {
        System.out.println("Invalid choice.");
    }
}

}
