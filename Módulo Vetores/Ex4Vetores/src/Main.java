import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number will you type? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        String evenNumbers = " ";
        int evenNumbersQauntity = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter the number: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < vect.length; i++) {

            if (vect[i] % 2 == 0) {

                evenNumbers += vect[i] + " ";
                evenNumbersQauntity++;
            }
        }

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Quantity of even number: " + evenNumbersQauntity);

    }
}