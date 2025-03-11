/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license | Aqui se puede mostrar un mensaje por defecto 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ud05a01;

/**
 *
 * @author irene.rodrod.2
 */
public class EJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int busquedaSecuencial(int[] v, int n){ 
        int pos=-1; 
        for(int i=0;i<v.length && pos==-1;i++){ 
            if(v[i]==n){ pos=i; 
            } 
        } 
        return pos; }
    
}
