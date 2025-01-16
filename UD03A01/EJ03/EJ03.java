// 3. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado dos números y si son iguales
// muestre por pantalla el mensaje: Los números introducidos son iguales

import java.util.Scanner;

public class EJ03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Introduzca el primer número: ");
		n1=teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		n2=teclado.nextInt();
		
		if (n1==n2) {
			System.out.print("Los números introducidos son iguales");
		}
	}
}