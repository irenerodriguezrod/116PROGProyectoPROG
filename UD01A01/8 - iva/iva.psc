Algoritmo  iva
	definir ivaSoportado Como Entero;
	definir precioBruto como real;
	definir precioNeto como real;
	definir ivaSoportado como real;
	
	ivaSoportado<-21;
	precioBruto<-1000;
	
	precioNeto<-precioBruto/(1+ivaSoportado/100);
	
	ivaSoportado<-precioBruto-precioNeto;
	
	Escribir "Precio neto (sin IVA):",precioNeto;
	Escribir "IVA(21%):",ivaSoportado;
	Escribir "Precio total (con IVA):",precioBruto;
	
FinProceso
