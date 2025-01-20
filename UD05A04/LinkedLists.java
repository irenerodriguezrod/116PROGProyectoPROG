/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arraylists;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LinkedLists {
static Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         LinkedList<Integer> lista=(LinkedList<Integer>) llenarEnteros();
        int opcion;
        int num;
         do {
            System.out.println("1- Añadir un entero solicitado por teclado.");
            System.out.println("2- Mostrar el contenido por pantalla.");
            System.out.println("3- Solicitar un entero por teclado e insertarlo en la primera" +
"posición.");
            System.out.println("4- Solicitar un entero por teclado e insertarlo en la última" +
"posición.");
            System.out.println("5- Mostrar el contenido en orden inverso.");
            System.out.println("6-Mostrar los elementos primero y último.");
            System.out.println("7- Eliminar los elementos primero y último.");
            System.out.println("8- Solicitar un entero por teclado y elimine la primera" +
"aparición del número introducido.");
            System.out.println("9- Solicitar un entero por teclado y eliminar la última" +
"aparición del número introducido.");
            System.out.println("10- Ordenar los elementos y mostrarlos por pantalla.");
            System.out.println("11- Invertir el orden de los elementos y mostrarlos por" +
"pantalla.");
            System.out.println("12- Mostrar por pantalla cuántas veces aparece cada número.");
            System.out.println("13- Eliminar todos los elementos.");
            System.out.println("0-Salir");
            System.out.print("Introduce opción :");
            opcion = teclado.nextInt();
            teclado.nextLine();// hay que ponerlo para que deje escribir entre linea y linea
            if(opcion==1){
               /*num=leerEntero(0,10);
                 if(lista.add(num)){
                     System.out.println("Elmento añadido a la lista.");
                 }else{
                     System.out.println("No se ha podido añadir el elmento a la lista.");
                 }*/
            }else{
                if(!lista.isEmpty()){
                 switch (opcion) {
                case 2 -> {
                    System.out.println("Esta es la lista en el estado acutal :"+lista);
                }
                case 3 -> {
                    System.out.println("Esta es la lista en el estado acutal :"+lista);
                    num=leerEntero(0,10);
                    lista.add(0, num);
                   System.out.println("Nueva lista :"+lista);
                }
                case 4 -> {
                    System.out.println("Esta es la lista en el estado acutal :"+lista);
                    num=leerEntero(0,10);
                    lista.add(num);
                    System.out.println("Nueva lista :"+lista);
                    //Tambien se puede hacer lista.addLast(num);
                    }
                case 5 -> {
                    System.out.println("Esta es la lista en el estado acutal :"+lista);
                    System.out.println(lista.reversed());
                    System.out.println("Nueva lista :"+lista);
                }
                case 6 -> {
                    System.out.println("Esta es la lista en el estado acutal :"+lista);
                    System.out.println("Este es el primer elemento de la lista: "+lista.getFirst());
                   System.out.println("Este es el ultimo elemento de la lista: "+lista.getLast());
                }
                case 7 -> {
                    System.out.println("Esta es la lista en el estado acutal :"+lista);
                    lista.removeFirst();
                  lista.removeLast();
                   System.out.println("Nueva lista :"+lista);
                }
                case 8 -> {
                    System.out.println("Esta es la lista en el estado acutal :"+lista);
                  System.out.println("Introduza un entero");
                  Integer  num2=teclado.nextInt();
                  if(lista.removeFirstOccurrence(num2)){
                      System.out.println("elemeto eliminado");
                  }else{
                  System.out.println("no existe el elemento");
                  }
                  System.out.println("Nueva lista :"+lista);
                }
                case 9 -> {
                /* System.out.println("Introduza un entero");
                  Integer  num2=teclado.nextInt();
                  lista.removeLastOccurrence(num2);*/
                System.out.println("Esta es la lista en el estado acutal :"+lista);
                  System.out.println("Introduza un entero");
                  Integer  num2=teclado.nextInt();
                  if(lista.removeLastOccurrence(num2)){
                      System.out.println("elemeto eliminado");
                  }else{
                  System.out.println("no existe el elemento");
                  }
                  System.out.println("Nueva lista :"+lista);
                }
                case 10 ->{
                    System.out.println("Esta es la lista en el estado acutal :"+lista);
                    Collections.sort(lista);
                    System.out.println("Lista ordenada :"+lista);
                   /* lista.sort(null);*/
                }
                case 11->{
                  /*Collections.reverse(lista);// esto le da la vuelta*/
                  System.out.println("Esta es la lista en el estado acutal :"+lista);
                 Collections.sort(lista,Comparator.reverseOrder());// este ordena y da la vuelta
                  System.out.println("Nueva lista :"+lista);
                }
                case 12-> {
                   System.out.println("Esta es la lista en el estado acutal :"+lista); 
                  /*  int[] frequencias=new int[11];
                    Arrays.fill(frecuencias, -1);*/
                    //como hacer entre 2 numeros?????????????
                  /*  for (Integer elemento:lista){
                   printf("El elemento %d aparece %d veces\n ", Collections.frequency(lista, elemento));
                    }
                    Esta forma tiene un problema, y es que repite las frases el numero de veces que este el elemento*/
                   int max=Collections.max(lista);
                   int min=Collections.min(lista);
                   int i;
                   for(i=min;i<=max;i++){
                       System.out.printf("El elemento %d aparece %d veces\n ",i, Collections.frequency(lista, i));
                   }
                }
                case 13-> {
                   System.out.println("Esta es la lista en el estado acutal :"+lista); 
                  lista.clear();
                    System.out.println("Nueva lista :"+lista);
                }
                case 0 -> {  
                }
                default -> { 
                }
               }
                }else{
                    System.out.println("La lista está vacía");
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
    private static List<Integer> llenarEnteros(){
            LinkedList<Integer> lista=new LinkedList<Integer>();
              lista.add(1);
              lista.add(8);
              lista.add(6);
              lista.add(5);
              lista.add(6);
              lista.add(8);
              lista.add(2);
            return lista;
        }
}