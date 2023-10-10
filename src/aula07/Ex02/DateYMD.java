package aula07.Ex02;

public class DateYMD extends Date{
    int day;
    int month;
    int year;

    DateYMD(){        
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


    @Override
    public String toString() {
        return this.year + "-" + this.month + "-" + this.day;
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

