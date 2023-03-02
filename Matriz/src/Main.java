import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int x = 0; x < mat[i].length; x++) {
                mat[i][x] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < mat.length; i++){
            for (int x = 0; x < mat[i].length; x ++){
                if (mat[i][x] < 0){
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);
        sc.close();
    }
}