package PraticaListas.ListaProduto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        double total = 0.0;
        int qtdProd = 0;


        Produto prod1 = new Produto("Arroz", 5.5);
        Produto prod2 = new Produto("Feijão", 6.2);
        Produto prod3 = new Produto("Carne", 13.5);
        Produto prod4 = new Produto("Refrigerante", 2.4);


        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(prod1);
        produtos.add(prod2);
        produtos.add(prod3);
        produtos.add(prod4);

        for(Produto prod : produtos){
            System.out.println(prod.getPreco());
            total += prod.getPreco();
        }
        System.out.println(String.format("O preço médio dos produtos é R$:%.2f", total / produtos.size()));
    }
}
