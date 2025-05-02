package src.test.java.Stage2;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<String, String> users = new HashMap<>();

    public boolean register(String username, String password) {
        if (username == null || password == null || users.containsKey(username)) {
            return false;
        }
        users.put(username, password);
        return true;
    }

    public boolean login(String username, String password) {
        if (username == null || password == null) {
            throw new NullPointerException("Username or password is null");
        }
        return password.equals(users.get(username));
    }
}
