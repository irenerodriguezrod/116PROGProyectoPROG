/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ud05a01;

import java.util.Scanner;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[5];

        // Solicitar los 5 números
        System.out.println("Introduzca 5 números enteros:");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Número %d: ", i + 1);
            vector[i] = teclado.nextInt();
        }

        // Verificar si el vector está ordenado en forma descendente
        if (estaOrdenadoDescendente(vector)) {
            System.out.println("VECTOR ORDENADO");
        } else {
            System.out.println("VECTOR NO ORDENADO");
        }
    }

    // Método para comprobar si el vector está ordenado de forma descendente
    public static boolean estaOrdenadoDescendente(int[] v) {
        for (int i = 1; i < v.length; i++) {
            if (v[i - 1] < v[i]) {
                return false; // No está ordenado
            }
        }
        return true; // Está ordenado
    }
}
