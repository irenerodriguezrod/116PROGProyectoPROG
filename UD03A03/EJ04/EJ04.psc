// 4. . Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java de un algoritmo que solicite por teclado
// un mes (entero entre 1 y 12) y muestre por pantalla el n�mero de d�as que tiene dicho mes.


Proceso EJ04
	Definir mes Como Entero;
	
	Escribir "Introduzca un mes(1- 12): ";
	Leer mes;
	
	Si mes >= 1 y mes<=12 Entonces
		Si mes=4 o mes =6 mes=9 o mes=11 Entonces;
			Escribir "30 d�as";
		SiNo
			Si mes=2 Entonces
				Escribir "28 dias";
			Sino 
				Escribir "31 dias";
			FinSi
		FinSi
	SiNo
		Escribir "Mes incorrecto";
	FinSi
	
FinProceso
