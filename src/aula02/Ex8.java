package aula02;
import java.util.Scanner;
import java.lang.Math;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double catA;
        double catB;

        while (true){
            System.out.print("Cateto A: ");
            catA = sc.nextDouble();

            if (catA > 0)
                break;
        }
        
        while (true){
            System.out.print("Cateto B: ");
            catB = sc.nextDouble();

            if (catB > 0)
                break;
        }

        sc.close();

        double hipotenusa = Math.sqrt(catA*catA + catB * catB);
        double angulo_rads = Math.acos(catA / hipotenusa);
        double angulo_graus = (angulo_rads *180)/ Math.PI;

        System.out.println("Hipotenusa(C): " + hipotenusa + ". Ângulo entre A e C: " + angulo_graus +"º");

    }
}
