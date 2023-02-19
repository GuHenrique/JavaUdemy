import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements will the vector have? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        double evenAvg = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter the number: ");
            vect[i] = sc.nextInt();

        }
        for (int i = 0; i < vect.length; i++) {

            if (vect[i] % 2 == 0) {
                evenAvg = Arrays.stream(vect).sum() / vect.length;

            } else {
                evenAvg = -1;
            }
        }
        if (evenAvg == -1) {
            System.out.println("NO EVEN NUMBER");
        } else {

            System.out.println("Even average: " + evenAvg);

        }


    }
}
