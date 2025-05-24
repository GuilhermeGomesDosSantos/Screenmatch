package Pratica.Calculavel;

public class ProdutoFisico implements Calculavel{
    private String produto;
    private double preco;

    public String getProduto(){
        return produto;
    }

    public void setProduto(String produto){
        this.produto = produto;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    @Override
    public double calcularPrecoFinal() {
        if (getPreco() > 100) {
            preco = (getPreco() * 0.1) - getPreco();
        } else {
            preco = getPreco();
        }
        return getPreco();
    }
}
