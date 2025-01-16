// 4. Realiza el pseudocódigo y la codificación en lenguaje de programación Java 
// de un algoritmo que solicite por teclado diez números y muestre por pantalla el menor de los números introducidos.


Proceso EJ04
    Definir n Como Entero;
	Definir i como entero;
    Definir menor Como Entero;
    
    Escribir "Introduzca 10 números:";
    
    Leer n;
    menor<-n; // Asumimos que el primer número es el menor
    
    Para i <- 1 Hasta 9 Con Paso 1 Hacer
        Leer n;
        Si n < menor Entonces
            menor<-n; // Actualizamos el menor
        Fin Si
    Fin Para
    
    Escribir "El menor de los números introducidos es: ", menor;
Fin Proceso
