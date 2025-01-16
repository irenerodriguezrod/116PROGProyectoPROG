Proceso EJ07
	Definir vector Como Entero;
	Dimension vector[10];
	Definir i,j Como Entero;
	Definir aux Como Entero;
	
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		vector[i]<-azar(100);
	FinPara
	
	Escribir "Vector original";
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Escribir vector[i]," " Sin saltar;
	FinPara
	
	//invertido
	j<-9;
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		aux<-vector[i];
		vector[i]<-vector[j];
		vector[j]<-aux;
		j<-j-1;
	FinPara
	
	Escribir "";
	Escribir "Vector invertido";
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Escribir vector[i]," " Sin saltar;
	FinPara
	
	//izq
	
	
	
	//der
	
	
	
FinProceso
