package aula08.Ex01.Pesados;

import aula08.Ex01.Viatura;

public abstract class Pesados extends Viatura{
    int nquadro;
    double peso;

    public Pesados(String matricula, String marca, String modelo, int potencia, int nquadro, double peso){
        super(matricula, marca, modelo, potencia);
        this.nquadro = nquadro;
        this.peso = peso;
    }


    public int getNquadro() {
        return this.nquadro;
    }

    public void setNquadro(int nquadro) {
        this.nquadro = nquadro;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "{" +
        " matricula='" + getMatricula() + "'" +
        ", marca='" + getMarca() + "'" +
        ", modelo='" + getModelo() + "'" +
        ", potencia='" + getPotencia() + "'" +
        ", trajetos='" + getTrajetos() + "'" +
            " nquadro='" + getNquadro() + "'" +
            ", peso='" + getPeso() + "'" +
            "}";
    }

}
