import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura =  new Scanner(System.in);
        consultacep consultacep = new consultacep();

        System.out.println("digite o cep: ");
        var cep = leitura.nextLine();
        try{
            endereco novoendereco = consultacep.buscaendereco(cep);
            System.out.println(novoendereco);
            geradordearquivo gerador = new geradordearquivo();
            gerador.salvaJson(novoendereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("finalizando aplicação.");
        }

    }
}
