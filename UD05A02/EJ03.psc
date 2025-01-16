// 3. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n
// Java de un algoritmo que permita llenar una matriz de dos filas y tres
// columnas con n�meros reales solicitados por teclado. A continuaci�n
// solicitar� un n�mero real (n) y deber� buscarlo en la matriz. Para
// finalizar mostrar� por pantalla si lo ha encontrado o no. En caso afirmativo tambi�n deber� mostrar la posici�n.

Proceso EJ03
	// Declarar la matriz y las variables
	Definir matriz Como Real;
	Dimension matriz[2,3];
	Definir n Como Real;
	Definir i, j Como Entero;
	Definir encontrado Como Logico;
	Definir posicionFila, posicionColumna Como Entero;
	
	// Inicializar la variable de b�squeda
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
	
	// Solicitar n�mero para buscarlo en la matriz
	Escribir "Introduzca un n�mero real para buscarlo en la matriz: ";
	Leer n;
	
	// Buscar el n�mero en la matriz
	Para i <- 0 Hasta 1 Hacer
		Para j <- 0 Hasta 2 Hacer
			Si matriz[i, j] = n Entonces
				encontrado <- Verdadero;
				posicionFila <- i;
				posicionColumna <- j;
			FinSi
		FinPara
	FinPara
	
	// Mostrar el resultado de la b�squeda
	Si encontrado Entonces
		Escribir "N�mero encontrado en la posici�n [", posicionFila, "][", posicionColumna, "].";
	SiNo
		Escribir "N�mero no encontrado en la matriz.";
	FinSi
FinProceso
