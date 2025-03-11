// 8. Escribe un programa en Java que llene un vector (v1) de enteros con 10 números aleatorios comprendidos entre 0 y 99.
// A continuación llenará otro vector (v2) con 10 números aleatorios comprendidos entre 0 y 99. Ordenará los vectores de forma descendente
// y generará un nuevo vector (v3) ordenado de forma descendente resultado de la mezcla de los vectores v1 y v2. 
// Para finalizar mostrará el contenido de los tres vectores por pantalla.


package com.mycompany.ud05a03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ08 {

    public static void main(String[] args) {
        int[] v1; //vector 1
        int[] v2; // vector 2
        int[] v3; // vector 3 es el equivalente al 1 y el 2 mezclados y ordenados
        int indice1, indice2, indice3;
        
        
        Random aleatorio = new Random();
        
        // Generar numeros aleatorios para los vectores 
        v1 = new int[10]; // tamaño que tendrá el vector
        for(int i=0;i<v1.length;i++) {
            v1[i]=aleatorio.nextInt(100); //generar numeros aleatorios comprendidos en 0-100
        }
        Arrays.sort(v1,Comparator.reverseOrder());
        
        v2 = new int[10]; 
        for(int j=0;j<v2.length;j++) {
            v2[j]=aleatorio.nextInt(100); 
        }
        Arrays.sort(v2,Comparator.reverseOrder());
        
        v3=new Integer[v1.length+v2.length];
        indice1=0;
        indice2=0;
        indice3=0;
        
        while(indice1<v1.length && indice2<v2.length) {
            if (v1[indice1]<v2[indice2]) {
                v3[indice3]=v1[indice1];
                indice1++;
            } else {
                v3[indice3]=v2[indice2];
            }
            indice3++;
        }
        
        while(indice)
        
    }
    
}
