// 5. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java de un
// algoritmo que solicite por teclado el radio de una esfera y muestre por pantalla el
// volumen de la misma. 

Proceso EJ05
	Definir radio Como Real;
	Definir volumen Como Real;
	Escribir "Escriba el radio de una esfera: ";
	Leer radio;
	
	volumen<-(4*PI*radio*radio*radio)/3;
	
	Escribir "El volumen de la esfera es: ",volumen;
	
FinProceso
