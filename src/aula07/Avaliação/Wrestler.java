package aula07.Avaliação;
import java.util.Objects;

public class Wrestler extends Fighter{
    int speed;

    public Wrestler(String nome){
        super();
        this.nome = nome;
        this.speed = (int)(Math.random()*10);
    }

    public void attack(Fighter fighter){
        int distancia_adversario = (int)(Math.random()*10);

        if (getSpeed() > distancia_adversario){
            fighter.vida -= (int)(Math.random()*100);
        }
    }
    
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Wrestler)) {
            return false;
        }
        Wrestler wrestler = (Wrestler) o;
        return speed == wrestler.speed;
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }


    @Override
    public String toString() {
        return "Nome: " + nome + " ; Tipo: Wrestler; Vitórias: " + getVitorias() + "; Derrotas: " + getDerrotas();
    }

}
