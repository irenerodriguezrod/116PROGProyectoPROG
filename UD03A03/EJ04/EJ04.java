// 4. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado
// un mes (entero entre 1 y 12) y muestre por pantalla el número de días que tiene dicho mes.

import java.util.Scanner;

public class EJ04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int mes;
		int diasMes;
		String salida;
		
		System.out.print("Introduzca un mes: ");
		mes=teclado.nextInt();
		
		if(mes>=1 && mes<=12) {
			diasMes=switch(mes){ //se emplea el switch como expresion para que devuelva un valor
				case 4,6,9,11 ->30;
				case 2 -> 28;
				default ->31; // la equivalencia de -> es el break en la anterior version de Java
			};
			System.out.printf("El mes %d tiene %d dias\n",mes,diasMes);
			
		}
		else {
			System.out.print ("ERROR EN LA ENTRADA");
		}