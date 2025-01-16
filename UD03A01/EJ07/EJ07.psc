// 7. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo
// que solicite por teclado un entero positivo y si no está comprendido entre 1 y 12 muestre 
// por pantalla el mensaje: Error en la entrada 


Proceso EJ07
	Definir numeroEntero Como Entero;
	
	Escribir "Introduzca un numero entero(1-12): " Sin Saltar;
	Leer numeroEntero;
	
	Si numeroEntero<1 o numeroEntero>12 Entonces;
		Escribir Error en la entrada;
	FinSi
FinProceso
