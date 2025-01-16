// 6. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado
// un mes (entero entre 1 y 12) y muestre por pantalla el nombre del mismo.


Proceso EJ06
	Definir mes Como Entero;
	
	Escribir "Introduzca un mes (1-12): " Sin Saltar;
	Leer mes;
	
	Segun mes Hacer
		1:
			Escribir "Enero";
		2:
			Escribir "Febrero";
		3:
			Escribir "Marzo";
		4:
			Escribir "Abril";
		5: 
			Escribir "Mayo";
		6:
			Escribir "Junio";
		7:
			Escribir "Julio";
		8:
			Escribir "Agosto";
		9:
			Escribir "Septiembre";
		10:
			Escribir "Octubre";
		11: 
			Escribir "Noviembre";
		12: 
			Escribir "Diciembre";
		De Otro Modo:
			Escribir "Error en la entrada";
	FinSegun
	
FinProceso
