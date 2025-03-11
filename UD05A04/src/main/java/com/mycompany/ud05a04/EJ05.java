package com.mycompany.ud05a04;

import java.util.TreeMap;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ05 {

    public static void main(String[] args) {
        TreeMap<String,String> mapa= (treeMap) llenarMapa();
        
        do {
            // Menú de opciones
            System.out.println("Menú de Opciones:");
            System.out.println("1. Añadir un entero solicitado por teclado.");
            System.out.println("2. Mostrar el contenido por pantalla.");
            System.out.println("3. Mostrar el numero de elementos.");
            System.out.println("4. Mostrar los elementos primero y último.");
            System.out.println("5. Solicitar un entero por tecladoy nos diga si se encuentra o no en el TreeSet.");
            System.out.println("6. Solicitar un entero por teclado y lo borre");
            System.out.println("7. Eliminar todos los elementos.");

            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 1) {
                System.out.print("Introduzca código color: ");
                String codigoColor = teclado.nextLine();
                String color;

            } else {
                if (!mapa.isEmpty) {
                    switch (opcion) {
                        case 2 -> {
                            System.out.println(mapa);
                        }

                        case 3 -> {
                            System.out.println(mapa.size());
                        }

                        case 4 -> {
                            System.out.print("Introduzca código color: ");
                            codigoColor = teclado.nextLine();
                            if (mapa.containsKey(codigoColor)) {

                            }
                        }

                        case 5 -> {
                            System.out.print("Introduzca código color: ");
                            codigoColor = teclado.nextLine();
                            if (mapa.containsValue(codigoColor)) {

                            }
                        }

                        case 6 -> {
                            System.out.print("Introduzca código color: ");
                            codigoColor = teclado.nextLine();
                            nombreColor = mapa.get(codigoColor);
                            if (nombreColor != null) {
                                System.out.print(codigoColor);
                            } else {
                            }
                        }

                        case 7 -> {
                            conjunto.clear();
                        }
                    }

                }
            }
        } while (opcion != 0);
    }
}
