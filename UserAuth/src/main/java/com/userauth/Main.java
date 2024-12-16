package com.userauth;

public class Main {
    public static void main(String[] args) {
        UserHashTable userHashTable = new UserHashTable();

        // Insert Users
        userHashTable.insert(new User("user1", "hashedPass1", "John", "Doe", "john@example.com"));
        userHashTable.insert(new User("user2", "hashedPass2", "Jane", "Doe", "jane@example.com"));
        userHashTable.insert(new User("user3", "hashedPass3", "Alice", "Smith", "alice@example.com"));
        userHashTable.insert(new User("user4", "hashedPass4", "Bob", "Brown", "bob@example.com"));
        userHashTable.insert(new User("user5", "hashedPass5", "Eve", "White", "eve@example.com"));

        System.out.println("User Table Before Deletion:");
        userHashTable.printTable();

        // Delete User
        userHashTable.delete("user3");

        System.out.println("User Table After Deletion:");
        userHashTable.printTable();

        // Lookup User
        User user = userHashTable.lookup("user3");
        System.out.println("Lookup 'user3': " + (user == null ? "Not Found" : user.getFirstName()));
    }
}
