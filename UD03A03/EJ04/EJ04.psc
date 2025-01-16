// 4. . Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado
// un mes (entero entre 1 y 12) y muestre por pantalla el número de días que tiene dicho mes.


Proceso EJ04
	Definir mes Como Entero;
	
	Escribir "Introduzca un mes(1- 12): ";
	Leer mes;
	
	Si mes >= 1 y mes<=12 Entonces
		Si mes=4 o mes =6 mes=9 o mes=11 Entonces;
			Escribir "30 días";
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
