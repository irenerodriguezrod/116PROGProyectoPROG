// 4. . Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado
// un mes (entero entre 1 y 12) y muestre por pantalla el número de días que tiene dicho mes.

//ALTERNATIVA MULTIPLE
Proceso EJ04
	Definir mes Como Entero;
	
	Escribir "Introduzca un mes(1- 12): ";
	Leer mes;
	
	Segun mes Hacer
		1,3,5,7,8,10,12:
			Escribir 31;
		4,6,9,11:
			Escribir 30;
		2:
			Escribir 28;
		De Otro Modo:
			Escribir "error en la entrada";
	FinSegun
	
FinProceso
