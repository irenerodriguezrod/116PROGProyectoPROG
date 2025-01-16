/* Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
algoritmo que muestre por pantalla el resultado de las siguientes expresiones: 5 + 2,
5 – 2, 5 * 2 y 5 / 2.
*/

public class operaciones {
	public static void main(String[] args) {
		double a=5, b=2;
		double suma, resta, multiplicacion;
		double division;
		
		suma = a + b;
		resta = a - b;
		multiplicacion = a * b;
		division = a / b;
		
		System.out.println("Resultado de la suma:"+suma);
		System.out.println("Resultado de la resta:"+resta);
		System.out.println("Resultado de la multiplicación:"+multiplicacion);
		System.out.println("Resultado de la división:"+division);
		
	}
}