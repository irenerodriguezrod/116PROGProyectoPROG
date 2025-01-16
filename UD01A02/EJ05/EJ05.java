/*5. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
algoritmo que solicite por teclado el radio de una esfera y muestre por pantalla el
volumen de la misma. */

import java.util.Scanner;
public class EJ05{
	public static void main(String [] args) {
		Scanner teclado=new Scanner(System.in);
		double radio, volumen;
		final float PI=3.14159F;
		System.out.print("Introduce el radio: ");
		radio=teclado.nextInt();
		
		volumen = 4 * PI * radio * radio * radio / 3;
		
		System.out.print("El volumen de la esfera es: "+volumen);
	}
}	