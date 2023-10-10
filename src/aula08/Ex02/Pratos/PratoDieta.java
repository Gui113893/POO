package aula08.Ex02.Pratos;

import java.util.Vector;

import aula08.Ex02.NotVegetarianos.Alimento;

public class PratoDieta extends Prato{
    double caloriasLimit;

    public PratoDieta(String nome, double caloriasLimit){
        super(nome);
        this.caloriasLimit = caloriasLimit;
    }

    public PratoDieta(String nome, Vector <Alimento> alimentos, double caloriasLimit){
        super(nome, alimentos);
        this.caloriasLimit = caloriasLimit;
    }


    public double getCaloriasLimit() {
        return this.caloriasLimit;
    }

    public void setCaloriasLimit(double caloriasLimit) {
        this.caloriasLimit = caloriasLimit;
    }

    public boolean addAlimento(Alimento alimento){
        if (getCalorias() + alimento.getCalorias() <= caloriasLimit || caloriasLimit == 0){
            getAlimentos().add(alimento); 
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Prato " + getNome() + ", composto por " + getAlimentos().size() + " Ingredientes - Dieta(" + getCaloriasLimit() + " Calorias)";
    }

}
