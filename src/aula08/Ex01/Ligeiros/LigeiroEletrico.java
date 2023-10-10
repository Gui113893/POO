package aula08.Ex01.Ligeiros;

import aula08.Ex01.Interfaces.VeiculoEletrico;

public class LigeiroEletrico extends Ligeiro implements VeiculoEletrico{
    int bateria;
    
    public LigeiroEletrico(String matricula, String marca, String modelo, int potencia, int nquadro, int CapBagageira){
        super(matricula, marca, modelo, potencia, nquadro, CapBagageira);
        this.bateria = 100;
    }

    public int autonomia(){
        //Neste programa é considerado que um carro carregado a 100% consegue fazer 400kms
        return getBateria() * 4;
    }

    public int getBateria() {
        return this.bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
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
        return "{"+
        " matricula='" + getMatricula() + "'" +
        ", marca='" + getMarca() + "'" +
        ", modelo='" + getModelo() + "'" +
        ", potencia='" + getPotencia() + "'" +
        ", trajetos='" + getTrajetos() + "'" +
            ", nquadro='" + getNquadro() + "'" +
            ", CapBagageira='" + getCapBagageira() + "'" +
            ", bateria='" + getBateria() + "'" +
            "}";
    }

}
