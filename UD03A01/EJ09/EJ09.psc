// 9. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite
// por teclado los tres ángulos de un triángulo y si la suma de los mismos no es 180 
// muestre por pantalla el mensaje: Error en la entrada

Proceso EJ09
	Definir angulo1, angulo2, angulo3 Como Entero;
	
	Escribir "Introduzca primer angulo del triangulo: " Sin Saltar
	Leer angulo1
	Escribir "Introduzca segundo angulo del triangulo: " Sin Saltar
	Leer angulo2	
	Escribir "Introduzca tercer angulo del triangulo: " Sin Saltar
	Leer angulo3
	
	si angulo1+angulo2+angulo3 <> 180 Entonces
		Escribir "Error en la entrada";
	FinSi
FinProceso
