// 3. Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
// algoritmo que solicite por teclado un usuario y una contraseña hasta que el usuario
// sea admin y la contraseña paso. Mostrará por pantalla uno de los siguientes mensajes:
// Usuario o contraseña incorrecto Bienvenido usuario


import java.util.Scanner;

public class EJ03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		String usuario, contrasenya;
		

		System.out.print("Introduzca usuario: ");
		usuario=teclado.nextLine();
		System.out.print("Introduzca contraseña: ");
		contrasenya=teclado.nextLine();
		
		// equals sirve para saber si es igual o no, la exclamacion es para decir que es diferente). si se hace con != el objeto tiene que ser igual a lo que
		// se ha definido. La comparación de objetos se hace con EQUALS
		while (!usuario.equals("admin") || !contrasenya.equals("paso")) {
			System.out.println("Usuario o contraseña incorrecto");
			
			System.out.print("Introduzca usuario: ");
			usuario=teclado.nextLine();
			System.out.println("Introduzca contraseña: ");
			contrasenya=teclado.nextLine();
		}
		
		System.out.print("Bienvenido "+usuario);
		
		
	}
}