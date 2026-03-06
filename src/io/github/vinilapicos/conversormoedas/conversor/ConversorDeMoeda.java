package io.github.vinilapicos.conversormoedas.conversor;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoeda {
    private double resultadoConversao;
    private String valorFormatado;
    private String primeiraMoeda;
    private String segundaMoeda;

    public void setValorFormatado(String valorFormatado) {
        this.valorFormatado = valorFormatado.replace("," , ".");
    }

    public String getValorFormatado() {
        return valorFormatado;
    }

    public void setResultadoConversao(String primeiraMoeda, String segundaMoeda) throws IOException, InterruptedException {
        this.primeiraMoeda = primeiraMoeda;
        this.segundaMoeda = segundaMoeda;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/ef7d39f14e68672fcbf9feff/pair/"+primeiraMoeda+"/"+segundaMoeda+"/"+valorFormatado))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        JsonElement elemento = JsonParser.parseString(response.body());
        JsonObject objectRoot = elemento.getAsJsonObject();
        this.resultadoConversao = objectRoot.get("conversion_result").getAsDouble();
    }

    public double getResultadoConversao() {
        return resultadoConversao;
    }

    public String getPrimeiraMoeda() {
        return primeiraMoeda;
    }

    public String getSegundaMoeda() {
        return segundaMoeda;
    }
}