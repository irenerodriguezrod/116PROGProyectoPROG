/*4. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
algoritmo que solicite por teclado tres calificaciones (números enteros) de un alumno y
muestre por pantalla la media de las mismas. */

import java.util.Scanner;
public class EJ04 {
	public static void main(String [] args) {
		Scanner teclado=new Scanner(System.in);
		int nota1, nota2, nota3;
		double media;
		System.out.print("Introduzca la nota 1: ");
		nota1=teclado.nextInt();
		
		System.out.print("Introduzca la nota 2: ");
		nota2=teclado.nextInt();
		
		System.out.print("Introduzca la nota 3: ");
		nota3=teclado.nextInt();
		
		media = (nota1 + nota2 + nota3) / 3;
		System.out.print("La media de las 3 notas es: "+media);
	}
}