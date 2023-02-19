import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.RecursiveAction;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.diagonal());

    }
}