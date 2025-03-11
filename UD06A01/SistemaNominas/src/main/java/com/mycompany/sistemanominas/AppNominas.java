package com.mycompany.sistemanominas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppNominas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Empleado> empleado = new ArrayList<>(); // Lista para almacenar empleados
        String dni, nombre;
        int opcion;
        int opcion2;

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1.- Crear empleado.");
            System.out.println("2.- Consultar empleado.");
            System.out.println("3.- Eliminar empleado.");
            System.out.println("4.- Listar empleados.");
            System.out.println("5.- Listar empleados por sueldo.");
            System.out.println("6.- Consultar total salarios.");
            System.out.println("0.- Salir.");
            System.out.print("Introduzca opción: ");

            // Validación para evitar excepciones con entradas no numéricas
            while (!teclado.hasNextInt()) {
                System.out.println("Por favor, introduzca un número válido.");
                teclado.next();
            }
            opcion = teclado.nextInt();
            teclado.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> {
                    do {
                        System.out.println("\n--- Crear Empleado ---");
                        System.out.println("1.- Crear empleado fijo.");
                        System.out.println("2.- Crear empleado eventual.");
                        System.out.println("0.- Volver al menú principal.");
                        System.out.print("Introduzca su opción: ");

                        while (!teclado.hasNextInt()) {
                            System.out.println("Por favor, introduzca un número válido.");
                            teclado.next();
                        }
                        opcion2 = teclado.nextInt();
                        teclado.nextLine(); // Consumir el salto de línea

                        switch (opcion2) {
                            case 1 -> {
                                System.out.print("Introduzca nombre: ");
                                nombre = teclado.nextLine();
                                System.out.print("Introduzca DNI: ");
                                dni = teclado.nextLine();

                                if (buscarEmpleado(empleado, dni) == null) {
                                    Empleado empleado = new EmpleadoFijo(dni, nombre);
                                    empleados.add(empleado);
                                    System.out.println("Empleado fijo creado: " + empleado);
                                } else {
                                    System.out.println("Ya existe un empleado con ese DNI.");
                                }
                            }
                            case 2 -> {
                                System.out.print("Introduzca nombre: ");
                                nombre = teclado.nextLine();
                                System.out.print("Introduzca DNI: ");
                                dni = teclado.nextLine();

                                if (buscarEmpleado(empleados, dni) == null) {
                                    Empleado empleado = new EmpleadoEventual(dni, nombre);
                                    empleados.add(empleado);
                                    System.out.println("Empleado eventual creado: " + empleado);
                                } else {
                                    System.out.println("Ya existe un empleado con ese DNI.");
                                }
                            }
                            case 0 -> System.out.println("Volviendo al menú principal.");
                            default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
                        }
                    } while (opcion2 != 0);
                }
                case 2 -> {
                    System.out.print("Introduzca DNI del empleado: ");
                    dni = teclado.nextLine();
                    Empleado empleado = buscarEmpleado(empleados, dni);

                    if (empleado != null) {
                        System.out.println("Datos del empleado: " + empleado);
                    } else {
                        System.out.println("No se encontró un empleado con ese DNI.");
                    }
                }
                case 3 -> {
                    System.out.print("Introduzca DNI del empleado: ");
                    dni = teclado.nextLine();
                    Empleado empleado = buscarEmpleado(empleados, dni);

                    if (empleado != null) {
                        empleados.remove(empleado);
                        System.out.println("Empleado eliminado.");
                    } else {
                        System.out.println("No se encontró un empleado con ese DNI.");
                    }
                }
                case 4 -> {
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados en la lista.");
                    } else {
                        System.out.println("Lista de empleados:");
                        for (Empleado empleado : empleados) {
                            System.out.println(empleado);
                        }
                    }
                }
                case 5 -> {
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados para listar por sueldo.");
                    } else {
                        System.out.println("Empleados ordenados por sueldo (descendente):");
                        empleados.stream()
                                .sorted((e1, e2) -> Double.compare(e2.getSueldo(), e1.getSueldo()))
                                .forEach(System.out::println);
                    }
                }
                case 6 -> {
                    double totalSalarios = empleados.stream().mapToDouble(empleado.getSueldo).sum();
                    System.out.printf("Total de salarios: %.2f%n", totalSalarios);
                }
                case 0 -> System.out.println("Adiós.");
                default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);

        teclado.close();
    }
}
