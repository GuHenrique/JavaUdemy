package entitie;

public class NaturalPerson extends Person{
    private Double healtSpending;

    public NaturalPerson() {
    }

    public NaturalPerson(String name, Double annualIncome, Double healtSpending) {
        super(name, annualIncome);
        this.healtSpending = healtSpending;
    }

    public Double getHealtSpending() {
        return healtSpending;
    }

    public void setHealtSpending(Double healtSpending) {
        this.healtSpending = healtSpending;
    }

    @Override
    public double calculatesTax() {
        double tax = 0.0;

        if (annualIncome < 20000) {
            tax = annualIncome * 0.15;
        }else {
            tax = annualIncome * 0.25;
        }

        return tax - healtSpending / 2;
    }
}
