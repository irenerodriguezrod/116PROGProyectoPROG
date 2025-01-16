// 6. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado las horas, los minutos y los
// segundos de una hora y muestre por pantalla un mensaje indicando si se
// trata de una hora correcta o incorrecta. 

Proceso EJ06
	Definir hora, min, seg Como Entero;
	
	Escribir "Introduzca una hora(0-23): ";
	Leer hora;
	Escribir "Introduzca unos minutos(0-59): ";
	Leer min;
	Escribir "Introduzca unos segundos(0-59): ";
	Leer seg;
	
	Si hora<=23 y hora>=0 y min<=59 y min>=0 y seg<=59 y seg>=0 Entonces //Si hora>=23 O hora<=0
		Escribir "La hora introducida es correcta"; // Escribir "La hora introducida es incorrecta"
	SiNo
		Escribir "La hora introducida es incorrecta";
	FinSi
	
FinProceso