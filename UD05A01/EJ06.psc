Proceso EJ06
	Definir vectorFrecuencias Como Entero;
	Dimension vector[11];
	Definir i Como Entero;
	Definir nota Como Entero;
	
	Para i<-0 Hasta 10 Con Paso 1 Hacer
		vectorFrecuencias[i]<-0;
	FinPara
	
	Escribir "INTRODUZCA CALIFICACION (0 - 10). CUALQUIER OTRA PARA SALIR: " Sin Saltar;
	Leer nota;
	Mientras nota>=0 y nota<=10 Hacer
		vectorFrecuencias[nota]<-vectorFrecuencias[nota]+1;
		
		Escribir "INTRODUZCA CALIFICACION (0 - 10). CUALQUIER OTRA PARA SALIR: " Sin Saltar;
		Leer nota;
	FinMientras
	
	Escribir "FRECUENCIAS: ";
	Para i<-0 Hasta 10 Con Paso 1 Hacer
		Escribir "LA CALIFICACION",i,"APARECE",vectorFrecuencias[i],"VECES";
	FinPara
	
FinProceso
