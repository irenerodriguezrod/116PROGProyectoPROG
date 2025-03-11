package com.mycompany.ud06a02;

/**
 *
 * @author holas
 */
public class Furgoneta extends Vehiculo{
    private float capacidad;

    public Furgoneta() {
    }

    public Furgoneta(String matricula) {
        super(matricula);
    }

    public Furgoneta(String matricula, Grupo grupo) {
        super(matricula, grupo);
    }

    @Override
    public String toString() {
        return "Furgoneta{" + "capacidad=" + capacidad + '}';
    }
    
    public float getPrecio(){
        float precio = 0;
        
        switch(getGrupo()){
            case A -> {
                // se tiene que poner con el punto y la F para que no de fallo
                precio=50+1.5f*capacidad;
            }
            case B -> {
                precio=55+2*capacidad;
            }
            case C -> {
                precio=60+2.5f*capacidad;
            }
        }
        return precio; 
    } 

    @Override
    public float getPrecioAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
