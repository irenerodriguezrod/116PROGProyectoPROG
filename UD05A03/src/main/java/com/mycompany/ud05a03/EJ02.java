// 2. Escribe un programa en Java que reciba varios números enteros
// como argumentos en la línea de comandos y muestre por pantalla
// los enteros recibidos y la media de los mismos.


package com.mycompany.ud05a03;

/**
 * 
 * @author irene.rodrod.2
 */
public class EJ02 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, proporciona al menos un número entero como argumento.");
        } else {
            int suma = 0;

            System.out.println("Números recibidos:");
            for (String arg : args) {
                int numero = Integer.parseInt(arg); // Se asume que todos los argumentos son válidos
                System.out.println(numero);
                suma += numero;
            }

            double media = (double) suma / args.length;
            System.out.println("Media de los números recibidos: " + media);
        }
    }
}


//public static void main(String[] args) {
//        float acumulador;
//        
//        if(args.length!=0){
//            acumulador=0;
//            for (String entero: args) {
//                acumulador+=Integer.parseInt(entero);
//            }
//            System.out.printf("Media: %f\n",acumulador/args.length);
//        } else {
//            System.out.println("No se ha introducido ningún numero");
//        }
//    }