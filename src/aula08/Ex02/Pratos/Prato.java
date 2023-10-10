package aula08.Ex02.Pratos;

import java.util.Vector;

import aula08.Ex02.NotVegetarianos.Alimento;

public class Prato {
    String nome;
    Vector <Alimento> alimentos = new Vector<Alimento>();

    public Prato(String nome){
        this.nome = nome;
    }

    public Prato(String nome, Vector <Alimento> alimentos){
        this.nome = nome;
        this.alimentos = alimentos;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vector<Alimento> getAlimentos() {
        return this.alimentos;
    }

    public void setAlimentos(Vector<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public boolean addAlimento(Alimento alimento){
        getAlimentos().add(alimento);
        return true;
    }

    public double getPesoTotal(){
        double total = 0;
        for (Alimento alimento : alimentos) {
            total += alimento.getPeso();
        }
        return total;
    }

    public double getCalorias(){
        double calorias = 0;
        for (Alimento alimento : alimentos) {
            calorias += alimento.getCalorias();
        }
        return calorias;
    }

    public double getProteinas(){
        double proteinas = 0;
        for (Alimento alimento : alimentos) {
            proteinas += alimento.getProteinas();
        }
        return proteinas;
    }



    @Override
    public String toString() {
        return "Prato " + getNome() + ", composto por " + getAlimentos().size() + " Ingredientes";
    }


}
