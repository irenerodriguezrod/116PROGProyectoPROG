// 4. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java de un
// algoritmo que solicite por teclado n�meros enteros hasta que introduzca uno que no
// est� comprendido entre 1 y 10, calcule la media de los n�meros introducidos y la
// muestre por pantalla

Proceso EJ04
	Definir n, contador, acumulador Como Entero;
	
	contador<-0;
	acumulador<-0; //Al acumular sumas se inicializa a 0, en cambio si acumulase producto se inicializar�a a 1
	
	Escribir "Introduzca un n�mero (1-10): ";
	Leer n;
	
	Mientras n>=1 y n<=10 Hacer
		contador<-(contador+1);
		acumulador<-(acumulador+n);
		
		Escribir "Introduzca un n�mero (1-10): ";
		Leer n;
		
	FinMientras
	
	Si contador<>0 Entonces
		Escribir acumulador/contador;
	SiNo
		Escribir "No se ha introducido ning�n n�mero entero dentro del rango";
	FinSi

	
FinProceso
