// 1. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java de un
// algoritmo que solicite por teclado n�meros enteros hasta que se introduzca uno no
// positivo y por cada uno de los n�meros introducidos muestre por pantalla uno de los
// siguientes mensajes: PAR IMPAR



Proceso EJ01
	Definir n Como Entero;
	
	// siempre se lee antes y durante el bucle
	Escribir "Introduzca un numero: ";
	Leer n;
	
	Mientras n>0 Hacer
		
		Si n%2=0 Entonces
			Escribir "Par";
		SiNo
			Escribir "Impar";
		FinSi
		
		Escribir "Introduzca un numero: ";
		Leer n;
	FinMientras
	
FinProceso