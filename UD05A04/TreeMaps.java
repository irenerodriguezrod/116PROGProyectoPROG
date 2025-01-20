/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arraylists;


import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class TreeMaps {

    static Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hay que definir 2 parametros, la clave y el valor.
        //Si se pone int para defiir
       TreeMap<String, String> mapaColor = new TreeMap<>();
        int opcion;
        do {
            System.out.println("1- Solicitar código y nombre de color e insertarlo en el mapa");
            System.out.println("2- Mostrar el contenido por pantalla.");
            System.out.println("3- Mostrar el primero y el último códigos.");
            System.out.println("4- Mostrar la primera pareja clave/valor.");
            System.out.println("5- Mostrar todas los colores con sus correspondientes códigos.");
            System.out.println("6- Eliminar todos los elementos.");
            System.out.println("0-Salir");
            System.out.print("Introduce opción :");
            opcion = teclado.nextInt();
            teclado.nextLine();// hay que ponerlo para que deje escribir entre linea y linea
            if (opcion ==1){
               /*System.out.println("Introduzca el codigo :");
               clave=teclado.nextLine();
               System.out.println("Introduzca el color :");
               color=teclado.nextLine();
               mapaColor.putIfAbsent(clave, color);*/
               mapaColor=(TreeMap<String, String>) llenarMapa();
               
            }else{
                if(!mapaColor.isEmpty()){
                    switch (opcion) {
                
                case 2 -> {
                    System.out.println("Estos son los elementos del mapa :  " + mapaColor); 
                }
                case 3 -> {
                    System.out.println("Este es el primer codigo : " + mapaColor.firstKey());
                    System.out.println("Este es el ultimo codigo : " + mapaColor.lastKey());
                }
                case 4 -> {
                   /* System.out.println("Esta es la primera pareja de elementos : "+mapaColor.firstEntry());*/
                    /* Correccion de Ambrosio*/
                Entry<String,String> entrada=mapaColor.firstEntry();
                System.out.printf("Clave=%s\n",entrada.getKey());
                    System.out.printf("Valor=%s\n",entrada.getValue());
                    }
                case 5 -> {
                    // Para poner ver clave con cada valor
                    for(Map.Entry<String,String> elemento:mapaColor.entrySet()){
                        System.out.println("Clave: "+elemento.getKey());
                        System.out.println("Valor: "+elemento.getValue());
                    }
                    }
                case 0 -> {  
                }
                default -> {
                    
                }
                    }
                }else {
                    System.out.println("El mapa está vacío");
                }
            }
            
            
                
            

            
        } while (opcion != 0);
                
                
        
    }
    //metodo para rellenar el mapa.
    private static Map<String, String> llenarMapa() {
    return new TreeMap<>(Map.of(
        "#000000", "NEGRO",
        "#FFFFFF", "BLANCO",
        "#FF0000", "ROJO",
        "#00FF00", "VERDE",
        "#0000FF", "AZUL"
    ));
    }
    
}
