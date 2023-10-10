package aula06.Ex01;
import aula05.Ex02.DateYMD;

public class Pessoa {
    private String nome;
    private int cc;
    private DateYMD dataNasc;

    public Pessoa(String nome, int cc, DateYMD dataNasc){
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    //Método criado para ser usado no Ex2
    public Pessoa(String nome){
        this.nome = nome;
    }

    public static Pessoa create(String nome, int cc, DateYMD dataNasc){
        if (isPessoaValid(nome, cc, dataNasc)){
            return new Pessoa(nome, cc, dataNasc);
        }else{
            return null;
        }
    }

    public static boolean isPessoaValid(String nome, int cc, DateYMD dataNasc){
        return (nome.length() > 0 && cc > 9999999 && cc < 100000000 && dataNasc != null);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCc() {
        return this.cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public DateYMD getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(DateYMD dataNasc) {
        this.dataNasc = dataNasc;
    }


    @Override
    public String toString() {
        return getNome() + "; CC: " + getCc() + 
        "; Data de Nascimento: " + getDataNasc().getDay() + "/" +
         getDataNasc().getMonth() + "/" + getDataNasc().getYear();
    }


}
