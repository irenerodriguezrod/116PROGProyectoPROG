// 7. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado un año y muestre por
// pantalla un mensaje indicando si el año es bisiesto o no. Un año es
// bisiesto si es divisible entre 400 o si es divisible entre 4 pero no entre 100

Proceso EJ07
	Definir anyo Como Entero;
	
	Escribir "Introduzca un año: "Sin Saltar;
	Leer anyo;
	
	Si anyo%400=0 o (anyo%4=0 y anyo%100<>0) Entonces
		Escribir "El año ",anyo," introducido es bisiesto";
	SiNo
		Escribir "El año ",anyo," introducido no es bisiesto";
	FinSi
	
FinProceso
