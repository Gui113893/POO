package aula08.Ex03;

import java.util.Vector;

import aula08.Ex03.Interfaces.Compra;
import aula08.Ex03.Interfaces.Produto;

public class CarrinhoDeCompras implements Compra{
    Vector <Produto> produtos = new Vector<Produto>();
    Vector <Integer> quantidades = new Vector<Integer>();

    public CarrinhoDeCompras(){}

    public void adicionarProduto(Produto produto, int quantidade){
        getProdutos().add(produto);
        getQuantidades().add(quantidade);
    }


    public Vector<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(Vector<Produto> produtos) {
        this.produtos = produtos;
    }

    public Vector<Integer> getQuantidades() {
        return this.quantidades;
    }

    public void listarProdutos() {
       for (int i = 0; i < getProdutos().size(); i++) {
            System.out.printf("Produto %d: %d %s - %.2f$\n", i, getQuantidades().elementAt(i), getProdutos().elementAt(i).getNome(), getProdutos().elementAt(i).getPreco());
       }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < getProdutos().size(); i++) {
            total += getProdutos().elementAt(i).getPreco() * getQuantidades().elementAt(i);
        }

        return total;
    }

}
