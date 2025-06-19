package PraticaAPI.API_CoinGecko;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/*
Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta
à API CoinGecko e exiba a cotação atual de uma criptomoeda escolhida pelo usuário.
*/
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma criptomoeda");
        var cripto = leitura.nextLine();

        var endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + cripto + "&vs_currencies=brl&include_market_cap=true&include_24hr_change=true&include_last_updated_at=true";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
