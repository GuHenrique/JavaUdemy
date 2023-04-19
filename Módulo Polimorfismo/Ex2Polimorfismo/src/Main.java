import entitie.ImportedProduct;
import entitie.Product;
import entitie.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();


        double fee;
        String date = "";

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Product #%d data: %n", i);

            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(type == 'u') {

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                date = sc.next();


            }else if (type == 'i'){
                System.out.print("Customs fee: ");
                fee = sc.nextDouble();
                Product importedProduct = new ImportedProduct(name, price, fee);
                products.add(importedProduct);

            } else if (type == 'c') {
                Product product = new Product(name, price);
                products.add(product);
            }

            if (type == 'u'){
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate manufactureDate = LocalDate.parse(date, dtf);

                Product usedProduct = new UsedProduct(name, price, manufactureDate);
                products.add(usedProduct);

            }

        }

        System.out.println("PRICE TAGS: ");

        for(Product p : products ){
            System.out.print(p.priceTag());
        }




    }


}