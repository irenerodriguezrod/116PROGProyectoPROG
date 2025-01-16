// 4. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
// algoritmo que solicite por teclado números enteros hasta que introduzca uno que no
// esté comprendido entre 1 y 10, calcule la media de los números introducidos y la
// muestre por pantalla

Proceso EJ04
	Definir n, contador, acumulador Como Entero;
	
	contador<-0;
	acumulador<-0; //Al acumular sumas se inicializa a 0, en cambio si acumulase producto se inicializaría a 1
	
	Escribir "Introduzca un número (1-10): ";
	Leer n;
	
	Mientras n>=1 y n<=10 Hacer
		contador<-(contador+1);
		acumulador<-(acumulador+n);
		
		Escribir "Introduzca un número (1-10): ";
		Leer n;
		
	FinMientras
	
	Si contador<>0 Entonces
		Escribir acumulador/contador;
	SiNo
		Escribir "No se ha introducido ningún número entero dentro del rango";
	FinSi

	
FinProceso
