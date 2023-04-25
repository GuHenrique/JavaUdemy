import model.entities.Location;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

/*
        System.out.println("Enter rental data: ");

        System.out.print("Car model: ");
        String car = sc.nextLine();

        System.out.print("Pickup (dd/mm/yyyy hh:mm): ");
        LocalDateTime initial = LocalDateTime.parse(sc.nextLine(), dtf);

        System.out.print("Return (dd/mm/yyyy hh:mm): ");
        LocalDateTime end = LocalDateTime.parse(sc.nextLine(), dtf);

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();
        */

        //Location location = new Location(car, initial, end, pricePerHour, pricePerDay);
        Location location = new Location("Civic", LocalDateTime.parse("25/06/2023 10:30", dtf), LocalDateTime.parse("27/06/2023 11:40", dtf), 10.00, 130.00);

        System.out.println("INVOICE: ");

        System.out.print(location);







    }
}