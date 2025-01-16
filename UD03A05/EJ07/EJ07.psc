// 7. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado un número entero positivo y muestre por pantalla 
// si se trata de un número perfecto o no. Se dice que un número es perfecto
// cuando la suma de sus divisores propios (todos excepto el propio número) es igual al número. Números perfectos: 6, 28, 496, 8128.


Proceso EJ07
	Definir n Como Entero;
	Definir i como entero;
	Definir sumaDivisores Como Entero; // se define para poder acumular los números de la división y poder comprobar si es perfecto o no. ACUMULADOR
	
	Escribir "Introduzca un número entero positivo: ";
	Leer n;
	
	Mientras n<=0 Hacer //comprobar que el número es positivo
		Escribir "Error en la entrada";
		
		Escribir "Introduzca un número entero positivo";
		Leer n;
		
	FinMientras
	
	sumaDivisores<-1; 
	Para i<-1 Hasta n/2 Con Paso 1 Hacer; // se calcula con la mitad del numero, si los divisores son 0 se acumulan
		Si n%i=0 Entonces
			sumaDivisores<-sumaDivisores+i;
		FinSi
	FinPara
	
	Si n=sumaDivisores Entonces
		Escribir "El número introducido es un número perfecto";
	SiNo
		Escribir "El número introducido no es un número perfecto";
	FinSi
	
FinProceso