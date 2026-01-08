package com.yourname.banking;

public class Account {
    private String accountNumber;
    private String name;
    private double balance;

    public Account(String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0.0;
    }

    // getters and setters
    public String getAccountNumber() { return accountNumber; }
    public String getName() { return name; }
    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public boolean withdraw(double amount) {
        if(balance >= amount) { balance -= amount; return true; }
        return false;
    }
}
