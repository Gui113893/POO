package aula07.Avaliação;
import java.util.Objects;

public class Boxer extends Fighter{
    int alcance;

    public Boxer(String nome){
        super();
        this.nome = nome;
        this.alcance = (int)(Math.random()*10);
    }

    public void attack(Fighter fighter){
        int distancia_adversario = (int)(Math.random()*10);

        if (distancia_adversario < getAlcance()){
            fighter.vida -= (int)(Math.random()*100);
        }
    }

    public int getAlcance() {
        return this.alcance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Boxer)) {
            return false;
        }
        Boxer boxer = (Boxer) o;
        return alcance == boxer.alcance;
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(alcance);
    }


    @Override
    public String toString() {
        return "Nome: " + nome + " ; Tipo: Boxer; Vitórias: " + getVitorias() + "; Derrotas: " + getDerrotas();
    }

}
