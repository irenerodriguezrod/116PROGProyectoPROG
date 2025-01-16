// 4. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado dos números y si ambos son
// positivos muestre por pantalla la media de los mismos.

import java.util.Scanner;

public class EJ04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int n1, n2, media;
		
		System.out.print("Introduzca el primer número: ");
		n1=teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		n2=teclado.nextInt();
		
		if (n1>0 && n2>0) {
			System.out.print((n1+n2)/2.0); //se puede declarar como double o como float para que de decimales
		}
	}
}
