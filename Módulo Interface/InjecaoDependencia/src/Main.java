import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");

        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();

        System.out.print("Retirada (dd/mm/aaaa hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.print("Retorno (dd/mm/aaaa hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        /*
        Ao instanciar a classe BrazilTaxService no construtor do RentarService estamos fazendo uma injeção de dependência por meio do construtor,
        como definimos uma interface para cuidar das taxas, aqui no construtor podemos injetar qualquer classe que esteja implementando a interface TaxService.
        um exemplo seria: Caso tivessemos mais uma classe além da BrazilTaxService, como por exemplo: UsaTaxService que implementa a interface TaxService,
        poderiamos fazer a injeção dela nesse construtor, não precisando alterar nenhumas das outras classes, apenas aqui no programa principal.

         */
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());


        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");

        System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Taxa: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));


        sc.close();
    }
}