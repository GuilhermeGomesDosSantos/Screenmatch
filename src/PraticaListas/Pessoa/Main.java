package PraticaListas.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setIdade(30);

        Pessoa p2 = new Pessoa();
        p2.setNome("Maria");
        p2.setIdade(19);

        Pessoa p3 = new Pessoa();
        p3.setNome("Guilherme");
        p3.setIdade(22);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);

        System.out.println("O tamanho da lista de pessoas é: " + listaDePessoas.size());
        System.out.println("A primeira pessoa da lista é: " + listaDePessoas.get(0));
        System.out.println("Lista de pessoas:" + "\n" + listaDePessoas);
    }
}
