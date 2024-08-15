package application;


import entities.Client;
import entities.enums.OrderStatus;
import entities.Order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

        System.out.print("How many items to this order? ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++){

        }














        Order order = new Order(new Date(),status, client);



        scan.close();
    }
}
