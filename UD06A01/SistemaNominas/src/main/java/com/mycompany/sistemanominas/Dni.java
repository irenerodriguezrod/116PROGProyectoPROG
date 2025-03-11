package com.mycompany.sistemanominas;

import java.util.Objects;

/**
 *
 * @author irene.rodrod.2
 */
public class Dni implements Comparable<Dni>{
    private String dni;
    
    public Dni(String dni) {
        if(!esValido(dni)){
            throw new DniException("Formato DNI incorrecto");
        }
        this.dni=dni;
    }
    
    public static boolean esValido(String dni){
        return true;
    }

    public String getDni() {
        return dni;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dni other = (Dni) obj;
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public int compareTo(Dni o) {
        return this.compareTo(o);
    }
    
}

