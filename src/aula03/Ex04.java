package aula03;
import java.util.Scanner;
import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nº de alunos: ");
        int nAlunos = sc.nextInt();
        double tabela[][] = new double[nAlunos][3];

        for (int i = 0; i<nAlunos; i++){
            tabela[i][0] = new Random().nextDouble()*20;
            tabela[i][1] = new Random().nextDouble()*20;
            tabela[i][2] = calculaNota(tabela[i][0], tabela[i][1]);
        }

        System.out.println("NotaT  NotaP  Pauta");
        for (int i=0; i<nAlunos; i++){
            System.out.printf("%5.1f%7.1f%7.0f\n", tabela[i][0], tabela[i][1], tabela[i][2]);
        }

        sc.close();
    
    }

    public static int calculaNota(double notaT , double notaP){
        if (notaP < 7 || notaT < 7)
            return 66;

        return (int)(0.4 * notaT + 0.6 * notaP);
    }

}
