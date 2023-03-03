import entitie.Department;
import entitie.HourContract;
import entitie.Worker;
import entitie.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.print("Enter department's name: ");
        Department department = new Department(sc.nextLine());

        System.out.println("Enter worker data: ");


        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine());

        System.out.println("Base Salary: ");
        double baseSalary = sc.nextDouble();


        Worker worker = new Worker(name, workerLevel, baseSalary, department);

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Enter contract " + i + " data: ");
            System.out.println("Date (DD/MM/YY): ");
            String date1 = sc.next();
            LocalDate date = LocalDate.parse(date1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (Hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(date, valuePerHour, hours);

            worker.addContract(contract);

        }

        System.out.println("Enter mont and year to calculate income (MM/YYYY): ");
        String date1 = sc.next();
        date1 = "01/" + date1;
        LocalDate date = LocalDate.parse(date1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int d_month = date.getMonthValue();
        int d_year = date.getYear();

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income: " + String.format("%.2f", worker.income(d_year, d_month)));




    }
}