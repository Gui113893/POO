package Avaliação;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderTester {
    public static void main(String[] args) throws IOException{
        OrderManager manager = new OrderManager();

        List<Order> orders = loadOrders("src/Avaliação/pedidos.txt");
        orders.stream().forEach((o)->{manager.addOrder(o);});


        List<Item> items = new ArrayList<Item>();
        items.add(new Item("pão", 1.50));
        Date date = new Date("2023-03-22", "09:43");

        Order o = new Order(items, "345", "50", date, false);

        manager.addOrder(o);

        manager.removeOrder(4);

        Order o2 = manager.searchOrder(7);
        System.out.println("Order Searched: " +o2);


        double valor = manager.calculateOrderCost(7);
        System.out.println("Order cost: " + valor);

        PrintWriter out = new PrintWriter(new File("src/Avaliação/OrderManager_Output.txt"), StandardCharsets.UTF_8);
        
        manager.getOrders().stream().forEach(out::println);
        out.close();
    }


    public static List<Order> loadOrders(String path) throws IOException{
        File file = new File(path);
        Scanner sc = new Scanner(new FileReader(file, StandardCharsets.UTF_8));
        
        String[] line = sc.nextLine().split(";");
        List<Order> orders = new ArrayList<>();

        while (sc.hasNextLine()) {
            line = sc.nextLine().split(";");
            String clientId = line[0];
            String storeId = line[1];
            
            String[] itens = line[2].split("\\|");
            List<Item> itemsList = new ArrayList<>();
            for (String item : itens) {
                String[] item_split = item.split("\\:");

                String name = item_split[0];
                double price = Double.parseDouble(item_split[1]);

                Item item2 = new Item(name, price);

                itemsList.add(item2);
            }

            String[] date_hour = line[3].split(" ");
        
            String date = date_hour[0];
            String hour = date_hour[1];

            Date date2 = new Date(date, hour);

            boolean expresso;
            if (line[4].equals("expresso")){
                expresso = true;
            }else{
                expresso = false;
            }

            Order order = new Order(itemsList, storeId, clientId, date2, expresso);
            orders.add(order);
        }


        return orders;
    }
}
