package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    /*
        Neste construtor temos a Inversão de controle sendo aplicada. Estamos retirando a responsabilidade da classe de instanciar suas dependencias.
        Deixando para ser feito no programa (Main), como podemos ver, estamos chamando a interface TaxService e não a classe BrazilTaxService.
        Conseguimos então instanciar qualquer classe que implementa a interface TaxService, não sendo necessário "cravar" uma dependencia.

     */
    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;
        double days = hours / 24;

        double basicPayment;

        if (hours <= 12) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(days);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
