package Pratica.ConversorTemperatura;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.setTemperatura(25);
        System.out.println("Celsius para Fahrenheit " + conversor.celsiusParaFahrenheit());
        conversor.setTemperatura(77);
        System.out.println("Fahrenheit para Celsius " + conversor.fahrenheitParaCelsius());
    }
}
