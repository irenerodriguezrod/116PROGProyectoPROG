// 7. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que permita llenar una matriz de tres filas y
// tres columnas con números enteros solicitados por teclado. A
// continuación comprobará si la matriz es la matriz identidad (todos los
// elementos son ceros menos los elementos de la diagonal principal que
// son unos) y mostrará por pantalla uno se los siguientes mensajes : "ES
// MATRIZ IDENTIDAD" o "NO ES MATRIZ IDENTIDAD".


// Este ejercicio consiste en una especie de 3 en ralla de UNOS. Tienen que coincidir de manera diagonal para que se de el caso de que sea
// matriz identidad.

// Representación de como quedaria: 
// 100
// 010
// 001

// Para que sea matriz identidad tienen que coincidir los valores, es decir, tienen que coincidir los indices y que no haya un 1


Proceso EJ07
	
	Definir matriz Como Entero;
	Dimension matriz[3,3]; // definir la dimension de la matriz
	
	Definir i, j Como Entero; //valor de las filas y valor de las columnas
	Definir matrizIdentidad Como Logico; // para comprobar si es matriz identidad o no
	
	// Introducir los datos de la matriz
    Para i <- 0 Hasta 2 Hacer // 3 filas
        Para j <- 0 Hasta 2 Hacer // 3 columnas
            Escribir "Introduce elemento [", i, "][", j, "]: " Sin Saltar;
            Leer matriz[i, j];
        FinPara
    FinPara
	
	
	// Comprobar si es matriz identidad
	matrizIdentidad<- Verdadero; //se comienza suponiendo que es verdad
	
	Para i <-0 Hasta 2 Hacer // 3 filas
		Para j <- 0 Hasta 2 Hacer // 3 columnas
			Si matriz[i,j] <> 1 y i==j Entonces // si los índices de la matriz no son 1 y el valor de I coincide con el de J, no es una matriz identidad
				matrizIdentidad <-Falso;
			FinSi
		FinPara
	FinPara
	
	
	// Escribir el resultado obtenido de la comprobación, ya que si se pone antes, se repetirá cada vez, de esta manera, SÓLO se escribe EL RESULTADO FINAL
	si matrizIdentidad Entonces
		Escribir "ES MATRIZ IDENTIDAD";
	SiNo
		Escribir "NO ES MATRIZ IDENTIDAD";
	FinSi
	
	
FinProceso
