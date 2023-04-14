import model.entitie.Reservation;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reservation reservation = new Reservation();

        // *** FIRST RESERVATION ***

        System.out.print("Room Number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Check-in date (dd/mm/yyyy): ");
        LocalDate checkin = LocalDate.parse(sc.nextLine(), reservation.getDtf());

        System.out.print("Check-out date (dd/mm/yyyy): ");
        LocalDate checkout = LocalDate.parse(sc.nextLine(), reservation.getDtf());

        reservation = new Reservation(roomNumber, checkin, checkout);

        System.out.println(reservation);

        // *** UPDATE ***

        System.out.print("Check-in date (dd/mm/yyyy): ");
        checkin = LocalDate.parse(sc.nextLine(), reservation.getDtf());

        System.out.print("Check-out date (dd/mm/yyyy): ");
        checkout = LocalDate.parse(sc.nextLine(), reservation.getDtf());

        reservation.updateDates(checkin, checkout);

        System.out.println(reservation);

    }
}