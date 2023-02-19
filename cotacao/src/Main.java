import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dolarPrice = sc.nextDouble();
        System.out.println("How many dollar will be bought? ");
        double dolarQuantity = sc.nextDouble();

        double value = CurrencyConverter.converter(dolarPrice, dolarQuantity);

        System.out.printf("Amount to be paid in reais: %.2f", value);

    }
}