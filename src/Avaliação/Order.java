package Avaliação;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int ID = 1;
    private int id;
    private List<Item> itens = new ArrayList<>();
    private String storeId;
    private String clientId;
    private Date orderDateTime;
    private boolean expresso;

    public Order(){}
    
    public Order(List<Item> itens, String storeId, String clientId, Date orderDateTime, boolean expresso) {
        this.itens = itens;
        this.storeId = storeId;
        this.clientId = clientId;
        this.orderDateTime = orderDateTime;
        this.expresso = expresso;
        this.id = Order.ID++;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Item> getItens() {
        return this.itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Date getOrderDateTime() {
        return this.orderDateTime;
    }

    public void setOrderDateTime(Date orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public boolean isExpresso() {
        return this.expresso;
    }

    public void setExpresso(boolean expresso) {
        this.expresso = expresso;
    }

    public double totalValue(){
        StandarOrderCostCalculator calculator = new StandarOrderCostCalculator();
        return calculator.calculateOrderCost(this);
    }
    
    @Override
    public String toString() {
        //Id Cliente Id Loja Composição Data e hora Tipo
        return String.format("Id: %2d; Itens: " + getItens() + "; StoreId: %2s, ClientId: %2s; Date: " + getOrderDateTime() + "; Expresso: " + isExpresso() + ";", getId(), getStoreId(), getClientId());
    }


}
