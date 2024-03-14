package com.qu1etboy.basic.exception;

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.deposit(200);
        System.out.println("Balance = " + a.getBalance());
        a.withdraw(100);
        System.out.println("Balance = " + a.getBalance());
        a.withdraw(500);
        System.out.println("Balance = " + a.getBalance());
    }
}
