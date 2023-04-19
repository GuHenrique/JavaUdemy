package App;

import Entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc;


        System.out.println("Enter the account number: ");
        int accountNumber = sc.nextInt();

        System.out.println("Enter the account holder name: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there a inital deposit (y/n)?: ");
        char depositAnswer = sc.next().charAt(0);

        if (depositAnswer == 'y') {

            System.out.println("Enter the initial deposit value: ");
            double initialDeposit =  sc.nextDouble();
            acc = new Account(accountNumber, holder, initialDeposit);

        } else {

           acc = new Account(accountNumber, holder);

        }

        System.out.println("Account data: " + acc);

        System.out.println("Enter the deposit value: ");
        Account.deposit(sc.nextDouble());

        System.out.println("Account update: " + acc);

        System.out.println("Enter the withdraw value: ");
        Account.withdraw(sc.nextDouble());

        System.out.println("Account update: " + acc);

        sc.close();

    }
}