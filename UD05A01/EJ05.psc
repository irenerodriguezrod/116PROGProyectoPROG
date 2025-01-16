Proceso EJ05
	Definir vector Como Entero;
	Dimension vector[5];
	Definir i Como Entero;
	
	Escribir "introduzca 5 numeros enteros: ";
	Para i<-0 hasta 4 con paso 1 Hacer
		Leer vector[i];
	FinPara
	
	si estaOrdenadoDescendente(vector, 5) Entonces
		Escribir "ORDENADO DESCENDENTE";
		Sino 
			Escribir "NO ESTA ORDENADO DESCENDENTE";
	FinSi
	
FinProceso



SubProceso ordenado <- estaOrdenadoDescendente(vector, numeroElementos)
	Definir ordenado Como Logico;
	Definir i Como Entero;
	
	ordenado<-Verdadero;
	Para i<-1 Hasta numeroElementos-1 Con Paso paso Hacer
		si vector[i-1]<vector[i] Entonces
			ordenado<-Falso;
			i<-numeroElementos;
		FinSi
	FinPara
	
FinSubProceso
	