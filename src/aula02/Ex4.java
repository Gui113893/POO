package aula02;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique o montante investido: ");
        double investido = sc.nextDouble();

        System.out.print("Indique a taxa de juro mensal: %");
        double taxaMensal = sc.nextDouble();
        sc.close();

        double investidoFinal = investido;

        for (int i = 0; i <3; i++)
            investidoFinal += investidoFinal*(taxaMensal/100); 

        System.out.println("Um investimento de " + investido + " Euros e uma taxa de " + taxaMensal + "%, o montante ao fim de 3 meses será de " + investidoFinal + " Euros");
        

    }
}
