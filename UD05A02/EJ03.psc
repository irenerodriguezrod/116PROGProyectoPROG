// 3. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que permita llenar una matriz de dos filas y tres
// columnas con números reales solicitados por teclado. A continuación
// solicitará un número real (n) y deberá buscarlo en la matriz. Para
// finalizar mostrará por pantalla si lo ha encontrado o no. En caso afirmativo también deberá mostrar la posición.

Proceso EJ03
	// Declarar la matriz y las variables
	Definir matriz Como Real;
	Dimension matriz[2,3];
	Definir n Como Real;
	Definir i, j Como Entero;
	Definir encontrado Como Logico;
	Definir posicionFila, posicionColumna Como Entero;
	
	// Inicializar la variable de búsqueda
	encontrado <- Falso;
	posicionFila <- -1;
	posicionColumna <- -1;
	
	// Introducir datos de la matriz
	Para i <- 0 Hasta 1 Hacer
		Para j <- 0 Hasta 2 Hacer
			Escribir "Introduce elementos [", i, "][", j, "]: ";
			Leer matriz[i, j];
		FinPara
	FinPara
	
	// Solicitar número para buscarlo en la matriz
	Escribir "Introduzca un número real para buscarlo en la matriz: ";
	Leer n;
	
	// Buscar el número en la matriz
	Para i <- 0 Hasta 1 Hacer
		Para j <- 0 Hasta 2 Hacer
			Si matriz[i, j] = n Entonces
				encontrado <- Verdadero;
				posicionFila <- i;
				posicionColumna <- j;
			FinSi
		FinPara
	FinPara
	
	// Mostrar el resultado de la búsqueda
	Si encontrado Entonces
		Escribir "Número encontrado en la posición [", posicionFila, "][", posicionColumna, "].";
	SiNo
		Escribir "Número no encontrado en la matriz.";
	FinSi
FinProceso
