import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Converter {

    public Rates buscaRate(String valor){
        URI rate = URI.create("https://v6.exchangerate-api.com/v6/e574a21549cc833c2a070eec/latest/USD");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(rate)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Rates.class);
        } catch (Exception e){
            throw new RuntimeException("Falha ao obter as taxas de câmbio. Código de resposta: \" + responseCode");
        }
    }
}
