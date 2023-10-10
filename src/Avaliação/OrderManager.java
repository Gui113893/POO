package Avaliação;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    List<Order> orders = new ArrayList<>();

    public OrderManager(){}

    public OrderManager(List<Order> orders){
        this.orders = orders;
    }


    public List<Order> getOrders() {
        return this.orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order){
        getOrders().add(order);
    }

    public void removeOrder(int id){
        Order order = searchOrder(id);

        orders.remove(order);
    }

    public Order searchOrder(int id){
        for (Order order : getOrders()) {
            if (order.getId() == id){
                return order;
            }
        }
        return null;
    }

    public double calculateOrderCost(int id){
        Order order = searchOrder(id);

        if (order == null){
            return -1;
        }

        StandarOrderCostCalculator calculator = new StandarOrderCostCalculator();

        return calculator.calculateOrderCost(order);
    }

    public void printAllOrders(){
        getOrders().stream().forEach(System.out::println);
    }
}
