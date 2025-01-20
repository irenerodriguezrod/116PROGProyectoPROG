import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EJ01 {

    public static void main(String[] args) {
        // Declaramos el ArrayList para almacenar enteros
        ArrayList<Integer> lista = new ArrayList<>();

        // Scanner para leer datos del usuario
        Scanner teclado = new java.util.Scanner(System.in);

        int opcion; // Variable para almacenar la opción del menú

        do {
            // Menú de opciones
            System.out.println("Menú de Opciones:");
            System.out.println("1. Añadir un entero");
            System.out.println("2. Mostrar contenido");
            System.out.println("3. Mostrar número por posición");
            System.out.println("4. Mostrar contenido en orden inverso");
            System.out.println("5. Mostrar número de elementos");
            System.out.println("6. Mostrar la media");
            System.out.println("7. Cambiar entero por 0 en una posición");
            System.out.println("8. Buscar un entero");
            System.out.println("9. Mostrar posición de un entero");
            System.out.println("10. Eliminar un entero");
            System.out.println("11. Insertar 0 en una posición");
            System.out.println("12. Ordenar elementos");
            System.out.println("13. Ordenar en orden inverso");
            System.out.println("14. Mostrar mayor y menor");
            System.out.println("15. Rotar elementos a la derecha");
            System.out.println("16. Intercambiar primer y último elemento");
            System.out.println("17. Eliminar todos los elementos");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = teclado.nextInt(); // Leemos la opción del usuario

            switch (opcion) {

                case 1 -> {// Añadir un entero
                    System.out.print("Introduce un entero (0-10): ");
                    int numero = teclado.nextInt();
                    if (numero >= 0 && numero <= 10) {
                        lista.add(numero);
                        System.out.println("Número añadido.");
                    } else {
                        System.out.println("Número fuera de rango.");
                    }
                }

                case 2 -> { // Mostrar contenido
                    System.out.println("Contenido: " + lista);
                }

                case 3 -> { // Mostrar número por posición
                    System.out.print("Introduce una posición: ");
                    int posicion = teclado.nextInt();
                    if (posicion >= 0 && posicion < lista.size()) {
                        System.out.println("Número en la posición " + posicion + ": " + lista.get(posicion));
                    } else {
                        System.out.println("Posición no válida.");
                    }
                }

                case 4 -> { // Mostrar contenido en orden inverso
                    System.out.println("Contenido en orden inverso:");
                    for (int i = lista.size() - 1; i >= 0; i--) {
                        System.out.print(lista.get(i) + " ");
                    }
                    System.out.println();
                }

                case 5 -> { // Mostrar número de elementos
                    System.out.println("Número de elementos: " + lista.size());
                }

                case 6 -> { // Mostrar la media
                    if (!lista.isEmpty()) {
                        double media = lista.stream().mapToInt(Integer::intValue).average().orElse(0);
                        System.out.println("Media de los números: " + media);
                    } else {
                        System.out.println("El ArrayList está vacío.");
                    }
                }

                case 7 -> { // Cambiar entero por 0 en una posición
                    System.out.print("Introduce la posición: ");
                    int posReemplazar = teclado.nextInt();
                    if (posReemplazar >= 0 && posReemplazar < lista.size()) {
                        lista.set(posReemplazar, 0);
                        System.out.println("Número reemplazado por 0.");
                    } else {
                        System.out.println("Posición no válida.");
                    }
                }

                case 8 -> { // Buscar un entero
                    System.out.print("Introduce el número a buscar: ");
                    int buscar = teclado.nextInt();
                    if (lista.contains(buscar)) {
                        System.out.println("El número " + buscar + " está en la lista.");
                    } else {
                        System.out.println("El número no se encuentra.");
                    }
                }

                case 9 -> { // Mostrar posición de un entero
                    System.out.println("Introduce el número a buscar: ");
                    int buscarPos = teclado.nextInt();
                    int indice = lista.indexOf(buscarPos);
                    if (indice != -1) {
                        System.out.println("El número está en la posición: " + indice);
                    } else {
                        System.out.println("El número no se encuentra.");
                    }
                }

                case 10 -> { // Eliminar un entero
                    System.out.print("Introduce el número a eliminar: ");
                    int eliminar = teclado.nextInt();
                    if (lista.remove(Integer.valueOf(eliminar))) {
                        System.out.println("Número eliminado.");
                    } else {
                        System.out.println("El número no está en la lista.");
                    }
                }

                case 11 -> { // Insertar 0 en una posición
                    System.out.print("Introduce la posición para insertar 0: ");
                    int insertarPos = teclado.nextInt();
                    if (insertarPos >= 0 && insertarPos <= lista.size()) {
                        lista.add(insertarPos, 0);
                        System.out.println("0 insertado.");
                    } else {
                        System.out.println("Posición no válida.");
                    }
                }

                case 12 -> { // Ordenar elementos
                    Collections.sort(lista);
                    System.out.println("Elementos ordenados: " + lista);
                }

                case 13 -> { // Ordenar en orden inverso
                    lista.sort(Collections.reverseOrder());
                    System.out.println("Elementos en orden inverso: " + lista);
                }

                case 14 -> { // Mostrar mayor y menor
                    if (!lista.isEmpty()) {
                        int max = Collections.max(lista);
                        int min = Collections.min(lista);
                        System.out.println("Mayor: " + max + ", Menor: " + min);
                    } else {
                        System.out.println("El ArrayList está vacío.");
                    }
                }

                case 15 -> { // Rotar elementos a la derecha
                    if (!lista.isEmpty()) {
                        lista.add(0, lista.remove(lista.size() - 1));
                        System.out.println("Elementos rotados.");
                    } else {
                        System.out.println("El ArrayList está vacío.");
                    }
                }

                case 16 -> { // Intercambiar primer y último elemento
                    if (lista.size() > 1) {
                        int primero = lista.get(0);
                        int ultimo = lista.get(lista.size() - 1);
                        lista.set(0, ultimo);
                        lista.set(lista.size() - 1, primero);
                        System.out.println("Primer y último elemento intercambiados.");
                    } else {
                        System.out.println("No hay suficientes elementos para intercambiar.");
                    }
                }

                case 17 -> { // Eliminar todos los elementos
                    lista.clear();
                    System.out.println("Todos los elementos eliminados.");
                }

                case 0 -> { // Salir del programa
                    System.out.println("Saliendo del programa...");
                }
            }
        } while (opcion != 0); // Mantener el menú hasta que el usuario elija salir
    }
}