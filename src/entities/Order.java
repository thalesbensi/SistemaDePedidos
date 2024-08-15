package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private OrderStatus status;
    private Date moment;

    private Client client;

    private List<OrderItem> itemsList = new ArrayList<>();

    public Order(){

    }

    public Order(Date moment, OrderStatus status , Client client) {
        this.status = status;
        this.moment = moment;
        this.client = client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }


    public void addItem(OrderItem item ){
        itemsList.add(item);
    }

    public void removeItem(OrderItem item ){
        itemsList.remove(item);
    }

    public double total(){
       double sum = 0.0;
       for (OrderItem it : itemsList){
           sum += it.subTotal();
       }
       return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(dateFormat.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client.getName() + " (" + dateFormat.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : itemsList) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }


}
