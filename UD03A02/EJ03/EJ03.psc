// 3. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n
// Java de un algoritmo que solicite por teclado dos n�meros enteros
// positivos y muestre por pantalla uno de los siguientes mensajes
// dependiendo si la divisi�n del primer n�mero entre el segundo es exacta o
// no:
//     si es exacta: Divisi�n exacta. Cociente= 
//     si no es exacta: Divisi�n no exacta. Cociente= Resto=

Proceso EJ03
	Definir numero1,numero2 Como Entero;
	
	Escribir "Introduzca un numero entero positivo: " Sin Saltar;
	Leer numero1;
	Escribir  "Introduzca otro numero entero positivo: " Sin Saltar;
	Leer numero2;
	
	
	//resto<-numero1%numero2;
	//cociente<-trunc(numero1/numero2);
	
	Si numero1%numero2=0 Entonces
		Escribir "Divisi�n exacta. Cociente= ",numero1/numero2;
	SiNo
		Escribir "Divisi�n no exacta. Cociente= ",numero1/numero2, " Resto= ",numero1%numero2;
	FinSi
	
FinProceso
