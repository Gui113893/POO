package aula02;
import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insere a distância(km): ");
        double distanciaKm = sc.nextDouble();
        double distanciaMilhas = distanciaKm / 1.609;
        sc.close();
        System.out.println(distanciaKm + " Quilómetros = " + distanciaMilhas + " Milhas");
    }
}
