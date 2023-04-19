import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Name: ");
        student.name = sc.nextLine();

        System.out.println("Enter the grades: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println("Final grade = " + student.finalGrade());

        if (student.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.println;
        }
    }
}