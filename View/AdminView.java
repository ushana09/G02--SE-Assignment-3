package View;


import java.util.Scanner;

public class AdminView {
    private final Scanner scanner = new Scanner(System.in);

    public String promptUsername() {
        System.out.print("Enter admin username: ");
        return scanner.nextLine();
    }

    public String promptPassword() {
        System.out.print("Enter password: ");
        return scanner.nextLine();
    }

    public void showLoginSuccess() {
        System.out.println("Login successful!\n");
    }

    public void showLoginFailure() {
        System.out.println("Invalid credentials. Exit.");
    }

    public int showDashboardMenu() {
        System.out.println("\n Admin Dashboard ");
        System.out.println("1. User Management");
        System.out.println("2. Manage Discounts");
        System.out.println("3. Manage Notifications");
        System.out.println("4. Contact Us / Support");
        System.out.println("5. Logout");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public String promptDiscountCode() {
        System.out.print("Enter discount code: ");
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public double promptDiscountPercentage() {
        System.out.print("Enter discount percentage: ");
        return scanner.nextDouble();
    }

    public String promptNotificationMessage() {
        System.out.print("Enter notification message: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public void showComingSoon(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showComingSoon'");
    }

}
