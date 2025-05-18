package Model;

public class ReturnRequest {
    private String orderId;
    private String reason;

    public ReturnRequest(String orderId, String reason) {
        this.orderId = orderId;
        this.reason = reason;
    }

    public void processReturn() {
        System.out.println("Return Requested for Order ID: " + orderId);
        System.out.println("Reason: " + reason);
    }
}