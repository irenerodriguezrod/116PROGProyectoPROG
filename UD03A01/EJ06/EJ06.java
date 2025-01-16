// 6. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo 
// que solicite por teclado una calificación (número entero) 
// y si está comprendido entre 0 y 10 muestre por pantalla el mensaje:  Calificación correcta 


import java.util.Scanner;

public class EJ06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int nota;
		
		System.out.print("Introduzca el primer número: ");
		nota=teclado.nextInt();
		
		if (nota >=0 && n2<=10) {
			System.out.print("Calificacion correcta"); 
		}
	}
}