// 5.. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado dos números y si el primero
// es mayor que el segundo intercambie sus valores. Para finalizar mostrará
// por pantalla los números introducidos.


Proceso EJ05
	Definir n1, n2 Como Entero;
	definir aux Como Entero;
	
	Escribir "Introduzca el primer número entero: ";
	Leer n1;
	Escribir "Introduzca el segundo número entero: ";
	Leer n2;
	
	si n1>n2 Entonces
		aux<- n1;
		n1<-n2;
		n2<-aux;
	FinSi
	
	Escribir n1,",",n2;
	
FinProceso
