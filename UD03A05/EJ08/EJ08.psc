// 8. Realiza el pseudoc�digo y la codificaci�n en lenguaje de
// programaci�n Java de un algoritmo que solicite por teclado un
// n�mero entero positivo y muestre por pantalla un mensaje
// indicando si el n�mero introducido es primo o no. Un n�mero es
// primo cuando es mayor que 1 y tiene s�lo dos divisores, �l mismo
// y el 1.



Proceso EJ08
	Definir n Como Entero;
	Definir i Como Entero;
	Definir esPrimo Como Logico;;
	
	Escribir "Introduzca un numero entero positivo: ";
	Leer n;
	Mientras n<=0 Hacer //comprobar que el n�mero es positivo
		Escribir "Error en la entrada";
		
		Escribir "Introduzca un n�mero entero positivo" Sin Saltar;
		Leer n;
		
	FinMientras
	
	esPrimo<-Verdadero;
	Para i<-1 Hasta n/2 Con Paso 1 Hacer; // i se define como 2 ya que si la definieramos como 1, nunca ser�a primo
		Si n%i=0 Entonces
			esPrimo<-Falso;
			i<-n;
		FinSi
		
	FinPara
	
	Si esPrimo Entonces
		Escribir "El n�mero ",n," es primo";
	SiNo
		Escribir "El n�mero ",n," no es primo";
	FinSi
	
FinProceso
