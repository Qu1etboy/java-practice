package com.qu1etboy.basic.exception;

public class BankAccount {

    private double balance;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (this.balance < amount) {
            throw new InsufficientFundException("Balance not enough");
        }

        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
