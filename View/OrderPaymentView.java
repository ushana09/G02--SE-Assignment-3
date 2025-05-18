package View;

import java.util.Scanner;

public class OrderPaymentView {
    private Scanner scanner = new Scanner(System.in);

    public int showOrderMenu() {
        System.out.println("\n1. Checkout\n2. Confirm Order\n3. Track Shipping\n4. Make Payment\n5. Return Request\n6. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public String promptProductName() {
        System.out.print("Enter product name: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public String promptOrderId() {
        System.out.print("Enter order ID: ");
        return scanner.nextLine();
    }

    public String promptOrderIdToConfirm() {
        System.out.print("Enter order ID to confirm: ");
        return scanner.nextLine();
    }

    public double promptPaymentAmount() {
        System.out.print("Enter amount: ");
        return scanner.nextDouble();
    }

    public String promptReturnReason() {
        System.out.print("Enter reason for return: ");
        scanner.nextLine();
        return scanner.nextLine();
    }
}
