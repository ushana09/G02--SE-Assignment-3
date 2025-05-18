package View;

import java.util.Scanner;

public class SellerView {
    private final Scanner scanner = new Scanner(System.in);

    public int showStartMenu() {
        System.out.println("1. Login\n2. Exit");
        System.out.print("Select an option: ");
        return scanner.nextInt();
    }

    public String promptUsername() {
        System.out.print("Enter username: ");
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public String promptPassword() {
        System.out.print("Enter password: ");
        return scanner.nextLine();
    }

    public void showLoginSuccess() {
        System.out.println("Login successful.");
    }

    public int showDashboardMenu() {
        System.out.println("\nSeller Dashboard:");
        System.out.println("1. Add Product");
        System.out.println("2. Edit Product");
        System.out.println("3. Delete Product");
        System.out.println("4. View Inventory");
        System.out.println("5. View Sales Analytics");
        System.out.println("6. Logout");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public String promptProductName() {
        System.out.print("Enter product name: ");
        scanner.nextLine(); // consume newline
        return scanner.nextLine();
    }

    public int promptStockQuantity() {
        System.out.print("Enter stock: ");
        return scanner.nextInt();
    }

    public String promptProductToEdit() {
        System.out.print("Enter product name to edit: ");
        scanner.nextLine(); // consume newline
        return scanner.nextLine();
    }

    public String promptProductToDelete() {
        System.out.print("Enter product name to delete: ");
        return scanner.nextLine();
    }

    public void showProductAdded() {
        System.out.println("Product added.");
    }

    public void showStockUpdated() {
        System.out.println("Stock updated.");
    }

    public void showProductRemoved() {
        System.out.println("Product removed.");
    }

    public void showInvalidOption() {
        System.out.println("Invalid option. Please try again.");
    }
}
