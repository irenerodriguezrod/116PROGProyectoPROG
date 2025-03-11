package com.mycompany.ud05a04;

import java.util.Scanner;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("Menú de Opciones:");
            System.out.println("1. Añadir un entero solicitado por teclado.");
            System.out.println("2. Mostrar el contenido por pantalla");
            System.out.println("3. Mostrar el numero de elementos.");
            System.out.println("4. Solicitar un entero por teclado y nos diga si se encuentra o no en el HashSet");
            System.out.println("5. Solicitar un entero por teclado y que lo borre");
            System.out.println("6. Eliminar todos los elementos.");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {

                }

                case 2 -> {

                }

                case 3 -> {

                }

                case 4 -> {

                }

                case 5 -> {

                }

                case 6 -> {

                }

            }
        }while (opcion != 0);
    }
}
