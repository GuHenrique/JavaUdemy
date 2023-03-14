package entities;

public class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    //QUANDO REESCREVEMOS O MÉTODO DA SUPERCLASSE EM UMA SUBCLASSE, CRIANDO UMA REGRA ESPECÍFICA PARA AQUELA CLASSE COM O MESMO MÉTODO CHAMAMOS DE SOBREPOSIÇÃO.
    //MÉTODO Withdraw FOI SOBRESCRITO NA CLASSE SavingsAccount, POIS FOI CRIADA UMA REGRA EM QUE CONTAS DO TIPO SavingsAccount NÃO TERIAM TAXAS NO SAQUE.
    //COMO O MÉTODO "RAIZ" QUE FICA NA CLASSE Account COBRA UMA TAXA DE 5.00 POR SAQUE, FOI NECESSÁRIO A SOBREPOSIÇÃO NESTA CLASSE.
    //A ANNOTATION @Override FACILITA A LEITURA DO CÓDIGO E TAMBÉM AVISA PARA O COMPILADOR QUE O MÉTODO ESTÁ SENDO SOBREPOSTO.

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

}
