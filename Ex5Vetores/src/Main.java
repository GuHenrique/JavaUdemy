import java.util.Arrays;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number will you type? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double higherNumber = 0.0;
        int higherNumberPosition = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter the number: ");
            vect[i] = sc.nextDouble();
            higherNumber = Arrays.stream(vect).max().getAsDouble();
            if (vect[i] == higherNumber) {
                higherNumberPosition = i + 1; //+1 para o usuário não se confundir, deduzindo que ele não saiba que os arrays começam com a contagem a partit zero.
            }


        }

        System.out.println("Highest value: " + higherNumber);
        System.out.println("Higher number position: " + higherNumberPosition);

    }
}