// 3. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado los coeficientes de una
// ecuación de primer grado ( ax+b=0 ) y muestre por pantalla uno de los
// siguientes mensajes:
//	LA ECUACIÓN TIENE INFINITAS SOLUCIONES a=0 y b=0
//	LA ECUACIÓN NO TIENE SOLUCIÓN a=0
//	LA ECUACIÓN TIENE UNA SOLUCIÓN Y ES  x=?b/a


Proceso EJ03
	Definir a,b Como Entero;
	
	Escribir "Introduzca un coeficiente: "Sin Saltar;
	Leer a;
	Escribir "Introduzca otro coeficiente: "Sin Saltar;
	Leer b;
	
	
	
	Si (a=0 y b=0) Entonces
		Escribir "La ecuación tiene infinitas soluciones";
		
	SiNo
		Si (a=0) Entonces
			Escribir "La ecuación no tiene solución";
			
		SiNo 
			Escribir "La ecuación tiene una solución y es ",(-b/a);
		FinSi
	FinSi
	
	
FinProceso
