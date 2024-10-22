package com.challegealura.conversormonedas.modelo;

import com.google.gson.JsonObject;

import java.io.IOException;

// Clase para representar y manejar la conversión de monedas
public class Conversor {
    private JsonObject exchangeRates;
    private Historial historial = new Historial();
    private String lastUpdateTime;

    // Constructor que obtiene las tasas de cambio al iniciar
    public Conversor() throws IOException, InterruptedException {
        this.exchangeRates = ExchangeRateAPI.getExchangeRates();
        this.lastUpdateTime = exchangeRates.get("time_last_update_utc").getAsString().substring(0,17);
    }
    // Metodo para obtener la última fecha de actualización
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    // Metodo para realizar la conversión de moneda
    public void convertirMoneda(String fromCurrency, String toCurrency, double cantidad) {
        if (!exchangeRates.has("conversion_rates")) {
            System.out.println("Error: No se pudieron obtener las tasas de cambio.");
            return;
        }

        JsonObject rates = exchangeRates.getAsJsonObject("conversion_rates");
        if (!rates.has(toCurrency)) {
            System.out.println("Error: No se encontró la tasa de cambio para " + toCurrency);
            return;
        }

        double fromRate = rates.get(fromCurrency).getAsDouble();
        double toRate = rates.get(toCurrency).getAsDouble();
        double rate = toRate/fromRate; //rates.get(fromCurrency).getAsDouble();
        double resultado = cantidad * rate;

        String consulta = String.format("%,.2f %s corresponden a %,.2f %s", cantidad, fromCurrency, resultado, toCurrency);
        System.out.println("\n-------------------------");
//        System.out.println(fromCurrency + ": " + rate + " | " + toCurrency + ": " + toRate );
        System.out.println(consulta);

        historial.agregarConsulta(consulta);
    }

    // Metodo para guardar el historial de consultas
    public void guardarHistorial() {
        historial.guardarHistorial();
    }

}
