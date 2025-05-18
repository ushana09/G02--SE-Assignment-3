package Model;

public class Authentication {
    public boolean authenticate(Admin admin, String username, String password) {
        return admin.getUsername().equals(username) && admin.validatePassword(password);
    }
}
