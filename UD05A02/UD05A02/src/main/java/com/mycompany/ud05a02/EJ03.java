/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// 3. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que permita llenar una matriz de dos filas y tres
// columnas con números reales solicitados por teclado. A continuación
// solicitará un número real (n) y deberá buscarlo en la matriz. Para
// finalizar mostrará por pantalla si lo ha encontrado o no. En caso afirmativo también deberá mostrar la posición.

package com.mycompany.ud05a02;

import java.util.Scanner;

/**
 *
 * @author holas
 */
public class EJ03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declarar la matriz y variables
        double[][] matriz = new double[2][3];
        double n;
        boolean encontrado = false;
        int posicionFila = -1, posicionColumna = -1;

        // Introducir datos de la matriz
        System.out.println("Introduce los números reales para llenar la matriz:");
        for (int i = 0; i < matriz.length; i++) { // filas
            for (int j = 0; j < matriz[i].length; j++) { // columnas
                System.out.printf("Introduce elemento para la posición [%d][%d]: ", i, j);
                matriz[i][j] = teclado.nextDouble();
            }
        }

        // Solicitar el número a buscar
        System.out.print("Introduzca un número real para buscarlo en la matriz: ");
        n = teclado.nextDouble();

        // Buscar el número en la matriz
        for (int i = 0; i < matriz.length; i++) { // filas
            for (int j = 0; j < matriz[i].length; j++) { // columnas
                if (matriz[i][j] == n) {
                    encontrado = true;
                    posicionFila = i;
                    posicionColumna = j;
                    break; // Salir del bucle interior
                }
            }
            if (encontrado) break; // Salir del bucle exterior si ya se encontró
        }

        // Mostrar resultados
        if (encontrado) {
            System.out.printf("Número encontrado en la posición [%d][%d].\n", posicionFila, posicionColumna);
        } else {
            System.out.println("Número no encontrado en la matriz.");
        }
    }
}
