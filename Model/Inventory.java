package Model;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getName(), product);
    }

    public void updateStock(String productName, int newStock) {
        if (inventory.containsKey(productName)) {
            inventory.get(productName).setStock(newStock);
        }
    }

    public void viewInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product.getName() + " - Stock: " + product.getStock());
        }
    }

    public void removeProduct(String productName) {
        inventory.remove(productName);
    }
}