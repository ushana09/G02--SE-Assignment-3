package Model;

public class Shipping {
    private String trackingNumber = "TRACK123";

    public void trackOrder() {
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Status: In Transit");
    }
}