package aula07.Ex02;

public class DateND extends Date{
    int d_dias;

    DateND(){}

    DateND(int d_dias){
        this.d_dias = d_dias;
    }

    public void increment(){
        this.d_dias += 1;
    }

    public void decrement(){
        this.d_dias -= 1;
    }


    @Override
    public String toString() {
        return "{" +
            " d_dias='" + this.d_dias + "'" +
            "}";
    }

}
