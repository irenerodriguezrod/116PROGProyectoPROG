// 4. . Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java de un algoritmo que solicite por teclado
// un mes (entero entre 1 y 12) y muestre por pantalla el n�mero de d�as que tiene dicho mes.

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
