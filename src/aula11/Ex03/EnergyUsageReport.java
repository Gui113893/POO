package aula11.Ex03;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class EnergyUsageReport {
    private HashSet<Customer> customers = new HashSet<>();

    public EnergyUsageReport(){}


    public HashSet<Customer> getCustomers() {
        return this.customers;
    }

    public void load(String fileName) throws IOException{
        File file = new File(fileName);
        Scanner scanner = new Scanner(new FileReader(file));

        while (scanner.hasNext()){
            String[] line = scanner.nextLine().split("\\|");

            List<Double> readings = new ArrayList<Double>();

            readings.add(Double.parseDouble(line[1]));
            readings.add(Double.parseDouble(line[2]));
            readings.add(Double.parseDouble(line[3]));
            readings.add(Double.parseDouble(line[4]));

            Customer student = new Customer(Integer.parseInt(line[0]), readings);
            getCustomers().add(student);

        }
    }

    public void removeCustomer(int id){
        for (Customer customer : customers) {
            if (customer.getCustomerId() == id){
                customers.remove(customer);
                break;
            }
        }
    }

    public void addCustomer(Customer customer){
        getCustomers().add(customer);
    }

    public Customer getCustomer(int id){
        for (Customer customer : customers) {
            if (customer.getCustomerId() == id){
                return customer;
            }
        }
        return null;
    }

    public double calculateTotalUsage(int id){
        List<Double> readings = new ArrayList<Double>();

        for (Customer customer : customers) {
            if (customer.getCustomerId() == id){
                readings = customer.getMeterReadings();
            }
        }

        double total = 0;
        for (Double read : readings) {
            total += read;
        }

        return total;

    }

    public void generateReport(String fileName) throws IOException{
        PrintWriter out = new PrintWriter(new File("src/aula11/Ex03/energy_report.txt"));
        
        for (Customer customer : customers) {
            double totalUsage = this.calculateTotalUsage(customer.getCustomerId());
            out.printf("Id = %d; TotalUsage = %.0f\n", customer.getCustomerId(), totalUsage);
        }
        out.close();
    }
}
