package com.mycompany.ud08a01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author irene.rodrod.2
 *
 * Escribe un programa en Java que reciba como argumentos un entero positivo n y
 * el nombre de un archivo de texto y muestre por pantalla las n primeras líneas
 * del archivo de texto.
 */
public class EJ06 {

    public static void main(String[] args) throws IOException {
        Path path;
        String linea, nombreArchivo;
        int n;
        int contadorLineas;

        if (args.length == 2) {
            n = Integer.parseInt(args[0]);
            nombreArchivo = args[1];
            path = Paths.get(nombreArchivo);
            try (BufferedReader entrada = Files.newBufferedReader(path)) {
                contadorLineas = 0;

                linea = entrada.readLine();
                while (linea != null && contadorLineas <= n) {
                    contadorLineas++;
                    linea = entrada.readLine();
                    System.out.printf("Lineas: %d\n", contadorLineas);
                }

            } catch (NoSuchFileException ex) {
                System.out.println("No existe el archivo");
            } catch (AccessDeniedException | NumberFormatException ex) {
                System.out.println("No se tiene acceso al archivo");
            }
        } else {
            System.out.println("Formato incorrecto");
        }
    }
}
