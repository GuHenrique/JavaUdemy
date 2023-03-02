import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();


        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.printf("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            employees.add(emp);


        }


        System.out.print("Enter the employee ID that will have salary increase: ");
        int increaseId = sc.nextInt();


        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        String teste = "";
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == increaseId) {
                employees.get(i).increaseSalary(percentage);

            }
        }


        for (Employee data : employees) {
            System.out.println(data);
        }

    }
}