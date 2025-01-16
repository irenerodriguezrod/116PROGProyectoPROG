// 3. Realiza el pseudocódigo y la codificación en lenguaje de
// programación Java de un algoritmo que solicite por teclado
// cuatro números binarios y los muestre por pantalla en decimal.


import java.util.Scanner;

public class EJ03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		int numeroBinario, acumulador, peso, digito;
		
		for(int i=1;i<=4;i++) {
			System.out.print("Introduzca numero binario: ");
			numeroBinario=teclado.nexttInt();
			acumulador=0;
			peso=1;
			while(numeroBinario!=0) {
				digito=numeroBinario%10;
				acumulador+=digito*peso;
				peso*=2;
				numeroBinario/=10;
			}
			System.out.println(acumulador);
		}
	}
}