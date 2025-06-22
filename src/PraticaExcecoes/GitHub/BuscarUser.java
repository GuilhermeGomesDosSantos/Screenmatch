package PraticaExcecoes.GitHub;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarUser {
    private String user;
    private String endereço;

    public BuscarUser(String user) throws ErroConsultaGitHubException, IOException, InterruptedException {
        this.user = user;
        this.endereço = "https://api.github.com/users/" + this.user;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(this.endereço)).build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 404){
            throw new ErroConsultaGitHubException("O usuário '" + this.user + "' não foi encontrado");
        }
            var jsonResponse = response.body();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            RecordUser recordUser = gson.fromJson((String) jsonResponse, RecordUser.class);

        System.out.println(recordUser);
    }
}
