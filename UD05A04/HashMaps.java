/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arraylists;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class HashMaps {

    static Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hay que definir 2 parametros, la clave y el valor.
        //Si se pone int para defiir
       HashMap<String, String> mapaColor = llenarMapa();
        int opcion;
       
        String codigo, color;
         do {
            System.out.println("1- Solicitar código y nombre de color e insertarlo en el mapa.");
            System.out.println("2- Mostrar el contenido por pantalla.");
            System.out.println("3- Mostrar el número de colores almacenados.");
            System.out.println("4- Solicitar un código por teclado y mostrar si existe o no.");
            System.out.println("5- Solicitar un nombre por teclado y mostrar si existe o no.");
            System.out.println("6- Solicitar un códigor por teclado y mostrar el nombre.");
            System.out.println("7- Eliminar todos los elementos");
            System.out.println("0-Salir");
            System.out.print("Introduce opción :");
            opcion = teclado.nextInt();
            teclado.nextLine();// hay que ponerlo para que deje escribir entre linea y linea
            if(opcion==1){
                /*System.out.println("Introduzca el codigo :");
                    codigo=teclado.nextLine();
                    
                    System.out.println("Introduzca el color :");
                    color=teclado.nextLine();*/
                    /*mapaColor.put(codigo, color); //Si no existe la clave lo crea y si existe cambia el valor*/
               /* mapaColor.putIfAbsent(codigo, color);*/
               // se rellena el mapa con el submetodo
            }else{
                if(!mapaColor.isEmpty()){
                switch (opcion) {
                case 2 -> {
                    System.out.println("Este es el mapa de color: "+mapaColor);
                    //Collections.
                }
                case 3 -> {
                    System.out.println("Este es el mapa de color en el estado actual :"+mapaColor);
                    System.out.printf("En el mapa hay %d colores\n",mapaColor.size());
                }
                case 4 -> {
                    System.out.println("Este es el mapa de color en el estado actual :"+mapaColor);
                    System.out.println("Introduzca el codigo :");
                    codigo=teclado.nextLine();
                    if(mapaColor.containsKey(codigo)){
                        System.out.println("El código es parte del mapa");
                    }else {
                        System.out.println("El código no es parte del mapa");
                    }
                    }
                case 5 -> {
                    System.out.println("Este es el mapa de color en el estado actual :"+mapaColor);
                   System.out.println("Introduzca el color :");
                    color=teclado.nextLine();
                    if(mapaColor.containsValue(color)){
                        System.out.println("El código es parte del mapa");
                    }else {
                        System.out.println("El código no es parte del mapa");
                    }
                }
                case 6 -> {
                   System.out.println("Este es el mapa de color en el estado actual :"+mapaColor);
                   System.out.println("Introduzca el codigo :");
                    codigo=teclado.nextLine();
                    color=mapaColor.get(codigo);
                    if(color!=null){
                        System.out.println(color);
                    }else{
                        System.out.println("ese color no existe");
                    }
                }
               case 7 -> {
                   mapaColor.clear();
                   System.out.println(mapaColor);
                }
                
                case 0 -> {
                   
                }
                default -> {
                    
                }
               }
                
                }else{
                    System.out.println("El mapa no tiene elementos.");
                }
            }
                
            

            
        } while (opcion != 0);
                
                
        
    }
   private static HashMap<String, String> llenarMapa() {
    return new HashMap<>(Map.of(
        "#000000", "NEGRO",
        "#FFFFFF", "BLANCO",
        "#FF0000", "ROJO",
        "#00FF00", "VERDE",
        "#0000FF", "AZUL"
    ));
    } 
    
    
}