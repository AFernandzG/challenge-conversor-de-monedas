package com.challengealura.conversormonedas.principal;

import com.challegealura.conversormonedas.modelo.Conversor;
import com.challengealura.conversormonedas.calculos.ValidadorEntrada;

import java.io.IOException;
import java.util.Scanner;

// Clase principal que contiene el menú y el bucle de la aplicación
public class ConversorDeMoneda {
        public static void main(String[] args) {
        try {
            Conversor conversor = new Conversor();
            Scanner sc = new Scanner(System.in);
            boolean continuar = true;

            System.out.println("\n¡Bienvenido al Conversor de Moneda!");
            System.out.println("Última fecha de actualización: " + conversor.getLastUpdateTime());
            System.out.println("Dólar estadounidense = USD");

            while (continuar) {
                // Mostrar el menú de opciones
                System.out.println("\n*****************************");
                System.out.println("Seleccione una opción de conversión:");
                System.out.println("1. USD a ARS (Pesos Argentinos)");
                System.out.println("2. USD a EUR (Euros)");
                System.out.println("3. USD a MXN (Pesos Mexicanos)");
                System.out.println("4. BRL (Reales Brasileños) a USD");
                System.out.println("5. GBP (Libras Esterlinas) a USD");
                System.out.println("6. JPY (Yen Japonés) a USD");
                System.out.println("0. Salir");

                int opcion = ValidadorEntrada.validarEntero(sc);
                sc.nextLine(); // Limpiar buffer

                if (opcion == 0) {
                    continuar = false;
                    continue;
                }

                // Solicitar el valor a convertir
                System.out.print("Ingrese el valor que desea convertir: ");
                double cantidad = ValidadorEntrada.validarDecimal(sc);
                sc.nextLine(); // Limpiar buffer

                // Realizar la conversión según la opción seleccionada
                switch (opcion) {
                    case 1:
                        conversor.convertirMoneda("USD", "ARS", cantidad);
                        break;
                    case 2:
                        conversor.convertirMoneda("USD", "EUR", cantidad);
                        break;
                    case 3:
                        conversor.convertirMoneda("USD", "MXN", cantidad);
                        break;
                    case 4:
                        conversor.convertirMoneda("BRL", "USD", cantidad);
                        break;
                    case 5:
                        conversor.convertirMoneda("GBP", "USD", cantidad);
                        break;
                    case 6:
                        conversor.convertirMoneda("JPY", "USD", cantidad);
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }

            // Guardar el historial de consultas al salir
            conversor.guardarHistorial();
            System.out.println("¡Gracias por usar el Conversor de Moneda!");

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al obtener las tasas de cambio: " + e.getMessage());
        }
    }
}
