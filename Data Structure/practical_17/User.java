package practical_17;

public class User {
    String user_id, user_name, user_email;


    public User(String id, String name, String email){
        this.user_id = id;
        this.user_name = name;
        this.user_email = email;
    }

    
    @Override
    public String toString() {
        return user_id + user_name + user_email;
    }

}
