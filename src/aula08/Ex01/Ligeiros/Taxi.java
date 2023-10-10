package aula08.Ex01.Ligeiros;

public class Taxi extends Ligeiro{
    int nlicenca;

    public Taxi(String matricula, String marca, String modelo, int potencia, int nquadro, int CapBagageira, int nlicenca){
        super(matricula, marca, modelo, potencia, nquadro, CapBagageira);
        this.nlicenca = nlicenca;
    }


    public int getNlicenca() {
        return this.nlicenca;
    }

    public void setNlicenca(int nlicenca) {
        this.nlicenca = nlicenca;
    }


    @Override
    public String toString() {
        return "{"+
        " matricula='" + getMatricula() + "'" +
        ", marca='" + getMarca() + "'" +
        ", modelo='" + getModelo() + "'" +
        ", potencia='" + getPotencia() + "'" +
        ", trajetos='" + getTrajetos() + "'" +
            " nquadro='" + getNquadro() + "'" +
            ", CapBagageira='" + getCapBagageira() + "'" +
            ", nlicenca='" + getNlicenca() + "'" +
            "}";
    }

}
