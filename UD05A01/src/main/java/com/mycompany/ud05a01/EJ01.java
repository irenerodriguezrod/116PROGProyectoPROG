/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license | Aqui se puede mostrar un mensaje por defecto 
 */

package com.mycompany.ud05a01;


import java.util.Scanner;
/**
 *
 * @author irene.rodrod.2
 */

// 1. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado 5 números enteros,
// los almacene en un vector y a continuación calcule la cantidad de elementos negativos del vector y la muestre por pantalla.
public class EJ01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int[] vector;
        vector = new int[5]; // define los 5 número que pueden entrar en el vector, en este caso 5
        
        System.out.println("Introduce 5 número enteros: ");
        for(int i=0;i<vector.length;i++) {
            vector[i]=teclado.nextInt(); //Se lee el vector
        }
        
        System.out.print(contarNegativos (vector));
        
    }
    
    public static int contarNegativos (int[] vector) {
        int contadorNegativos; 
        
        contadorNegativos = 0; // se inicializa el contador
        for(int i=0;i<vector.length;i++) {
            if (vector[i]<0) {
                contadorNegativos++; // se suma uno si se encuentra 
            }
        }
        return contadorNegativos; // error si no se pone
    }
}
