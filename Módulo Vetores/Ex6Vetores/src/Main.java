import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of capacity each vector: ");
        int n = sc.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];

        System.out.println("Enter the number of vector A: ");
        for (int i = 0; i < vectA.length; i++) {

            vectA[i] = sc.nextInt();

        }
        System.out.println("Enter the number of vector B: ");
        for (int i = 0; i < vectB.length; i++) {

            vectB[i] = sc.nextInt();

        }
        int[] vectC = new int[n];
        String resultSum = "";
        for (int i = 0; i < n; i++) {


            vectC[i] = vectA[i] + vectB[i];
            resultSum += vectC[i] + " ";

        }
        System.out.println(resultSum);
        sc.close();
    }
}