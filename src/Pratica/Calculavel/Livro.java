package Pratica.Calculavel;

public class Livro implements Calculavel{
    private String titulo;
    private double preco;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
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
            preco = preco -(preco * 0.10);
        } else if (getPreco() >= 50) {
            preco = preco - (preco * 0.05);
        } else {
            preco = getPreco();
        }
        return getPreco();
    }
}
