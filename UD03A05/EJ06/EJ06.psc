// 6. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que 
// solicite por teclado un número entero positivo y muestre por pantalla los números impares comprendidos entre 1 y el número introducido.


Proceso EJ06
	Definir n Como Entero;
	Definir i Como Entero;
	
	Escribir "Introduzca un numero entero positivo: ";
	Leer n;
	
	Mientras n<=0 Hacer //comprobar que el número es positivo
		Escribir "Error en la entrada";
		
		Escribir "Introduzca un número entero positivo";
		Leer n;
		
	FinMientras
	
	Para i<-1 Hasta n Con Paso 2 Hacer; //una vez está comprobado que es positivo, se escriben los números impares comprendidos entre 1 y el número que se ha introducido
		Escribir "Los números impares comprendidos entre 1 y ",n," son: ",i;
		
	FinPara
	
FinProceso
