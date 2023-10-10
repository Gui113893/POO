package aula02;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double v1;
        double v2;
        double d1;
        double d2;
        double t1;
        double t2;
        double deltaS;
        double deltaT;
        double velocidadeMedia;

        while (true){
            System.out.print("v1: ");
            v1 = sc.nextDouble();

            if (v1 > 0)
                break;
        }

        while (true){
            System.out.print("d1: ");
            d1 = sc.nextDouble();

            if (d1 > 0)
                break;
        }

        while (true){
            System.out.print("v2: ");
            v2 = sc.nextDouble();

            if (v2 > 0)
                break;
        }

        while (true){
            System.out.print("d2: ");
            d2 = sc.nextDouble();

            if (d2 > 0)
                break;
        }

        sc.close();

        t1 = d1 / v1;
        t2 = d2 / v2;
        deltaT = t1 + t2;
        deltaS = d1 + d2;
        velocidadeMedia = deltaS / deltaT;

        System.out.println("Velocidade Média Final: " + velocidadeMedia);

    }
}
