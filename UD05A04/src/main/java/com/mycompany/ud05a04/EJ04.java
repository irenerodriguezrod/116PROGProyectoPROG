/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license | Aqui se puede mostrar un mensaje por defecto 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ud05a04;

import java.util.Scanner;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do {
            // Menú de opciones
            System.out.println("Menú de Opciones:");
            System.out.println("1. Añadir un entero solicitado por teclado.");
            System.out.println("2. Mostrar el contenido por pantalla.");
            System.out.println("3. Mostrar el numero de elementos.");
            System.out.println("4. Mostrar los elementos primero y último.");
            System.out.println("5. Solicitar un entero por tecladoy nos diga si se encuentra o no en el TreeSet.");
            System.out.println("6. Solicitar un entero por teclado y lo borre");
            System.out.println("7. Eliminar todos los elementos.");
        
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1 -> {
                    
                }
                
                case 2 -> {
                    
                }
                
                case 3 -> {
                    System.out.println(conjunto.size());
                }
                
                case 4 -> {
                    System.out.println(conjunto.first());
                    System.out.println(conjunto.last());
                }
                
                case 5 -> {
                    if (conjunto.contains(n)){}
                }
                
                case 6 -> {
                    n = Utilidades.leerEntero(0,10);
                    conjunto.remove();
                }
                
                case 7 -> {
                    conjunto.clear();
                }
            }
        
        } while (opcion!=0);
    } 
}

