// 7. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java de un
// algoritmo que solicite por teclado dos n�meros enteros positivos (a y b) y muestre por
// pantalla el m�ximo com�n divisor calcul�ndolo mediante el algoritmo de Euclides.
// 	 - Si a es menor que b se intercambian los valores
//	 - Sea r el resto de dividir a entre b
// 	 - Si r=0 entonces mcd(a,b)=b sino mcd(a,b)=mcd(b,r)



Proceso EJ07
	Definir  a, b, resto Como Entero;
	
	Leer a;
	Leer b;
	
	resto<-a%b;
	
	Mientras resto<>0 Hacer
		a<-b;
		b<-resto;
		
		resto<-a%b;
	FinMientras
	Escribir"mcd=",b;
	
FinProceso
