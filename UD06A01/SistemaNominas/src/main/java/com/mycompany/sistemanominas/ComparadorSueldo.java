package com.mycompany.sistemanominas;

import java.util.Comparator;

public class ComparadorSueldo implements Comparator<Empleado> {
    
    @Override
    public int compare(Empleado e1, Empleado e2) {
        return Float.compare(e1.getSalario(), e2.getSalario());
    }
}

