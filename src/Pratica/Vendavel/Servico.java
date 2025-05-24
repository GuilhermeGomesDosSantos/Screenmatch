package Pratica.Vendavel;

public class Servico implements Vendavel{
    private double preco;
    private int quantidade;

    private double valorTotalProduto;

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public double calcularPrecoTotal() {
        valorTotalProduto = getPreco() * getQuantidade();

        if (valorTotalProduto > 250 && getQuantidade() >= 10){
            valorTotalProduto = valorTotalProduto - (valorTotalProduto * 0.2);
        } else if (valorTotalProduto > 150 && getQuantidade() >= 10){
            valorTotalProduto = valorTotalProduto - (valorTotalProduto * 0.05);
        } else {
            return valorTotalProduto;
        }
        return valorTotalProduto;
    }
}
