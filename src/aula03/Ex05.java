package aula03;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String output;
        boolean valido = false;
        
        while (true){
            System.out.print("Data(mm/yyyy): ");
            output = sc.next();
            valido = validarOutput(output);

            if (valido)
                break;
            
            System.out.println("Data Inválida. Tente novamente.");
        }

        int mes = Integer.parseInt(output.substring(0, 2));
        int ano = Integer.parseInt(output.substring(3, 7));

        String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        String mesString = meses[mes-1];
        
        System.out.print("Dia da semana em que começa esse mês: ");
        int dia_semana = sc.nextInt(); 
        sc.close();

        int dias_mes = calculoDias(mes, ano);

        imprimirCalendario(dia_semana, dias_mes, ano, mesString);
    }

    public static boolean validarOutput(String op){
        return (op.length() == 7 && Integer.parseInt(op.substring(0, 2)) <= 12 && Integer.parseInt(op.substring(0, 2)) >= 1 && op.substring(2, 3).equals("/") && Integer.parseInt(op.substring(3, 7)) >= 0);
    }

    public static int calculoDias(int mes, int ano){
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        

        if(ano % 400 == 0){
            dias[1] = 29;
        } else if((ano % 4 == 0) && (ano % 100 != 0))
            dias[1] = 29;

        return dias[mes-1];

    }

    public static void imprimirCalendario(int dia_semana, int dias_mes, int ano, String mesString){

        System.out.printf("       %s %d\n", mesString, ano);
        
        System.out.println("Su Mo Tu We Th Fr Sa");
        
        int dia_semana_atual = 1;
        int dia_atual = 1;
    
        while (dia_semana_atual <= dia_semana) {
            System.out.print("   ");
            dia_semana_atual++;
        }
    
        while (dia_atual <= dias_mes) {
            System.out.printf("%2d ", dia_atual);
    
            if (dia_semana_atual % 7 == 0) {
                System.out.println();
            }
            
            dia_atual++;
            dia_semana_atual++;
        }
        
        if ((dia_semana_atual-1) % 7 != 0) {
            System.out.println();
        }
    }
    
    
}

