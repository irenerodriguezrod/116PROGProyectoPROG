package com.mycompany.ud08a01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author irene.rodrod.2
 *
 * Escribe un programa en Java que reciba como argumento el nombre de un archivo
 * de texto y muestre por pantalla la siguiente información: número de líneas,
 * número de palabras y número de caracteres.
 */
public class EJ05 {

    public static void main(String[] args) throws IOException {
        Path path;
        String linea;
        int contadorLineas, contadorPalabras, contadorCaracteres;
        String[] palabras;

        if (args.length > 0) {
            path = Paths.get(args[0]);
            try (BufferedReader entrada = Files.newBufferedReader(Paths.get(args[0]))) {
                contadorLineas = 0;
                contadorPalabras = 0;
                contadorCaracteres = 0;

                linea = entrada.readLine();
                while (linea != null) {
                    contadorLineas++;
                    palabras=linea.split(" ");
                    contadorPalabras+=palabras.length;
                    
                    //para no contar los espacios en blanco
                    for(String palabra: palabras){
                        contadorCaracteres+=palabra.length();
                    }
                    linea = entrada.readLine();
                }
                System.out.printf("Lineas: %d\n", contadorLineas);
                System.out.printf("Palabras: %d\n", contadorPalabras);
                System.out.printf("Caracteres: %d\n", contadorCaracteres);

            } catch (NoSuchFileException ex) {
                System.out.println("No existe el archivo");
            } catch (AccessDeniedException ex){
                System.out.println("No se tiene acceso al archivo");
            }
        }

    }

}
