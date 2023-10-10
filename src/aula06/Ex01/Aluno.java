package aula06.Ex01;
import aula05.Ex02.DateYMD;
import java.time.LocalDate;

public class Aluno extends Pessoa{
    private static int NMECS = 100;
    int nmec;
    DateYMD dataIns;

    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD dataIns){
        super(nome, cc, dataNasc);
        this.nmec = Aluno.NMECS++;
        this.dataIns = dataIns;
    }

    public Aluno(String nome, int cc, DateYMD dataNasc){
        super(nome, cc, dataNasc);
        this.nmec = Aluno.NMECS++;
        LocalDate date_now = LocalDate.now();
        this.dataIns = new DateYMD(date_now.getDayOfMonth(), date_now.getMonthValue(), date_now.getYear());
    }


    public int getNmec() {
        return this.nmec;
    }

    public void setNmec(int nmec) {
        this.nmec = nmec;
    }

    public DateYMD getDataIns() {
        return this.dataIns;
    }

    public void setDataIns(DateYMD dataIns) {
        this.dataIns = dataIns;
    }

    @Override
    public String toString() {
        return getNome() + "; CC: " + getCc() + "Nmec: " + getNmec() +
        "; Data de Nascimento: " + getDataNasc().getDay() + "/" + 
        getDataNasc().getMonth() + "/" + getDataNasc().getYear() +
         "; Data de Inscrição: " + getDataIns().getDay() + "/" + 
         getDataIns().getMonth() + "/" + getDataIns().getYear();
    }

}
