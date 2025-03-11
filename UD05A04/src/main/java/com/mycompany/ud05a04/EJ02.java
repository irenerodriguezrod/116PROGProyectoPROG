package com.mycompany.ud05a04;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<>();
        int opcion;
        
        do {
            // Menú de opciones
            System.out.println("Menú de Opciones:");
            System.out.println("1. Añadir un entero solicitado por teclado.");
            System.out.println("2. Mostrar el contenido por pantalla");
            System.out.println("3. Solicitar un entero por teclado e insertarlo en la primera posición");
            System.out.println("4. Solicitar un entero por teclado e insertarlo en la última posición");
            System.out.println("5. Mostrar el contenido en orden inverso");
            System.out.println("6. Mostrar los elementos primero y último");
            System.out.println("7. Eliminar los elementos primero y último");
            System.out.println("8. Solicitar un entero por teclado y elimine la primera aparición del número introducido.");
            System.out.println("9. Solicitar un entero por teclado y eliminar la última aparición del número introducido.");
            System.out.println("10. Ordenar los elementos y mostrarlos por pantalla.");
            System.out.println("11. Invertir el orden de los elementos y mostrarlos por pantalla.");
            System.out.println("12. Mostrar por pantalla cuántas veces aparece cada número.");
            System.out.println("13. Eliminar todos los elementos.");
        
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1 -> {
                    
                }
                
                case 2 -> {
                    
                }
                
                case 3 -> {
                    
                }
                
                case 4 -> {
                    
                }
                
                case 5 -> {
                    
                }
                
                case 6 -> {
                    
                }
                
                case 7 -> {
                    
                }
                
                case 8 -> {
                    
                }
                
                case 9 -> {
                    
                }
                
                case 10 -> {
                    
                }
                
                case 11 -> {
                    
                }
                
                case 12 -> {
                    int min=Collections.min(lista);
                    int max=Collections.max(lista);
                    for(int i=min;i<=max;i++){
                        System.out.printf("El elemento %d aparece %d veces\n",i,Collections.frequency(lista, i));
                    }
                }
                
                case 13 -> { // Eliminar todos los elementos
                    lista.clear();
                }
            }
            
        } while (opcion!=0);
    }
    
}
