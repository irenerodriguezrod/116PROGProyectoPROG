// 5. Realiza la codificación en lenguaje de programación Java de un
// algoritmo que solicite por teclado un número de filas y de
// columnas (enteros comprendidos entre 2 y 10) y muestre por
// pantalla una figura similar a la siguiente (filas=5,
// columnas=10).



Proceso EJ05
	
	Definir filas, columnas Como Entero;
	Definir i, j Como Entero;
	
	Escribir "Introduzca numero filas(2-10): " Sin Saltar;
	Leer filas;
	Mientras filas<2 o filas>10 hacer;
		escribir "Error en la entrada";
		Escribir "Introduzca numero filas(2-10): " Sin Saltar;
		Leer filas;
	FinMientras
	Escribir "Introduzca numero columnas(2-10): " Sin Saltar;
	Leer columnas;
	Mientras columnas<2 o columnas>10 hacer;
		escribir "Error en la entrada";
		Escribir "Introduzca numero columnas(2-10): " Sin Saltar;
		Leer columnas;
	FinMientras
	
	Para i<-1 Hasta filas Con Paso 1 Hacer
		Para j<-1 Hasta columnas Con Paso 1 Hacer
			Escribir "*" Sin Saltar;
		FinPara
		Escribir "";
	FinPara
	
FinProceso
