// 1.  Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado tres números y muestre por
// pantalla un mensaje indicando si los tres números son iguales, si los tres
// son distintos o si hay dos iguales.


Proceso EJ01
	Definir n1,n2,n3 Como Entero;
	
	Escribir "Introduzca el primer número: ";
	Leer n1;
	
	Escribir "Introduzca el segundo número: ";
	Leer n2;
	
	Escribir "Introduzca el tercer número: ";
	Leer n3;
	
	Si n1=n2 y n2=n3 y n1=n3 Entonces  // NO ES NECESARIO PREGUNTAR N1=N3
		Escribir "Los tres numeros son iguales.";
	SiNo
		Si n1<>n2 y n2<>n3 y n1<>n3 Entonces
			Escribir "Los tres números son distintos";
			
		SiNo
			Escribir "Hay dos números iguales";
		FinSi
	FinSi

	
FinProceso
