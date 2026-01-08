package com.yourname.banking;

import java.util.HashMap;
import java.util.Map;

public class BankService {

    private Map<String, Account> accounts = new HashMap<>();

    public Account createAccount(String accountNumber, String name) {
        Account account = new Account(accountNumber, name);
        accounts.put(accountNumber, account);
        return account;
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public boolean deposit(String accountNumber, double amount) {
        Account acc = accounts.get(accountNumber);
        if(acc != null) {
            acc.deposit(amount);
            return true;
        }
        return false;
    }

    public boolean withdraw(String accountNumber, double amount) {
        Account acc = accounts.get(accountNumber);
        if(acc != null) return acc.withdraw(amount);
        return false;
    }
}
