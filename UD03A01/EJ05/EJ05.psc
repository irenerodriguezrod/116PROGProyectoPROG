// 5.. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n
// Java de un algoritmo que solicite por teclado dos n�meros y si el primero
// es mayor que el segundo intercambie sus valores. Para finalizar mostrar�
// por pantalla los n�meros introducidos.


Proceso EJ05
	Definir n1, n2 Como Entero;
	definir aux Como Entero;
	
	Escribir "Introduzca el primer n�mero entero: ";
	Leer n1;
	Escribir "Introduzca el segundo n�mero entero: ";
	Leer n2;
	
	si n1>n2 Entonces
		aux<- n1;
		n1<-n2;
		n2<-aux;
	FinSi
	
	Escribir n1,",",n2;
	
FinProceso
