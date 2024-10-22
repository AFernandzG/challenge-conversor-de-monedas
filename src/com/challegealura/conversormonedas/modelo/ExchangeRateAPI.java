package com.challegealura.conversormonedas.modelo;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Clase base para manejar la API
public class ExchangeRateAPI {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/c1427241653a2593f647a53f/latest/USD";

    public static JsonObject getExchangeRates() throws IOException, InterruptedException {
        /* Metodo para obtener las tasas de cambio desde la API*/
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(API_URL))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return JsonParser.parseString(response.body()).getAsJsonObject();
    }

}
