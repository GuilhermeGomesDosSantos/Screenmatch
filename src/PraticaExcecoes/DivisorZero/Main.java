package PraticaExcecoes.DivisorZero;

/*
Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        try {
            System.out.println("Informe um número para ser dividido:");
            var n1 = leitura.nextInt();

            System.out.println("Informe um número que será o divisor de '" + n1 + "'");
            var n2 = leitura.nextInt();

            var resultado = n1 / n2;

        System.out.println("A divisão de '" + n1 + "' por '" + n2 + "' é: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Não é possível dividir usando zero\nErro: " + e.getMessage());
        }
    }
}