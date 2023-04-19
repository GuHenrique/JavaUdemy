package entities;

// O USO DO final EM UMA CLASSE IMPEDE QUE ELA SEJA HERDADA POR QUALQUER OUTRA CLASSE.

public final class SavingsAccount extends Account {

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

    //O USO DO final EM UM MÉTODO IMPEDE QUE ELE SEJA SOBREPOSTO EM UMA SUBCLASSE.
    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }

}
