//  4.  Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado tres números enteros
// positivos y muestre por pantalla un mensaje indicando si forman una
// progresión aritmética. En una progresión aritmética la diferencia entre dos
// términos consecutivos siempre es la misma.


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
