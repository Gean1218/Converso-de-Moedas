package br.com.atividades.converso.requisão;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    private final String responseBody;

    public API() throws IOException, InterruptedException {
        URI dados = URI.create("https://v6.exchangerate-api.com/v6/f42ab303dbd70660045ebb50/latest/USD");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(dados)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //Guarda a resposta
        this.responseBody= response.body();
    }
    //Método para acessa o corpo
    public String getResponseBody(){
        return responseBody;
    }
}
