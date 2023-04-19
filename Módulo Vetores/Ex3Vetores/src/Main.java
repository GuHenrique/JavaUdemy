import Entities.Person;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people wil be entered? ");
        int n = sc.nextInt();

        Person[] vec = new Person[n];

        int age = 0;
        for (int i = 0; i < vec.length; i++) {
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();

            vec[i] = new Person(name, age, height);
        }

        double heightAvg = 0;
        double perCent = 0;
        String nameUnder16 = "";
        for (int i = 0; i < vec.length; i++) {
            heightAvg += vec[i].getHeight() / vec.length;
            vec[i].getAge();


            if (vec[i].getAge() < 16) {

                int x = 0;
                x++;
                perCent = ((double) x / vec.length) * 100;
                nameUnder16 += vec[i].getName() + "  ";

            }

        }

        System.out.printf("Height average: %.2f%n", heightAvg);
        System.out.println(String.format("People percent under 16 years old: %.0f%%", perCent));
        System.out.println("Name of people who are under 16 years old: " + nameUnder16);


    }
}