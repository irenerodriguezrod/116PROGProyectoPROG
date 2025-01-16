// 2. Realiza el pseudocódigo y la codificación en lenguaje de programación
// Java de un algoritmo que solicite por teclado los tres ángulos de un
// triángulo y si la suma de los mismos es 180 muestre por pantalla si se
// trata de un triángulo rectángulo, obtusángulo o acutángulo. Un triángulo
// es rectángulo si el valor de uno de sus ángulos es 90, es obtusángulo si el
// valor de uno de sus ángulos es mayor de 90 y es acutángulo si el valor de
// cada uno de sus tres ángulos es menor de 90.


Proceso EJ02
	Definir angulo1,angulo2, angulo3 Como Entero;
	
	Escribir "Introduzca el primer ángulo del triangulo: " Sin Saltar;
	Leer angulo1;
	Escribir "Introduzca el segundo ángulo del triángulo: " Sin Saltar;
	Leer angulo2;
	Escribir "Introduzca el tercer ángulo del triángulo: " Sin Saltar;
	Leer angulo3;
	
	Si angulo1+angulo2+angulo3=180 Entonces
		Si angulo1=90 o angulo2=90 o angulo3=90 Entonces
			Escribir "Es un triángulo rectángulo";
		SiNo
			Si angulo1>=90 o angulo2>=90 o angulo3>=90 Entonces
			Escribir "Es un triángulo obtusángulo";
			SiNo
			Escribir "Es un triángulo acutángulo";
		FinSi
	SiNo
		Escribir "Entrada incorrecta";
	FinSi
	
FinProceso
