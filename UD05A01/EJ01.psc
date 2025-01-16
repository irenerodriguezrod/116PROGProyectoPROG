// 1. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java de un algoritmo que solicite por teclado 5 n�meros enteros,
// los almacene en un vector y a continuaci�n calcule la cantidad de elementos negativos del vector y la muestre por pantalla.

SubProceso contadorNegativos <- contarNegativos (vector, numeroElementos)
	Definir contadorNegativos Como Entero;
	Definir i Como Entero;
	
	contadorNegativos<-0;
	Para i<-0 Hasta numeroElementos-1 Con Paso 1 Hacer
		Si vector[i]<0 Entonces
			contadorNegativos<-contadorNegativos+1;
		FinSi
	FinPara
	
FinSubProceso


Proceso EJ01
	Definir vector Como Entero;
	Dimension vector[5];  //se define el numero maximo de numeros que se pueden introducir, en este caso son 5
	Definir i Como Entero; //se define como entero, es el indice. son los elementos que hay dentro del vector
	
	Escribir "Introduce 5 enteros: ";
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Leer vector[i];
	FinPara
	
	Escribir contarNegativos(vector,5);
	
FinProceso
