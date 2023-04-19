package Entities;

public class Account {
    private int accountNumber;
    private String holder;
    private static double balance;

    private static final int WITHDRAW_TAX = 5;


    public Account(int accountNumber, String holder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public static double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public static void withdraw(double withdrawValue) {
        balance -= withdrawValue + WITHDRAW_TAX;
    }

    public static void deposit(double depositValue) {
        balance += depositValue;
    }


    public String toString() {
        return "Account number: " + accountNumber + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }

}
