// 3. Realiza el pseudoc�digo y la codificaci�n en lenguaje de
// programaci�n Java de un algoritmo que solicite por teclado
// cuatro n�meros binarios y los muestre por pantalla en decimal.


Proceso EJ03
	Definir numeroBinario Como Entero; //solicitar los numeros binarios
	Definir i, acumulador, peso Como Entero; // acumulador comienza en 0 y hay que sumarle el peso
	Definir digito Como Entero;
	
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Escribir "Introduzca n�mero binario: " Sin Saltar;
		Leer numeroBinario;
		acumulador<-0;
		peso<-1;
		Mientras numeroBinario<>0 Hacer
			digito<-numeroBinario%10;
			acumulador<-acumulador+(digito*peso);
			peso<-peso*2;
			numeroBinario<-trunc(numeroBinario/10);
		FinMientras
		
		Escribir acumulador;
	FinPara
	
	
FinProceso
