package com.userauth;

import java.util.HashMap;

public class UserHashTable {
    private final HashMap<String, User> table = new HashMap<>();

    public void insert(User user) {
        table.put(user.getUsername(), user);
    }

    public void delete(String username) {
        table.remove(username);
    }

    public User lookup(String username) {
        return table.get(username);
    }

    public void printTable() {
        table.forEach((key, user) -> System.out.println(key + ": " + user.getFirstName() + " " + user.getSurname()));
    }
}
