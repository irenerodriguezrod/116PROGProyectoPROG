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
public class EJ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] vector = new String[5];
        String nombreABuscar;
        int posicion;

        // Rellenar el vector con nombres
        System.out.println("Introduzca 5 nombres:");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Nombre %d: ", i + 1);
            vector[i] = teclado.nextLine();
        }

        // Solicitar el nombre a buscar
        System.out.print("Introduzca el nombre a buscar: ");
        nombreABuscar = teclado.nextLine();

        // Buscar el nombre en el vector
        posicion = busquedaSecuencial(vector, nombreABuscar);

        // Mostrar el resultado
        if (posicion != -1) {
            System.out.printf("Encontrado en la posición %d\n", posicion + 1);
        } else {
            System.out.println("NO ENCONTRADO");
        }
    }

    // Método de búsqueda secuencial
    public static int busquedaSecuencial(String[] v, String n) {
        for (int i = 0; i < v.length; i++) {
            if (v[i].equalsIgnoreCase(n)) { // Ignorar mayúsculas/minúsculas
                return i;
            }
        }
        return -1; // Devuelve -1 si no encuentra el elemento
    }
}
