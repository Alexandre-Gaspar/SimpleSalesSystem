import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import model.entities.enums.OrderStatus;
public class App {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateOnly = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // All code ...
        System.out.println("Enter client datas: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateString = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateString, dateOnly); // Converting and assigning the date coming from the user

        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine().toUpperCase());
        
        Order order = new Order(status, new Client(name, email, birthDate));
        
        System.out.print("How many items to this order? ");
        Integer nItems = sc.nextInt();

        for (int c = 0; c < nItems; c++) {
            sc.nextLine();
            System.out.println("Enter #" + (c+1) + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Product quantity: ");
            Integer productQuantity = sc.nextInt();

            order.addItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));
        }


        System.out.println(order); // Show the order details...

        sc.close(); // Close the object that alow read values by keyword
    }

}
