package aula07.Ex02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res, ano, mes, dia;
        DateYMD data = new DateYMD();
        
        while (true){
            System.out.println("======================");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");
            res = sc.nextInt();
            System.out.println("======================");

            if (res == 0) break;
            else{
                if (res == 1){
                    System.out.print("Ano: ");
                    ano = sc.nextInt();
                    System.out.println();
                    System.out.print("Mês: ");
                    mes = sc.nextInt();
                    System.out.println();
                    System.out.print("Dia: ");
                    dia = sc.nextInt();
                    System.out.println();

                    data.set(dia, mes, ano);
                } else if (res == 2){
                    System.out.println(data.toString());
                }else if (res == 3){
                    data.increment();
                }else if (res == 4){
                    data.decrement();
                }else System.out.println("Input Inválido");
            }
        }
        sc.close();
    }
}

