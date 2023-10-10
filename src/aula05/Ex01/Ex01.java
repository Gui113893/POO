package aula05.Ex01;
import java.util.Scanner;


class DateYMD{
    int day;
    int month;
    int year;

    DateYMD(){        
    }

    DateYMD(int day, int month, int year){
        if (valid(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }   
    }
    
    public void set(int day, int month, int year){
        if (valid(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }


    @Override
    public String toString() {
        return this.year + "-" + this.month + "-" + this.day;
    }

    public static boolean validMonth(int month){
        return (month >= 1 && month <= 12);
    }

    public static int monthDays(int month, int year){
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (leapYear(year)) days[1] = 29;

        return days[month-1];
    }

    public static boolean leapYear(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static boolean valid(int day, int month, int year){
        return (validMonth(month) && year >= 0 && day <= monthDays(month, year) && day > 0);
    }

    public void increment(){
        if (this.day == monthDays(this.month, this.year)){
            this.day = 1;
            if (this.month == 12){
                this.month = 1;
                this.year += 1;
            }
            else this.month += 1;   
        } else this.day += 1;
    }

    public void decrement(){
        if (this.day == 1){
            if (this.month == 1){
                this.year -= 1;
                this.month = 12;
                this.day = 31;
            }
            else {
                this.day = monthDays(month-1, year);
                this.month -= 1;
            }
        }else this.day -= 1;
    }
}




public class Ex01 {
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
