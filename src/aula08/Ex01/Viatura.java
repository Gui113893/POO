package aula08.Ex01;

import java.util.Vector;

import aula08.Ex01.Interfaces.KmPercorridosInterface;

public abstract class Viatura implements KmPercorridosInterface{
    String matricula;
    String marca;
    String modelo;
    int potencia;
    Vector <Integer> trajetos; 

    public Viatura(String matricula, String marca, String modelo, int potencia){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        trajetos = new Vector<Integer>();
    }


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Vector<Integer> getTrajetos(){
        return this.trajetos;
    }

    public void trajeto(int quilometros){
        getTrajetos().add(quilometros);
    }

    public int ultimoTrajeto(){
        return getTrajetos().lastElement();
    }

    public int distanciaTotal(){
        int soma = 0;

        for (int i = 0; i < getTrajetos().size(); i++){
            soma += getTrajetos().get(i);
        }

        return soma;
    }


    @Override
    public String toString() {
        return "{" +
            " matricula='" + getMatricula() + "'" +
            ", marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", potencia='" + getPotencia() + "'" +
            ", trajetos='" + getTrajetos() + "'" +
            "}";
    }

}
