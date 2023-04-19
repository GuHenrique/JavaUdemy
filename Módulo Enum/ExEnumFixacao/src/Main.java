import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String date = sc.next();

        LocalDate birth = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Client client = new Client(name, email, birth);


        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());



        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        LocalDateTime moment = LocalDateTime.now();

        Product product;
        OrderItem orderItem;

        Order order = new Order(orderStatus, moment, client);

        for (int i = 1; i <= n; i ++){
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            product = new Product(productName, price);
            orderItem = new OrderItem(quantity, price, product);
            order.addItem(orderItem);

        }

        System.out.println("ORDER SUMMARY: ");
        System.out.print(order);











    }
}