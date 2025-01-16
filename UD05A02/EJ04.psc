// 4. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que permita llenar una matriz de tres filas y dos
// columnas con números enteros solicitados por teclado. Para finalizar
//mostrará por pantalla la matriz y la matriz traspuesta (cambia las
// filas por columnas).


Proceso EJ04
	// Declarar la matriz original y sus dimensiones
	Definir matriz Como Entero;
	Dimension matriz(3,2);
	Definir i, j Como Entero;
	
	// Introducir datos de la matriz
	Para i <- 0 Hasta 2 Hacer // 3 filas
		Para j <- 0 Hasta 1 Hacer // 2 columnas
			Escribir "Introduce elemento [", i, "][", j, "]: ";
			Leer matriz[i, j];
		FinPara
	FinPara
	
	// Mostrar los datos introducidos
	Escribir "Matriz original:";
	Para i <- 0 Hasta 2 Hacer
		Para j <- 0 Hasta 1 Hacer
			Escribir Sin Saltar matriz[i, j], " ";
		FinPara
		Escribir ""; // Salto de línea después de cada fila
	FinPara
	
	// Mostrar la matriz traspuesta
	Escribir "Matriz traspuesta:";
	Para i <- 0 Hasta 1 Hacer // Recorrer columnas de la matriz original
		Para j <- 0 Hasta 2 Hacer // Recorrer filas de la matriz original
			Escribir Sin Saltar matriz[j, i], " ";
		FinPara
		Escribir ""; // Salto de línea después de cada fila
	FinPara
FinProceso

// Echo como SubProceso 
//
//SubProceso escribirTraspuesta (matriz,filas,columnas)
//	Definir i,j Como Entero;
//	Escribir "Matriz traspuesta";
//	
//	Para j<-0 Hasta columnas-1 Hacer
//		Para i<-0 Hasta filas-1 Hacer
//			Escribir Sin Saltar matriz[j, i], " ";
//		FinPara
//	FinPara
//FinSubProceso
//	