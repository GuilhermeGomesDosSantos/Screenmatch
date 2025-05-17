package Pratica.Produto;

public class Main {
    public static void main(String[] args) {
        Produto prod = new Produto();
        prod.setNome("Celular");
        prod.setPreco(1000);
        prod.aplicarDesconto(10);
    }
}
