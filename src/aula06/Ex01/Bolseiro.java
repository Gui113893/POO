package aula06.Ex01;
import aula05.Ex02.DateYMD;

public class Bolseiro extends Aluno{
    Professor orientador;
    int mensalBolsa;

    public Bolseiro(String nome, int cc, DateYMD dataNasc, Professor orientador, int mensalBolsa){
        super(nome, cc, dataNasc);
        this.orientador = orientador;
        this.mensalBolsa = mensalBolsa;
    }


    public Professor getOrientador() {
        return this.orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public int getMensalBolsa() {
        return this.mensalBolsa;
    }

    public void setMensalBolsa(int mensalBolsa) {
        this.mensalBolsa = mensalBolsa;
    }


    @Override
    public String toString() {
        return getNome() + "; CC: " + getCc() + "Nmec: " + getNmec() +
        "; Data de Nascimento: " + getDataNasc().getDay() + "/" + 
        getDataNasc().getMonth() + "/" + getDataNasc().getYear() +
         "; Data de Inscrição: " + getDataIns().getDay() + "/" + 
         getDataIns().getMonth() + "/" + getDataIns().getYear() +
         "; Mensalidade: " + getMensalBolsa() + "; Orientador: " + getOrientador().getNome();
    }
    
}
