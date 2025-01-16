// 2. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
// algoritmo que solicite por teclado la hora, los minutos y segundos de una hora hasta
// que sea correcta y cuando sea correcta muestre por pantalla la hora convertida a
// segundos.



Proceso EJ02
	Definir hora, min, seg Como Entero;
	Definir segTotales Como Entero;;
	
	// como no se escribe un mensaje de erorr se puede hacer con repetir 
	Repetir
		Escribir "Introduzca una hora: ";
		Leer hora;
		Escribir "Introduzca minutos: ";
		Leer min;
		Escribir "Introduzca segundos: ";
		Leer seg;
	Hasta Que hora>=0 y hora<=23 y min>=0 y min<=59 y seg>=0 y seg<=59;
	
	
	segTotales<- (hora*3600)+(min*60)+seg;
	Escribir "Las horas, minutos y segundos introducidos equivalen a ",segTotales;
	
FinProceso
