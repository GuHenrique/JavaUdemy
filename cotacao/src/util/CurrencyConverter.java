package util;

public class CurrencyConverter {

    public static double IOF = 6.00;
    public static double converter(double price, double quantity){

        return price * (quantity += quantity * IOF / 100);

    }

}

