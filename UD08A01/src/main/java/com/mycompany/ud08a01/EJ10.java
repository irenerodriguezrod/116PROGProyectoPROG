package com.mycompany.ud08a01;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author irene.rodrod.2
 *
 * Escribe un programa en Java que reciba como argumentos los nombres de tres
 * archivos de texto (entrada1.txt, entrada2.txt y salida.txt). El programa
 * creará el archivo salida.txt que deberá contener al archivo entrada1.txt
 * seguido del archivo entrada2.txt.
 */
public class EJ10 {

    public static void main(String[] args) {
        Path pathEntrada, pathSalida;
        String linea;
        if (args.length == 3) {
            pathSalida = Paths.get(args[2]);
            try (BufferedReader entrada = Files.newBufferedReader(pathSalida, StandardOpenOption.APPEND)) {
                for (int i = 0; i < 2; i++) {
                    pathEntrada = Paths.get(args[i]);
                }try (BufferedReader entrada = Files.newBufferedReader(pathEntrada)) {

                } catch (NoSuchFileException ex) {
                    System.out.printf("Archivo %s no existe\n", args[i]);
                }
            }
        }
    }
}
