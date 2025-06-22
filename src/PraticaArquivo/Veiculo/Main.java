package PraticaArquivo.Veiculo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
Defina uma classe chamada Veiculo com os atributos necessários.
Em seguida, crie um programa que instancia um objeto Veiculo,
serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
*/
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("BMW", "320i", "2023", "Preto", "4", "ABC-1234");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String veiculoJson = gson.toJson(veiculo);

        System.out.println(veiculoJson);

    }
}
