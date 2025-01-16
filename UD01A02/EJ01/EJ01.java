// Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
// algoritmo que solicite por teclado un nombre y muestre por pantalla el siguiente
// mensaje: Hola nombre.

import java.util.Scanner;
public class EJ01 {
	
	public static void main (String[] args) { 
		Scanner teclado=new Scanner(System.in);
		String nombre;
		System.out.print("Introduce un nombre: ");
		nombre=teclado.nextLine();
		System.out.println("Hola "+nombre);
	}
}