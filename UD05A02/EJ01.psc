// 1. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que permita llenar una matriz de tres filas y dos
// columnas con números enteros solicitados por teclado. A continuación
// comprobará si la matriz es positiva (todos los elementos son mayores o
// iguales a cero) y mostrará por pantalla uno de los siguientes
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
	Escribir "Introduce los números para llenar la matriz:";
	Para i <- 0 Hasta 2 Hacer
		Para j <- 0 Hasta 1 Hacer
			Escribir "Introduce entero para la posición [", i, "][", j, "]: " Sin Saltar;
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
