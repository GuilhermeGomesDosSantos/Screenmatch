package PraticaAPI.API_Google_Books;
/*
Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à API do Google Books.
Solicite ao usuário que insira o título de um livro, e exiba as informações disponíveis sobre o livro retornado pela API.
*/


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um Título de um livro");
        var buscaLivro = leitura.nextLine();

        var endereco = "https://www.googleapis.com/books/v1/volumes?q=" + buscaLivro;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
