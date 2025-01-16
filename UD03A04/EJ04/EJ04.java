// 4. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
// algoritmo que solicite por teclado números enteros hasta que introduzca uno que no
// esté comprendido entre 1 y 10, calcule la media de los números introducidos y la
// muestre por pantalla.

import java.util.Scanner;

public class EJ04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int n;
		int contador=0;
		float acumulador=0;

		
		System.out.print("Introduzca un número: ");
		n=teclado.nextInt();
		
		while (n>=1 && n<=10) {
			contador++; //contador=(contador+1);
			acumulador+=n; //acumulador=(acumulador+n);
			
			System.out.println("Introduzca un número: ");
			n=teclado.nextInt();
			
		}
		
		if (contador!=0) {
			System.out.print(acumulador/contador;
		}
		else {
			System.out.print ("No se ha introducido ningún número entero dentro del rango");
		}
		
	}
}