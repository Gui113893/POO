package aula08.Ex01.Motociclo;

import aula08.Ex01.Viatura;

public class Motociclo extends Viatura{
    MotocicloType tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia, MotocicloType tipo){
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
        
    }


    public MotocicloType getTipo() {
        return this.tipo;
    }

    public void setTipo(MotocicloType tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "{" +
        " matricula='" + getMatricula() + "'" +
        ", marca='" + getMarca() + "'" +
        ", modelo='" + getModelo() + "'" +
        ", potencia='" + getPotencia() + "'" +
        ", trajetos='" + getTrajetos() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }

}
