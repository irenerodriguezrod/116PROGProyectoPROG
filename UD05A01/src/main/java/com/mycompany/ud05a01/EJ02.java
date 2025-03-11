/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license | Aqui se puede mostrar un mensaje por defecto 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ud05a01;

import java.util.Scanner;
/**
 *
 * @author irene.rodrod.2
 */


// 2. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado 5 números enteros,
// los almacene en un vector y a continuación calcule la media de los elementos del vector y la muestre por pantalla.
public class EJ02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int[] vector;
        vector = new int[5];
        
        System.out.println("Introduzca 5 números enteros para calcular la media: ");
        for (int i=0; i<vector.length;i++) {
            vector[i] = teclado.nextInt();
        }
    }
    
    public static double calcularMedia (int[] vector) { //es double porque tiene que coincidir con el tipo de dato que se devuelve
        double media;
        int contador, acumulador;
        
        contador=0;
        acumulador=0;
        
        for (int i=0;i<vector.length;i++) {
            contador++;
            acumulador=acumulador+vector[i];
        }
        
        media = acumulador/contador;
        
        return media;
    }
}