import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RecuperaMoeda {
    public Conversao buscaMoeda (String moeda, Double valor){

        URI endereco =URI.create("https://v6.exchangerate-api.com/v6" +
                "/64e781d158dc00d270bc069f/pair/BRL/" + moeda + '/' + valor);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response;

        try {
            response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível encontrar a cotação desejada.");
        }

        return new Gson().fromJson(response.body(), Conversao.class);
    }

}
