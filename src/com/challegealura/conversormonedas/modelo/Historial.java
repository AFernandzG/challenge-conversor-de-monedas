package com.challegealura.conversormonedas.modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Clase para manejar el historial de consultas
public class Historial {
    private List<String> consultas = new ArrayList<>();

    // Metodo para agregar una consulta al historial
    public void agregarConsulta(String consulta) {
        consultas.add(consulta);
    }

    // Metodo para guardar el historial en un archivo JSON
    public void guardarHistorial() {
        try (FileWriter writer = new FileWriter("historial.json")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            writer.write(gson.toJson(consultas));
//            new Gson().toJson(consultas, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar el historial: " + e.getMessage());
        }
    }
}
