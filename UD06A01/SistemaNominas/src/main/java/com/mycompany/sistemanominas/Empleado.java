package com.mycompany.sistemanominas;

import java.util.Objects;

/**
 * Clase empleado, la cual contiene la información de este. Implementa Comparable para comparar empleados por DNI.
 *
 * @author irene
 * @version 1.0
 */
public abstract class Empleado implements Comparable<Empleado> {
    
    private Dni dni;
    private String nombre;
    private float salario;
    
    // Constructores
    public Empleado() {
    }
    
    public Empleado(Dni dni) {
        if (dni == null || dni.isEmpty()) {
            throw new IllegalArgumentException("El DNI no puede ser nulo o vacío.");
        }
        this.dni = dni;
    }
    
    public Empleado(Dni dni, String nombre) {
        this(dni);
        this.nombre = nombre != null ? nombre : "Desconocido";
    }
    
    public Empleado(Dni dni, String nombre, float salario) {
        this(dni, nombre);
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        if (dni == null || dni.isEmpty()) {
            throw new IllegalArgumentException("El DNI no puede ser nulo o vacío.");
        }
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre != null ? nombre : "Desconocido";
    }
    
    public float getSalario() {
        return salario;
    }
    
    public void setSalario(float salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }

    // Métodos sobreescritos
    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Salario: " + salario;
    }

    @Override
    public int compareTo(Empleado o) {
        return this.dni.compareTo(o.dni);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
    
    /**
     * Calcula el salario del empleado. Este método debe ser implementado por las subclases.
     * 
     * @return el salario calculado del empleado.
     */
    public abstract float calcularSalario();
}
