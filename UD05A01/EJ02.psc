// 2. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado 5 números enteros,
// los almacene en un vector y a continuación calcule la media de los elementos del vector y la muestre por pantalla.


SubProceso media <- calcularMedia (vector, numeroElementos) // se define un subproceso llamado media que da el resultado llamado calcularMedia. para que de  el resultado hay que poner entre parentesis el vector que se utiliza y el numero de elementos que tiene
	
	Definir media Como Real;
	Definir i Como Entero;
	Definir contador, acumulador Como Entero;
	
	contador<-0;
	acumulador<-0;
	Para i<-0 Hasta numeroElementos-1 Con Paso 1 Hacer
		contador<-contador+1;
		acumulador<-acumulador+vector[i]; //se pone vector[i] porque es el numero que estamos recogiendo para hacer la media
	FinPara
	
	media<-acumulador/contador;
	
FinSubProceso

Proceso EJ02
	Definir vector Como Entero;
	Dimension vector[5];
	Definir i Como Entero;
	
	Escribir "Introduce 5 números enteros para calcular la media: ";
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Leer vector[i]; //se lee i 
	FinPara
	
	Escribir calcularMedia(vector,5);
FinProceso
