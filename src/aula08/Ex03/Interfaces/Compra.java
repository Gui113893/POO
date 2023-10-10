package aula08.Ex03.Interfaces;

public interface Compra {
    public void adicionarProduto(Produto produto, int quantidade);
    public void listarProdutos();
    public double calcularTotal();
}
