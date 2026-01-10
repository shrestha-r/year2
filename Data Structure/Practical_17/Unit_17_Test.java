package Practical_17;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Unit_17_Test {
    @Test
    public void userSameId() {
        User user1 = new User("1", "Rahul", "rahul@gmail.com");
        User user2 = new User("1", "Rahul", "rahul@gmail.com");
        assertTrue(user1.equals(user2));
    }

    @Test
    public void userDifferentId() {
        User user1 = new User("1", "Rahul", "rahul@gmail.com");
        User user2 = new User("2", "Rahul", "rahul@gmail.com");
        assertTrue(!user1.equals(user2));
    }

    @Test
    public void userHasCode() {
        User user1 = new User("1", "Rahul", "rahul@gmail.com");
        User user2 = new User("1", "kumar", "kumar@gmail.com");
        assertTrue(user1.equals(user2));
    }

    @Test
    public void testAddUser() {
        AccessManager manager = new AccessManager();
        User user = new User("12", "Rahul", "rahul@gmail.com");
        manager.addUser(user);
        assertTrue(manager.userEntries.containsKey(user));
        assertTrue(manager.userEntries.get(user).isEmpty());
        assertEquals(1, manager.userEntries.size());
    }

    @Test
    public void testAddPermission() {
        AccessManager manager = new AccessManager();
        User user = new User("12", "Rahul", "rahul@gmail.com");
        manager.addUser(user);
        manager.addPermission(user, "System A", "add user");
        assertTrue(manager.userEntries.get(user).containsKey("System A"));
        assertTrue(manager.userEntries.get(user).containsValue("add user"));
        assertTrue(!manager.userEntries.get(user).isEmpty());
    }

    @Test
    public void testRemovePermission() {
        AccessManager manager = new AccessManager();
        User user = new User("12", "Rahul", "rahul@gmail.com");
        manager.addUser(user);
        manager.addPermission(user, "System A", "add user");

        manager.removePermission(user, "System A");

        assertTrue(!manager.userEntries.get(user).containsKey("System A"));
        assertTrue(manager.userEntries.get(user).isEmpty());
    }

}
