// 7. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n
// Java de un algoritmo que solicite por teclado un a�o y muestre por
// pantalla un mensaje indicando si el a�o es bisiesto o no. Un a�o es
// bisiesto si es divisible entre 400 o si es divisible entre 4 pero no entre 100

Proceso EJ07
	Definir anyo Como Entero;
	
	Escribir "Introduzca un a�o: "Sin Saltar;
	Leer anyo;
	
	Si anyo%400=0 o (anyo%4=0 y anyo%100<>0) Entonces
		Escribir "El a�o ",anyo," introducido es bisiesto";
	SiNo
		Escribir "El a�o ",anyo," introducido no es bisiesto";
	FinSi
	
FinProceso
