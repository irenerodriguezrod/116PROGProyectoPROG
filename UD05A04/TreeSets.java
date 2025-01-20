/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arraylists;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class TreeSets {

   static Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TreeSet<Integer> listat=llenarNumeros();
        int opcion;
        Integer num;
         do {
            System.out.println("1- Añadir un entero solicitado por teclado.");
            System.out.println("2- Mostrar el contenido por pantalla.");
            System.out.println("3- Mostrar el número de elementos.");
            System.out.println("4- Mostrar los elementos primero y último..");
            System.out.println("5- Solicitar un entero por teclado y nos diga si se encuentra " +
"o no en el TreeSet.");
            System.out.println("6- Solicitar un entero por teclado y lo borre.");
            System.out.println("7- Eliminar todos los elementos");
            System.out.println("0-Salir");
            System.out.print("Introduce opción :");
            opcion = teclado.nextInt();
            teclado.nextLine();// hay que ponerlo para que deje escribir entre linea y linea
            if(opcion==1){
               /* num=leerEntero(0,10);
                  listat.add(num);*/
            }else{
                if(!listat.isEmpty()){
                switch (opcion) {
                case 2 -> {
                    System.out.println("Estos son los elementos de la lista: "+listat);
                }
                case 3 -> {
                    System.out.println("Esta es la lista en el estado actual: "+listat);
                    System.out.printf("La lista está compuesta de %d elementos.\n",listat.size());
                }
                case 4 -> {
                    System.out.println("Esta es la lista en el estado actual: "+listat);
                    System.out.printf("este es el primer elemento de la lista : %d\n",listat.getFirst());
                    System.out.printf("este es el ultimo elemento de la lista : %d\n",listat.getLast())  ;
                    }
                case 5 -> {
                    System.out.println("Esta es la lista en el estado actual: "+listat);
                   num=leerEntero(0,10);
                   if(listat.contains(num)){
                       System.out.println("El elemento está en el TreeSet");
                   }else{
                        System.out.println("El elemento no está en el TreeSet");
                   }
                }
                case 6 -> {
                    System.out.println("Esta es la lista en el estado actual: "+listat);
                   num=leerEntero(0,10);
                   listat.remove(num);
                    System.out.println(listat);
                }
               case 7 -> {
                  System.out.println("Esta es la lista en el estado actual: "+listat);
                   listat.clear();
                   System.out.println(listat);
                }
                case 0 -> {
                }
                default -> { 
                }
               }
                }else{
                    System.out.println("La lista no tiene elementos.");
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
    private static TreeSet<Integer> llenarNumeros() {
        TreeSet<Integer> listah = new TreeSet<>();
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
