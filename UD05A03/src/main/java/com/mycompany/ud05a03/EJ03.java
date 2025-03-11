// 3. Escribe un programa en Java que contenga el siguiente método estático: float calcularMediaEnteros(int… enteros),
// que admitirá un número variable de enteros como parámetros y devolverá la media de los enteros recibidos. 
// Desde el método main deberemos llamar al método estático tres veces, con distinto número de parámetros, y mostrar el resultado por pantalla



package com.mycompany.ud05a03;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ03 {

    public static void main(String[] args) {
        System.out.println(calcularMediaEnteros(1,2));
        System.out.println(calcularMediaEnteros(1,2,3));
        System.out.println(calcularMediaEnteros());
    }
    
    public static float calcularMediaEnteros (int... enteros) {
        float acumulador;
        float media;
        
        if(enteros.length!=0){
            acumulador=0;
            for (int entero: enteros) {
                acumulador+=entero;
            }
            
            media=acumulador/enteros.length;   
        } else {
            media=0;
        }
        
        return media;
        
    }
}
