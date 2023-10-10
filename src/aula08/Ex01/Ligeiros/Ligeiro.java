package aula08.Ex01.Ligeiros;

import aula08.Ex01.Viatura;

public class Ligeiro extends Viatura{
    int nquadro;
    int CapBagageira;

    public Ligeiro(String matricula, String marca, String modelo, int potencia, int nquadro, int CapBagageira){
        super(matricula, marca, modelo, potencia);
        this.nquadro = nquadro;
        this.CapBagageira = CapBagageira;
    }


    public int getNquadro() {
        return this.nquadro;
    }

    public void setNquadro(int nquadro) {
        this.nquadro = nquadro;
    }

    public int getCapBagageira() {
        return this.CapBagageira;
    }

    public void setCapBagageira(int CapBagageira) {
        this.CapBagageira = CapBagageira;
    }


    @Override
    public String toString() {
        return "{"+
        " matricula='" + getMatricula() + "'" +
        ", marca='" + getMarca() + "'" +
        ", modelo='" + getModelo() + "'" +
        ", potencia='" + getPotencia() + "'" +
        ", trajetos='" + getTrajetos() + "'" +
            ", nquadro='" + getNquadro() + "'" +
            ", CapBagageira='" + getCapBagageira() + "'" +
            "}";
    }


}
