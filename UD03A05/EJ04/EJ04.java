// 4. Realiza el pseudocódigo y la codificación en lenguaje de programación Java 
// de un algoritmo que solicite por teclado diez números y muestre por pantalla el menor de los números introducidos.


import java.util.Scanner;
 
public class EJ04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int numero, menor;
 
        System.out.println("Introduzca 10 números:");
        
        // Leer el primer número
        numero = teclado.nextInt();
        menor = numero; // Asumimos que el primer número es el menor
 
        for (int i = 2; i <= 10; i++) {
            numero = teclado.nextInt();
            if (numero < menor) {
                menor = numero; // Actualizamos el menor
            }
        }
 
        System.out.println("El menor de los números introducidos es: " + menor);
        
    }
}