package aula06.Ex01;
import aula05.Ex02.DateYMD;

public class Professor extends Pessoa{
    String categoria;
    String departamento;

    public Professor(String nome, int cc, DateYMD dataNasc, String categoria, String departamento){
        super(nome, cc, dataNasc);
        this.categoria = categoria;
        this.departamento = departamento;
    }


    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return getNome() + "; CC: " + getCc() + 
        "; Data de Nascimento: " + getDataNasc().getDay() + "/" +
         getDataNasc().getMonth() + "/" + getDataNasc().getYear() +
        "; Categoria: " + getCategoria() + "; Departamento: " + getDepartamento();
    }

}
