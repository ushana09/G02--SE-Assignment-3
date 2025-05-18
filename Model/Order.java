package Model;

public class Order {
    private String orderId;
    private String product;
    private String status;

    public Order(String orderId, String product) {
        this.orderId = orderId;
        this.product = product;
        this.status = "Processing";
    }

    public void confirmOrder() {
        status = "Confirmed";
        System.out.println("Order Confirmed: " + orderId);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Product: " + product);
        System.out.println("Status: " + status);
    }
}