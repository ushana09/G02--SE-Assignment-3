package Model;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String password;
    private String address;

    public Customer(String customerId, String name, String email, String password, String address) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public void register() {
        System.out.println(name + " registered successfully.");
    }

    public boolean login(String inputEmail, String inputPassword) {
        return email.equals(inputEmail) && password.equals(inputPassword);
    }

    public boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void updateProfile(String newName, String newAddress) {
        this.name = newName;
        this.address = newAddress;
    }

    public void viewOrderHistory() {
        System.out.println("Order history for customer " + name);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerId() {
        return customerId;
    }
}
