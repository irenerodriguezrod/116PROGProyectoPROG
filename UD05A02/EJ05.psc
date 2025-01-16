// 5. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que permita llenar una matriz de tres filas y dos
// columnas con números enteros solicitados por teclado. A continuación
// generará un vector que contendrá la media de cada una de las filas.
// Para finalizar mostrará por pantalla el vector generado.

Proceso EJ05
    // Declarar la matriz y el vector
    Definir matriz Como Entero;
    Dimension matriz(3,2); // 3 filas y 2 columnas
    Definir vectorMedia Como Real;
    Dimension vectorMedia(3); // 1 media por cada fila. se dimensiona en proporcion de las filas que tiene
	
    Definir i, j Como Entero; //valor de las filas y de las columnas
    Definir acumulador Como Entero;
	
    // Introducir los datos de la matriz
    Para i <- 0 Hasta 2 Hacer // 3 filas
        Para j <- 0 Hasta 1 Hacer // 2 columnas
            Escribir "Introduce elemento [", i, "][", j, "]: " Sin Saltar;
            Leer matriz[i, j];
        FinPara
    FinPara
	
    // Calcular la media de cada fila y guardarla en el vector
    Para i <- 0 Hasta 2 Con Paso 1 Hacer
        acumulador <- 0; // Se reinicia el acumulador para cada fila
        Para j <- 0 Hasta 1 Con Paso 1 Hacer
            acumulador <- acumulador + matriz[i, j]; // Acumular los elementos de la fila
        FinPara
        // vectorMedia[i] <- acumulador / 2; // Dividir por el número de columnas
		vectorMedia[i] <- acumulador/j; //Se divide por el numero de columnas que tiene la fila, en este caso se podría poner /2 o /j ya que j tiene 2 de valor
    FinPara
	
    // Mostrar el vector con las medias
    Escribir "Medias de las filas:";
    Para i <- 0 Hasta 2 Hacer
        Escribir "Media de la fila ", i, ": ", vectorMedia[i]; // se muestra el numero de la fila de la que se hace la media y la media que queda
    FinPara
	
	
FinProceso


//Para i <- 0 hasta 2 Con Paso 1 Hacer
//	Escribir vectorMedia
//FinPara
	