// 1. Escribe un programa en Java que reciba varios nombres como
// argumentos en la línea de comandos y muestre por pantalla por
// cada una de los nombres recibidos el mensaje Hola nombre! .


package com.mycompany.ud05a03;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ01 {

    public static void main(String[] args) {
        for (String argumento: args) {
            System.out.printf("Hola %s\n !",argumento);
            // System.out.println("Hola "+argumento+" !");
        }
    }
}
