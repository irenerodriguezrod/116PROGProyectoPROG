// 2. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que permita llenar una matriz de dos filas y tres
// columnas con números enteros solicitados por teclado. Para finalizar
// mostrará por pantalla la media de los elementos, el elemento menor y
// a posición que ocupa.

Proceso EJ02
    // Declarar matriz y variables
    Definir matriz Como Entero;
    Dimension matriz[2,3];
    Definir i, j, suma, contador Como Entero;
    Definir menor, posicionFila, posicionColumna Como Entero;
    Definir media Como Real;
	
    // Inicializar variables
    suma <- 0;
    contador <- 0;
    menor <- 0; // Un valor inicial para encontrar el menor
    posicionFila <- -1;
    posicionColumna <- -1;
	
    // Llenar la matriz
    Para i <- 0 Hasta 1 Hacer
        Para j <- 0 Hasta 2 Hacer
            Escribir "Introduce elementos [", i, "] [", j, "]: ";
            Leer matriz[i, j];
            
            // Acumular suma y contador para calcular la media
            suma <- suma + matriz[i, j];
            contador <- contador + 1;
			
            // Comprobar si el elemento actual es el menor
            Si matriz[i, j] < menor Entonces
                menor <- matriz[i, j];
                posicionFila <- i;
                posicionColumna <- j;
            FinSi
        FinPara
    FinPara
	
    // Calcular la media
    media <- suma / contador;
	
    // Mostrar resultados
    Escribir "La media de los números introducidos es: ", media;
    Escribir "El elemento menor es: ", menor, " y su posición es: [", posicionFila, "][", posicionColumna, "]";
FinProceso
