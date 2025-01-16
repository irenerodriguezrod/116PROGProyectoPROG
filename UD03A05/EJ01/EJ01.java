// 1. Realiza el pseudocódigo y la codificación en lenguaje de
// programación Java de un algoritmo que solicite por teclado un
// número entero comprendido entre 1 y 5 y muestre por pantalla el
// mensaje HOLA MUNDO las veces indicadas por dicho número

import java.util.Scanner;

public class EJ01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.print("Introduzca un número entero (1-5): ");
		n=teclado.nextInt();
		
		
		// bucle MIENTRAS
		while (n<1 || n>5) {
			System.out.print("Error en la entrada");
			
			System.out.print("Introduzca un número entero (1-5): ");
			n=teclado.nextInt();
			
		}
		
		
		// bucle PARA
		for (int i=1;i<=5;i++) { // el significado del bucle para es desde i igual a uno o i igual o mayor que 5
			System.out.println("Hola mundo");
		}
	}
}