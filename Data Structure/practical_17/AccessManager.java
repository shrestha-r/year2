package practical_17;

import java.util.HashMap;
import practical_17.User;

public class AccessManager {
    HashMap<User, HashMap<String,String>> userEntries = new HashMap<>();
    HashMap<String, User> users = new HashMap<>();

    AccessManager(User user, String system, String permisions){
        HashMap inside = new HashMap<>();
        inside.put(system, permisions);
        
        userEntries.put(user, inside);
    }

    void addUser(String id, String name, String email){
        User new_usr = new User(id, name, email);
        users.put(id, new_usr);
    }
    void deleteUser(){

    }
    void updateUser(){

    }
    void getUserAccessDetail(){

    }
}
