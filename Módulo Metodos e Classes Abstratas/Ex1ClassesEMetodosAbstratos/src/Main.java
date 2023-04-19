import entitie.LegalPerson;
import entitie.NaturalPerson;
import entitie.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Person> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Tax payer #%d data %n", i);

            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health spending: ");
                double healtSpending = sc.nextDouble();

                list.add(new NaturalPerson(name, annualIncome, healtSpending));

            } else if (type == 'c') {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();

                list.add(new LegalPerson(name, annualIncome, employees));
            }
        }
        double sum = 0.0;
        System.out.println("TAXES PAID: ");
        for (Person person : list) {
            sum += person.calculatesTax();
            System.out.println(String.format("%s $ %.2f", person.getName(), person.calculatesTax()));
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", sum);
    }
}