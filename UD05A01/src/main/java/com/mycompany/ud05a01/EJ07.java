/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license | Aqui se puede mostrar un mensaje por defecto 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ud05a01;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vector;
        int aux;
        Random aleatorio=new Random();
        
        vector=new int[10];
        for(int i=0;i<vector.length;i++) {
            vector[i]=aleatorio.nextInt(100);
        }
        
        System.out.println("Vector original");
        System.out.println(Arrays.toString(vector));
        
        
        //vector invertido
        for(int i=0, j=9; i<vector.length/2;i++,j--) {
            aux=vector[i];
            vector[i]=vector[j];
            vector[j]=aux;
        }
        System.out.println("Vector invertido");
        System.out.println(Arrays.toString(vector));
        
        //vector rotado izq
        
        
        //vector rotado der
    }
    
}
