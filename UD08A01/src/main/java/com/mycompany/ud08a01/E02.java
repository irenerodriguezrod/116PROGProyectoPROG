package com.mycompany.ud08a01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Irene RODRIGUEZ RODRIGUEZ
 *
 * Escribe un programa en Java que reciba como argumento el nombre de un archivo
 * y realice una copia del mismo. El nombre del nuevo archivo será el del
 * archivo de origen con el sufijo “-copia”. Ejemplo: archivo.txt
 * archivo-copia.txt Si el origen no existe o el destino ya existe, mostrará un
 * mensaje de error por pantalla.
 */
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class E02 {

    public static void main(String[] args) throws IOException {
        Path pathOrigen, pathDestino;
        String nombre, extension;
        int posicion;

        try {
            pathOrigen = Paths.get(args[0]);
            if (Files.exists(pathOrigen)) {
                System.out.println("EXISTE");
                if (!Files.isDirectory(pathOrigen)) {
                    posicion = args[0].lastIndexOf(".");
                    if (posicion != 1) {
                        nombre = args[0].substring(0, posicion);
                        extension = args[0].substring(posicion);
                        pathDestino = Paths.get(nombre + "-copia" + extension);
                        // en caso de que el destino ya exista
                        try {
                            Files.copy(pathOrigen, pathDestino);
                        } catch (FileAlreadyExistsException ex) {
                            System.out.println("El archivo de destino ya existe");
                        }
                    }
                }
            } else {
                System.out.println("NO existe");
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("No se han introducido argumentos");
        } catch (NoSuchFileException ex) {
            System.out.println("No existe el archivo");
        }

        // Verificar si el archivo de origen existe
        /*if (Files.exists(sourcePath)) {
            // Crear el nombre del archivo de copia
            String archivoOriginal = sourcePath.getFileName().toString();
            String archivoCopia = archivoOriginal.substring(0, archivoOriginal.lastIndexOf(".")) + "-copia"
                    + archivoOriginal.substring(archivoOriginal.lastIndexOf("."));
            Path copyPath = sourcePath.resolveSibling(archivoCopia);

            // Verificar si el archivo destino ya existe
            if (Files.exists(copyPath)) {
                System.out.println("Error: el archivo de destino ya existe.");
            } else {
                // Realizar la copia del archivo
                Files.copy(sourcePath, copyPath);
                System.out.println("Archivo copiado con éxito: " + copyPath);
            }
        } else {
            System.out.println("Error: el archivo de origen no existe.");
        }*/
    }
}
