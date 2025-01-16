/* 3. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
algoritmo que solicite por teclado dos números enteros y muestre por pantalla el
cociente y el resto de ambos números. */

import java.util.Scanner;
public class EJ03 {
	public static void main(String [] args) {
		Scanner teclado=new Scanner(System.in);
		int entero1, entero2, resto;
		System.out.print("Introduzca un número entero: ");
		entero1=teclado.nextInt();
		
		System.out.print("Introduzca otro número entero: ");
		entero2=teclado.nextInt();
		
		resto = entero1 % entero2;
		System.out.print("El resto de la división de los dos números enteros es: "+resto);
	}
}