public class Admin {
    private String username;
    private String email;

    public Admin(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void viewDashboard() {
        System.out.println("Welcome to Admin Dashboard, " + username);
        // Further dashboard logic
    }
}
