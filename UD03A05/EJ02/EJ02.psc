// 2. Realiza el pseudocódigo y la codificación en lenguaje de
// programación Java de un algoritmo que solicite por teclado un
// número entero comprendido entre 1 y 10 y muestre por pantalla la
// tabla de multiplicar de dicho número.


Proceso EJ02
	Definir n Como Entero; //se define el numero que se va a multiplicar
	Definir i Como Entero; //para definir el bucle Para (CONTADOR)
	
	Escribir "Introduzca un número(1-10): "Sin Saltar;
	Leer n;
	
	Mientras n<1 o n>10 Hacer
		Escribir "Error en la entrada";
		Escribir "Introduzca entero (1-10): "Sin Saltar;
		Leer n;
	FinMientras
	
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir i,"*",n,"=",i*n;
	FinPara
	
FinProceso
