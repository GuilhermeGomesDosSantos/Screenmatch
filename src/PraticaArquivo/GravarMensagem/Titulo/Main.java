package PraticaArquivo.GravarMensagem.Titulo;
/*
Defina uma classe chamada Titulo com os atributos necessários.
Em seguida, crie um programa que instancia um objeto Titulo,
serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
*/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Titulo titulo = new Titulo(123321, "Titulo 1");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);

        System.out.println(json);
    }
}
