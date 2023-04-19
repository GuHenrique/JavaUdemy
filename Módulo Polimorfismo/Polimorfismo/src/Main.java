import entities.Account;
import entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {

        //POLIMORFISMO É A DECLARAÇÃO DA VARIAVEL COM UM TIPO MAIS GENÉRICO APONTANDO PARA UM TIPO MAIS ESPECIFICO.
        //TENDO COMPORTAMENTOS DIFERENTES MESMO SENDO DO TIPO "ACCOUNT", COMO NO EXEMPLO ABAIXO
        //O MÉTODO WITHDWRAW NA CLASSE ACCOUNT TEM UM VALOR DE 5.0 PARA CADA SAQUE REALIZADO
        //PORÉM NA CLASSE BUSINESSACCOUNT A TAXA É DE 7.0.

        Account acc1 = new Account(1020, "Alex", 1000.0);
        Account acc2 = new BusinessAccount(1023, "Maria", 1000.0, 0.01);

        //MESMO AS DUAS VARIÁVEIS TENDO O MESMO TIPO ACCOUNT ESTÃO TENDO COMPORTAMENTOS DIFERENTES POS ESTÃO APONTADAS PARA TIPOS MAIS ESPECIFÍCOS.

        acc1.withdraw(50.0);
        acc2.withdraw(50.0);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());


    }
}