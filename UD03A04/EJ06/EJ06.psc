// 6. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java de un
// algoritmo que solicite por teclado un n�mero entero positivo y muestre por pantalla si
// se trata o no de un n�mero hyperpar. Se dice que un n�mero es hyperpar cuando
// todos sus d�gitos son pares.



// Se crea un interrruptor para evitar comprobar dos veces lo mismo, ya que si estuvieramos trabajando en ficheros mas grandes, a la hora de buscar
// ser�a mas complicado
Proceso EJ06
	Definir N Como Entero;
	definir esH como logico;

	Leer n;
	
	esH<-n%2=0;
	Mientras esH y n>9 Hacer
		n<-trunc(n/10);
		esH<-n%2=0
	FinMientras
	Si esH Entonces
		Escribir "Hyperpar";
	SiNo
		Escribir "No es hyperpar";
	FinSi
	
FinProceso






// El siguiente algoritmo ESTA MAL, ya que pregunta m�s veces de las necesarias cuando desde el comienzo ya est� tomada la decisi�n de que es verdadero o falso 
// dependiendo del n�mero que se haya introducido


//esH<-Verdadero; // se asigna el valor de verdadero al comienzo y mas tarde se cambiara para poder definir si el numero es hyperpar o no
//leer n;
//Mientras esH y n<>0 hacer; //mientras que no de 0 la division se va a seguir dividiendo. la condici�n es restrictiva porque lleva Y
//	si n%2=1 Entonces // cuando el resultado de la operaci�n de 1, va a tomar el valor de falso
//		esH<-falso;
//	FinSi
//	n<-trunc(n/10);
//FinMientras
//
//Si esH Entonces
//	Escribir "Hyperpar";
//SiNo
//	Escribir "No es hyperpar";
//FinSi
	