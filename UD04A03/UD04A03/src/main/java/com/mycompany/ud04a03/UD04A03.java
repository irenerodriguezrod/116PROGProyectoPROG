/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ud04a03;

/**
 *
 * @author irene.rodrod.2
 */

import java.text.NumberFormat;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.TimeZone;

public class UD04A03 {

    //static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion;
        int n;
        
        do {
            System.out.println("0. Salir");
            System.out.println("1. Calculo de la media.");
            System.out.println("2. Adivina el número.");
            System.out.println("3. Dividir cadena.");
            System.out.println("4. Leer fecha y mostrar formateada.");
            System.out.println("5. Unir palabras separadas con delimitador.");
            System.out.println("6. Mostrar la configuración regional y la zona horaria");
            System.out.println("7. Cambiar la configuración regional.");
            System.out.println("8. Cambiar la zona horaria.");
            System.out.println("9. Mostrar información en distintos formatos.");

            
            System.out.print("Introduzca opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch (opcion) {
                case 0 -> { // Salir de la aplicacion
                    System.out.println("Bye.");
                }
                
                case 1 -> { // Calculo de la media
                    
                    int contador;
                    float acumulador; // Se declara como float para que al hacer la operación de decimales
                    
                    // Ambos se inician a 0. El contador servirá para contar los números que se van introduciendo, y el acumulador servirá para realizar 
                    // la suma de todos los valores que se han ido añadiendo hasta que se introduzca un número negativo
                    acumulador = 0;
                    contador = 0;
                    
                    System.out.print("Introduzca entero: ");
                    n = leerEntero();
                    
                    while (n >= 0 ) {
                        acumulador+=n; // Se va acumulando el valor de todos los números que se van añadiendo
                        contador++; // Se cuentan las veces que se añaden números
                        
                        System.out.print("Introduzca entero: ");
                        n = leerEntero();
                    }
                    if (contador!=0){ // Si el contador es distinto de 0, se muestra la media
                        System.out.printf("Media: %f\n"+acumulador/contador);
                    }
                }
                
                case 2 -> { // Adivina el numero. Hay que utilizar la clase Random
                    Random aleatorio=new Random();
                    int intentos;
                    int numero; // Se declara para introducir el numero a la hora de adivinarlo

                    n=aleatorio.nextInt(100); // Va entre 0 y 99, porque el último número es excluido en esta clase. Se declara N como el número que generará los números aleatorios
                    intentos = 1; // sirve para contar el numero de  veces que ha tardado en adivinar el número. comienza en 1 porque se cuenta desde el primer numero que se introduzca
                    
                    do {
                        System.out.println("Introduce un numero entero: ");
                        numero=teclado.nextInt();
                        intentos++;
                        
                        if (numero==n) {
                            System.out.println("El número introducido es correcto. Te ha costado "+intentos+" intentos.");
                        } else {
                            System.out.println("El numero introducido es incorrecto.");
                            if (numero<n) {
                                System.out.println ("El numero a encontrar es MAYOR");
                            } else {
                                System.out.println("El numero a encontrar es MENOR");
                            }
                        }
                    } while (numero!=n);
                }
                
                case 3 -> { // Dividir cadena. Hay que utilizar la clase StringTokenizer
                    System.out.println("Introduzca cadena de texto: ");
                    String cadena=teclado.nextLine(); // Se declara la cadena y se lee lo que se ha introducido por teclado
                    StringTokenizer st = new StringTokenizer(cadena); //a la clase la hemos llamado st
                    while(st.hasMoreTokens()){ // Mientras tenga más tokens
                        System.out.println(st.countTokens()); // Sirve para mostrar los tokens que faltan de la caden
                        System.out.println(st.nextToken()); // Se imprimen todos los tokens, uno por uno en cada linea
                    }
                }
                
                case 4 -> { //Leer fecha y mostrar formateada
                    int dia, mes, anyo;
                    String mesEnLetra;
                    
                    System.out.println("Introduzca una fecha: ");
                    String cadena=teclado.nextLine();
                    
                    StringTokenizer st = new StringTokenizer(cadena, "-"); //StringTokenizer st; | Se puede declarar al comienzo del documento, luego solo habria que escrbir st=new  StringTokenizer(cadena, "-");
                    if(st.countTokens()==3) {
                        dia=Integer.parseInt(st.nextToken()); //Sirve para convertir un entero en un string
                        mes=Integer.parseInt(st.nextToken());
                        anyo=Integer.parseInt(st.nextToken());
                        
                        mesEnLetra=switch(mes){
                            case 1 ->"enero";
                            case 2 ->"febrero";
                            case 3 ->"marzo";
                            case 4 ->"abril";
                            case 5 ->"mayo";
                            case 6 ->"junio";
                            case 7 ->"julio";
                            case 8 ->"agosto";
                            case 9 ->"septiembre";
                            case 10 ->"octubre";
                            case 11 ->"noviembre";
                            case 12 ->"diciembre";
                            default -> "error";
                        };
                        System.out.printf("%d\n de %d\n de %d\n",dia,mes,anyo);
                    }
                }
                
                case 5 -> { // Unir palabras separadas con delimitador
                    StringJoiner sj = new StringJoiner(",", "[", "]");
                    System.out.print("Introduzca cadena (FIN para salir): ");
                    String cadena = teclado.nextLine();
                    while(!cadena.equals("FIN")) {
                        sj.add(cadena);
                        System.out.print("Introduzca cadena (FIN para salir): ");
                        cadena = teclado.nextLine();
                    }
                    System.out.print(sj);
                }
                
                case 6 -> { // Mostrar la configuración regional y la zona horaria
                    System.out.print("Configuracion regional: "+Locale.getDefault());
                    System.out.print("Zona horaria: "+TimeZone.getDefault());
                }
                
                case 7 -> { // Cambiar la configuración regional
                    String codigoPais, codigoIdioma;
                    
                    System.out.print("introduzca codigo de pais: ");
                    codigoPais = teclado.nextLine();
                    System.out.print("introduzca codigo de idioma: ");
                    codigoIdioma = teclado.nextLine();
                    
                    Locale.setDefault(Locale.of(codigoIdioma, codigoPais));
                    System.out.println("Pais: "+Locale.getDefault().getDisplayCountry());
                    System.out.println("Idioma: "+Locale.getDefault().getDisplayLanguage());
                }
                
                case 8 -> { // Cambiar la zona horaria
                    String cadena;
                    System.out.print("Introduzca zona horaria: ");
                    cadena = teclado.nextLine();
                    TimeZone.setDefault(TimeZone.getDefault());
                    System.out.println(LocalTime.now());  
                }
                
                case 9 -> { // Mostrar información en distintos formatos
                    
                    NumberFormat nf=NumberFormat.getInstance(Locale.getDefault());
                    System.out.print("Introduzca un precio: ");
                    float precio = teclado.nextFloat();
                    
                    System.out.println("%s %s\n"+nf.format(precio)+nf.getCurrency()); //los literales, los decimales en este caso van con punto

                }
                
                default -> { // Error
                    System.out.println("Error en la entrada.");
                }   
            }   
        } while (opcion!=0); 
    }
    
    private static int leerEntero (int min, int max) {
        int entero;
        
        Scanner teclado = new Scanner(System.in);
        do {
            while(!teclado.hasNextInt()) { //si el numero no es entero vuelve a solicitarlo
            teclado.nextLine();
        }
        entero = teclado.nextInt();
            if (entero < min || entero > max) {
                System.out.println("El número debe estar entre"+ min +" y "+max);
            }
        } while (entero < min || entero > max);
        return entero;
    }
    
     private static int leerEntero () {
        int entero;
        
        Scanner teclado = new Scanner(System.in);
      
            while(!teclado.hasNextInt()) { //si el numero no es entero vuelve a solicitarlo
            teclado.nextLine();
            }
        entero = teclado.nextInt();
          
        return entero;
    }
}