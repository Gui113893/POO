package aula08.Ex03.Interfaces;

public interface Produto {
    public String getNome();
    public double getPreco();
    public int getQuantidade();
    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);
}
