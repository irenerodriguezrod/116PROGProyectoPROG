// 3. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado 5
// números enteros, los almacene en un vector y a continuación calcule el número menor, la posición que ocupa y los muestre por pantalla.

SubProceso posicion <- numeroMenor (vector, numeroElementos)
	Definir posicion Como Entero;
	Definir menor,i  Como Entero;
	posicion<-0;
	menor<-vector[0];
	Para i<-0 Hasta numeroElementos-1 Con Paso 1 Hacer
		Si (vector[i] < menor) Entonces
			posicion<-i;
			menor<-vector[i];
		FinSi
	FinPara
FinSubProceso

Proceso EJ03
	Definir vector Como Entero;
	Dimension vector[5];
	Definir i Como Entero;
	Definir posicion Como Entero;
	
	Escribir "Introduce 5 números enteros: ";
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Leer vector[i]; //se lee i 
	FinPara
	
	posicion<-numeroMenor(vector,5);
	Escribir "Menor: ",vector[posicion],"Posición: ",posicion;
FinProceso
