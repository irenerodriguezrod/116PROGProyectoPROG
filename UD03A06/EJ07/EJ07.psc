// 7. Realiza el pseudocódigo y la codificación en lenguaje de
// programación Java de un algoritmo que solicite por teclado un
// número de filas (entero comprendido entre 2 y 9) y muestre por
// pantalla una figura similar a la siguiente (filas=5)


Proceso EJ07
	Definir filas Como Entero;
	Definir i, j Como Entero;
	
	Escribir "Introduzca numero filas(2-10): " Sin Saltar;
	Leer filas;
	Mientras filas<2 o filas>10 hacer;
		escribir "Error en la entrada";
		Escribir "Introduzca numero filas(2-10): " Sin Saltar;
		Leer filas;
	FinMientras
	
	Para i<-1 Hasta filas Con Paso 1 Hacer
		Para j<-filas Hasta i Con Paso -1 Hacer
			Escribir j," " Sin Saltar;
		FinPara
		Escribir "";
	FinPara
FinProceso
