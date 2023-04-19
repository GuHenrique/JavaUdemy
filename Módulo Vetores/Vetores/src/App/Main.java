package App;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the people amount: ");
        int n = sc.nextInt();
        double media;
        double y = 0;
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {

            vect[i] = sc.nextDouble();
        }
        media = Arrays.stream(vect).sum() / n;

        System.out.printf("Average height: %.2f", media);
        sc.close();

    }
}