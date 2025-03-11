// 2. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que permita llenar una matriz de dos filas y tres
// columnas con números enteros solicitados por teclado. Para finalizar
// mostrará por pantalla la media de los elementos, el elemento menor y
// a posición que ocupa.

package com.mycompany.ud05a02;

import java.util.Scanner;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declarar la matriz de 2 filas y 3 columnas
        int[][] matriz = new int[2][3];

        // Declarar e inicializar variables
        int i, j, suma = 0, contador = 0, menor = Integer.MAX_VALUE;
        int posicionFila = -1, posicionColumna = -1;
        double media; //se pone double delante para que pueda dar decimales 

        // Solicitar los valores de la matriz
        System.out.println("Introduce los números enteros para llenar la matriz:");
        for (i = 0; i < matriz.length; i++) { // filas
            for (j = 0; j < matriz[i].length; j++) { // columnas
                System.out.printf("Introduce entero para la posición [%d][%d]: ", i, j);
                matriz[i][j] = teclado.nextInt();

                // Actualizar suma y contador
                suma += matriz[i][j];
                contador++;

                // Buscar el menor elemento y su posición
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    posicionFila = i;
                    posicionColumna = j;
                }
            }
        }

        // Calcular la media
        media = suma / contador;  

        // Mostrar los resultados
        System.out.println("Resultados:");
        System.out.printf("La media de los números introducidos es: %.2f\n", media);
        System.out.printf("El elemento menor es: %d y se encuentra en la posición [%d][%d]\n",
                menor, posicionFila, posicionColumna);
    }
}
