package aula05.Ex03;

public class Imovel {
    int id;
    static int IDS = 1000;
    int nquartos;
    String localidade;
    double preco;
    boolean disponivel;
    Leilao leilao;

    Imovel(){
    }


    public Imovel(int nquartos, String localidade, double preco, boolean disponivel) {
        this.id = Imovel.IDS++;
        this.nquartos = nquartos;
        this.localidade = localidade;
        this.preco = preco;
        this.disponivel = disponivel;
        this.leilao = null;
    }

    public static Imovel create(String localidade, int nquartos, double preco){
        return new Imovel(nquartos, localidade, preco, true);
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public void setLeilao(Leilao leilao){
        this.leilao = leilao;
    }

}
