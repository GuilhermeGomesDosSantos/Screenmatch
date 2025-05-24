package Pratica.CalculadoraSalaRetangular;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculo = new CalculadoraSalaRetangular();

        calculo.setAltura(6);
        calculo.setLargura(4);
        System.out.println(calculo.calcularArea());
        System.out.println(calculo.calcularPerimetro());
    }
}
