// 3. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
// algoritmo que solicite por teclado un usuario y una contraseña hasta que el usuario
// sea admin y la contraseña paso. Mostrará por pantalla uno de los siguientes mensajes:
// Usuario o contraseña incorrecto Bienvenido usuario


//bucle mientras con lectura anticipada - Leer Mientras ...(lo que haya que hacer)
Proceso EJ03
	Definir usuario, contrasenya Como Caracter;
	
	Escribir "Introduzca usuario: " Sin Saltar;
	Leer usuario;
	Escribir "Introduzca contraseña: " Sin Saltar;
	Leer contrasenya;
	
	// es O porque si no coincide ninguna de las dos ya está mal, no es necesario que las dos estén mal para que dé error
	Mientras usuario<>"admin" o contrasenya<>"paso" Hacer
		Escribir "Usuario o contraseña incorrecto";
		
		Escribir "Introduzca usuario: " Sin Saltar;
		Leer usuario;
		Escribir "Introduzca contraseña: " Sin Saltar;
		Leer contrasenya;
		
	FinMientras
	
	Escribir "Bienvenido usuario";
	
FinProceso
