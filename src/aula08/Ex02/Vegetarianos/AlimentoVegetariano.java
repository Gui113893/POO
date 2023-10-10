package aula08.Ex02.Vegetarianos;

import aula08.Ex02.NotVegetarianos.Alimento;

public abstract class AlimentoVegetariano extends Alimento{
    final boolean vegetariano = true;
    String nome;

    public AlimentoVegetariano(String nome, double proteinas, double calorias, double peso){
        super(proteinas, calorias, peso);
        this.nome = nome;
    }  


    public boolean isVegetariano() {
        return this.vegetariano;
    }

    public boolean getVegetariano() {
        return this.vegetariano;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
