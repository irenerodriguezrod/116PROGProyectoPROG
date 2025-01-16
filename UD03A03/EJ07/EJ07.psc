// 7. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado una calificación (entero entre 0 y 10) 
// y muestre por pantalla uno de los siguientes mensajes: SUSPENSO(0-4), APROBADO(5-6),  NOTABLE(7-8), SOBRESALIENTE (9,10).


Proceso EJ07
	Definir nota Como Entero;
	
	Escribir "Introduzca una calificacion (1-10): " Sin Saltar;
	Leer nota;
	
	Segun nota Hacer
		0-4:
			Escribir "SUSPENSO";
		5-6:
			Escribir "APROBADO";
		7-8:
			Escribir "NOTABLE";
		9-10:
			Escribir "SOBRESALIENTE";
		De Otro Modo:
			Escribir "Valor incorrecto";
	FinSegun
	
FinProceso



Si nota<=0 y nota<=10 Entonces
	si nota<5 Entonces
		Escribir Suspenso
	Sino
		Si nota<7 Entonces
			Escribir Aprobado
		Sino 
			Si nota<9 Entonces
				Escribir notable
			SiNo
				Escribir sobresaliente
			FinSi
		FinSi
	FinSi
FinSi


