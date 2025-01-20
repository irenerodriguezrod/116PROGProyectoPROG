package com.mycompany.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author veronique.gru
 */
public class ArrayLists {
 static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
         
        List<Integer> lista=llenarEnteros();
        int opcion;
        int num;
        int posicion;
         do {
            System.out.println("1- Añadir un entero solicitado por teclado.");
            System.out.println("2- Mostrar el contenido por pantalla.");
            System.out.println("3- Solicitar una posición por teclado y mostrar por pantalla el entero que ocupa dicha posición");
            System.out.println("4- Mostrar el contenido por pantalla en orden inverso.");
            System.out.println("5- Mostrar por pantalla el numero de elementos que tiene la arraylist.");
            System.out.println("6- Mostrar por pantalla la media de los números contenidos. .");
            System.out.println("7- Solicitar una posición por teclado y cambiar el entero que ocupe dicha posición por 0.");
            System.out.println("8- Solicitar un entero por teclado y nos diga si se encuentra o no en el ArrayList.");
            System.out.println("9- Solicitar un entero por teclado y nos muestra la posición en la que está.");
            System.out.println("10- Solicitar un entero por teclado y lo elimina del ArrayList");
            System.out.println("11- Solicitar una posición por teclado e insertar el número 0 en dicha posición.");
            System.out.println("12- Ordenar los elementos y mostrarlos por pantalla.");
            System.out.println("13- Ordenar los elementos en orden inverso y mostrarlos por pantalla.");
            System.out.println("14- Mostrar el mayor y el menor de los elementos.");
            System.out.println("15- Rotar los elementos una posicion a la derecha");
            System.out.println("16- Intercambiar el primer elemento con el ultimo.");
            System.out.println("17- Eliminar todos los elmentos.");
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
               //SubMetodo hecho para rellenar solo
            }else{
                if(!lista.isEmpty()){
                switch (opcion) {
                case 2 -> {
                    System.out.println("Estos son los elementos de la lista: "+lista);
                }
                case 3 -> {
                    System.out.println("Lista en el estado actual: "+lista);
                    System.out.println("Introduzca la posición :");
                    posicion = teclado.nextInt();
                    System.out.printf("En la posición %d está el numero %d.\n",posicion,lista.get(posicion));
                }
                case 4 -> {
                    System.out.println("Lista en el estado actual: "+lista);
                    System.out.println("Está es la lista en orden inverso: "+lista.reversed());  // esto solo es para mostratralo. no deja la lista en esta posición.
                    /*ListIterator<Integer> iterator=lista.listIterator(lista.size());
                    while(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }*/
}
                case 5 -> {
                    System.out.println("Lista en el estado actual: "+lista);
                    System.out.printf("Hay %d elementos en la arraylist.\n",lista.size());
                }
                case 6 -> {
                    System.out.println("Lista en el estado actual: "+lista);
                    float suma;
                    suma=0;
                    for (Integer elemento:lista){
                        suma=suma+elemento;
                    }
                    System.out.printf("La media de los elementos es : %f\n",(suma/lista.size()));
                }
                case 7 -> {
                    System.out.println("Lista en el estado actual: "+lista);
                   System.out.println("Introduzca la posición del elemento :");
                    posicion = teclado.nextInt();
                    if(posicion>=0 && posicion<lista.size()){
                        lista.set(posicion, 0);
                        System.out.printf("Elemento de la posicion %d : %d\n",posicion,lista.get(posicion));
                        System.out.println("La nueva lista es está : "+lista);
                    }else{
                    System.out.println("No hay elementos en esta posición.");
                    }    
                }
                case 8 -> {
                    System.out.println("Lista en el estado actual: "+lista);
                   num=leerEntero(0,10);
                        if(lista.contains(num)){
                            System.out.println("El elemento está en la lista");
                        }else{
                            System.out.println("El elmento no está en la lista");
                        }
                    
                }
                case 9 -> {
                    System.out.println("Lista en el estado actual: "+lista);
                    num=leerEntero(0,10);
                    for(int i=0;i<lista.size();i++){
                        if(lista.get(i)==num){
                            System.out.printf("el numero %d se encuentra en el posición %d.\n",num,i);
                        }else{
                            System.out.print("");
                        }
                   
                    }
                    /*System.out.println("Lista en el estado actual: "+lista);
                    num=leerEntero(0,10);
                    posicion=lista.indexOf(num);
                        if(posicion!=-1){
                            System.out.println("Se encuentra en la position: "+posicion);
                        }else{
                            System.out.println("El elmento no se encuentra en la lista.");
                        }/*
                /*    
                   num=leerEntero(0,10);
                    posicion=lista.indexOf(num);
                    for (Integer elemento:lista){
                        if(posicion!=-1){
                            System.out.println(posicion);
                        }
                    }
                  */
                }
                case 10 ->{
                    System.out.println("Lista en el estado actual: "+lista);
                    num=leerEntero(0,10);
                        if(lista.remove(Integer.valueOf(num))){
                            System.out.println("Elemento eliminado");
                            System.out.println(lista);
                        }else{
                            System.out.println("No se ha podido eliminar el elemento");
                        }
                      //si quieres que se eliminen todos los elementos que sean iguales. hay que hacer un bucle
                }
                case 11->{
                  /*posicion=leerEntero(0,10);
                  lista.set(posicion, 0);*/
                    System.out.println("Lista en el estado actual : "+lista);
                System.out.println("Introduzca la posición del elemento :");
                    posicion = teclado.nextInt();
                    if(posicion>=0 && posicion<lista.size()){
                        lista.add(posicion, 0);
                        System.out.println(lista);
                }else{
                        System.out.println("error");
                    }
                    //siempre hacer la comprobación
                      /*  lista.get(posicion).equals(0);
                        System.out.printf("Elemento de la posicion %d : %d",posicion,lista.get(posicion));*/
                }
                case 12-> {
                    // se utiliza null para el orden ascendente. Para el orden descendente 
                   //se utilizará comparator,.reverseOrder();
                   System.out.println("Lista en el estado actual : "+lista);
                  lista.sort(null);
                  /*lista.forEach(System.out::println);*/
                 /*Collections.sort(lista);
                  lista.forEach(System.out::println);*/
                    System.out.println("Lista despues de la ordenación: "+lista);
                }
                case 13-> {
                    // se utiliza null para el orden ascendente. Para el orden descendente 
                   //se utilizará comparator.reverseOrder();
                   System.out.println("Lista en el estado actual : "+lista);
                   lista.sort(Comparator.reverseOrder());
                    System.out.println("Esta es la lista en orden inverso"+lista);
                    
                   /* lista.forEach(System.out::println);*/
                   
                   /* SE puede hacer eso
                   Collections.sort(lista, Comparator.reverseOrder());*/
                }
                case 14-> {
                    System.out.println("Lista en el estado actual : "+lista);
                 System.out.printf("El elemento mayor es %d y el elemento menor es %d.\n",Collections.max(lista),Collections.min(lista));
                }
                case 15-> {
                   /*Collectiions.rotate :Rotates the elements in the specified list by the specified distance. After 
                    calling this method, the element at index i will be the element previously at index (i - distance) 
                    mod list.size(), for all values of i between 0 and list.size()-1, inclusive.
                    Para rotar a la derecha 1 y a la izquierda -1*/
                   System.out.println("Lista en el estado actual : "+lista);
                   Collections.rotate(lista, 1);
                    System.out.println("La lista con los elementos rotados  una posición a la derecha: "+lista);
                }
                case 16-> {
                   /*Collection.swap:Swaps the elements at the specified positions in the specified list. */
                   //Collections.swap(lista, lista.getFirst(), lista.getLast()); o
                   System.out.println("Lista en el estado actual : "+lista);
                   Collections.swap(lista, 0, lista.size()-1);
                    System.out.println("Esta es la lista despues de intercambiar el primer elemento con el ultimo: "+lista);
                }
                case 17-> {
                    System.out.println("Lista en el estado actual : "+lista);
                    lista.clear();
                    System.out.println(lista);
                }
                case 0 -> {
                    System.out.println("BYE.");
                }
                default -> {
                }
               }
                }else {
                       System.out.println("La lista está vacía.");
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
            List<Integer> lista=new ArrayList<Integer>();
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

