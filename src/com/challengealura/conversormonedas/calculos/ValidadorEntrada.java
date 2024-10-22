package com.challengealura.conversormonedas.calculos;

import java.util.Scanner;

public class ValidadorEntrada {
    // Metodo para validar entradas enteras
    public static int validarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Error: Eso no es una opcion correcta. Inténtalo de nuevo.");
            sc.next(); // Descartar la entrada incorrecta
        }
        return sc.nextInt();
    }

    // Metodo para validar entradas decimales
    public static double validarDecimal(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Eso no es un número decimal. Inténtalo de nuevo.");
            sc.next(); // Descartar la entrada incorrecta
        }
        return sc.nextDouble();
    }

}
