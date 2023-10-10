package aula08.Ex01.Pesados;

import aula08.Ex01.Interfaces.VeiculoEletrico;

public class PesadoPassageirosEletrico extends PesadoPassageiros implements VeiculoEletrico{
    int bateria;

    public PesadoPassageirosEletrico(String matricula, String marca, String modelo, int potencia, int nquadro, double peso, int passageirosMax, int bateria){
        super(matricula, marca, modelo, potencia, nquadro, peso, passageirosMax);
        this.bateria = 100;
    }


    public int getBateria() {
        return this.bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int autonomia(){
        //Neste programa é considerado que um pesado carregado a 100% consegue fazer 600kms
        return getBateria() * 6;
    }

    public void carregar(int percentagem){
        if (getBateria() + percentagem > 100){
            setBateria(100);
        }else{
            setBateria(getBateria() + percentagem);
        }
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
            ", peso='" + getPeso() + "'"+
            ", passageirosMax='" + getPassageirosMax() + "'"+
            ", bateria='" + getBateria() + "'" +
            "}";
    }

}
