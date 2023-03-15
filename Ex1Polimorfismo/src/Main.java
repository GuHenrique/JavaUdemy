import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        double additionalCharge = 0.0;

        List<Employee> employees = new LinkedList<>();


        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");

            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();


            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(outsourced == 'y'){
                System.out.print("Additional charge: ");
                additionalCharge = sc.nextDouble();
            }

            if(outsourced == 'y'){
                Employee outEmp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(outEmp);
            }else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
        }

        System.out.println("PAYMENTS: ");
        for(Employee e : employees){
            System.out.println(e.getName() + " - " + String.format("$ %.2f", e.payment()));
        }

    }
}