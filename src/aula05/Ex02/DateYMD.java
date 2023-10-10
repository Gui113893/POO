package aula05.Ex02;

public class DateYMD{
    int day;
    int month;
    int year;
    int firstWeekDayofYear;
    int[][] events = new int[12][31];

    DateYMD(){        
    }

    DateYMD(int year, int firstWeekDayofYear){
        if (year > 0 && firstWeekDayofYear >= 1 || firstWeekDayofYear <= 7){
            this.year = year;
            this.firstWeekDayofYear = firstWeekDayofYear;
        }
    }

    public DateYMD(int day, int month, int year){
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

    public DateYMD incrementPlus(int periodo){
        for (int i = 0; i < periodo; i++){
            this.increment();
        }

        return this;
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

    public DateYMD decrementPlus(int periodo){
        for (int i = 0; i < periodo; i++){
            this.decrement();
        }

        return this;
    }

    public int getFirstWeekDayofYear(){
        return this.firstWeekDayofYear;
    }

    public int firstWeekdayOfMonth(int month){
        int diaSemana_atual = getFirstWeekDayofYear();

        for (int i = 1; i <= month-1; i++){
            for (int j = 1; j <= monthDays(i, this.year); j++){
                if (diaSemana_atual % 7 == 0){
                    diaSemana_atual = 1;
                } else diaSemana_atual += 1;
            }
        }

        return diaSemana_atual;
    }

    public void addEvent(DateYMD data){
        events[data.month - 1][data.day - 1] = 1;
    }

    public void removeEvent(DateYMD data){
        events[data.month - 1][data.day - 1] = 0;
    }

    public void printMonth(int month){
        String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String mesString = meses[month-1];

        int dia_semana = this.firstWeekdayOfMonth(month);
        int dia_semana_atual = 1;

        System.out.printf("         %s %d\n", mesString, this.year);
        
        System.out.println(" Su  Mo  Tu  We  Th  Fr  Sa");

        while (dia_semana_atual < dia_semana) {
            System.out.print("    ");
            dia_semana_atual++;
        }

        int dia_atual = 1;


        while (dia_atual <= monthDays(month, this.year)){
            if (events[month-1][dia_atual - 1] == 1){
                System.out.printf("*%2d ", dia_atual);
            } else System.out.printf(" %2d ", dia_atual);

            if (dia_semana_atual % 7 == 0 ){
                dia_semana_atual = 1;
                System.out.print("\n");
            }else dia_semana_atual ++;

            dia_atual ++;
        }
    }

    public String toString(){
        for (int i = 1; i<=12; i++){
            printMonth(i);
            System.out.println();
        }
        return "";
    }
}

