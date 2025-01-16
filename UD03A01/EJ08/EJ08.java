//8. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo
// que solicite por teclado dos números y si el segundo es distinto de cero muestre por pantalla 
// el resultado de dividir el primer número entre el segundo.

import java.util.Scanner;

public class EJ08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int dividendo, divisor;
		
		System.out.print("Introduzca dividendo: ");
		dividendo=teclado.nextInt();
		System.out.print("Introduzca divisor: ");
		divisor=teclado.nextInt();
		
		if (divisor !=0) {
			System.out.print((float)dividendo/divisor); //dividendo se convierte en float para que en el resultado de con decimales
		}
	}
}