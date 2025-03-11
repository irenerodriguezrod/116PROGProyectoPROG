/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.agendacontactos;

/**
 *
 * @author irene.rodrod.2
 */
import java.util.Scanner;

public class AppAgenda {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Contacto contacto = null;
        int opcion;
        String nombre;
        String telefono;
        String email;
        String seguro;

        do {
            System.out.println("1.- Crear contacto.");
            System.out.println("2.- Consultar contacto.");
            System.out.println("3.- Modificar contacto.");
            System.out.println("4.- Eliminar contacto.");
            System.out.println("0.- Salir.");
            System.out.print("Introduzca una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            if (opcion >= 1 && opcion <= 5) { //Se solicita para evitar repetir la misma pregunta todo el rato
                System.out.print("Introduzca el nombre del contacto: "); //Se solicita el nombre para consultar si existe o no el contacto
                nombre = teclado.nextLine();

                //Crear contacto
                if (opcion == 1) {
                    if (contacto == null) {
                        System.out.println("Introduzca el nombre del contacto: ");
                        nombre = teclado.nextLine();
                        System.out.println("Introduzca el numero de teléfono: ");
                        telefono = teclado.nextLine();
                        System.out.println("Introduzca el email: ");
                        email = teclado.nextLine();

                        contacto = new Contacto(nombre, telefono, email);
                        System.out.print("Contacto creado con éxito. Los datos del contacto son: " + getContacto);
                    } else {
                        System.out.print("El contacto ya existe. ");
                    }

                    if (contacto != null && contacto.equals(contacto.getNombre())) {
                        switch (opcion) {
                            // Consultar contacto: Muestra los datos del contacto(nombre, telefono y email
                            case 2 -> {
                                System.out.print("El contacto es" + contacto.getContacto);
                            }
                            // Modificar contacto
                            case 3 -> {
                                System.out.print("¿Qué datos desea modificar?");
                                System.out.print("1. Teléfono");
                                System.out.print("2. Email");
                                opcion = teclado.nextInt();
                                if (opcion == 1) {
                                    System.out.print("Introduzca el nuevo número: ");
                                    telefono = teclado.nextLine();
                                    telefono.setContacto;
                                    //Mostrar el dato modificado
                                    System.out.print("Modificacion guardada. El nuevo numero es: " + getContacto);
                                } else {
                                    System.out.print("Introduzca el nuevo email: ");
                                    email = teclado.nextLine();
                                    email.setContacto;
                                    //Mostrar el dato modificado
                                    System.out.print("Modificación guardada. El nuevo email es: " + getEmail);
                                }
                            }
                            // Eliminar contacto
                            case 4 -> {
                                System.out.print("¿Desea eliminar" + contacto + "?");

                                contacto = null;
                                System.out.print("Contacto eliminado.");
                            }

                        
                        else{
                    System.out.print("El contacto introducido no existe.")
                }
                            
        while (opcion == 5);
                        System.out.println("BYE");
                    }

                }
            }
        }
    }
}
}