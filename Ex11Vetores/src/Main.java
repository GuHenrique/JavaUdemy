import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students wil be typed? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        double[] grade1 = new double[n];
        double[] grade2 = new double[n];

        for (int i = 0; i < name.length; i++) {
            sc.nextLine();
            System.out.printf("Enter the name, first and second grade of the %d student: %n", i + 1);
            name[i] = sc.nextLine();
            grade1[i] = sc.nextDouble();
            grade2[i] = sc.nextDouble();
        }

        double gradeAvg;

        System.out.println("Approved students: ");
        for (int i = 0; i < name.length; i++) {

          gradeAvg = (grade1[i] + grade2[i]) / 2;

            if ( gradeAvg >= 6 ){
                System.out.println(name[i]);
            }
        }

        sc.close();
    }
}