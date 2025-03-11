// 4. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que permita llenar una matriz de tres filas y dos
// columnas con números enteros solicitados por teclado. Para finalizar
//mostrará por pantalla la matriz y la matriz traspuesta (cambia las
// filas por columnas).

package com.mycompany.ud05a02;

import java.util.Scanner;

/**
 *
 * @author holas
 */
public class EJ04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declarar la matriz
        int[][] matriz = new int[3][2];

        // Introducir datos de la matriz
        System.out.println("Introduce los números enteros para llenar la matriz:");
        for (int i = 0; i < matriz.length; i++) { // filas
            for (int j = 0; j < matriz[i].length; j++) { // columnas
                System.out.printf("Introduce elemento para la posición [%d][%d]: ", i, j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) { // filas
            for (int j = 0; j < matriz[i].length; j++) { // columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }

        // Mostrar la matriz traspuesta
        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < matriz[0].length; i++) { // columnas de la original
            for (int j = 0; j < matriz.length; j++) { // filas de la original
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}