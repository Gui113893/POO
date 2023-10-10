package aula02;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double maximo = 0;
        double minimo = 0;
        double soma = 0;
        double media;
        double primeiro = 0;
        double n;
        int i = 1;
        
        while (true){
            if (i == 1){
                System.out.print("Número: ");
                primeiro = sc.nextDouble();
                n = primeiro;
                i++;
                soma += n;
                total += 1;
                maximo = primeiro;
                minimo = primeiro;
            }
            else{
                System.out.print("Número: ");
                n = sc.nextDouble();
                soma += n;
                total += 1;
                if (n > maximo)
                    maximo = n;
                else if (n < minimo)
                    minimo = n;
                
                if (n == primeiro)
                    break;    
            }
        }
        sc.close();

        media = soma / total;

        System.out.println("Máximo: " + maximo + " ; Mínimo: " + minimo + " ; Média: " + media + " ; Total: " + total);

    }
}
