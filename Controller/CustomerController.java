package Controller;

import java.util.*;
import Model.Customer;
import View.CustomerView;

public class CustomerController {
    private Map<String, Customer> customers = new HashMap<>();
    private Customer loggedInCustomer = null;
    private CustomerView view;

    private List<String> cart = new ArrayList<>();

    public CustomerController() {
        this.view = new CustomerView(this);
    }

    public void start() {
        view.start();
    }

    public void signup() {
        Scanner scanner = view.getScanner();
        System.out.print("Choose a username: ");
        String username = scanner.nextLine();
        if (customers.containsKey(username)) {
            System.out.println("Username already exists.");
            return;
        }
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Choose a password: ");
        String password = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(UUID.randomUUID().toString(), username, email, password, address);
        customers.put(username, customer);
        System.out.println("Signup successful.");
    }

    public void login() {
        Scanner scanner = view.getScanner();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        Customer customer = customers.get(username);
        if (customer != null && customer.validatePassword(password)) {
            loggedInCustomer = customer;
            System.out.println("Login successful.");
            view.showMenu();
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    public void logout() {
        loggedInCustomer = null;
        cart.clear();
        System.out.println("Logged out.");
    }

    public String getCustomerName() {
        return loggedInCustomer != null ? loggedInCustomer.getName() : "Guest";
    }

    public String getCustomerEmail() {
        return loggedInCustomer != null ? loggedInCustomer.getEmail() : "N/A";
    }

    public void addProductToCart(String product) {
        cart.add(product);
        System.out.println(product + " added to cart.");
    }

    public void removeProductFromCart(String product) {
        if (cart.remove(product)) {
            System.out.println(product + " removed from cart.");
        } else {
            System.out.println(product + " not found in cart.");
        }
    }

    public List<String> viewCart() {
        return new ArrayList<>(cart);
    }

    public void addReview(String product, String reviewText, int rating) {
        System.out.println("Review for " + product + ": " + reviewText + " (Rating: " + rating + ")");
    }

    public List<String> getRecommendations() {
        return Arrays.asList("Shirt", "Shoes", "Watch");
    }

    public List<String> getAllProducts() {
    return List.of("T-Shirt", "Jeans", "Sneakers", "Jacket", "Watch");
}

}
