package aula08.Ex02.Vegetarianos;

public class Legume extends AlimentoVegetariano{
    
    public Legume(String nome, double proteinas, double calorias, double peso){
        super(nome, proteinas, calorias, peso);
    }

    @Override
    public String toString() {
        return
            "Legume " + getNome() + ", Proteinas " + getProteinas() + ", calorias " + getCalorias() +
            ", Peso " + getPeso();
        
    }
}
