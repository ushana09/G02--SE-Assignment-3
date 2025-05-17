import java.util.HashMap;
import java.util.Scanner;

public class Authentication {
    private HashMap<String, String> adminCredentials = new HashMap<>();

    public Authentication() {
        adminCredentials.put("admin", "admin123"); // dummy credentials
    }

    public Admin login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Admin Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (adminCredentials.containsKey(username) && adminCredentials.get(username).equals(password)) {
            System.out.println("Login Successful!");
            return new Admin(username, username + "@admin.com");
        } else {
            System.out.println("Invalid credentials!");
            return null;
        }
    }
}
