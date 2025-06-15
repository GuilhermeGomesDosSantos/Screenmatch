package Pratica.ListaNumeros;

/*
Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente.
Em seguida, imprima a lista ordenada.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(45310);
        numeros.add(13210);
        numeros.add(5530);
        numeros.add(130);
        numeros.add(26);
        numeros.add(78);
        numeros.add(10);
        numeros.add(3);
        numeros.add(0);
        numeros.add(35253);
        numeros.add(82);
        numeros.add(36);

        Collections.sort(numeros);

        int indice = 1;

        System.out.println("Números ordenados:");
        for(Integer num : numeros){
            System.out.println(indice + " - " + num);
            indice++;
        }
    }
}
