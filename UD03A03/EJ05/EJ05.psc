// 5. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un algoritmo que solicite por teclado
// el día, el mes y el año de una fecha y muestre por pantalla un mensaje indicando si la fecha es correcta o incorrecta.



//*otra manera de hacer el codigo 
SubProceso res <- DameDiasMes(mes)
	Definir res Como Entero;
	Segun mes Hacer
		1,3,5,7,8,10,12:
			res<-31;
		4,6,9,11:
			res<-30;
		2:
			res<-28;
		De Otro Modo:
			res<-0;
	FinSegun
FinSubProceso
//*


//*
SubProceso res <- EsFechaValida(dia, mes, anyo)
	Definir res Como Logico;
	res <- (anyo>1586 y mes>=1 y mes<=12 y dia>=1 y dias<=diasMes);
FinSubProceso
//*


//*Este es el proceso principal, iría después del SubProceso 
Proceso EJ05
	Definir dia, mes, anyo Como Entero;
	Definir diasMes Como Entero;
	
	Escribir "Introduzca año: " Sin Saltar;
	Leer anyo;
	Escribir "Introduzca mes(1-12): " Sin Saltar;
	Leer mes;
	Escribir "Introduzca dia: " Sin Saltar;
	Leer dia;
	
	
	//definir los dias que tiene cada mes en la variable diasMes, asi queda guardado el numero y no devuelve ningun valor hasta que no se ha terminado de ejecutar el algoritmo
	Segun mes Hacer
		1,3,5,7,8,10,12:
			diasMes<-31;
		4,6,9,11:
			diasMes<-30;
		2:
			diasMes<-28;
		De Otro Modo:
			diasMes<-0;
	FinSegun
	
	//*
	//Si anyo>1586 y mes>=1 y mes<=12 y dia>=1 y dias<=DameDiasMes(mes) Entonces
	//*
	
	//Si EsFechaValida (dia, mes, anyo) Entonces
	
	Si anyo>1586 y mes>=1 y mes<=12 y dia>=1 y dias<=diasMes Entonces
		Escribir "Fecha correcta";
	SiNo
		Escribir "Fecha incorrecta";
	FinSi
	
	
FinProceso
