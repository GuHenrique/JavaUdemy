import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many persons wil be typed? ");
        int n = sc.nextInt();

        double[] height = new double[n];
        char[] gender = new char[n];

        for (int i = 0; i < height.length; i++) {
            System.out.printf("Enter the height of %d person %n", i + 1);
            height[i] = sc.nextDouble();
            System.out.printf("Enter the gender of %d person %n", i + 1);
            gender[i] = sc.next().charAt(0);

        }
        double higherHeight = Arrays.stream(height).max().getAsDouble();
        double shorterHeight = Arrays.stream(height).min().getAsDouble();


        double avgFemHeight;
        int x = 0;
        double sum = 0;
        for (int i = 0; i < height.length; i++) {
            if (gender[i] == 'f') {

                x++;

                sum += height[i];
            }
        }

        avgFemHeight = sum / x;
        int menNumber = 0;
        for (int i = 0; i < height.length; i++) {
            if (gender[i] == 'm') {
                menNumber ++;

            }
        }


        System.out.printf("Shorter height: %.2f%n", shorterHeight);
        System.out.printf("Higher height: %.2f%n", higherHeight);
        System.out.printf("Average female height: %.2f%n", avgFemHeight);
        System.out.printf("Number of men: %d%n", menNumber);

    }
}