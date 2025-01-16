/*6. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
algoritmo que solicite por teclado la temperatura en grados Celsius (centígrados) y
muestre por pantalla el equivalente en grados Fahrenheit. */

import java.util.Scanner;
public class EJ06 {
	public static void main(String [] args) {
		Scanner teclado=new Scanner(System.in);
		double celsius, fahrenheit;
		
		System.out.print("Introduce la temperatura en grados Celsius: ");
		celsius=teclado.nextInt();
		
		fahrenheit = 1.8 * celsius + 32;
		
		System.out.print("La temperatura que ha introducido anteriormente equivale en Fahrenheit a: "+fahrenheit);
	}
}		