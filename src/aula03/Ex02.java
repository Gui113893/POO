package aula03;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int investido;
        double taxaMensal;

        while (true){
            System.out.print("Indique o montante investido: ");
            investido = sc.nextInt();

            if (investido>0 && investido % 1000 == 0 )
                break;
        }
        
        while (true){
            System.out.print("Indique a taxa de juro mensal: %");
            taxaMensal = sc.nextDouble();

            if (0<=taxaMensal && taxaMensal <=5 )
                break;
        }
        
        sc.close();

        double investidoFinal = investido;

        for (int i = 0; i <12; i++){
            investidoFinal += investidoFinal*(taxaMensal/100); 
            System.out.printf("Mês %d: %.1f\n", i+1, investidoFinal);
        }
            
        System.out.printf("Um investimento de %d Euros e uma taxa de %.1f , o montante ao fim de 12 meses será de %.1f Euros", investido, taxaMensal, investidoFinal);
        
    }
}
