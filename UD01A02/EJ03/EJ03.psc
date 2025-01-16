// 3. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
// algoritmo que solicite por teclado dos números enteros y muestre por pantalla el
// cociente y el resto de ambos números.

Proceso EJ03
	Definir dividendo, divisor como entero;
	Definir cociente, resto Como Entero;
	
	Escribir "Introduzca dividendo: " Sin Saltar;
	Leer dividendo;
	Escribir "Introduzca divisor: " Sin Saltar;
	Leer divisor;
	
	cociente<-trunc(dividendo/divisor);
	
	Escribir "Cociente: ",cociente;
	
FinProceso
