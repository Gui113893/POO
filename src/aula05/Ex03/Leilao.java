package aula05.Ex03;
import aula05.Ex02.DateYMD;

public class Leilao {
    DateYMD data_inicio;
    DateYMD data_fim;

    public Leilao(){
    }

    public Leilao(DateYMD data_inicio, DateYMD data_fim){
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
    }

    public static Leilao create(DateYMD data_inicio, int periodo_dias){
        return new Leilao(data_inicio, data_inicio.incrementPlus(periodo_dias));
    }

}
