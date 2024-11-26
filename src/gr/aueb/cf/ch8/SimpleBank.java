package gr.aueb.cf.ch8;

import java.util.Scanner;

public class SimpleBank {

    static double balance = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Simple Bank Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1:
                        deposit(50);
                        break;
                    case 2:
                        withdraw(100);
                        break;
                    case 3:
                        System.out.println("Current balance: $" + balance);
                        break;
                    case 4:
                        System.out.println("Thank you for using Simple Bank. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static void deposit(double amount) throws IllegalArgumentException {
        System.out.print("Enter amount to deposit: ");
        try {

            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be positive.");
            }
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    public static void withdraw(double amount) {
        System.out.print("Enter amount to withdraw: ");
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive.");
            }
            if (amount > balance) {
                throw new ArithmeticException("Insufficient funds.");
            }
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

