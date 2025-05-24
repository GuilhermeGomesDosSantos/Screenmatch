package Pratica.Tabuada;

import Pratica.Tabuada.Tabuada;

import java.util.Scanner;

/*
Crie uma classe TabuadaMultiplicacao que implementa uma interface
Tabuada com o método mostrarTabuada() para exibir a tabuada de um número.
A classe deve receber o número como parâmetro.
 */
public class TabuadaMultiplicacao implements Tabuada {
    Scanner leitura = new Scanner(System.in);
    private int numero;

    public void solicita(){
        System.out.println("Informe um numero para ser multiplicado: ");
        numero = leitura.nextInt();
    }
    @Override
    public void mostrarTabuada() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " X " + numero + " = " + i * numero);
        };
    }
}
