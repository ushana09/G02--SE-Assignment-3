import java.util.*;

public class Cart {
    private String cartId;
    private String customerId;
    private List<Product> items;

    public Cart(String cartId, String customerId) {
        this.cartId = cartId;
        this.customerId = customerId;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeItem(Product product) {
        items.remove(product);
        System.out.println(product.getName() + " removed from cart.");
    }

    public void viewCart() {
        System.out.println("Cart items:");
        for (Product item : items) {
            System.out.println("- " + item.getName() + " ($" + item.getPrice() + ")");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}