package Pratica.ConversorMoeda;

import java.util.Scanner;

/*
Crie uma classe ConversorMoeda que implementa uma interface
ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais.
A classe deve receber o valor em dólar como parâmetro.
 */
public class ConversorMoeda implements ConversaoFinanceira{

    private double valor;

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    Scanner leitura = new Scanner(System.in);

    public void solicitaValor(){
        System.out.println("Digite o valor em dolar que você qur converter para real: ");
        valor = leitura.nextDouble();
    }
    @Override
    public double converterDolarParaReal() {
        return (double) valor / 5.65;
    }



}
