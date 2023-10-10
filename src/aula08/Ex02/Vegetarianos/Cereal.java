package aula08.Ex02.Vegetarianos;

public class Cereal extends AlimentoVegetariano{
    
    public Cereal(String nome, double proteinas, double calorias, double peso){
        super(nome, proteinas, calorias, peso);
    }

    @Override
    public String toString() {
        return
            "Cereal " + getNome() + ", Proteinas " + getProteinas() + ", calorias " + getCalorias() +
            ", Peso " + getPeso();
        
    }
}
