// 1. Realiza el pseudoc�digo y la codificaci�n en lenguaje de
// programaci�n Java de un algoritmo que muestre por pantalla las
// tablas de multiplicar desde el 1 hasta el 5.

//SubProceso escribirTablaMultiplicar(n)
//	Escribir "TABLA DEL ",n;
//	
//FinSubProceso

Proceso EJ01
	Definir n Como Entero;
	Definir i Como Entero;
	
Para n<-1 Hasta 5 Con Paso 1 Hacer
	Para i<-1 Hasta 10 Con Paso 1 Hacer
			Escribir i," * ",n," =",i*n;
		FinPara
	FinPara
	
FinProceso
