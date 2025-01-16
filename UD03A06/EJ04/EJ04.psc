// 4. Realiza el pseudocódigo y la codificación en lenguaje de
// programación Java de un algoritmo que solicite por teclado un
// número entero positivo (n) y muestre por pantalla los primos
// comprendidos entre 1 y n y cuantos son.


Proceso EJ04
	Definir esPrimo Como Logico;
	Definir i Como Entero;
	Definir n Como Entero;
	Definir numerosAComprobar Como Entero;
	Definir contadorPrimos como entero;
	
	Escribir "Introduzca los numeros a comprobar: ";
	Leer numerosAComprobar;
	
	contadorPrimos<-0;
	para n<-2 hasta numerosAComprobar Con Paso 1 Hacer
		esPrimo<-Verdadero;
		Para i<-2 hasta n/n con Paso 1 Hacer;
			Si n%i=0 Entonces
				esPrimo<-falso;
				i<-n;
			FinSi
		FinPara
		Si esPrimo Entonces
			Escribir n;
			contadorPrimos<-contadorPrimos+1;
		FinSi
	FinPara
	
FinProceso
