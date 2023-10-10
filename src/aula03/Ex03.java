package aula03;
import java.util.Scanner;
import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        boolean answer = true;
        Scanner sc = new Scanner(System.in);
        
        while (answer){
            int int_random = new Random().nextInt(1, 100);
            answer = altobaixo(int_random, sc);
        }

    }

    public static boolean altobaixo(int random, Scanner sc){
        int tentativas = 0;
        while (true){
            System.out.print("Guess? ");
            int guess = sc.nextInt();
        
            if (guess < random){
                System.out.println("Low");
                tentativas += 1;
            } else if (guess > random){
                System.out.println("High");
                tentativas += 1;
            } else {
                tentativas += 1;
                System.out.println("Acertaste em " + tentativas + " tentativas.");
                break;
            }
        }


        System.out.println("Pretende continuar? Prima (S)im ");
        String resposta = sc.next();
      

        if (resposta.equals("S") || resposta.equals("Sim")){
            return true;
        } else{
            return false;
        }
    
    } 

}
