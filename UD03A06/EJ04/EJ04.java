// 4. Realiza el pseudocódigo y la codificación en lenguaje de
// programación Java de un algoritmo que solicite por teclado un
// número entero positivo (n) y muestre por pantalla los primos
// comprendidos entre 1 y n y cuantos son.

import java.util.Scanner;

public class EJ04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, i, numerosAComprobar;
        boolean esPrimo;
		
		System.out.print("Introduzca los números enteros a comprobar: ");
		numerosAComprobar=teclado.nextInt();
		
		for(n=2;n==numerosAComprobar;n++) {
			esPrimo = true;
			for(i=2;n/n;i++) {
				if (n%i=0) {
					esPrimo = false;
					i=n;
				}
			}
			if (esPrimo) {
				System.out.print(n);
			}
		}
	}
}