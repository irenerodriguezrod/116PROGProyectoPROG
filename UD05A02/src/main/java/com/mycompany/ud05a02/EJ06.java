// 6. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que permita llenar una matriz de dos filas y tres
// columnas con números enteros solicitados por teclado. A continuación
// generará un vector que contendrá la media de cada una de las columnas.
// Para finalizar mostrará por pantalla el vector generado.

package com.mycompany.ud05a02;

import java.util.Scanner;

/**
 *
 * @author holas
 */
public class EJ06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declarar la matriz de 2 filas y 3 columnas
        int[][] matriz = new int[2][3];
        double[] vectorMedia = new double[3]; // Vector con la media de cada columna

        // Solicitar los valores de la matriz
        System.out.println("Introduce los números enteros para llenar la matriz:");
        for (int i = 0; i < matriz.length; i++) { // filas
            for (int j = 0; j < matriz[i].length; j++) { // columnas
                System.out.printf("Introduce elemento para la posición [%d][%d]: ", i, j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Calcular la media de cada columna y guardarla en el vector
        for (int j = 0; j < matriz[0].length; j++) { // columnas
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) { // filas
                suma += matriz[i][j]; // Sumar los elementos de la columna
            }
            vectorMedia[j] = (double) suma / matriz.length; // Calcular la media
        }

        // Mostrar el vector con las medias
        System.out.println("Medias de las columnas:");
        for (int j = 0; j < vectorMedia.length; j++) {
            System.out.printf("Media de la columna %d: %.2f%n", j, vectorMedia[j]);
        }
    }
}
