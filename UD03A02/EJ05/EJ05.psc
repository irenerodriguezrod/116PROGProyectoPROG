// 5. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado tres números enteros
// positivos y muestre por pantalla un mensaje indicando si el tercer número
// está más cerca del primero o del segundo

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
	//Escribir El segundo está más cerca que el primero
	
	Si (diferencia1>diferencia2) Entonces
		Escribir "El número ",numero3," está mas cerca de: ",numero2;
	SiNo
		Escribir "El número ",numero3," está mas cerca de: ",numero1;
	FinSi
	
FinProceso
