package aula02;
import java.util.Scanner;
import java.lang.Math;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1;
        double y1;
        double x2;
        double y2;
        double distancia;

        System.out.print("p1(x): ");
        x1 = sc.nextDouble();
        
        System.out.print("p1(y): ");
        y1 = sc.nextDouble();
        
        System.out.print("p2(x): ");
        x2 = sc.nextDouble();
        
        System.out.print("p2(y): ");
        y2 = sc.nextDouble();

        sc.close();

        distancia = Math.sqrt((x2 - x1)*(x2 - x1) + (y2- y1)*(y2- y1));
        
        System.out.println("Distância entre p1 = (" + x1 + ", " + y1 + ") e p2 = (" + x2 + ", " + y2 + ") é de " + distancia);

    }
}
