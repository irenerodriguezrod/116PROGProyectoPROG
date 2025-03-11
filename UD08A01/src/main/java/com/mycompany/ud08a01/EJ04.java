package com.mycompany.ud08a01;

import java.io.IOException;
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
 * Escribe un programa en Java que reciba como argumento el nombre de un
 * directorio y muestre por pantalla el contenido del mismo.
 */
public class EJ04 {

    public static void main(String[] args) throws IOException{
        Path path;
        
        try {
            path= Paths.get(args[0]);
            DirectoryStream<Path> directorio =  Files. newDirectoryStream(path);
            for (Path p: directorio){
                System.out.println(p);
            }
        }catch (NoSuchFileException ex){
        System.out.println("No existe el archivo");
        }catch (NotDirectoryException ex){
        System.out.println("No existe el directorio ");
        }
    }
}

