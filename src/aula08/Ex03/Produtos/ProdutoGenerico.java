package aula08.Ex03.Produtos;

import aula08.Ex03.Interfaces.Produto;

public class ProdutoGenerico implements Produto{
    String nome;
    int quantidade;
    double preco;

    public ProdutoGenerico(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adicionarQuantidade(int quantidade){
        setQuantidade(getQuantidade() + quantidade);
    }

    public void removerQuantidade(int quantidade){
        setQuantidade(getQuantidade() - quantidade);
    }

}
