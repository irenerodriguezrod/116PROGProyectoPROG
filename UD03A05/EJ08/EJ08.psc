// 8. Realiza el pseudocódigo y la codificación en lenguaje de
// programación Java de un algoritmo que solicite por teclado un
// número entero positivo y muestre por pantalla un mensaje
// indicando si el número introducido es primo o no. Un número es
// primo cuando es mayor que 1 y tiene sólo dos divisores, él mismo
// y el 1.



Proceso EJ08
	Definir n Como Entero;
	Definir i Como Entero;
	Definir esPrimo Como Logico;;
	
	Escribir "Introduzca un numero entero positivo: ";
	Leer n;
	Mientras n<=0 Hacer //comprobar que el número es positivo
		Escribir "Error en la entrada";
		
		Escribir "Introduzca un número entero positivo" Sin Saltar;
		Leer n;
		
	FinMientras
	
	esPrimo<-Verdadero;
	Para i<-1 Hasta n/2 Con Paso 1 Hacer; // i se define como 2 ya que si la definieramos como 1, nunca sería primo
		Si n%i=0 Entonces
			esPrimo<-Falso;
			i<-n;
		FinSi
		
	FinPara
	
	Si esPrimo Entonces
		Escribir "El número ",n," es primo";
	SiNo
		Escribir "El número ",n," no es primo";
	FinSi
	
FinProceso
