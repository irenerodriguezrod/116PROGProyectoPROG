// 5 . Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado dos números y si el primero
// es mayor que el segundo intercambie sus valores. Para finalizar mostrará
// por pantalla los números introducidos.


import java.util.Scanner;

public class EJ05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int n1, n2, aux;
		
		System.out.print("Introduzca el primer número: ");
		n1=teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		n2=teclado.nextInt();
		
		if (n1>n2){
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		
		
		System.out.printf("%,%d\n",n1,n2);
	}