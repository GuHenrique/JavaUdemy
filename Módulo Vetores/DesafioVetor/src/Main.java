

import Entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("How many rooms will be rented: ");

        int n = sc.nextInt();
        Student[] student = new Student[9];


        for (int i = 0; i < n; i++) {

            sc.nextLine();
            System.out.printf("Rent %d%n", i + 1);
            System.out.printf("Name: ");
            String name = sc.nextLine();

            System.out.printf("Email: ");
            String email = sc.nextLine();

            System.out.printf("Room: ");
            int room = sc.nextInt();

            student[room] = new Student(name, email, room);


        }

        for (int i = 0; i < student.length; i++) {

            if (student[i] != null) {

                System.out.println(student[i].getRoom() + ": " + student[i].getName() + ", " + student[i].getEmail());

            }
        }


    }
}