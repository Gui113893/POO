package aula07.Ex02;

public abstract class Date {
    
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

    public abstract void increment();

    public abstract void decrement();

    public abstract String toString();
}
