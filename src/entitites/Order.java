package entitites;

import entitites.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private OrderStatus status;
    private Date moment;
    private List<OrderItem> itemsList = new ArrayList<>();

    public Order(){

    }

    public Order(OrderStatus status, Date moment) {
        this.status = status;
        this.moment = moment;
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

    public List<OrderItem> getItems() {
        return itemsList;
    }

    public void addItem(OrderItem item ){
        itemsList.add(item);
    }

    public void removeItem(OrderItem item ){
        itemsList.remove(item);
    }

}
