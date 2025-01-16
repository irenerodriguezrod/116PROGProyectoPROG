/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ud04a02;

/**
 *
 * @author irene.rodrod.2
 */
import java.util.Scanner;

public class UD04A02 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion; // sirve para las diferentes opciones que hay
        String cadena1, cadena2; //para solicitar cadenas de texto
        int entero; // se usa en el case 2
        boolean sufijo, prefijo; // se usa en el case 3
        int buscar;
        
        do {
            System.out.println("1. Mostrar el sistema operativo, el usuario, el directorio home del usuario y la versión del JRE.");
            System.out.println("2. Mostrar la mayor de dos cadenas.");
            System.out.println("3. Comprobar prefijo y sufijo.");
            System.out.println("4. Buscar una cadena dentro de otra.");
            System.out.println("0. Salir");
            
            System.out.print("Introduzca opcion: ");
            opcion=teclado.nextInt();
            teclado.nextLine();
            switch(opcion) {
                case 1 -> {
                    System.out.println(System.getProperty("os.name")); // muestra la versión del SO
                    System.out.println(System.getProperty("user.name")); //muestra el nombre de usuario
                    System.out.println(System.getProperty("user.home")); //muestra el directorio home del usuario
                    System.out.println(System.getProperty("java.version")); //muestra la versión del JRE
                }
                
                case 2 -> {
                    System.out.println("Introduzca cadena 1: ");
                    cadena1 = teclado.nextLine();
                    System.out.println("Introduzca cadena 2: ");
                    cadena2 = teclado.nextLine();
                    
                    //se ignora si es mayuscula o minuscula, si solo se quiere compara se utiliza compareTo
                    entero = cadena1.compareToIgnoreCase(cadena2);
                    
                    if (entero<0) { //se muestra primero la cadena 1 si es mayor y después la 2
                        System.out.println(cadena1);
                        System.out.println(cadena2);
                    } else {
                        System.out.println(cadena2);
                        System.out.println(cadena1);
                    }
                }
                
                case 3 -> {
                    System.out.println("Introduzca cadena 1: ");
                    cadena1 = teclado.nextLine();
                    System.out.println("Introduzca cadena 2: ");
                    cadena2 = teclado.nextLine();
                    
                    sufijo = cadena1.startsWith(cadena2);
                    prefijo = cadena1.endsWith(cadena2);
                    
                    if (sufijo && prefijo) { // significa que es True
                        System.out.println("Es sufijo y prefijo");
                    } else {
                        if (sufijo) {
                            System.out.println("Es sufijo");
                        } else {
                            if (prefijo) {
                                System.out.println("Es prefijo");
                            } else {
                                System.out.println("No es ni prefijo ni sufijo");
                            }
                        }
                    }
                }
                
                case 4 -> {
                    System.out.println("Introduzca cadena 1: ");
                    cadena1 = teclado.nextLine();
                    System.out.println("Introduzca cadena 2: ");
                    cadena2 = teclado.nextLine();
                    
                    buscar = cadena2.indexOf(cadena1);
                    
                    if (buscar<0) {
                        System.out.println("");
                    } else {
                        
                    }
                    
                }
                
                case 0 -> {
                    System.out.println("Bye.");
                } 
                default -> {
                    System.out.println("Error en la entrada.");
                }
            }
        } while (opcion!=0);
    }
}
