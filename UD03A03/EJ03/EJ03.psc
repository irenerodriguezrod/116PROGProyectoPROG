// 3. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n
// Java de un algoritmo que solicite por teclado los coeficientes de una
// ecuaci�n de primer grado ( ax+b=0 ) y muestre por pantalla uno de los
// siguientes mensajes:
//	LA ECUACI�N TIENE INFINITAS SOLUCIONES a=0 y b=0
//	LA ECUACI�N NO TIENE SOLUCI�N a=0
//	LA ECUACI�N TIENE UNA SOLUCI�N Y ES  x=?b/a


Proceso EJ03
	Definir a,b Como Entero;
	
	Escribir "Introduzca un coeficiente: "Sin Saltar;
	Leer a;
	Escribir "Introduzca otro coeficiente: "Sin Saltar;
	Leer b;
	
	
	
	Si (a=0 y b=0) Entonces
		Escribir "La ecuaci�n tiene infinitas soluciones";
		
	SiNo
		Si (a=0) Entonces
			Escribir "La ecuaci�n no tiene soluci�n";
			
		SiNo 
			Escribir "La ecuaci�n tiene una soluci�n y es ",(-b/a);
		FinSi
	FinSi
	
	
FinProceso
