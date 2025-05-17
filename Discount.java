import java.util.HashMap;

public class Discount {
    private HashMap<String, Integer> discountCodes = new HashMap<>();

    public void addDiscount(String code, int percentage) {
        discountCodes.put(code, percentage);
        System.out.println("Discount Code Added: " + code + " - " + percentage + "%");
    }

    public void viewDiscounts() {
        System.out.println("Available Discounts:");
        for (String code : discountCodes.keySet()) {
            System.out.println(code + ": " + discountCodes.get(code) + "%");
        }
    }
}
