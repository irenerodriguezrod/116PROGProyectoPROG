/*8 - Realiza el pseudocódigo y la codificación en lenguaje de programación Java de una
algoritmo que declare la constante IVA, asignándole el valor 21. Declara la variable
precioBruto, asignándole un valor cualquiera. Mostrará por pantalla el precio neto (sin
IVA) y el IVA de un producto cuyo precio bruto es el asignado a la variable
precioBruto. Ejemplo de salida para precioBruto = 1000*/

public class PseudocodigoProducto{
	public static void main(String[] args) {
		final int IVA=21;
		float precioBruto, precioNeto, ivaSoportado;
		
		precioBruto=1000;
		
		precioNeto=precioBruto/(1+IVA/100);
		ivaSoportado=precioBruto-precioNeto;
		
		System.out.println("Precio neto (sin IVA): "+precioNeto);
		System.out.println("IVA(21%): "+ivaSoportado);
		System.out.println("Precio total (con IVA): "+precioBruto);
	}
}