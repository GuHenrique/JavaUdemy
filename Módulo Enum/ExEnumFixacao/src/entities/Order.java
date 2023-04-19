package entities;

import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(OrderStatus status, LocalDateTime moment, Client client) {

        this.status = status;
        this.moment = moment;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {

        double sum = 0;

        for (OrderItem o : items) {
            sum += o.subTotal();
        }
        return sum;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment " + moment.format(dtf) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.toString() + "\n");
        for(OrderItem o : items) {
            sb.append(o.getProduct().getName() + ", ");
            sb.append("$" + String.format("%.2f", o.getPrice()) + ", ");
            sb.append("Quantity: " + o.getQuantity() + ", ");
            sb.append("Subtotal: $" + String.format("%.2f", o.subTotal()) + "\n");

        }
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();
    }
}
