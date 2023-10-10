package aula08.Ex02.NotVegetarianos;

public class Carne extends Alimento{
    CarneType variedade;

    public Carne(CarneType variedade, double proteinas, double calorias, double peso){
        super(proteinas, calorias, peso);
        this.variedade = variedade;
    }


    public CarneType getVariedade() {
        return this.variedade;
    }

    public void setVariedade(CarneType variedade) {
        this.variedade = variedade;
    }


    @Override
    public String toString() {
        return
            "Carne " + getVariedade() + ", Proteinas " + getProteinas() + ", calorias " + getCalorias() + 
            ", Peso " + getPeso();
        
    }

}


