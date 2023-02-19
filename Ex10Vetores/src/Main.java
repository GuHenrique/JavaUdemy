import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many are you going to type? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];

        for (int i = 0; i < name.length; i++) {
            sc.nextLine();
            System.out.println(i + 1 + "person data: ");
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Age: ");
            age[i] = sc.nextInt();

        }
        int higherAge = Arrays.stream(age).max().getAsInt(); // ex 22 anos
        System.out.println(higherAge);
        int index = 0;
        for (int i = 0; i < name.length; i++) {
            if (age[i] == higherAge) { //quando o valor do vetor age for == 22, vou pegar a quantidade de vezes que a var i rodou no loop e esse será o index.
                index = i;
            }
        }
        String olderPerson = name[index];

        System.out.println("Older person: " + olderPerson);
            sc.close();
    }
}