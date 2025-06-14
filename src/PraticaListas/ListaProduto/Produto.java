package PraticaListas.ListaProduto;

/*
Crie uma classe Produto com propriedades como nome e preço.
Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
*/
public class Produto {
    private String nome;
    private double preco;
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + getNome() + ", Preço R$: " + getNome();
    }
}
