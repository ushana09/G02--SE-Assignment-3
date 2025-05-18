package Model;

import java.util.Map;

public class Analytics {
    private Map<String, Integer> salesData;

    public Analytics(Map<String, Integer> salesData) {
        this.salesData = salesData;
    }

    public void displaySales() {
        for (String product : salesData.keySet()) {
            System.out.println(product + ": " + salesData.get(product) + " units sold");
        }
    }
}