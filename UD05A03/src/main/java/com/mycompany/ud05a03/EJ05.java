// 5. Escribe un programa en Java que solicite por teclado 10 números enteros y los almacene en un vector. 
// A continuación solicitará un entero y deberá buscarlo en el vector utilizando búsqueda binaria. Para finalizar mostrará por pantalla
// si lo ha encontrado o no. En caso afirmativo también deberá mostrar la posición.


package com.mycompany.ud05a03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ05 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector;
        int n; // Numero que se solicita para buscarlo
        int encontrado; //sirve xa saber si lo ha encontrado
        
        vector = new int[10]; //Definir el tamaño del vector
        
        //Solicitar los números por teclado
        System.out.println("Introduce 10 número enteros: ");
        for(int i=0;i<vector.length;i++) {
            vector[i]=teclado.nextInt(); //Se lee el vector
        }
        
        // Solicitar numero entero a buscar
        System.out.println("Introduzca un numero a buscar: ");
        n=teclado.nextInt();
        
        // Buscar el numero en el vector
        encontrado= Arrays.binarySearch(vector, n);
        
        // Resultado de la búsqueda
        if (encontrado>=0) { //Si se encuentra se dice la posicion en la que se ha encontrado
            System.out.print(n);
        } else {
            System.out.println("No se ha encontrado");
        }
        
    }
    
}
