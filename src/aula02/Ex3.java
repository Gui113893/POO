package aula02;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantidade de água(Kg): ");
        double M = sc.nextDouble();

        System.out.print("Temperatura Inicial(ºC): ");
        double initialTemperature = sc.nextDouble();

        System.out.print("Temperatura Final(ºC): ");
        double finalTemperature = sc.nextDouble();
        sc.close();

        double Q = M * (finalTemperature - initialTemperature) * 4184;

        System.out.println("A quantidade de energia necessária para aquecer " + M + "Kg de água desde " + initialTemperature + "ºC até " + finalTemperature + "ºC é de " + Q + "J");

    }
}
