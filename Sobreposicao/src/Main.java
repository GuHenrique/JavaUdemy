import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {


        //PODEMOS VER QUE NA acc1 FOI DESCONTADO O VALOR DE 5.00 AO REALIZAR O SAQUE POIS É DO TIPO Account.

        Account acc1 = new Account(1001, "Gustavo", 1000.0);
        acc1.withdraw(200.00);
        System.out.println(acc1.getBalance());

        //PORÉM NA acc2 NÃO FOI FEITO O DESCONTO DE 5.00 POIS O MÉTODO FOI SOBRESCRITO NA CLASSE SavingsAccount.

        SavingsAccount acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.1);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        // SOBRESCRITRA REALIZADA NO MÉTODO withdraw, PORÉM UTILIZANDO O SUPER E CRIANDO UMA NOVA REGRA DE TAXAS NA CLASSE BusinessAccount.
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());



    }

}