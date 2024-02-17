package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import entities.enums.OrderStatus;
import java.util.List;

public class Order {
    
    DateTimeFormatter dateAndTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter dateOnly = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDateTime moment = LocalDateTime.now();
    private OrderStatus status;
    private double totalToPay = 0.0;

    // Creating association
    List<OrderItem> items = new ArrayList<>(); // Lista dos items
    Client client;

    public Order() {} // Empty constructor...

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    } // Constructor with params

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        for (OrderItem oi: items) {
            System.out.println(oi);
        }
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public void addItem(OrderItem item) {
        items.add(item);
    }
    
    public void removeItem(OrderItem item) {
        items.remove(item);
    }
    
    public double getTotalToPay() { // Return the total cost
        for (OrderItem each: items) {
            totalToPay += each.subTotal();
        }

        return totalToPay;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMARY: \n");
        sb.append("Order moment: " + moment.format(dateAndTime) + "\n");
        sb.append("Order status: " + getStatus() + "\n");
        sb.append("Client: " + client.getName() + " (" + client.getBirthDate().format(dateOnly) + ") - " + client.getEmail() + "\n");
        // All others
        sb.append("Total price: " + getTotalToPay());

        return sb.toString();
    }

}
