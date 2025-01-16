/* 4 - Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
algoritmo que declare la constante PI, asignándole el valor 3.14159. A continuación
mostrará por pantalla el área de un círculo de radio 5. Área = π * radio2 */

public class ConstantePi {
	public static void main(String[] args) {
		final float PI=3.14159F;
		float radio=5, areaCirculo;
		
		areaCirculo=PI*radio*radio;
		
		System.out.println("El área del circulo de rado "+radio+" es "+areaCirculo);
	}
}