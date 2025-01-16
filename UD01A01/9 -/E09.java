/* 9 - Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
algoritmo que declare dos variables de tipo entero, inicializadas a un valor cualquiera
cada una de ellas, muestre por pantalla el contenido de las variables, intercambie el
valor de las mismas y muestre por pantalla el contenido de las variables después del
intercambio de valores. */

public class E09{
	public static void main(String[] args) {
		int a=5, b=7;
		int aux;
		
		System.out.println(a);
		System.out.println(b);
		
		aux=a;
		a=b;
		b=aux;
		
		System.out.println(a);
		System.out.println(b);
		
	}
}