package com.qu1etboy.pattern.di;

public class Main {

    public static void main(String[] args) {
        // DI makes it easy to change implementation without needed to change the main code.
        Bank bank1 = new Bank(new DataSourceFile<>("test.txt"));
        Bank bank2 = new Bank(new DataSourceDB<>());
    }
}
