// 1.  Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n
// Java de un algoritmo que solicite por teclado tres n�meros y muestre por
// pantalla un mensaje indicando si los tres n�meros son iguales, si los tres
// son distintos o si hay dos iguales.


Proceso EJ01
	Definir n1,n2,n3 Como Entero;
	
	Escribir "Introduzca el primer n�mero: ";
	Leer n1;
	
	Escribir "Introduzca el segundo n�mero: ";
	Leer n2;
	
	Escribir "Introduzca el tercer n�mero: ";
	Leer n3;
	
	Si n1=n2 y n2=n3 y n1=n3 Entonces  // NO ES NECESARIO PREGUNTAR N1=N3
		Escribir "Los tres numeros son iguales.";
	SiNo
		Si n1<>n2 y n2<>n3 y n1<>n3 Entonces
			Escribir "Los tres n�meros son distintos";
			
		SiNo
			Escribir "Hay dos n�meros iguales";
		FinSi
	FinSi

	
FinProceso
