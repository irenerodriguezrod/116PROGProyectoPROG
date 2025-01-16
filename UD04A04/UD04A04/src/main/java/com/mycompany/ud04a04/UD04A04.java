/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ud04a04;

import java.io.File;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author irene.rodrod.2
 */
public class UD04A04 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("0. Salir");
            System.out.println("1. Mostrar fecha y hora del sistema");
            System.out.println("2. Mostrar fecha y hora en dos zonas horarias.");
            System.out.println("3. Sumar un número de días a una fecha.");
            System.out.println("4. Mostrar la menor de dos fechas.");
            System.out.println("5. Sumar un número de minutos a una hora.");
            System.out.println("6. Mostrar si la hora es anterior o posterior.");
            System.out.println("7. Mostrar la diferencia entre dos fechas.");
            System.out.println("8. Mostrar la diferencia entre dos horas.");
            System.out.println("9. Calcular hora de llegada de un vuelo.");
            System.out.println("10. Numero de vocales de una cadena.");
            System.out.println("11. Iniciales del nombre y apellidos.");
            System.out.println("12. Información sobre ficheros y directorios.");
            
            System.out.print("Introduzca opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch (opcion){
                case 0 -> { // Salir de la aplicacion
                    System.out.print("Bye.");
                }
                
                case 1 -> { // Mostrar fecha y hora del sistema. Muestra la fecha y la hora del sistema obtenida a partir de las siguientes clases: LocalDateTime, ZonedDateTime y OffsetDateTime e Instant.
                    System.out.println(LocalDateTime.now()); // Clase LocalDateTime
                    System.out.println(ZonedDateTime.now()); // Clase ZonedDateTime
                    System.out.println(OffsetDateTime.now()); // Clase OffsetDateTime
                    System.out.println(Instant.now()); // Clase Instant
                }
                
                case 2 -> { // Mostrar fecha y hora en dos zonas horarias. Muestra la fecha y la hora en dos zonas horarias distintas: Asia/Tokyo y America/New_York.
                    System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Tokyo"))); // ZoneId.of son los lugares que estan asociados, no se necesita el ID, sino el nombre de la zona
                    System.out.println(ZonedDateTime.now(ZoneId.of("America/New_York")));
                }
                
                case 3 -> { // Sumar un número de días a una fecha. Solicita una fecha (yyyy-mm-dd) y un número de días, calcula la nueva fecha y la muestra por pantalla.
                    System.out.println("Introduzca una fecha(yyyy-mm-dd): ");
                    String fecha = teclado.nextLine();
                    System.out.println("Introduzca un numero de días a sumar: ");
                    int dias = teclado.nextInt();
                    
                    LocalDate date = LocalDate.parse(fecha);
                    System.out.println(date.plusDays(dias));
                }
                
                case 4 -> { // Mostrar la menor de dos fechas. Solicita dos fechas y muestra la menor por pantalla.
                    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    System.out.println("Introduzca la primera fecha(yyyy-mm-dd): ");
                    String fecha = teclado.nextLine();
                    System.out.println("Introduzca la segunda fecha(yyyy-mm-dd): ");
                    String fecha2 = teclado.nextLine();
                    
                    LocalDate date = LocalDate.parse(fecha,dtf);
                    LocalDate date2 = LocalDate.parse(fecha2,dtf);
                    
                    int entero = date.compareTo(date2);
                    
                    if (entero < 0) {
                        System.out.println("La fecha introducida es posterior.");
                    } else {
                        System.out.println("La fecha introducida es anterior.");
                    }
                }
                
                case 5 -> { // Sumar un número de minutos a una hora. Solicita una hora (hh:mm) y un número de minutos, calcula la nueva hora y la muestra por pantalla.
                    System.out.println("Introduzca una hora (hh:mm): ");
                    String hora = teclado.nextLine();
                    System.out.println("Introduzca un numero de minutos a sumar: ");
                    int minutos = teclado.nextInt();
                    
                    LocalTime time = LocalTime.parse(hora);
                    System.out.println(time.plusMinutes(minutos));
                }
                
                case 6 -> { // Mostrar si la hora es anterior o posterior. Solicita una hora (hh:mm:ss) y muestra por pantalla si es anterior o posterior a la hora del sistema.
                    System.out.println("Introduzca una hora (hh:mm:ss) para compararla con la del sistema: ");
                    String hora = teclado.nextLine();
                    
                    LocalTime time = LocalTime.now();
                    LocalTime time2 = LocalTime.parse(hora);
                    
                    int entero = time.compareTo(time2);
                    
                    if (entero < 0) {
                        System.out.println("La hora introducida es posterior.");
                    } else {
                        System.out.println("La hora introducida es anterior.");
                    }   
                }
                
                case 7 -> { // Mostrar la diferencia entre dos fechas. Solicita una fecha y muestra la diferencia entre la fecha introducida y la del sistema en años, meses y días.
                    System.out.println ("Introduzca la fecha(yyyy-mm-dd): ");
                    String fecha = teclado.nextLine();
                    
                    LocalDate date = LocalDate.now();
                    LocalDate date2 = LocalDate.parse(fecha);
                    
                    Period period = Period.between(date, date2);
                    
                    System.out.println("Dias: "+period.getDays());
                    System.out.println("Meses: "+period.getMonths());
                    System.out.println("Años: "+period.getYears());
                }
                
                case 8 -> { // Mostrar la diferencia entre dos horas. Solicita una hora y muestra la diferencia entre la hora introducida y la del sistema en horas, minutos y segundos.
                    System.out.println("Introduzca una hora (hh:mm:ss): ");
                    String hora = teclado.nextLine();
                    
                    LocalTime time = LocalTime.now();
                    LocalTime time2 = LocalTime.parse(hora);
                    
                    Duration duration = Duration.between(time, time2);
                    System.out.println("La diferencia es de: "+Duration.between(time, time2));
                }
                
                case 9 -> { // Calcular la hora de llegada de un vuelo. Dados el origen, la fecha y la hora de salida de un avión, la duración del vuelo y el destino, calcular la fecha y hora de llegada del vuelo y mostrarlas por pantalla.
                    ZonedDateTime salidaVuelo, llegadaVuelo;
                    
                    System.out.println("Introduzca la fecha del vuelo: ");
                    String fechaSalida = teclado.nextLine();
                    System.out.println("Introduzca la hora de salida del vuelo: ");
                    String horaSalida = teclado.nextLine();
                    System.out.println("Introduzca la zona horaria de salida: ");
                    String entrada = teclado.nextLine();
                    
                    salidaVuelo = ZonedDateTime.of(LocalDate.parse(fechaSalida), LocalTime.parse(horaSalida), ZoneId.of(entrada));
                    System.out.println("Introduzca la duracion del vuelo(hh:mm): ");
                    entrada =teclado.nextLine();
                    StringTokenizer st = new StringTokenizer(entrada,":");
                    int minutos = Integer.parseInt(st.nextToken())*60+Integer.parseInt(st.nextToken());
                    System.out.println("Introduzca la zona horaria de llegada: ");
                    entrada =teclado.nextLine();
                    llegadaVuelo=salidaVuelo.plusMinutes(minutos).withZoneSameInstant(ZoneId.of(entrada));
                    System.out.println(llegadaVuelo);
                    
                    //hay que pedir, origen, fecha hora y duracion vuelo. hay que calcular el destino y la hora 
                }
                
                case 10 -> { // Numero de vocales de una cadena. Solicita una cadena y muestra el número de vocales que contiene. La entrada y salida la haremos mediante la clase JOptionPane
                    char letra;
                    int contador;
                    String entrada = JOptionPane.showInputDialog(null, "Introduzca una cadena");
                    contador = 0;
                    for(int i=0; i<entrada.length(); i++){
                        letra= entrada.charAt(i);
                        if (letra=='a' || letra=='e' ||letra=='i' || letra=='o' || letra=='u' ) {
                            contador++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Vocales: "+contador);
                }
                
                case 11 -> { // Iniciales del nombre y apellidos. Solicita el nombre y apellidos y muestra las iniciales de los mismos. La entrada y salida la haremos mediante la clase JOptionPane
                    String entrada = JOptionPane.showInputDialog(null, "Introduzca nombre y apellidos: ");
                    StringTokenizer st = new StringTokenizer(entrada);
                    StringBuilder sb = new StringBuilder();
                    
                    while (st.hasMoreTokens()) {
                        sb.append(st.nextToken().charAt(0));
                    }
                    JOptionPane.showMessageDialog(null, sb);
                }
                
                case 12 -> { // Información sobre ficheros y directorios. Solicita el nombre de un archivo o directorio y deberá mostrar si existe o no. En caso de que exista también deberá mostrar si se trata de un fichero o de un directorio. La opción se repetirá mientras que el usuario quiera. La entrada y salida la haremos mediante la clase JOptionPane
                    String entrada = JOptionPane.showInputDialog(null, "Introduzca nombre de archivo o directorio: ");
                    File ficheroDirectorio = new File(entrada);
                    StringBuilder sb = new StringBuilder();
                    if(ficheroDirectorio.exists()) {
                        sb.append("EXISTE");
                        
                        if (ficheroDirectorio.isFile()) {
                            sb.append("ES UN FICHERO");
                        } else {
                            sb.append("ES UN DIRECTORIO");
                        }
                    } else {
                        sb.append("NO EXISTE");
                    }
                }
                
            }
            
        } while (opcion != 0);
                
    }
    
}