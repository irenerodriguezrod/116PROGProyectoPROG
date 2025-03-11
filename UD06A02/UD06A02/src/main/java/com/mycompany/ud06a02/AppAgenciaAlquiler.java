package com.mycompany.ud06a02;

import java.util.Scanner;

/**
 * 
 * @author Irene RODRIGUEZ RODRIGUEZ
 * @version 1.0
 */
public class AppAgenciaAlquiler {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        AgenciaAlquiler agencia = null; // No inicializada
        int opcion, opcion2;

        do {
            System.out.println("-- Agencia alquiler --");
            System.out.println("1.- Crear vehículo.");
            System.out.println("2.- Consultar vehículo.");
            System.out.println("3.- Eliminar vehículo.");
            System.out.println("4.- Listar vehículos.");
            System.out.println("5.- Consultar alquiler más barato.");
            System.out.println("0.- Salir.");
            System.out.print("Introduzca opción: ");

            while (!teclado.hasNextInt()) {
                System.out.println("Por favor, introduzca un número válido.");
                teclado.next();
            }
            opcion = teclado.nextInt();
            teclado.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> {
                    do {
                        System.out.println("-- Crear vehículo --");
                        System.out.println("1.- Crear turismo.");
                        System.out.println("2.- Crear furgoneta.");
                        System.out.println("0.- Volver al menú principal.");
                        System.out.print("Introduzca su opción: ");

                        while (!teclado.hasNextInt()) {
                            System.out.println("Por favor, introduzca un número válido.");
                            teclado.next();
                        }
                        opcion2 = teclado.nextInt();
                        teclado.nextLine(); // salto de línea

                        switch (opcion2) {
                            case 1 -> {
                                System.out.println("Introduzca la matrícula del turismo:");
                                String matricula = teclado.nextLine();
                                System.out.println("Introduzca el grupo del turismo (A, B, C):");
                                char grupo = teclado.nextLine().toUpperCase().charAt(0);
                                Vehiculo turismo = new Turismo(matricula, Grupo.valueOf(String.valueOf(grupo)));
                                if (agencia.incluirVehiculo(turismo)) {
                                    System.out.println("Turismo añadido con éxito.");
                                } else {
                                    System.out.println("Error: Ya existe un vehículo con esa matrícula.");
                                }
                            }
                            case 2 -> {
                                System.out.println("Introduzca la matrícula de la furgoneta:");
                                String matricula = teclado.nextLine();
                                System.out.println("Introduzca el grupo de la furgoneta (A, B, C):");
                                char grupo = teclado.nextLine().toUpperCase().charAt(0);
                                Vehiculo furgoneta = new Furgoneta(matricula, Grupo.valueOf(String.valueOf(grupo)));
                                if (agencia.incluirVehiculo(furgoneta)) {
                                    System.out.println("Furgoneta añadida con éxito.");
                                } else {
                                    System.out.println("Error: Ya existe un vehículo con esa matrícula.");
                                }
                            }
                            case 0 -> System.out.println("Volviendo al menú principal.");
                            default -> System.out.println("Opción no válida.");
                        }
                    } while (opcion2 != 0);
                }
                case 3, 4, 5, 6 -> {
                    if (agencia == null) {
                        System.out.println("Debe configurar la agencia primero (opción 1).");
                    } else {
                        switch (opcion) {
                            case 3 -> {
                                System.out.println("Introduzca la matrícula del vehículo a consultar:");
                                String matricula = teclado.nextLine();
                                Vehiculo vehiculo = agencia.consultarVehiculo(matricula);
                                if (vehiculo != null) {
                                    System.out.println("Vehículo encontrado: " + vehiculo);
                                } else {
                                    System.out.println("No se encontró ningún vehículo con esa matrícula.");
                                }
                            }
                            case 4 -> {
                                System.out.println("Introduzca la matrícula del vehículo a eliminar:");
                                String matricula = teclado.nextLine();
                                Vehiculo vehiculo = agencia.consultarVehiculo(matricula);
                                if (vehiculo != null && agencia.eliminarVehiculo(vehiculo)) {
                                    System.out.println("Vehículo eliminado con éxito.");
                                } else {
                                    System.out.println("No se pudo eliminar.");
                                }
                            }
                            case 5 -> {
                                System.out.println("Lista de vehículos:");
                                agencia.listarVehiculosPorPrecio().forEach(System.out::println);
                            }
                            case 6 -> {
                                Vehiculo masBarato = agencia.getVehiculoMasBarato();
                                if (masBarato != null) {
                                    System.out.println("El vehículo más barato es: " + masBarato);
                                }
                            }
                        }
                    }
                }
                case 0 -> System.out.println("Adiós.");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}