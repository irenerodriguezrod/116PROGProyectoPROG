package com.mycompany.sistemanominas;

/**
 * Clase que representa un empleado eventual con salario por horas
 * @author irene.rodrod.2
 */
public class EmpleadoEventual extends Empleado {
    private float salarioHora;
    private int horas;
    private String fechaFinContrato;
    
    public EmpleadoEventual() {
        super();
    }

    public EmpleadoEventual(String dni) {
        super(dni);
    }

    public EmpleadoEventual(String dni, String nombre, float salarioHora, int horas, String fechaFinContrato) {
        super(dni, nombre);
        this.salarioHora = salarioHora;
        this.horas = horas;
        this.fechaFinContrato = fechaFinContrato;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public String getFechaFinContrato() {
        return fechaFinContrato;
    }
    
    public void setFechaFinContrato(String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    @Override
    public String toString() {
        return super.toString() + 
               ", Tipo: Eventual" +
               ", Salario por hora: " + salarioHora + 
               ", Horas trabajadas: " + horas +
               ", Fecha fin contrato: " + fechaFinContrato;
    }

    @Override
    public float calcularSalario() {
        return salarioHora * horas;
    }
}