package Pratica.Vendavel;

public class Main {
    public static void main(String[] args) {
        Servico servico = new Servico();
        servico.setPreco(17);
        servico.setQuantidade(10);
        System.out.println(servico.calcularPrecoTotal());

        Produto produto = new Produto();
        produto.setPreco(25);
        produto.setQuantidade(9);
        System.out.println(produto.calcularPrecoTotal());

        produto.setQuantidade(20);
        produto.setPreco(22);
        System.out.println(produto.calcularPrecoTotal());
    }
}
