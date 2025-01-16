// 5. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
// algoritmo que solicite números enteros por teclado hasta que la suma de los números
// introducidos sea igual o mayor que 100. Antes de finalizar mostrará por pantalla el
// valor de la suma, la media y cuántos números positivos, negativos y nulos se han
// introducido.


Proceso EJ05
	Definir n, acumulador, contadorPositivo, contadorNegativo, contadorNulo Como Entero;
	Definir media Como Real;
	
	
	// no hace falta poner contadorTotal ya que el valor de este será igual a la suma de los valores positivos, negativos y nulos
	acumulador<-0;
	contadorPositivo<-0;
	contadorNegativo<-0;
	contadorNulo<-0;
	Escribir "Introduzca un número: ";
	Leer n;
	
	
	Repetir
		Escribir "Introduzca un número: ";
		Leer n;
		
		acumulador<-(acumulador+n);
		
		Si n>0 Entonces // definir los numeros positivos
			contadorPositivo<-(contadorPositivo+1);
		SiNo
			Si n<0 Entonces // se definen los números negativos
				contadorNegativo<-(contadorNegativo+1);
			SiNo //números nulos
				contadorNulo<-(contadorNulo+1);
			FinSi
		FinSi
		
	Hasta Que acumulador>=100;

	
	
	media<-acumulador/(contadorPositivo+contadorNegativo+contadorNulo);
	
	// mostrar valor de la suma total
	Escribir "El valor de la suma total es ",acumulador;
	// mostrar valor de la media total
	Escribir "El valor de la media total es ",media;
	// mostrar numero total de positivos, negativos y nulos
	Escribir "El número total de positivos introducidos es ",contadorPositivo,", el número total de negativos es ",contadorNegativo," y el numero total de nulos es ",contadorNulo;
	
	
FinProceso
