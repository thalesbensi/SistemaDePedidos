package application;


import entities.Client;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import entities.Order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String nome = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date date = sdf.parse(scan.next());

        Client client = new Client(nome,email, date);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = scan.nextLine();
        OrderStatus orderStatus = OrderStatus.valueOf(scan.next());

        Order order = new Order(new Date(), orderStatus, client);

        System.out.print("How many items to this order? ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            scan.nextLine();
            String productName = scan.nextLine();
            System.out.print("Product price: ");
            double productPrice = scan.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scan.nextInt();

            Product product = new Product(productName, productPrice);



            OrderItem it = new OrderItem(quantity, productPrice, product);

           order.addItem(it);

        }

        System.out.println();
        System.out.println(order);

        scan.close();
    }
}
