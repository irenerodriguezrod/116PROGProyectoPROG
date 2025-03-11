package com.mycompany.sistemanominas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Clase SistemaNominas para gestionar empleados en un sistema de nóminas.
 *
 * @author irene.rodrod.2
 * @version 1.0
 */
public class SistemaNominas {
    private String dni;
    private List<Empleado> empleados;

    /**
     * Constructor que inicializa el sistema con un identificador único.
     *
     * @param dni Identificador del sistema.
     * @throws IllegalArgumentException si el DNI es nulo o vacío.
     */
    public SistemaNominas(String dni) {
        if (dni == null || dni.isEmpty()) {
            throw new IllegalArgumentException("El DNI del sistema no puede ser nulo o vacío.");
        }
        this.dni = dni;
        this.empleados = new ArrayList<>();
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni == null || dni.isEmpty()) {
            throw new IllegalArgumentException("El DNI no puede ser nulo o vacío.");
        }
        this.dni = dni;
    }

    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }

    public void setEmpleados(List<Empleado> empleados) {
        if (empleados == null) {
            throw new IllegalArgumentException("La lista de empleados no puede ser nula.");
        }
        this.empleados = empleados;
    }

    // Métodos principales

    /**
     * Añade un nuevo empleado a la lista.
     *
     * @param empleado Empleado a incluir.
     * @return true si se añadió correctamente, false en caso contrario.
     */
    public boolean incluirEmpleado(Empleado empleado) {
        if (empleado != null && !empleados.contains(empleado)) {
            return empleados.add(empleado);
        }
        return false;
    }

    /**
     * Busca un empleado por su DNI.
     *
     * @param dni DNI del empleado a buscar.
     * @return el empleado encontrado o null si no existe.
     */
    public Empleado getEmpleado(String dni) {
        if (dni == null || dni.isEmpty()) {
            return null;
        }
        for (Empleado empleado : empleados) {
            if (dni.equals(empleado.getDni())) {
                return empleado;
            }
        }
        return null;
    }

    /**
     * Elimina un empleado por su referencia.
     *
     * @param empleado Empleado a eliminar.
     * @return true si el empleado fue eliminado, false en caso contrario.
     */
    public boolean eliminarEmpleado(Empleado empleado) {
        return empleados.remove(empleado);
    }

    /**
     * Elimina un empleado por su DNI.
     *
     * @param dni DNI del empleado a eliminar.
     * @return true si el empleado fue eliminado, false en caso contrario.
     */
    public boolean eliminarEmpleadoPorDni(String dni) {
        Empleado empleado = getEmpleado(dni);
        if (empleado != null) {
            return empleados.remove(empleado);
        }
        return false;
    }

    /**
     * Devuelve una copia de la lista de empleados.
     *
     * @return lista de empleados.
     */
    public List<Empleado> listarEmpleados() {
        return new ArrayList<>(empleados);
    }

    /**
     * Devuelve una copia de la lista original ordenada por sueldo en orden descendente.
     *
     * @return lista de empleados ordenada por sueldo.
     */
    public List<Empleado> listarEmpleadosPorSueldo() {
        List<Empleado> empleadosOrdenados = new ArrayList<>(empleados);
        empleadosOrdenados.sort(Comparator.comparingDouble(Empleado::calcularSalario).reversed());
        return empleadosOrdenados;
    }

    /**
     * Calcula el total de salarios de todos los empleados.
     *
     * @return suma total de los salarios.
     */
    public double getTotalSalarios() {
        double totalSalarios = 0.0;
        for (Empleado empleado : empleados) {
            totalSalarios += empleado.calcularSalario();
        }
        return totalSalarios;
    }
}
