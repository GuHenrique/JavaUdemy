package entitie;

public class LegalPerson extends Person {

    private int employeeNumbers;

    public LegalPerson() {
    }

    public LegalPerson(String name, Double annualIncome, int employeeNumbers) {
        super(name, annualIncome);
        this.employeeNumbers = employeeNumbers;
    }

    public int getEmployeeNumbers() {
        return employeeNumbers;
    }

    public void setEmployeeNumbers(int employeeNumbers) {
        this.employeeNumbers = employeeNumbers;
    }

    @Override
    public double calculatesTax() {

        double tax = 0.0;
        if (employeeNumbers > 10) {
            tax = annualIncome * 0.14;
        } else {
            tax = annualIncome * 0.16;
        }
        return tax;
    }



}
