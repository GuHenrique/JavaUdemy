import entitie.Circle;
import entitie.Color;
import entitie.Rectangle;
import entitie.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> shapes = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.print("Shape #" + i + " data:");

            System.out.print("Rectangle or Circle (r/c): ");
            char type = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next().toUpperCase());
            sc.nextLine();

            if (type == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();


                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapes.add(new Rectangle(color, width, height));

            } else if (type == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapes.add(new Circle(color, radius));
            }

        }

        System.out.println("SHAPES AREAS: ");
        for (Shape shape : shapes) {
            System.out.println(String.format("%.2f", shape.area()));
        }
    }
}