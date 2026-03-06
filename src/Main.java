import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a primeira moeda:");
        var primeiraMoeda = leitura.nextLine();
        System.out.println("Digite a segunda moeda");
        var segundaMoeda = leitura.nextLine();
        System.out.println("Digite o valor a ser convertido:");
        var valor = leitura.nextLine();


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/ef7d39f14e68672fcbf9feff/pair/"+primeiraMoeda+"/"+segundaMoeda+"/"+valor))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        JsonElement elemento = JsonParser.parseString(response.body());
        JsonObject objectRoot = elemento.getAsJsonObject();
        System.out.println(objectRoot.get("conversion_result").getAsDouble());
    }
}