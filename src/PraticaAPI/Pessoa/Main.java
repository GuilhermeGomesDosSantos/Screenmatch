package PraticaAPI.Pessoa;
/*
Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade.
Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON representando uma pessoa em um objeto do tipo Pessoa.
Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos estiverem ausentes ou se houver
campos adicionais não representados no objeto Pessoa.
Consulte a documentação da biblioteca Gson para flexibilizar a conversão.
 */


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";
        Gson gson = new GsonBuilder().setLenient().create();

        Pessoa p = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println("Convertendo JSON\n" + p);

    }
}
