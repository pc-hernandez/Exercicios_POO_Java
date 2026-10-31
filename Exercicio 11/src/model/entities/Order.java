package model.entities;

import model.Enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date date;
    private OrderStatus status;

    private List<OrderItem> orderItems = new ArrayList();

    public Order(Date date, OrderStatus status) {
        this.date = date;
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItens(OrderItem orderItem){
        orderItems.add(orderItem);
    }

    public void removeItens(OrderItem orderItem){
        orderItems.remove(orderItem);
    }

    public double total(){
        double soma = 0.0;
        for (OrderItem orderItem : orderItems ){
            soma += orderItem.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("date = ").append(date)
                .append("\nstatus = ").append(status)
                .append("\norderItems:\n");

        for (OrderItem orderItem : orderItems) {
            sb.append(orderItem).append("\n");
        }
        sb.append("\nTOTAL PRICE: \n");
        sb.append(total());

        return sb.toString();
    }
}
