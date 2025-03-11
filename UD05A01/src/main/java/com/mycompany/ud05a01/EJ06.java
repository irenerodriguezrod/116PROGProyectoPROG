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
public class EJ06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Array para almacenar las frecuencias
        int[] vectorFrecuencias = new int[11];
        int nota;

        // Solicitar calificaciones al usuario
        System.out.print("Introduzca una calificación (0-10). Cualquier otro número para salir: ");
        nota = teclado.nextInt();

        while (nota >= 0 && nota <= 10) {
            vectorFrecuencias[nota]++;
            System.out.print("Introduzca una calificación (0-10). Cualquier otro número para salir: ");
            nota = teclado.nextInt();
        }

        // Mostrar las frecuencias
        System.out.println("Frecuencia de calificaciones:");
        for (int i = 0; i < vectorFrecuencias.length; i++) {
            System.out.printf("Calificación %d: %d veces\n", i, vectorFrecuencias[i]);
        }
    }
}
