// 6. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que permita llenar una matriz de dos filas y tres
// columnas con números enteros solicitados por teclado. A continuación
// generará un vector que contendrá la media de cada una de las columnas.
// Para finalizar mostrará por pantalla el vector generado.

Proceso EJ06
    // Declarar la matriz y el vector
    Definir matriz Como Entero;
    Dimension matriz(2,3); // 2 filas y 3 columnas
    Definir vectorMedia Como Real;
    Dimension vectorMedia(3); // 1 media por cada columna
	
    Definir i, j Como Entero; //se define I para las filas y J para las columnas
    Definir suma Como Entero;
	
    // Introducir los datos de la matriz
    Para i <- 0 Hasta 1 Hacer // 2 filas
        Para j <- 0 Hasta 2 Hacer // 3 columnas
            Escribir "Introduce elemento [", i, "][", j, "]: " Sin Saltar;
            Leer matriz[i, j];
        FinPara
    FinPara
	
    // Calcular la media de cada columna y guardarla en el vector
    Para j <- 0 Hasta 2 Hacer // Para cada columna
        suma <- 0; // Reiniciar suma para cada columna
        Para i <- 0 Hasta 1 Hacer
            suma <- suma + matriz[i, j]; // Acumular los elementos de la columna
        FinPara
        vectorMedia[j] <- suma / 2; // Dividir por el número de filas
    FinPara
	
    // Mostrar el vector con las medias
    Escribir "Media de las columnas:";
    Para j <- 0 Hasta 2 Hacer
        Escribir "Media de la columna ", j, ": ", vectorMedia[j] ;
    FinPara
FinProceso
