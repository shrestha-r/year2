package Practical_17;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import Practical_17.User;

public class Unit_17_Test {
    @Test
    public void userSameId(){
        User user1 = new User("1","Rahul","rahul@gmail.com");
        User user2 = new User("1","Rahul","rahul@gmail.com");
        assertTrue(user1 != user2);
        
    }
}
