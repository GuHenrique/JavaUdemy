import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        int n = sc.nextInt();

        int[] vec = new int[n];


        for (int i = 0; i < vec.length; i++) {
            System.out.print("Enter the number: ");
            vec[i] = sc.nextInt();

        }
        System.out.println("Negatives numbers: ");
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] < 0) {
                System.out.println(vec[i]);

            }


        }

    }
}

