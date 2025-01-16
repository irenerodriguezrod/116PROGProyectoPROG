/*10 - Realiza la codificación en lenguaje de programación Java de un algoritmo que declare
dos variables de tipo real, inicializadas a un valor cualquiera cada una de ellas y
muestre por pantalla el menor de los valores. */

public class E10{
	public static void main(String[] args) {
		
		float real1=1.5f, real2=2.2f;
		float menor;
		
		menor=real1<real2?real1:real2;
		
		Sytem.outprintln("El menor es "+menor);
		
	}
}