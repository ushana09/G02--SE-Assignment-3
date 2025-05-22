package Model;

import java.util.HashMap;
import java.util.Map;

public class Discount {
    private Map<String, Double> discountCodes;

    public Discount() {
        discountCodes = new HashMap<>();
    }

    public void addDiscount(String code, double percentage) {
        discountCodes.put(code, percentage);
        System.out.println("Discount Code Added: " + code + " - " + percentage + "%");
    }

    public void viewDiscounts() {
        if (discountCodes.isEmpty()) {
            System.out.println("No discounts available.");
            return;
        }

        System.out.println("Available Discounts:");
        for (Map.Entry<String, Double> entry : discountCodes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "%");
        }
    }

    public Double getDiscount(String code) {
        return discountCodes.get(code);
    }
}
