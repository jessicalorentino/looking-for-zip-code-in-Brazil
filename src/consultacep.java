import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultacep {
    public endereco buscaendereco(String cep) throws IOException, InterruptedException {
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try{
            HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), endereco.class);

        }catch(Exception e){
            throw new RuntimeException("Não consegui obter o endereço a partir desse cep");
        }



    }
}
