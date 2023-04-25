package model.entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Location {

    private String car;
    private LocalDateTime initial;
    private LocalDateTime end;
    private Double pricePerHour;
    private Double pricePerDay;


    public Location() {
    }

    public Location(String car, LocalDateTime initial, LocalDateTime end, Double pricePerHour, Double pricePerDay) {
        this.car = car;
        this.initial = initial;
        this.end = end;
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public LocalDateTime getInitial() {
        return initial;
    }

    public void setInitial(LocalDateTime initial) {
        this.initial = initial;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public double getTotalPayment() {
        return basicPayment() + tax();
    }

    public double basicPayment() {

        double minutes = Duration.between(initial, end).toMinutes();
        double hours = minutes / 60.0;
        double days = hours / 24.0;

        double price;

        if (hours <= 12.0){
            price = pricePerHour * Math.ceil(hours);
        }else {
            price = pricePerDay * Math.ceil(days);
        }

        return price;

    }

    public double tax() {
        double value;
        if (basicPayment() <= 100) {
            value = basicPayment() * 0.2;
        } else {
            value = basicPayment() * 0.15;
        }
        return value;
    }


    @Override
    public String toString() {
        return "Basic Payment: " + String.format("%.2f", basicPayment()) +
                String.format("%nTax: %.2f", tax()) +
                String.format("%nTotal payment %.2f", getTotalPayment());
    }
}

