package aula08.Ex02.Pratos;

import java.util.Vector;
import aula08.Ex02.NotVegetarianos.Alimento;
import aula08.Ex02.Vegetarianos.AlimentoVegetariano;


public class PratoVegetariano extends Prato{

    public PratoVegetariano(String nome){
        super(nome);
    }

    public PratoVegetariano(String nome, Vector <Alimento> alimentos){
        super(nome, alimentos);
        if (!isVegetariano(alimentos)){
            setAlimentos(null);;
        }
    }

    private static boolean isVegetariano(Vector <Alimento> alimentos){
        for (Alimento alimento : alimentos) {
            if (!(alimento instanceof AlimentoVegetariano)){
                return false;
            }
        }
        return true; 
    }

    public boolean addAlimento(Alimento alimento){
        if (alimento instanceof AlimentoVegetariano){
            getAlimentos().add(alimento);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Prato " + getNome() + ", composto por " + getAlimentos().size() + " Ingredientes - Prato Vegetariano";
    }

}
