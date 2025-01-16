// 4. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado dos números y si ambos son
// positivos muestre por pantalla la media de los mismos.



Proceso EJ04
	Definir n1, n2, media Como Entero;
	
	Escribir "Escriba un numero: ";
	Leer n1;
	
	Escribir "Escriba un numero: ";
	Leer n2;
	
	Si (n1>0 y n2>0) Entonces
		media<-n1+n2/2;
		Escribir "La media de los números es: ",media;
	FinSi

FinProceso
