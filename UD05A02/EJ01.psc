// 1. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n
// Java de un algoritmo que permita llenar una matriz de tres filas y dos
// columnas con n�meros enteros solicitados por teclado. A continuaci�n
// comprobar� si la matriz es positiva (todos los elementos son mayores o
// iguales a cero) y mostrar� por pantalla uno de los siguientes
// mensajes: "MATRIZ POSITIVA" o "MATRIZ NO POSITIVA".

Algoritmo EJ01
	// Declarar matriz y variables
	Definir matriz Como Entero;
	Dimension matriz[3,2];
	Definir i, j Como Entero;
	Definir esPositiva Como Logico;
	
	// Inicializar la variable esPositiva en Verdadero
	esPositiva <- Verdadero;
	
	// Entrada de datos
	Escribir "Introduce los n�meros para llenar la matriz:";
	Para i <- 0 Hasta 2 Hacer
		Para j <- 0 Hasta 1 Hacer
			Escribir "Introduce entero para la posici�n [", i, "][", j, "]: " Sin Saltar;
			Leer matriz[i, j];
		FinPara
	FinPara
	
	// Comprobar si la matriz es positiva
	Para i <- 0 Hasta 2 Hacer
		Para j <- 0 Hasta 1 Hacer
			Si matriz[i, j] < 0 Entonces
				esPositiva <- Falso;
			FinSi
		FinPara
	FinPara
	
	// Mostrar resultado
	Si esPositiva Entonces
		Escribir "MATRIZ POSITIVA";
	SiNo
		Escribir "MATRIZ NO POSITIVA";
	FinSi
FinAlgoritmo
