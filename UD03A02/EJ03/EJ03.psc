// 3. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado dos números enteros
// positivos y muestre por pantalla uno de los siguientes mensajes
// dependiendo si la división del primer número entre el segundo es exacta o
// no:
//     si es exacta: División exacta. Cociente= 
//     si no es exacta: División no exacta. Cociente= Resto=

Proceso EJ03
	Definir numero1,numero2 Como Entero;
	
	Escribir "Introduzca un numero entero positivo: " Sin Saltar;
	Leer numero1;
	Escribir  "Introduzca otro numero entero positivo: " Sin Saltar;
	Leer numero2;
	
	
	//resto<-numero1%numero2;
	//cociente<-trunc(numero1/numero2);
	
	Si numero1%numero2=0 Entonces
		Escribir "División exacta. Cociente= ",numero1/numero2;
	SiNo
		Escribir "División no exacta. Cociente= ",numero1/numero2, " Resto= ",numero1%numero2;
	FinSi
	
FinProceso
