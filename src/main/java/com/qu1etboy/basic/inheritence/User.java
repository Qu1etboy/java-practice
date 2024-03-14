package com.qu1etboy.basic.inheritence;

public class User extends Person {

    public User(String name, int age) {
        super(name, age);
    }
    public void walk() {
        System.out.println(this.getName() + " is walking...");
    }
}
