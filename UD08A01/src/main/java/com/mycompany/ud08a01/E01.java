package com.mycompany.ud08a01;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Irene RODRIGUEZ RODRIGUEZ
 *
 * Escribe un programa en Java que reciba como argumento el nombre de un archivo
 * o directorio y muestre por pantalla la siguiente información: si existe y si
 * se trata de un archivo o de un directorio.
 *
 */
public class E01 {

    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                // Se refiere a la primera posicion, el primer argumento que le añadimos
                Path path = Paths.get(args[0]);

                // verificar si el archivo o directorio existe
                if (Files.exists(path)) {
                    // Si existe, verificar el tipo(si es un directorio o un archivo)
                    if (Files.isDirectory(path)) {
                        System.out.println("Es un directorio");
                        //Si se comprueba que es un archivo (es decir, si es true). Significa que es un archivo
                    } else {
                        System.out.println("Es un archivo");
                    }
                    /*
                esto equivale a escribir sólo el ELSE anterior
                
                else if (Files.isRegularFile(path)==true) {
                    System.out.println("Es un archivo");
                }
                     */
                } else {
                    System.out.println("El archivo o directorio no existe");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("No se han introducido argumentos");
        }

        /*
        
        Sin hacer comprobaciones
        
    public static void main(String[] args) {
        //se puede hacer un IF o un TRY - CATCH
        if (args.length > 0) {
            Path path = Paths.get(args[0]);
            System.out.println(Files.exists(path)); //comprueba si existe
            if (Files.isDirectory(path)) {
                System.out.println("Es un directorio");
            } else {
                System.out.println("Es un archivo");
            }
            //System.out.println(Files.isDirectory(path)); //comprueba si es un directorio
        } 

    }*/
    }
}
