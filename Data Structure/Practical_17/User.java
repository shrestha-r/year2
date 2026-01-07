package Practical_17;

import java.util.Objects;

public class User {
    String user_id, user_name, user_email;


    public User(String id, String name, String email){
        this.user_id = id;
        this.user_name = name;
        this.user_email = email;
    }

    
    @Override
    public String toString() {
        return "User("+"ID="+user_id + " USERNAME="+user_name + " EMAIL="+user_email+")";
    }

    // Time complexity: O(1)
// Compares user_id strings; String.equals() is O(k) where k is length of the id,
// but user_id is short, so treated as constant time in practice.

// Note: If equals() compared multiple fields (id, name, email),
// comparisons would be more expensive and unnecessary for identity checks.

    @Override 
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return this.user_id.equals(user.user_id);
    }
    // Time complexity: O(1)
// Hash code is computed from user_id only, ensuring consistency with equals().


    @Override
    public int hashCode(){
        return Objects.hash(user_id);
    }

}
