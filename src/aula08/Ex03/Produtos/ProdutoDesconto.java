package aula08.Ex03.Produtos;

public class ProdutoDesconto extends ProdutoGenerico{
    double desconto;

    public ProdutoDesconto(String nome, int quantidade, double preco, double desconto){
        super(nome, quantidade, preco - preco*(desconto/100));
        this.desconto = desconto;
    }

}
