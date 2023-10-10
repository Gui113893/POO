package aula02;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        while (true){
            System.out.print("N: ");
            N = sc.nextInt();

            if (N > 0)
                break;
        }

        sc.close();

        for (int i = N; i>=0; i--){
            if (i % 10 == 0){
                System.out.println();
                if (i == 0){
                    System.out.print(i);
                }
                else
                    System.out.print(i +",");
            }
            else
                System.out.print(i + ",");
        }

    }
}
