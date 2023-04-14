package model.entitie;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public DateTimeFormatter getDtf() {
        return dtf;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }


    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public long duration() {
        Duration duration = Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay());
        return duration.toDays();

    }

    public String updateDates(LocalDate checkin, LocalDate checkout) {
        LocalDate now = LocalDate.now();
        if (checkin.isBefore(now) || checkout.isBefore(now)) {
            return "Reservation dates for update must be future dates";
        }
        if (!checkout.isAfter(checkin)){
            return "Check=out date must be after check-in date";
        }
        this.checkin = checkin;
        this.checkout = checkout;
        return null;
    }

    @Override
    public String toString() {
        return "Reservation: " +
                "Room: " + roomNumber +
                ", check-in: " + checkin.format(dtf) +
                ", check-out: " + checkout.format(dtf) +
                " " + duration() + " nights";
    }
}
