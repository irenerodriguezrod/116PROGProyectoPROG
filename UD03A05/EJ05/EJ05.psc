// 5. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java
// de un algoritmo que solicite por teclado diez n�meros enteros y muestre por pantalla si se ha introducido el n�mero 5 o no.


Proceso EJ05
	Definir n Como Entero;
	Definir i Como Entero;	
	Definir hayCinco Como Logico;
	
	Escribir "Introduzca 10 n�meros: ";
	
	hayCinco<-Falso;
	hayCinco<-Falso;
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Leer n;
		Escribir "Introduzca el siguiente numero: ";
		Leer n;
		
		Si n=5 Entonces
			hayCinco<-Verdadero
		FinSi
		
	FinPara
	
FinProceso




//
//Si n>0 Entonces
//	Para i<-1 Hasta 10 Con Paso 1 Hacer
//		Leer n;
//		Escribir "Introduzca el siguiente numero: ";
//		Leer n;
//		
//		Si n=5 Entonces
//			Escribir "Se ha introducido el numero 5";
//		SiNo
//			Escribir "No se ha introducido el n�mero 5";
//		FinSi
//	FinPara
//SiNo
//	Escribir "El numero introducido es incorrecto";
//FinSi