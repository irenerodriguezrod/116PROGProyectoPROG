import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


/**
 *
 * @author irene
 */
public class ArrayLists {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> lista = llenarEnteros();
        int opcion;

        do {
            System.out.println("1- Añadir un entero solicitado por teclado.");
            System.out.println("2- Mostrar el contenido por pantalla.");
            System.out.println("3- Solicitar una posición por teclado y mostrar por pantalla el entero que ocupa dicha posición");
            System.out.println("4- Mostrar el contenido por pantalla en orden inverso.");
            System.out.println("5- Mostrar por pantalla el número de elementos que tiene la ArrayList.");
            System.out.println("6- Mostrar por pantalla la media de los números contenidos.");
            System.out.println("7- Solicitar una posición por teclado y cambiar el entero que ocupe dicha posición por 0.");
            System.out.println("8- Solicitar un entero por teclado y decir si se encuentra o no en la ArrayList.");
            System.out.println("9- Solicitar un entero por teclado y mostrar la posición en la que está.");
            System.out.println("10- Solicitar un entero por teclado y eliminarlo del ArrayList.");
            System.out.println("11- Solicitar una posición por teclado e insertar el número 0 en dicha posición.");
            System.out.println("12- Ordenar los elementos y mostrarlos por pantalla.");
            System.out.println("13- Ordenar los elementos en orden inverso y mostrarlos por pantalla.");
            System.out.println("14- Mostrar el mayor y el menor de los elementos.");
            System.out.println("15- Rotar los elementos una posición a la derecha.");
            System.out.println("16- Intercambiar el primer elemento con el último.");
            System.out.println("17- Eliminar todos los elementos.");
            System.out.println("0- Salir");
            System.out.print("Introduce opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce un número entero: ");
                    int num = teclado.nextInt();
                    lista.add(num);
                    System.out.println("Elemento añadido.");
                }
                case 2 -> System.out.println("Contenido de la lista: " + lista);
                case 3 -> {
                    System.out.print("Introduce una posición: ");
                    int posicion = teclado.nextInt();
                    if (posicion >= 0 && posicion < lista.size()) {
                        System.out.println("El elemento en la posición " + posicion + " es: " + lista.get(posicion));
                    } else {
                        System.out.println("Posición no válida.");
                    }
                }
                case 4 -> {
                    ListIterator<Integer> iter = lista.listIterator(lista.size());
                    System.out.println("Contenido en orden inverso:");
                    while (iter.hasPrevious()) {
                        System.out.print(iter.previous() + " ");
                    }
                    System.out.println();
                }
                case 5 -> System.out.println("Número de elementos en la lista: " + lista.size());
                case 6 -> {
                    double suma = lista.stream().mapToInt(Integer::intValue).sum();
                    System.out.println("La media de los elementos es: " + (suma / lista.size()));
                }
                case 7 -> {
                    System.out.print("Introduce una posición: ");
                    int posicion = teclado.nextInt();
                    if (posicion >= 0 && posicion < lista.size()) {
                        lista.set(posicion, 0);
                        System.out.println("Elemento actualizado a 0 en la posición " + posicion);
                    } else {
                        System.out.println("Posición no válida.");
                    }
                }
                case 8 -> {
                    System.out.print("Introduce un número entero: ");
                    int num = teclado.nextInt();
                    if (lista.contains(num)) {
                        System.out.println("El número se encuentra en la lista.");
                    } else {
                        System.out.println("El número no está en la lista.");
                    }
                }
                case 9 -> {
                    System.out.print("Introduce un número entero: ");
                    int num = teclado.nextInt();
                    int posicion = lista.indexOf(num);
                    if (posicion != -1) {
                        System.out.println("El número se encuentra en la posición: " + posicion);
                    } else {
                        System.out.println("El número no se encuentra en la lista.");
                    }
                }
                case 10 -> {
                    System.out.print("Introduce un número entero: ");
                    int num = teclado.nextInt();
                    if (lista.remove((Integer) num)) {
                        System.out.println("Elemento eliminado.");
                    } else {
                        System.out.println("El elemento no se encuentra en la lista.");
                    }
                }
                case 11 -> {
                    System.out.print("Introduce una posición: ");
                    int posicion = teclado.nextInt();
                    if (posicion >= 0 && posicion <= lista.size()) {
                        lista.add(posicion, 0);
                        System.out.println("Número 0 insertado en la posición " + posicion);
                    } else {
                        System.out.println("Posición no válida.");
                    }
                }
                case 12 -> {
                    lista.sort(Integer::compareTo);
                    System.out.println("Lista ordenada: " + lista);
                }
                case 13 -> {
                    lista.sort(Comparator.reverseOrder());
                    System.out.println("Lista ordenada en orden inverso: " + lista);
                }
                case 14 -> {
                    int max = Collections.max(lista);
                    int min = Collections.min(lista);
                    System.out.println("Mayor: " + max + ", Menor: " + min);
                }
                case 15 -> {
                    Collections.rotate(lista, 1);
                    System.out.println("Lista rotada una posición a la derecha: " + lista);
                }
                case 16 -> {
                    Collections.swap(lista, 0, lista.size() - 1);
                    System.out.println("Primer y último elemento intercambiados: " + lista);
                }
                case 17 -> {
                    lista.clear();
                    System.out.println("Todos los elementos eliminados.");
                }
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static List<Integer> llenarEnteros() {
        return new ArrayList<>(Arrays.asList(1, 8, 6, 5, 6, 8, 2));
    }
}