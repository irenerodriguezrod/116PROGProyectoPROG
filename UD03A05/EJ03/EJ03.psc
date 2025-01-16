// 3. Realiza el pseudocódigo y la codificación en lenguaje de
// programación Java de un algoritmo que solicite por teclado un
// número entero comprendido entre 1 y 10 y muestre por pantalla el
// factorial de dicho número. Recuerda: !5=5*4*3*2*1

Proceso EJ03
	Definir n Como Entero;
	Definir i como entero;
	Definir factorial Como Entero;
	
	Escribir "Introduzca un numero entero (1-10): ";
	Leer n;
	
	Mientras n<1 o n>10 Hacer
		Escribir "Error en la entrada";
		Escribir "Introduzca entero (1-10): "Sin Saltar;
		Leer n;
	FinMientras
	

	factorial<-1;
	Escribir n,"!=",n," + " Sin Saltar;
	Para i<-n-1 Hasta 2 Con Paso -1 Hacer // -1 sirve para hacer el bucle inverso, restando en lugar de sumar 
		factorial<-factorial*i;
		Escribir i," * " Sin Saltar; 
	FinPara
	
	Escribir "1 = ", factorial;
	
FinProceso
