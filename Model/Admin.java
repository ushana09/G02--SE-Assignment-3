package Model;

public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}
