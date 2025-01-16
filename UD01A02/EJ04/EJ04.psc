// 4. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
// algoritmo que solicite por teclado tres calificaciones (números enteros) de un alumno y
// muestre por pantalla la media de las mismas.

Proceso EJ04
	Definir nota1, nota2, nota3 Como Entero;
	Definir media Como Real;
	
	Escribir "Introduzca la nota 1: ";
	Leer nota1;
	
	Escribir "Introduzca la nota 2: ";
	Leer nota2;
	
	Escribir "Introduzca la nota 3: ";
	Leer nota3;
	
	media<- (nota1+nota2+nota3)/3;
	
	Escribir "La nota media es: ",media;
	
FinProceso
