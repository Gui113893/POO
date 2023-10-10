package Avaliação;

import java.util.List;

public class StandarOrderCostCalculator implements OrderCostCalculator{
    public StandarOrderCostCalculator(){
    }

    public double calculateOrderCost(Order order){
        double total = 0;
        List<Item> itens = order.getItens();

        for (Item item : itens) {
            total += item.getPrice();
        }

        if (order.isExpresso()){
            total += total*0.30;
        }

        return total;
    }

}
