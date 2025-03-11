//1. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que permita llenar una matriz de tres filas y dos
// columnas con números enteros solicitados por teclado. A continuación comprobará si la matriz es positiva (todos los elementos son mayores o
// iguales a cero) y mostrará por pantalla uno de los siguientes mensajes: “MATRIZ POSITIVA” o “MATRIZ NO POSITIVA”
package com.mycompany.ud05a02;

import java.util.Scanner;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declarar la matriz de 3 filas y 2 columnas
        int[][] matriz = new int[3][2];

        // Solicitar los valores de la matriz
        System.out.println("Introduce los números enteros para llenar la matriz:");
        for (int i = 0; i < matriz.length; i++) { // Filas
            for (int j = 0; j < matriz[i].length; j++) { // Columnas
                System.out.printf("Introduce entero para la posición [%d][%d]: ", i, j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Mostrar los valores introducidos
        System.out.println("Números introducidos:");
        for (int i = 0; i < matriz.length; i++) { // Recorrer filas
            for (int j = 0; j < matriz[i].length; j++) { // Recorrer columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }

        // Comprobar si la matriz es positiva
        if (esMatrizPositiva(matriz)) {
            System.out.println("MATRIZ POSITIVA");
        } else {
            System.out.println("MATRIZ NO POSITIVA");
        }
    }


    // Método para comprobar si una matriz es positiva
    public static boolean esMatrizPositiva(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // Recorrer filas
            for (int j = 0; j < matriz[i].length; j++) { // Recorrer columnas
                if (matriz[i][j] < 0) { // Comprobar si el elemento es negativo
                    return false;
                }
            }
        }
        return true; // Si no hay elementos negativos, la matriz es positiva
    }
}
