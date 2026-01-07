package Practical_17;

import java.util.HashMap;

public class AccessManager {
    HashMap<User, HashMap<String,String>> userEntries;
    
    AccessManager(){
    userEntries = new HashMap<>();
    }

// Time complexity: O(1) average-case HashMap insertion
    void addUser(User user){
        userEntries.put(user,new HashMap<>());
    }
    // Time complexity: O(1) average-case for containsKey, get, and put
// Note: containsKey + get performs two hash lookups (sub-optimal but acceptable)

    void addPermission(User user, String system, String permission){
        if(userEntries.containsKey(user)){
            userEntries.get(user).put(system, permission);
        }
    }
// Time complexity: O(1) average-case HashMap removal

    void removePermission(User user,String system){
         if(userEntries.containsKey(user)){
        userEntries.get(user).remove(system);
         }
    }
    // Time complexity: O(1) to retrieve the inner map; printing is O(n) in number of systems

    void printAccessDetails(User user){
        if (userEntries.containsKey(user)){
            HashMap<String, String> system_permission = userEntries.get(user);
            System.out.println(system_permission.toString());
        }
    }

    public static void main(String[] args) {
        AccessManager am = new AccessManager();
        User user1 = new User("1", "Raj","raaz@gmail.com");
        am.addUser(user1);
        am.addPermission(user1, "A", "add");
        am.addPermission(user1, "B", "remove");
        am.printAccessDetails(user1);

    }
    
}