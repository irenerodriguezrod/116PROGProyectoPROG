
/**
 * Write a description of class TestHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// EJERCICIO 3.
// Escribe un programa en lenguaje de programación Java que permita crear dos objetos de la clase Hora. 
// Para ello solicitará por teclado las horas, los minutos y los segundos de cada una de las horas. 
// Una vez creados los objetos, mostrará por pantalla cada una de las horas haciendo uso del método toString(). 
// A continuación mostrará por pantalla el número de segundos de cada uno de los objetos de tipo Hora, para ello llamaremos al método convertirASegundos().
// También deberemos mostrar por pantalla la diferencia en segundos entre los dos objetos de tipo Hora, para ello llamaremos al método compareTo(Hora otraHora).

import java.util.Scanner;
public class TestHora
{
  public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      Hora hora1, hora2, horaNueva;
      int horas, minutos, segundos, totalSegundos;
      
      //PRIMERA PARTE DEL EJERCICIO
      //Solicitar los datos de la hora 1
      System.out.print("Introduzca la hora de la hora 1: ");
      horas=teclado.nextInt();
      System.out.print("Introduzca los minutos de la hora 1: ");
      minutos=teclado.nextInt();
      System.out.print("Introduzca los segundos de la hora 2: ");
      segundos=teclado.nextInt();
      
      //Solicitar los datos de la hora 2
      System.out.print("Introduzca la hora de la hora 2: ");
      horas=teclado.nextInt();
      System.out.print("Introduzca los minutos de la hora 2: ");
      minutos=teclado.nextInt();
      System.out.print("Introduzca los segundos de la hora 2: ");
      segundos=teclado.nextInt();
      
      //Crear nuevo objeto para hora1 y hora2
      hora1=new Hora(horas,minutos,segundos);
      hora2=new Hora(horas,minutos,segundos);
      
      //Mostrar datos por pantalla
      
      //1. Utilizar metodo toString
      System.out.printf("Hora 1: %s\n",hora1.toString());
      System.out.printf("Hora 2: %s\n",hora2.toString());
      
      //2. Utilizar metodo convertirASegundos
      System.out.printf("Hora 1: %s\n",hora1.convertirASegundos());
      System.out.printf("Hora 2: %s\n",hora2.convertirASegundos());
      
      //3. Utilizar metodo compareTo
      System.out.printf("Diferencia de segundos entre la hora 1 y la hora 2: %s\n",hora1.compareTo(hora2));
      
      
      
      //SEGUNDA PARTE. Solicitaremos por teclado un número de segundos,
      //llamaremos al método sumarSegundos(int segundos) en cada uno de los
      //objetos y mostraremos por pantalla el resultado obtenido (utilizaremos el
      //método toString()).
      
      
      //el razonamiento de porqué se creó un nuevo objeto llamado horaNueva es para almacenar los datos en una nueva variable llamada horaNueva, la cual empleará los últimos datos solicitados pero no sobreescribirá en el objeto llamado hora2, puesto que 
      //los nuevos datos solicitados, se llevarán a cabo en horaNueva sin modificar hora1 y/o hora2
      
      horaNueva=new Hora(horas, minutos, segundos);
      //Solicitar numero de segundos
      System.out.print("Introduzca el número de segundos a sumar: ");
      
      //totalSegundos es como se ha declarado el nombre de esta nueva variable la cual almacenaŕa los segundos que en el paso anterior hemos solicitado
      totalSegundos=teclado.nextInt();

      
      //Mostrar número en pantalla. Metodo sumarSegundos
      
      //horaNueva tiene los mismos datos que hora 2, ya que no se han solicitado nuevos datos y empleará los últimos datos que el programa haya recibido
      System.out.println("El número de segundos equivale a: "+horaNueva.sumarSegundos(totalSegundos));
      //Metodo toString
      System.out.printf("El resultado de segundos equivale a: %s\n"+horaNueva.toString());
    }
}
