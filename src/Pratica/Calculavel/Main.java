package Pratica.Calculavel;

/*
Crie uma interface Calculavel com um método double calcularPrecoFinal().
Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
 */
public class Main {
    public static void main(String[] args) {
        Livro book = new Livro();

        book.setTitulo("Livro 1");
        book.setPreco(105);
        book.calcularPrecoFinal();
        System.out.println(book.getTitulo() + " - R$:" + book.getPreco());

        book.setTitulo("Livro 2");
        book.setPreco(15);
        book.calcularPrecoFinal();
        System.out.println(book.getTitulo() + " - R$:" + book.getPreco());

        ProdutoFisico produto = new ProdutoFisico();
        produto.setProduto("Caneca");
        produto.setPreco(67);
        produto.calcularPrecoFinal();
        System.out.println(produto.getProduto() + " - R$:" + produto.getPreco());
        produto.setProduto("Camisa");
        produto.setPreco(150);
        produto.calcularPrecoFinal();
        System.out.println(produto.getProduto() + " - R$:" + produto.getPreco());
    }
}
