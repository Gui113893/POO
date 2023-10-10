package aula04.Ex04;
import java.util.Scanner;

class Car {
    public String marca;
    public String model;
    public int year;
    public int kms;

    public Car(String marca, String model, int year, int kms) {
        this.marca = marca;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        kms += distance;
    }


    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", model='" + getModel() + "'" +
            ", year='" + getYear() + "'" +
            ", kms='" + getKms() + "'" +
            "}";
    }

    public Car() {
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKms() {
        return this.kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        int i = 0;
        while (true){
            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            String[] data = sc.nextLine().trim().split("\\s+");

            if (data[0] == "" || i > 8) break;

            if (data.length >= 4){
                String[] dataSlice = new String[data.length-3];
                System.arraycopy(data, 1, dataSlice, 0, data.length-3);

                String marca = data[0];
                String model = "";
                for (int j=0; j<dataSlice.length; j++){
                    model += dataSlice[j] + " ";
                }

                String year = data[data.length-2];
                String kms = data[data.length-1];

                if (isMarcaValid(marca) && isModelValid(model) && isYearValid(year) && isKmsValid(kms)){
                    cars[i] = new Car(marca, model, Integer.parseInt(year), Integer.parseInt(kms));
                    i++;
                }
                else{
                    System.out.println("Dados mal formatados. Tente novamente");
                }
            } else System.out.println("Dados mal formatados. Tente novamente");
        }

        return i;

   }

    static void registerTrips(Car[] cars, int numCars) {
        while (true){
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            String input = sc.nextLine();
            
            if (input == "") break;

            String[] parts = input.split(":");

            if (parts.length != 2) System.out.println("Dados mal formatados. Tente novamente.");
            else{
                int carIndex = Integer.parseInt(parts[0]);
                int distance = Integer.parseInt(parts[1]);

                if (!(input.matches("\\d{1}:\\d+")) || carIndex < 0 || carIndex >= numCars || distance < 0){
                    System.out.println("Dados mal formatados. Tente novamente.");
                }else cars[carIndex].drive(distance);
            }
        }
    }


    static void listCars(Car[] cars, int numCars) {
        System.out.println("\nCarros registados: ");

        for (int i = 0; i<numCars; i++){
            System.out.printf("%s %s, %d, kms: %d\n", cars[i].marca, cars[i].model, cars[i].year, cars[i].kms);
        }
        
        System.out.println("\n");
    }

    static boolean isMarcaValid(String marca){
        return marca.matches("\\w+");
    }

    static boolean isModelValid(String model){
        return model.matches(".+");
    }

    static boolean isYearValid(String year){
        return year.matches("\\d{4}");
    }

    static boolean isKmsValid(String kms){
        return kms.matches("\\d+");
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars, numCars);
            registerTrips(cars, numCars);
            listCars(cars, numCars);
        }

        sc.close();

    }
}
