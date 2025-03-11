// 4. Escribe un programa en Java que llene un vector de enteros con 10 números aleatorios comprendidos entre 0 y 100,
// realice una copia del mismo, ordene el vector original y muestre por pantalla los dos vectores.



package com.mycompany.ud05a03;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ04 {

    public static void main(String[] args) {
        int[] vector; //se declara el vector
        int[] vectorCopia; //paara crear la copia del vector original
        Random aleatorio=new Random();
        
        vector = new int[10]; // tamaño que tendrá el vector
        for(int i=0;i<vector.length;i++) {
            vector[i]=aleatorio.nextInt(100); //generar numeros aleatorios comprendidos en 0-100
        }
        
        vectorCopia=Arrays.copyOf(vector, vector.length); //para saber el tamaño total del vector se utiliza vector.length
        Arrays.sort(vectorCopia);
        
        System.out.println("Vector original:");
        System.out.println(Arrays.toString(vector));
        System.out.println("Vector ordenado:");
        System.out.println(Arrays.toString(vectorCopia));
    }
    
}
