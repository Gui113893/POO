package aula07.Avaliação;

public abstract class Fighter {
    String nome;
    int vida;
    int vitorias; 
    int derrotas;

    public Fighter(){
        this.vida = 100;
        this.vitorias = 0;
        this.derrotas = 0;
    }

    public boolean isAlive(){
        if (vida > 0) return true;
        else return false;
    }

    public abstract void attack(Fighter fighter);

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVitorias() {
        return this.vitorias;
    }
    
    public int getDerrotas() {
        return this.derrotas;
    }
}
