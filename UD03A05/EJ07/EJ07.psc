// 7. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java de un algoritmo que solicite por teclado un n�mero entero positivo y muestre por pantalla 
// si se trata de un n�mero perfecto o no. Se dice que un n�mero es perfecto
// cuando la suma de sus divisores propios (todos excepto el propio n�mero) es igual al n�mero. N�meros perfectos: 6, 28, 496, 8128.


Proceso EJ07
	Definir n Como Entero;
	Definir i como entero;
	Definir sumaDivisores Como Entero; // se define para poder acumular los n�meros de la divisi�n y poder comprobar si es perfecto o no. ACUMULADOR
	
	Escribir "Introduzca un n�mero entero positivo: ";
	Leer n;
	
	Mientras n<=0 Hacer //comprobar que el n�mero es positivo
		Escribir "Error en la entrada";
		
		Escribir "Introduzca un n�mero entero positivo";
		Leer n;
		
	FinMientras
	
	sumaDivisores<-1; 
	Para i<-1 Hasta n/2 Con Paso 1 Hacer; // se calcula con la mitad del numero, si los divisores son 0 se acumulan
		Si n%i=0 Entonces
			sumaDivisores<-sumaDivisores+i;
		FinSi
	FinPara
	
	Si n=sumaDivisores Entonces
		Escribir "El n�mero introducido es un n�mero perfecto";
	SiNo
		Escribir "El n�mero introducido no es un n�mero perfecto";
	FinSi
	
FinProceso