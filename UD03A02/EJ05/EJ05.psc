// 5. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n
// Java de un algoritmo que solicite por teclado tres n�meros enteros
// positivos y muestre por pantalla un mensaje indicando si el tercer n�mero
// est� m�s cerca del primero o del segundo

Proceso EJ05
	Definir numero1, numero2, numero3, diferencia1, diferencia2 Como Entero;
	
	Escribir "Introduzca el primer numero entero: " Sin Saltar;
	Leer numero1;
	Escribir "Introduzca el segundo numero entero: " Sin Saltar;
	Leer numero2;
	Escribir "Introduzca el tercer numero entero: " Sin Saltar;
	Leer numero3;
	
	diferencia1<--numero3-numero1;
	diferencia2<-numero3-numero2;
	
	
	
	//Si abs(numero3-numero1) < abs(numero3-numero2) Entonces
	//Escribir El primero esta mas cerca que el segundo
	//Si no 
	//Escribir El segundo est� m�s cerca que el primero
	
	Si (diferencia1>diferencia2) Entonces
		Escribir "El n�mero ",numero3," est� mas cerca de: ",numero2;
	SiNo
		Escribir "El n�mero ",numero3," est� mas cerca de: ",numero1;
	FinSi
	
FinProceso
