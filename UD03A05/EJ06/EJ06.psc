// 6. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java de un algoritmo que 
// solicite por teclado un n�mero entero positivo y muestre por pantalla los n�meros impares comprendidos entre 1 y el n�mero introducido.


Proceso EJ06
	Definir n Como Entero;
	Definir i Como Entero;
	
	Escribir "Introduzca un numero entero positivo: ";
	Leer n;
	
	Mientras n<=0 Hacer //comprobar que el n�mero es positivo
		Escribir "Error en la entrada";
		
		Escribir "Introduzca un n�mero entero positivo";
		Leer n;
		
	FinMientras
	
	Para i<-1 Hasta n Con Paso 2 Hacer; //una vez est� comprobado que es positivo, se escriben los n�meros impares comprendidos entre 1 y el n�mero que se ha introducido
		Escribir "Los n�meros impares comprendidos entre 1 y ",n," son: ",i;
		
	FinPara
	
FinProceso
