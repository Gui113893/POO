package aula03;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true){
            System.out.print("Número: ");
            n = sc.nextInt();
            if (n > 0)
                break;
        }
        sc.close();

        int soma = n;

        for (int i=2; i<n; i++){
            if (isPrime(i))
                soma += i;
        }

        System.out.print(soma);

    }

    public static boolean isPrime(int n){
        if (n == 1)
            return false;

        for (int i=2; i < n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
