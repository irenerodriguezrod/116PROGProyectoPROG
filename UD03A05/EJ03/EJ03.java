// 3. Realiza el pseudocódigo y la codificación en lenguaje de
// programación Java de un algoritmo que solicite por teclado un
// número entero comprendido entre 1 y 10 y muestre por pantalla el
// factorial de dicho número. Recuerda: !5=5*4*3*2*1



import java.util.Scanner;
 
public class EJ03 {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int n, i, factorial;
        
        System.out.print("Introduzca un numero entero (1-10): ");
        n = teclado.nextInt();
        
        while (n < 1 || n > 10) {
            System.out.println("Error en la entrada");
            System.out.print("Introduzca entero (1-10): ");
            n = teclado.nextInt();
        }
        
		factorial=n;
		System.out.printf("%d! = ",n);
		if(n>1) {
			System.out.print("%d * ",n);
			for (int i=n-1;i>1;i--) {
				factorial *= i; // Calculando el factorial
				System.out.prinf("%d * ",i);
			}
        
        System.out.println("1 = %d\n",factorial);
		}
	}
}