// 1. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado la edad de una persona y si
// es mayor de edad muestre por pantalla el mensaje: Eres mayor de edad


import java.util.Scanner;

public class EJ01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int edad ;
		
		System.out.print("Introduzca su edad: ");
		edad=teclado.nextInt();
		
		if (edad>=18) {
			System.out.print("Eres mayor de edad");
		}
	}
}