package Controller;

import java.util.Scanner;

import Model.Order;
import Model.Payment;
import Model.ReturnRequest;
import Model.Shipping;
import View.OrderPaymentView;

public class OrderPaymentController {
    private Scanner scanner = new Scanner(System.in);
    private OrderPaymentView view = new OrderPaymentView();

    public void start() {
        while (true) {
            int choice = view.showOrderMenu();

            switch (choice) {
                case 1:
                    checkout();
                    break;
                case 2:
                    confirmOrder();
                    break;
                case 3:
                    new Shipping().trackOrder();
                    break;
                case 4:
                    double amount = view.promptPaymentAmount();
                    new Payment().processPayment(amount);
                    break;
                case 5:
                    returnRequest();
                    break;
                case 6:
                    return;
            }
        }
    }

    private void checkout() {
        String product = view.promptProductName();
        String orderId = view.promptOrderId();
        Order order = new Order(orderId, product);
        order.displayOrder();
    }

    private void confirmOrder() {
        String orderId = view.promptOrderIdToConfirm();
        String product = view.promptProductName();
        Order order = new Order(orderId, product);
        order.confirmOrder();
    }

    private void returnRequest() {
        String orderId = view.promptOrderId();
        String reason = view.promptReturnReason();
        ReturnRequest request = new ReturnRequest(orderId, reason);
        request.processReturn();
    }
}