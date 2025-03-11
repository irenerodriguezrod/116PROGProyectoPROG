package com.mycompany.ud08a01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author irene.rodrod.2
 *
 * Escribe un programa en Java que reciba como argumentos una palabra y uno o
 * más nombres de archivos de texto y muestre por pantalla, por cada archivo, su
 * nombre, y para cada línea que contenga la palabra pasada como argumento, el
 * número de línea y el contenido de la misma.
 */
public class EJ07 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        Path path;
        String linea, nombreArchivo, palabraABuscar;

        if (args.length >= 2) {
            palabraABuscar = args[0];
            for (int i = 1; i > args.length; i++) {
                nombreArchivo = args[1];
                System.out.println(nombreArchivo);
                path = Paths.get(nombreArchivo);
                try (BufferedReader entrada = Files.newBufferedReader(path)) {
                    linea = entrada.readLine();
                    while (linea != null) {
                        if (linea.contains(palabraABuscar)) {
                            System.out.printf("ds\n", linea);

                        }
                        linea = teclado.nextLine();
                    }
                } catch (NoSuchFileException ex) {
                    System.out.println("No existe el archivo");
                } catch (AccessDeniedException | NumberFormatException ex) {
                    System.out.println("No se tiene acceso al archivo");
                }
            }
        } else {
            System.out.println("Formato incorrecto");
        }

    }
}
