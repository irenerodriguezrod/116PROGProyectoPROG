// 3. Realiza el pseudoc�digo y la codificaci�n en lenguaje de programaci�n Java de un
// algoritmo que solicite por teclado un usuario y una contrase�a hasta que el usuario
// sea admin y la contrase�a paso. Mostrar� por pantalla uno de los siguientes mensajes:
// Usuario o contrase�a incorrecto Bienvenido usuario


//bucle mientras con lectura anticipada - Leer Mientras ...(lo que haya que hacer)
Proceso EJ03
	Definir usuario, contrasenya Como Caracter;
	
	Escribir "Introduzca usuario: " Sin Saltar;
	Leer usuario;
	Escribir "Introduzca contrase�a: " Sin Saltar;
	Leer contrasenya;
	
	// es O porque si no coincide ninguna de las dos ya est� mal, no es necesario que las dos est�n mal para que d� error
	Mientras usuario<>"admin" o contrasenya<>"paso" Hacer
		Escribir "Usuario o contrase�a incorrecto";
		
		Escribir "Introduzca usuario: " Sin Saltar;
		Leer usuario;
		Escribir "Introduzca contrase�a: " Sin Saltar;
		Leer contrasenya;
		
	FinMientras
	
	Escribir "Bienvenido usuario";
	
FinProceso
