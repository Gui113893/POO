package aula02;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Segundos: ");
        int segundos = sc.nextInt();

        segundos = segundos % (24*3600);
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        sc.close();

        System.out.println(horas +":"+ minutos + ":" + segundos);
    }
}
