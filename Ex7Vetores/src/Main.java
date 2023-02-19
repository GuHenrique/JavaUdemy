import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements will the vector have? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter the number: ");
            vect[i] = sc.nextDouble();


        }

        double avg = Arrays.stream(vect).sum() / vect.length;
        System.out.printf("Vector average: %.3f%n", avg);

        double elementsBelowAvg = 0;
        System.out.println("Elements below average: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < avg) {
                elementsBelowAvg = vect[i];
                System.out.printf("%.2f%n", elementsBelowAvg);
            }

        }


    }
}