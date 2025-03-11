/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// 5. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que permita llenar una matriz de tres filas y dos
// columnas con números enteros solicitados por teclado. A continuación
// generará un vector que contendrá la media de cada una de las filas.
// Para finalizar mostrará por pantalla el vector generado.


package com.mycompany.ud05a02;

import java.util.Scanner;

/**
 *
 * @author holas
 */


public class EJ05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declarar la matriz de 3 filas y 2 columnas
        int[][] matriz = new int[3][2];
        double[] vectorMedia = new double[3]; // Vector con la media de cada fila

        // Solicitar los valores de la matriz
        System.out.println("Introduce los números enteros para llenar la matriz:");
        for (int i = 0; i < matriz.length; i++) { // filas
            for (int j = 0; j < matriz[i].length; j++) { // columnas
                System.out.printf("Introduce elemento para la posición [%d][%d]: ", i, j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Calcular la media de cada fila y guardarla en el vector
        for (int i = 0; i < matriz.length; i++) { // filas
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) { // columnas
                suma += matriz[i][j]; // Sumar los elementos de la fila
            }
            vectorMedia[i] = (double) suma / matriz[i].length; // Calcular la media
        }

        // Mostrar el vector con las medias
        System.out.println("Medias de las filas:");
        for (int i = 0; i < vectorMedia.length; i++) {
            System.out.printf("Media de la fila %d: %.2f%n", i, vectorMedia[i]);
        }
    }
}
