import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Gustavo", 0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        // UPCASTING -> CONVERTER OBJETO DA SUBCLASSE PARA A SUPERCLASSE
        // RELAÇÃO "É UM" A BUSINESS ACCOUNT E A SAVINGSACCOUNT "É UMA" ACCOUNT, POR ISSO ELA PODE SER RELACIONADA A INSTÂNCIA DA CONTA.

        Account acc1 = bacc;

        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);

        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING -> CONVERTER O OBJETO DA SUPERCLASSE PARA A SUBCLASSE
        // NÃO ACEITA A INSTÂNCIA SEM QUE SEJA FEITO UM CASTING MANUAL, POIS A ACCOUNT NÃO É UM TIPO DE CONTA ESPECÍFICA COMO A BUSINESSACCOUNT.

        //BusinessAccount acc4 = acc2;
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // A acc3 É UMA SavingsAccount E NÃO UMA BusinessAccount, PORÉM O COMPILADOR NÃO PERCEBE ISSO E ACABA APENAS APONTANDO O ERRO AO EXECUTAR O PROGRAMA.
        // NÃO É POSSÍVEL REALIZAR O CASTING MANUAL EM UMA CONTA DO TIPO SavingAccount COM O CASTING DE BusinessAccount.
        // AMBAS SÃO DO TIPO GENÉRICO Account PORÉM NÃO SE CONVERSAM ENTRE SIM, POR TEREM ESPECIFICIDADES DIFERENTES.

        //BusinessAccount acc5 = (BusinessAccount) acc3;

        //PARA QUE SEJA POSSÍVEL REALIZAR ESSE CASTING É NECESSÁRIO CHAMAR O instaceof, POIS ELE "PERGUNTA" SE TAL CONTA É UMA INSTÂNCIA DE TAL CLASSE.
        //NO CASO ABAIXO A acc3 É UMA INSTÂNCIA DA CLASSE SavingsAccount, COM ISSO O VALOR A SER EXBIDO É O DE "Update".

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

    }

}