package aula04.Ex02;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }
}


class CashRegister {
    private Product[] produtos;
    private int nProdutos;


    CashRegister(){
        produtos = new Product[10];
        nProdutos = 0;
    }

    public void addProduct(Product product){
        if (nProdutos >= produtos.length){
            Product[] newProdutos = new Product[produtos.length + 10];

            for (int i = 0; i < nProdutos; i++){
                newProdutos[i] = produtos[i];
            }

            produtos = newProdutos;
        }

        produtos[nProdutos] = product;
        nProdutos++;
    }

    public double getTotalValue(){
        double total = 0;
        for (int i = 0; i < nProdutos; i++){
            total += produtos[i].getTotalValue();
        }
        
        return total;
    }

    public void printFatura(){
        System.out.println("Product         Price      Quantity      Total");
        for (int i=0; i<nProdutos; i++){
            System.out.printf("%-15s %5.2f %13d %10.2f\n", produtos[i].getName(), produtos[i].getPrice(), produtos[i].getQuantity(), produtos[i].getTotalValue());
        }
        System.out.println();
        System.out.printf("Total value: %5.2f",this.getTotalValue());
    }
}

public class CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        cr.printFatura();

    }
}