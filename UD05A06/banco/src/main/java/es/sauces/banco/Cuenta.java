package es.sauces.banco;

import java.util.Objects;

/**
 * Clase que representa una cuenta bancaria.
 * Permite gestionar el saldo, el titular y el código de la cuenta.
 * Proporciona métodos para realizar operaciones básicas como ingresos y reintegros.
 * 
 * @author irene.rodrod
 * @version 1.0
 */
public class Cuenta {
    private String codigo;
    private String titular;
    private float saldo;

    /**
     * Constructor de la clase Cuenta.
     * 
     * @param codigo el código único de la cuenta
     * @param titular el nombre del titular de la cuenta
     * @param saldo el saldo inicial de la cuenta; debe ser mayor o igual a 0
     */
    public Cuenta(String codigo, String titular, float saldo) {
        this.codigo = codigo;
        this.titular = titular;
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    /**
     * Devuelve el código de la cuenta.
     * 
     * @return el código de la cuenta
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Devuelve el titular de la cuenta.
     * 
     * @return el titular de la cuenta
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return el saldo de la cuenta
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Establece el código de la cuenta.
     * 
     * @param codigo el nuevo código de la cuenta
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Establece el titular de la cuenta.
     * 
     * @param titular el nuevo titular de la cuenta
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Establece el saldo de la cuenta.
     * El saldo debe ser mayor o igual a 0.
     * 
     * @param saldo el nuevo saldo de la cuenta
     */
    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * La cantidad debe ser mayor que 0.
     * 
     * @param cantidad la cantidad a ingresar
     */
    public void ingresar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    /**
     * Reintegra una cantidad de la cuenta.
     * La cantidad debe ser mayor que 0 y no superar el saldo disponible.
     * 
     * @param cantidad la cantidad a reintegrar
     */
    public void reintegrar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    /**
     * Devuelve una representación en cadena de la cuenta.
     * 
     * @return una cadena que contiene el código, el titular y el saldo de la cuenta
     */
    @Override
    public String toString() {
        return codigo + "," + titular + "," + saldo;
    }

    /**
     * Calcula el código hash de la cuenta basado en el código único.
     * 
     * @return el código hash de la cuenta
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    /**
     * Compara si esta cuenta es igual a otro objeto.
     * 
     * @param obj el objeto a comparar
     * @return true si ambos objetos son iguales; false en caso contrario
     */
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
        final Cuenta other = (Cuenta) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
}
