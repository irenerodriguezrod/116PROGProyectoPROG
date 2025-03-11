package com.mycompany.ud08a01;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Irene RODRIGUEZ RODRÍGUEZ
 *
 * Escribe un programa en Java que reciba como argumento el nombre de un archivo
 * o directorio y lo borre. Si el archivo o directorio no existe mostrará un
 * mensaje de error por pantalla. Si se trata de un directorio y no está vacío
 * mostrará un mensaje de error por pantalla.
 */
public class EJ03 {

    public static void main(String[] args) throws IOException {

        try {
            Path path = Paths.get(args[0]);
            Files.delete(path);
            System.out.println("BORRADO");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("No se han introducido argumentos");
        } catch (NoSuchFileException ex) {
            System.out.println("No existe el archivo o directorio");
        } catch (DirectoryNotEmptyException ex) {
            System.out.println("El directorio no esta vacio");
        }
    }

    /*try {
            if (args.length > 0) {
                Path path = Paths.get(args[0]);

                //comprobar que exista
                if (Files.exists(path)) {
                    try {
                        Files.delete(path);
                        System.out.println("Archivo o directorio eliminado: " + path.getFileName());
                    } catch (IOException ex) {
                        System.out.println("No ha podido eliminarse el archivo");
                    }
                } else {
                    System.out.println("El archivo o directorio no se ha eliminado");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("No se han introducido argumentos");
        } catch (NoSuchFileException ex) {
            System.out.println("No existe el archivo o directorio");
        } catch (DirectoryNotEmptyException ex){
            System.out.println("El directorio no esta vacio");
        }*/
}
