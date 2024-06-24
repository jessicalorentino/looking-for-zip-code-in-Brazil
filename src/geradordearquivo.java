import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class geradordearquivo {
    public void salvaJson(endereco endereco) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter escrita = new FileWriter(endereco.cep() + ".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();

    }

}
