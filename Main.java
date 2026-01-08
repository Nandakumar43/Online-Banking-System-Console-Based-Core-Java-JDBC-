package com.yourname.banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();

        while(true) {
            System.out.println("\n--- Online Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.nextLine();
                    bank.createAccount(accNo, name);
                    System.out.println("Account created successfully!");
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    double amt = sc.nextDouble();
                    if(bank.deposit(accNo, amt)) System.out.println("Deposit successful!");
                    else System.out.println("Account not found!");
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    amt = sc.nextDouble();
                    if(bank.withdraw(accNo, amt)) System.out.println("Withdrawal successful!");
                    else System.out.println("Insufficient balance or account not found!");
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();
                    Account acc = bank.getAccount(accNo);
                    if(acc != null) System.out.println("Balance: " + acc.getBalance());
                    else System.out.println("Account not found!");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
