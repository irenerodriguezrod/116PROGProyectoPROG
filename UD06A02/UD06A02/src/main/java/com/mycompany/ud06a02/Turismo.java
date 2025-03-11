package com.mycompany.ud06a02;

/**
 *
 * @author holas
 */
public class Turismo extends Vehiculo{
    private int plazas;

    public Turismo() {
    }

    public Turismo(String matricula) {
        super(matricula);
    }

    public Turismo(String matricula, Grupo grupo) {
        super(matricula, grupo);
    }

    @Override
    public String toString() {
        return "Turismo{" + "plazas=" + plazas + '}';
    }
    
    //se hace un switch con los precios de la tabla
    public float getPrecio(){
        float precio = 0;
        
        switch(getGrupo()){
            case A -> {
                // se tiene que poner con el punto y la F para que no de fallo
                precio=50+1.5f*plazas;
            }
            case B -> {
                precio=55+2*plazas;
            }
            case C -> {
                precio=60+2.5f*plazas;
            }
        }
        return precio; 
    } 

    @Override
    public float getPrecioAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
