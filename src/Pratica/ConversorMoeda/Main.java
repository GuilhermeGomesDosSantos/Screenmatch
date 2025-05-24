package Pratica.ConversorMoeda;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda= new ConversorMoeda();

        conversorMoeda.solicitaValor();
        System.out.println(conversorMoeda.converterDolarParaReal());
    }
}
