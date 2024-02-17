package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import entities.enums.OrderStatus;
import java.util.List;

public class Order {
    
    DateTimeFormatter dateAndTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Create a format of date and time
    DateTimeFormatter dateOnly = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Create a format of date only
    private LocalDateTime moment = LocalDateTime.now();
    private OrderStatus status;
    private double totalToPay = 0.0;

    // Creating association
    List<OrderItem> items = new ArrayList<>(); // Lista dos items (heve many)
    Client client; // (have one)

    public Order() {} // Empty constructor...

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    } // Constructor with params

    // Getters and Setters
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
    
    public double getTotalToPay() { // Return the total cost of the order
        for (OrderItem each: items) { // Go through the entire list of items, taking only the subtotals
            totalToPay += each.subTotal();
        } // Add all subtotals and add the variable totalToPay

        return totalToPay; // Return the total of order
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Creates a string construction object
        // Add the strings to the object 'sb'
        sb.append("\nORDER SUMARY: \n");
        sb.append("Order moment: " + moment.format(dateAndTime) + "\n");
        sb.append("Order status: " + getStatus() + "\n");
        sb.append("Client: " + client.getName() + " (" + client.getBirthDate().format(dateOnly) + ") - " + client.getEmail() + "\n\n");
        sb.append("Order items: \n" + items + "\n");
        sb.append("Total price: " + getTotalToPay());

        return sb.toString(); // Gotta be converted into String, because its (method) return is a String
    }

}
