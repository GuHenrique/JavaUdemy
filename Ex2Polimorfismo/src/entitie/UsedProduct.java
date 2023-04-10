package entitie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class UsedProduct extends Product {
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate manufactureDate;


    public UsedProduct() {

    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName() + " (used)" + " $ " + String.format("%.2f (Manufacture date: %s) %n", getPrice(), manufactureDate.format(dtf));
    }
}
