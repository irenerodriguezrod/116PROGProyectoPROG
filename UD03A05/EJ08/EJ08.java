// 8. Realiza el pseudocódigo y la codificación en lenguaje de
// programación Java de un algoritmo que solicite por teclado un
// número entero positivo y muestre por pantalla un mensaje
// indicando si el número introducido es primo o no. Un número es
// primo cuando es mayor que 1 y tiene sólo dos divisores, él mismo
// y el 1.


import java.util.Scanner;

public class EJ08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        boolean esPrimo;

        // Solicitar un número entero positivo
        System.out.print("Introduzca un número entero positivo: ");
        n = telcado.nextInt();

        // Comprobar que el número es positivo
        while (n <= 0) {
            System.out.println("Error en la entrada. Introduzca un número entero positivo:");
            n = teclado.nextInt();
        }

        esPrimo = true; // INTERRUPTOR que declara que el numero introducido ES PRIMO. El interruptor siempre se inicialza cerca del bucle
        // Comprobar si n es primo
        for (int i = 2; i <= n / 2 && esPrimo; i++) { //
            if (n % i == 0) { // al estar empleando INTERRUPTOR, NO se pone else, solo lleva IF
                primo = false;
               // break; // Si encontramos un divisor, no es primo, se puede o no usar
            }
        }

        // Mostrar el resultado
        if (primo) {
            System.out.println("El número " + n + " es primo.");
        } else {
            System.out.println("El número " + n + " no es primo.");
        }
    }
}
