
/**
 * Write a description of class TestFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// EJERCICIO 2.
// Escribe un programa en lenguaje de programación Java que permita crear dos objetos de la clase Fecha.
// Para ello solicitará por teclado el día, el mes y el año de cada una de las fechas. 
// Una vez creados los objetos, mostrará por pantalla cada una de las fechas haciendo uso del método toString().

import java.util.Scanner;
public class TestFecha
{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        Fecha fecha1, fecha2;
        //se declaran los tipos de datos que vamos a utilizar
        int dia, mes, anyo;
        
        //Solicitar datos de la fecha 1
        System.out.print("Introduzca el día de la fecha 1: ");
        dia=teclado.nextInt();
        System.out.print("Introduzca el mes de la fecha 1: ");
        mes=teclado.nextInt();
        System.out.print("Introduzca el año de la fecha 1: ");
        anyo=teclado.nextInt();
        
        
        //Solicitar datos de la fecha 2
        System.out.print("Introduzca el día de la fecha 2: ");
        dia=teclado.nextInt();
        System.out.print("Introduzca el mes de la fecha 2: ");
        mes=teclado.nextInt();
        System.out.print("Introduzca el año de la fecha 2: ");
        anyo=teclado.nextInt();
        
        fecha1=new Fecha(anyo,mes,dia);
        fecha2=new Fecha(anyo,mes,dia);
        
        //En el formato se pone %s porque se devuelve un numero entero
        System.out.printf("Fecha 1: %s\n",fecha1.toString());
        
        //System.out.println("Fecha 1: "+fecha1.toString());
        //System.out.println("Fecha 1: "+fecha1);
        System.out.printf("Fecha 2: %s\n",fecha2.toString());
        
    }
}
