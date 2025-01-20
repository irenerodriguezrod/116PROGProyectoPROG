/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arraylists;


import java.util.Scanner;
import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class ListaHashset {
static Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashSet<Integer> listah=llenarNumeros();
        int opcion;
        Integer num;
        int posicion;
         do {
            System.out.println("1- Añadir un entero solicitado por teclado.");
            System.out.println("2- Mostrar el contenido por pantalla.");
            System.out.println("3- Mostrar el número de elementos.");
            System.out.println("4- Solicitar un entero por teclado y nos diga si se encuentra" +
"o no en el HashSet.");
            System.out.println("5- Solicitar un entero por teclado y lo borre.");
            System.out.println("6- Eliminar todos los elementos.");
            System.out.println("0-Salir");
            System.out.print("Introduce opción :");
            opcion = teclado.nextInt();
            teclado.nextLine();// hay que ponerlo para que deje escribir entre linea y linea
           if(opcion==1){
               /*num=leerEntero(0,10);
                 if(listah.add(num)){
                     System.out.println("Elmento añadido a la lista.");
                 }else{
                     System.out.println("No se ha podido añadir el elmento a la lista.");
                 }*/
               //Para rellenar la lista sin tener que meter los numeros uno a uno.
               //Esta hecho el submetodo.
               
           }else{
               if(!listah.isEmpty()){
                switch (opcion) {
                
                case 2 -> {
                   System.out.println(listah);
                    }
                case 3 -> {
                    System.out.println(listah.size());
                }
                case 4 -> {
                     num=leerEntero(0,10);
                     if(listah.contains(num)){
                         System.out.println("El elemento está en la lista");
                        }else{
                            System.out.println("El elmento no está en la lista");
                     }
                     
                    }
                case 5 -> {
                   num=leerEntero(0,10);
                   if(listah.remove(num)){
                       System.out.println("El elemento está eliminado");
                   }
                  
                   listah.remove(num);
                   System.out.println(listah);
                  
                }
                case 6 -> {
                   listah.clear();
                   System.out.println(listah);
                }
               
                
                case 0 -> {
                    System.out.println("Bye.");
                }
                default -> {
                    
                }
               }
               }else{
                   System.out.println("La lista esta vacía. Debe introducir datos.");
               }
           }
               
            

            
        } while (opcion != 0);
                
                
        
    }
    private static int leerEntero(int limiteinf, int limitesup){
            int num;
            System.out.printf("Introduza un entero entre %d y %d\n : ",limiteinf, limitesup);
            num=teclado.nextInt();
            while(num<limiteinf || num>limitesup){
                System.out.println("Error en entrada");
                System.out.printf("Introduza un entero entre %d y %d",limiteinf, limitesup);
                num=teclado.nextInt();
            }
            return num;
        }
    private static HashSet<Integer> llenarNumeros() {
        HashSet<Integer> listah = new HashSet<>();
        listah.add(1);
        listah.add(4);
        listah.add(7);
        listah.add(8);
        listah.add(9);
        listah.add(3);
        listah.add(5);
        
        
    return listah;
    }
}
