// 4. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java 
// de un algoritmo que solicite por teclado diez n�meros y muestre por pantalla el menor de los n�meros introducidos.


Proceso EJ04
    Definir n Como Entero;
	Definir i como entero;
    Definir menor Como Entero;
    
    Escribir "Introduzca 10 n�meros:";
    
    Leer n;
    menor<-n; // Asumimos que el primer n�mero es el menor
    
    Para i <- 1 Hasta 9 Con Paso 1 Hacer
        Leer n;
        Si n < menor Entonces
            menor<-n; // Actualizamos el menor
        Fin Si
    Fin Para
    
    Escribir "El menor de los n�meros introducidos es: ", menor;
Fin Proceso
