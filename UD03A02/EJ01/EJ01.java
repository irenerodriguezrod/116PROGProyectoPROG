// 1. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado dos números y muestre por
// pantalla el mayor

import java.util.Scanner;

public class EJ01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int numero1, numero2 ;
		
		System.out.print("Introduzca un numero entero: ");
		numero1=teclado.nextInt();
		System.out.print("Introduzca otro número entero: ");
		numero2= teclado.nextInt();
		
		
		if (numero1<numero2) {
			System.out.print(numero2);
		}
		else{
			System.out.print(numero1);
		}
	}
}