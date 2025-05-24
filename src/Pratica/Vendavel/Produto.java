package Pratica.Vendavel;

public class Produto implements Vendavel{
    private double preco;
    private int quantidade;
    private double valorTotal;

    private double getPreco(){
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
        valorTotal = getQuantidade() * getPreco();

        if (valorTotal < 250 && quantidade < 10){
            valorTotal = valorTotal + (valorTotal * 0.1);
        } else if (valorTotal > 350 && quantidade > 15) {
            valorTotal = valorTotal - (valorTotal * 0.07);
        } else {
            return valorTotal;
        }
        return valorTotal;
    }
}
