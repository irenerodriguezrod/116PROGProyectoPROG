// 6. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado las horas, los minutos y los
// segundos de una hora y muestre por pantalla un mensaje indicando si se
// trata de una hora correcta o incorrecta. 

import java.util.Scanner;

public class EJ06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int hora, min, seg;
		
		System.out.print("Introduzca una hora(0-23): ");
		hora=teclado.nextInt();
		System.out.print("Introduzca unos minutos(0-59): ");
		min=teclado.nextInt();
		System.out.print("Introduzca unos segundos(0-59): ");
		seg=teclado.nextInt();
		
		if (hora<=23 && hora>=0 && min<=59 && min>=0 && seg<=59 && seg>=0) {
			System.out.print("La hora introducida es correcta");
		}
		else {
			System.out.print("La hora introducida es incorrecta");
		}
	}
}