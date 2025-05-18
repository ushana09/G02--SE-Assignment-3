package Model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<String> products = new ArrayList<>();

    public void addProduct(String product) {
        products.add(product);
        System.out.println(product + " added to cart.");
    }

    public void removeProduct(String product) {
        if (products.remove(product)) {
            System.out.println(product + " removed from cart.");
        } else {
            System.out.println(product + " not found in cart.");
        }
    }

    public void viewCart() {
        System.out.println("Cart Items: " + products);
    }

    public List<String> getProducts() {
        throw new UnsupportedOperationException("Unimplemented method 'getProducts'");
    }
}