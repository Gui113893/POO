package aula02;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insere a temperatura(ºC): ");
        double temperaturaC = sc.nextDouble();
        double temperaturaF = 1.8 * temperaturaC + 32;
        sc.close();
        System.out.println(temperaturaC + " ºC = " + temperaturaF + " ºF");
    }
}