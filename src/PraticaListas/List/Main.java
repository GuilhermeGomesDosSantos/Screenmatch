package PraticaListas.List;
/*
Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listArrayList;

        listArrayList= new ArrayList<>();
        listArrayList.add("Elemento 1");
        listArrayList.add("Elemento 2");

        List<String> listLinkedList;
        listLinkedList = new LinkedList<>();
        listLinkedList.add("Elemento 1");
        listLinkedList.add("Elemento 2");
    }
}
