import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product name: ");
        String name = sc.nextLine();

        System.out.println("Enter the product price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println("Updated data: " + product);





    }
}