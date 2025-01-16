// 2. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n
// Java de un algoritmo que solicite por teclado los tres �ngulos de un
// tri�ngulo y si la suma de los mismos es 180 muestre por pantalla si se
// trata de un tri�ngulo rect�ngulo, obtus�ngulo o acut�ngulo. Un tri�ngulo
// es rect�ngulo si el valor de uno de sus �ngulos es 90, es obtus�ngulo si el
// valor de uno de sus �ngulos es mayor de 90 y es acut�ngulo si el valor de
// cada uno de sus tres �ngulos es menor de 90.


Proceso EJ02
	Definir angulo1,angulo2, angulo3 Como Entero;
	
	Escribir "Introduzca el primer �ngulo del triangulo: " Sin Saltar;
	Leer angulo1;
	Escribir "Introduzca el segundo �ngulo del tri�ngulo: " Sin Saltar;
	Leer angulo2;
	Escribir "Introduzca el tercer �ngulo del tri�ngulo: " Sin Saltar;
	Leer angulo3;
	
	Si angulo1+angulo2+angulo3=180 Entonces
		Si angulo1=90 o angulo2=90 o angulo3=90 Entonces
			Escribir "Es un tri�ngulo rect�ngulo";
		SiNo
			Si angulo1>=90 o angulo2>=90 o angulo3>=90 Entonces
			Escribir "Es un tri�ngulo obtus�ngulo";
			SiNo
			Escribir "Es un tri�ngulo acut�ngulo";
		FinSi
	SiNo
		Escribir "Entrada incorrecta";
	FinSi
	
FinProceso
