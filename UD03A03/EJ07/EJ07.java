// 7. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado una calificación (entero entre 0 y 10) 
// y muestre por pantalla uno de los siguientes mensajes: SUSPENSO(0-4), APROBADO(5-6),  NOTABLE(7-8), SOBRESALIENTE (9,10).


import java.util.Scanner;

public class EJ07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int nota;
		string salida;
		
		System.out.print("Introduzca calificacion(1-10): ");
		nota=teclado.nextInt();
		
		if(nota<=1 && nota>=10) {
			nota=switch(nota){ //se emplea el switch como expresion para que devuelva un valor
				case 0,1,2,3,4 ->salida=("Suspenso");
				case 5,6 -> salida=("Aprobado");
				case 7,8 -> salida=("Notable");
				default ->salida=("Sobresaliente"); // la equivalencia de -> es el break en la anterior version de Java
			};
			System.out.printf(salida);