package com.qu1etboy.basic.inheritence;

public class Admin extends User {

    public Admin(String name, int age) {
        super(name, age);
    }

    @Override
    public void greet() {
        System.out.println(this.getName() + " is admin.");
    }
}
