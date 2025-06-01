package PraticaListas.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Camiseta", 56.90, 1);
        Produto p2 = new Produto("Calça", 86.40, 1);
        Produto p3 = new Produto("Boné", 46.50, 1);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        System.out.println("Total de produtos é: " + produtos.size());
        System.out.println("O último produto é: " + produtos.get(produtos.size() - 1));
        System.out.println("Lista de produtos:" + "\n" + produtos);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Feijão", 15.30, 1, "05/07/2025");
        System.out.println(produtoPerecivel);

    }
}
