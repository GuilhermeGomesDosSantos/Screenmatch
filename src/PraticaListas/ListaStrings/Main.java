package PraticaListas.ListaStrings;
/*
Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>();

        string.add("Camisa");
        string.add("Boné");
        string.add("Blusa");
        string.add("Meia");
        string.add("Tênis");

        for(String item: string){
            System.out.println(item);
        }
    }
}
