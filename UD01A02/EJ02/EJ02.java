/*2. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
algoritmo que solicite por teclado un número entero positivo (n) y muestre por pantalla
la suma de todos los enteros comprendidos entre 1 y n. */

import java.util.Scanner;
 public class EJ02 {

	public static void main (String[] args) {
		Scanner teclado=new Scanner(System.in);
		int entero, suma;
		System.out.print("Introduce un entero: ");
		entero=teclado.nextInt();
		
		suma = (entero * (entero + 1)) / 2; 
		System.out.print("El resultado de la suma es: "+suma);
	}
 }