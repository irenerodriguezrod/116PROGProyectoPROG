// 1. Realiza el pseudoc�digo y la codificaci�n en lenguaje de
// programaci�n Java de un algoritmo que solicite por teclado un
// n�mero entero comprendido entre 1 y 5 y muestre por pantalla el
// mensaje HOLA MUNDO las veces indicadas por dicho n�mero

Proceso EJ01
	Definir n Como Entero;
	Definir i Como Entero; // al ser bucle para se define asi
	
	Escribir "Introduzca entero (1-5): "Sin Saltar;
	Leer n;
	Mientras n<1 o n>5 Hacer
		Escribir "Error en la entrada";
		Escribir "Introduzca entero (1-5): "Sin Saltar;
		Leer n;
	FinMientras
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir "Hola mundo";
	FinPara
	
FinProceso
