package com.qu1etboy.basic.inheritence;

public class Main {

    public static void main(String[] args) {
        User user = new User("Alan", 24);

        user.greet();
        user.walk();

        Admin admin = new Admin("John", 36);

        admin.greet();
        admin.walk();
    }
}
