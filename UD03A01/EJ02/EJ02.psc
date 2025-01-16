// 2.  Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado un número y si es negativo lo
// cambie de signo. Para finalizar mostrará el número por pantalla.

Proceso EJ02
	Definir numeroEntero Como Entero;
	Escribir "Introduce un numero entero: " Sin Saltar;
	Leer numeroEntero;
	
	Si numeroEntero<0 Entonces
		numeroEntero<--numeroEntero;
	FinSi
	
	Escribir numeroEntero;
	
FinProceso
