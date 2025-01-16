
/**
 * Write a description of class TestRectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// EJERCICIO 1.
// Escribe un programa en lenguaje de programación Java que permita crear dos objetos de la clase Rectangulo. 
// Para ello solicitará por teclado el alto y el ancho de cada uno de los rectángulos. 
// Una vez creados los objetos, mostrará por pantalla el área y el perímetro de cada uno de los rectángulos.


import java.util.Scanner;
public class TestRectangulo
{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Rectangulo rectangulo1, rectangulo2;
        float alto, ancho;
        
        //Solicitar datos del rectángulo 1
        System.out.print("Introduzca el alto del rectángulo 1: ");
        alto=teclado.nextFloat();
        System.out.print("Introduzca el ancho del rectángulo 1: ");
        ancho=teclado.nextFloat();
        
        //Solicitar datos rectángulo 2
        System.out.print("Introduzca el alto del rectángulo 2: ");
        alto=teclado.nextFloat();
        System.out.print("Introduzca el ancho del rectángulo 2: ");
        ancho=teclado.nextFloat();
        
        rectangulo1=new Rectangulo(ancho,alto);
        rectangulo2=new Rectangulo(ancho,alto);
        
        //Calcular e imprimir el resultado 
        
        //System.out.printf("Área del rectangulo 1: "+rectangulo1.calcularArea());
        System.out.printf("Área del rectangulo 1: %f\n",rectangulo1.calcularArea());
        //System.out.printf("Perímetro del rectángulo 1: "+rectángulo1.calcularPerimetro());
        System.out.printf("Perímetro del rectangulo 1: %f\n",rectangulo1.calcularPerimetro());
        
        System.out.println("Área del rectángulo 2: "+rectangulo2.calcularArea());
        System.out.println("Perímetro del rectángulo 2: "+rectangulo2.calcularPerimetro());
    }
}
