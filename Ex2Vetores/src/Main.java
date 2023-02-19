import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you gonna type? ");
        int n = sc.nextInt();

        double[] vec = new double[n];


        for (int i = 0; i < n; i++) {
            vec[i] = sc.nextDouble();
        }

        System.out.printf("Entered values: ");
        for (int i = 0; i < n; i++) {
           System.out.print(vec[i] + "  ");
        }

        double sum = Arrays.stream(vec).sum();
        double avg = sum / vec.length;

        System.out.println();
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Average: %.2f%n", avg);

    }
}