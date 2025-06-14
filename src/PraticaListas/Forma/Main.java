package PraticaListas.Forma;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setArea(5);

        Quadrado quadrado = new Quadrado();
        quadrado.setArea(4);

        ArrayList<Forma> listFormas = new ArrayList<>();
        listFormas.add(circulo);
        listFormas.add(quadrado);

        for(Forma form:listFormas){
            System.out.println("Área" + form.calcularArea());
        }
    }
}
