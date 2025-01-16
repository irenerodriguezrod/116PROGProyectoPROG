
import java.util.LinkedList;
import java.util.Collections;

public class EJ02 {
    public static void main(String[] args) {
        // Declaramos el LinkedList para almacenar enteros
        LinkedList<Integer> lista = new LinkedList<>();

        java.util.Scanner teclado = new java.util.Scanner(System.in);

        int opcion; // Variable para almacenar la opción del menú

        do {
            // Menú de opciones
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Añadir un entero");
            System.out.println("2. Mostrar contenido");
            System.out.println("3. Insertar un entero en la primera posición");
            System.out.println("4. Insertar un entero en la última posición");
            System.out.println("5. Mostrar contenido en orden inverso");
            System.out.println("6. Mostrar el primer y el último elemento");
            System.out.println("7. Eliminar el primer y el último elemento");
            System.out.println("8. Eliminar la primera aparición de un número");
            System.out.println("9. Eliminar la última aparición de un número");
            System.out.println("10. Ordenar los elementos");
            System.out.println("11. Invertir el orden de los elementos");
            System.out.println("12. Mostrar cuántas veces aparece cada número");
            System.out.println("13. Eliminar todos los elementos");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = teclado.nextInt(); // Leemos la opción del usuario

            switch (opcion) {

                case 1: // Añadir un entero
                    System.out.print("Introduce un entero (0-10): ");
                    int numero = teclado.nextInt();
                    if (numero >= 0 && numero <= 10) {
                        lista.add(numero);
                        System.out.println("Número añadido.");
                    } else {
                        System.out.println("Número fuera de rango.");
                    }

                    case 2: // Mostrar contenido
                    System.out.println("Contenido: " + lista);

                    case 3: // Insertar un entero en la primera posición
                    System.out.print("Introduce un entero para la primera posición: ");
                    int primero = teclado.nextInt();
                    lista.addFirst(primero);
                    System.out.println("Número añadido en la primera posición.");

                    case 4: // Insertar un entero en la última posición
                    System.out.print("Introduce un entero para la última posición: ");
                    int ultimo = teclado.nextInt();
                    lista.addLast(ultimo);
                    System.out.println("Número añadido en la última posición.");

                    case 5: // Mostrar contenido en orden inverso
                    System.out.println("Contenido en orden inverso:");
                    for (int i = lista.size() - 1; i >= 0; i--) {
                        System.out.print(lista.get(i) + " ");
                    }
                    System.out.println();

                    case 6: // Mostrar el primer y último elemento
                    if (!lista.isEmpty()) {
                        System.out.println("Primer elemento: " + lista.getFirst());
                        System.out.println("Último elemento: " + lista.getLast());
                    } else {
                        System.out.println("El LinkedList está vacío.");
                    }

                    case 7: // Eliminar el primer y último elemento
                    if (!lista.isEmpty()) {
                        lista.removeFirst();
                        lista.removeLast();
                        System.out.println("Primer y último elemento eliminados.");
                    } else {
                        System.out.println("El LinkedList está vacío.");
                    }

                    case 8: // Eliminar la primera aparición de un número
                    System.out.print("Introduce el número a eliminar (primera aparición): ");
                    int eliminarPrimero = teclado.nextInt();
                    if (lista.removeFirstOccurrence(eliminarPrimero)) {
                        System.out.println("Primera aparición eliminada.");
                    } else {
                        System.out.println("Número no encontrado.");
                    }

                    case 9: // Eliminar la última aparición de un número
                    System.out.print("Introduce el número a eliminar (última aparición): ");
                    int eliminarUltimo = teclado.nextInt();
                    if (lista.removeLastOccurrence(eliminarUltimo)) {
                        System.out.println("Última aparición eliminada.");
                    } else {
                        System.out.println("Número no encontrado.");
                    }

                    case 10: // Ordenar los elementos
                    Collections.sort(lista);
                    System.out.println("Elementos ordenados: " + lista);

                    case 11: // Invertir el orden de los elementos
                    Collections.reverse(lista);
                    System.out.println("Elementos invertidos: " + lista);

                    case 12: // Mostrar cuántas veces aparece cada número
                    if (!lista.isEmpty()) {
                        System.out.println("Frecuencia de números:");
                        for (int i = 0; i <= 10; i++) {
                            int frecuencia = Collections.frequency(lista, i);
                            if (frecuencia > 0) {
                                System.out.println(i + " aparece " + frecuencia + " veces.");
                            }
                        }
                    } else {
                        System.out.println("El LinkedList está vacío.");
                    }

                    case 13: // Eliminar todos los elementos
                    lista.clear();
                    System.out.println("Todos los elementos eliminados.");

                    case 0: // Salir del programa
                    System.out.println("Saliendo del programa...");
            }
        } while (opcion != 0); // Mantener el menú hasta que el usuario elija salir
    }
}
