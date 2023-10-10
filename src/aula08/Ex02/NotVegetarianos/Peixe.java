package aula08.Ex02.NotVegetarianos;

public class Peixe extends Alimento{
    PeixeType tipo;

    public Peixe(PeixeType tipo, double proteinas, double calorias, double peso){
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }


    public PeixeType getTipo() {
        return this.tipo;
    }

    public void setTipo(PeixeType tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return
            "Peixe " + getTipo() + ", Proteinas " + getProteinas() + ", calorias " + getCalorias() +
            ", Peso " + getPeso();
        
    }
}

