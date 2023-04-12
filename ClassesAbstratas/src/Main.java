import entitie.Account;
import entitie.BusinessAccount;
import entitie.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Account acc1 = new Account(1001, "Aex", 1000.0); Não é possível instanciar uma classe abstrata.

        //Pq então não criar apenas as outras duas classes?
        // - Reuso
        // - Polimorfismo


        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1003, "Ana", 500.0, 500.0));

        double sum = 0;

        for (Account acc : list) {
            sum += acc.getBalance();
        }


        System.out.println(sum);


        for (Account acc : list) {
            acc.deposit(10);
        }

        for (Account acc : list) {
            System.out.println(acc.getNumber() + acc.getBalance());
        }
    }
}