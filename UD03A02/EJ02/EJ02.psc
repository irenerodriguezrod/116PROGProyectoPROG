// 2. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n
// Java de un algoritmo que solicite por teclado dos n�meros enteros
// positivos y muestre por pantalla un mensaje indicando si el segundo es
// divisor del primero o no.

Proceso EJ02
	Definir numero1, numero2 Como Entero;;
	
	Escribir "Introoduzca un numero entero positivo: ";
	Leer numero1;
	Escribir "Introduzca otro n�mero entero positivo: ";
	Leer numero2;
	
	
	Si numero1>numero2 Entonces
		Escribir "El numero ",numero2," es divisor de ", numero1;
	SiNo
		Escribir "El numero ",numero2," no es divisor de ",numero1;
	FinSi
	
FinProceso
