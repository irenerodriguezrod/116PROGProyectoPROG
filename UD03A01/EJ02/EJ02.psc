// 2.  Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n
// Java de un algoritmo que solicite por teclado un n�mero y si es negativo lo
// cambie de signo. Para finalizar mostrar� el n�mero por pantalla.

Proceso EJ02
	Definir numeroEntero Como Entero;
	Escribir "Introduce un numero entero: " Sin Saltar;
	Leer numeroEntero;
	
	Si numeroEntero<0 Entonces
		numeroEntero<--numeroEntero;
	FinSi
	
	Escribir numeroEntero;
	
FinProceso
