//  4.  Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n
// Java de un algoritmo que solicite por teclado tres n�meros enteros
// positivos y muestre por pantalla un mensaje indicando si forman una
// progresi�n aritm�tica. En una progresi�n aritm�tica la diferencia entre dos
// t�rminos consecutivos siempre es la misma.


Proceso EJ04
	Definir numero1, numero2, numero3, diferencia1, diferencia2 Como Entero;
	
	Escribir "Introduzca el primer numero entero positivo: " Sin Saltar;
	Leer numero1;
	Escribir "Introduzca el segundo numero entero positivo: " Sin Saltar;
	Leer numero2;
	Escribir "Introduzca el tercer numero entero positivo: " Sin Saltar;
	Leer numero3;
	
	diferencia1<-numero2-numero1;
	diferencia2<-numero3-numero2;
	
	
	
	//Si numero2-numero1 = numero3-numero2 Entonces
	Si (diferencia1=diferencia2) Entonces
		Escribir "Los numeros forman una progresion aritmetica";
	SiNo
		Escribir "Los numeros NO forman una progresion aritmetica";
	FinSi
	
FinProceso
