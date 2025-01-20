import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class EJ06 {

    public static void main(String[] args) {
        TreeMap<String, String> mapaColores = new TreeMap<>();
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú
            System.out.println("Menú de opciones");
            System.out.println("1. Insertar código y nombre de color");
            System.out.println("2. Mostrar el contenido del mapa");
            System.out.println("3. Mostrar el primer y último códigos");
            System.out.println("4. Mostrar la primera pareja clave/valor");
            System.out.println("5. Mostrar todos los colores con sus códigos");
            System.out.println("6. Eliminar todos los elementos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            while (!teclado.hasNextInt()) {
                System.out.print("Por favor, introduzca un número válido: ");
                teclado.next();
            }
            opcion = teclado.nextInt();
            teclado.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1 -> {
                    // Solicitar código y nombre de color
                    System.out.print("Ingrese el código de color (en hexadecimal, ejemplo: #FF5733): ");
                    String codigo = teclado.nextLine().trim();
                    if (!codigo.matches("^#?[0-9a-fA-F]{6}$")) {
                        System.out.println("Código inválido. Asegúrese de usar un formato hexadecimal de 6 caracteres.");
                    } else {
                        System.out.print("Ingrese el nombre del color: ");
                        String nombre = teclado.nextLine().trim();
                        mapaColores.put(codigo, nombre);
                        System.out.println("Color agregado correctamente.");
                    }
                }
                case 2 -> {
                    // Mostrar el contenido del mapa
                    if (mapaColores.isEmpty()) {
                        System.out.println("El mapa está vacío.");
                    } else {
                        System.out.println("Contenido del mapa:");
                        mapaColores.forEach((codigo, nombre) -> {
                            System.out.println("Código: " + codigo + " - Nombre: " + nombre);
                        });
                    }
                }
                case 3 -> {
                    // Mostrar el primer y último códigos
                    if (mapaColores.isEmpty()) {
                        System.out.println("El mapa está vacío.");
                    } else {
                        System.out.println("Primer código: " + mapaColores.firstKey());
                        System.out.println("Último código: " + mapaColores.lastKey());
                    }
                }
                case 4 -> {
                    // Mostrar la primera pareja clave/valor
                    if (mapaColores.isEmpty()) {
                        System.out.println("El mapa está vacío.");
                    } else {
                        Map.Entry<String, String> primeraEntrada = mapaColores.firstEntry();
                        System.out.println("Primera pareja clave/valor:");
                        System.out.println("Código: " + primeraEntrada.getKey() + " - Nombre: " + primeraEntrada.getValue());
                    }
                }
                case 5 -> {
                    // Mostrar todos los colores con sus correspondientes códigos
                    if (mapaColores.isEmpty()) {
                        System.out.println("El mapa está vacío.");
                    } else {
                        System.out.println("Colores con sus correspondientes códigos:");
                        mapaColores.forEach((codigo, nombre) -> {
                            System.out.println("Código: " + codigo + " - Nombre: " + nombre);
                        });
                    }
                }
                case 6 -> {
                    // Eliminar todos los elementos
                    mapaColores.clear();
                    System.out.println("Todos los elementos han sido eliminados.");
                }
                case 0 -> {
                    // Salir
                    System.out.println("Saliendo del programa...");
                }
                default -> {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        } while (opcion != 0);
    }
}
