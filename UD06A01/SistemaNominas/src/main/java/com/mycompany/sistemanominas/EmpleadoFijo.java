package com.mycompany.sistemanominas;

/**
 * Clase que representa un empleado fijo con salario mensual
 * @author irene.rodrod.2
 */
public class EmpleadoFijo extends Empleado {
    private float salario;

    public EmpleadoFijo(String dni, String nombre) {
        super();
    }
    
    public EmpleadoFijo(String dni) {
        super(dni);
    }
    
    public EmpleadoFijo(String dni, String nombre, float salario) {
        super(dni, nombre);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + 
               ", Tipo: Fijo" +
               ", Salario mensual: " + salario;
    }

    @Override
    public float calcularSalario() {
        return salario;
    }
}
