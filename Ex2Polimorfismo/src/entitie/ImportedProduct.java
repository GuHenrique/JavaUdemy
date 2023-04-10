package entitie;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {

    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return getName() + " $ " + String.format("%.2f (Customs fee: $ %.2f) %n", totalPrice(), customsFee);
    }
}
