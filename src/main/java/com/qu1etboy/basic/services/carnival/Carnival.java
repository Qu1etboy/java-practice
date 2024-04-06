package com.qu1etboy.basic.services.carnival;

import java.util.ArrayList;
import java.util.List;

public class Carnival {

    List<User> users;

    public Carnival() {
        this.users = new ArrayList<>();
    }

    public void join(User user) {
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("User is under 18");
        }
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

}
