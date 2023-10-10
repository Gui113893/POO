package Avaliação;

public class Date {
    String date;
    String hour;

    public Date(String date, String hour){
        this.date = date;
        this.hour = hour;
    }


    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return this.hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }


    @Override
    public String toString() {
        return String.format("%11s %6s", getDate(), getHour());
    }

}
