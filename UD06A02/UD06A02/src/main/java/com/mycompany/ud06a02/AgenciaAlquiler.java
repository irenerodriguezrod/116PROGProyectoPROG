package com.mycompany.ud06a02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Irene RODRIGUEZ RODRIGUEZ
 * @version 1.0
 */
public class AgenciaAlquiler {

    private TreeSet<Vehiculo> vehiculos;
    private String nombre;

    public AgenciaAlquiler(String nombre) {
        this.nombre = nombre;
        vehiculos = new TreeSet<>();
    }

    /**
     * Añade un nuevo vehículo en caso de que no exista, devuelve el nuevo
     * vehículo. Si ya existe, devuelve false
     *
     * @param vehiculo
     * @return
     */
    public boolean incluirVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
            return vehiculos.add(vehiculo);
        }
        return false;
    }

    /**
     *
     * @param matricula
     * @return
     */
    public Vehiculo consultarVehiculo(String matricula) {
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;
    }

    /**
     * Elimina un vehículo existente
     *
     * @param vehiculo
     * @return
     */
    public boolean eliminarVehiculo(Vehiculo vehiculo) {
        return vehiculos.remove(vehiculo);
    }

    /**
     * Lista los vehículos por precio
     *
     * @return
     */
    public List<Vehiculo> listarVehiculosPorPrecio() {
        List<Vehiculo> vehiculosPorPrecio = new ArrayList<>(vehiculos);
        vehiculosPorPrecio.sort(new ComparadorPrecio());
        return vehiculosPorPrecio;
    }

    /**
     *
     * @return
     */
    public List<Vehiculo> listarFurgonetas() {
        List<Vehiculo> furgonetas = new ArrayList<>();
        for (Vehiculo v : vehiculos) {//se recorre todo y se saca los que quieras.
            if (v instanceof Furgoneta) {
                furgonetas.add(v);
            }
        }
        return furgonetas;
    }

    /**
     *
     * @return
     */
    public List<Vehiculo> listarTurismos() {
        List<Vehiculo> turismos = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v instanceof Turismo) {
                turismos.add(v);
            }
        }
        return turismos;
    }

    /**
     * 
     * @return 
     */
    public Vehiculo getVehiculoMasBarato() {
        return Collections.min(vehiculos, new ComparadorPrecio() {
        });// Buscame por medio de Collections, el minimo de la lista de vehiculos utilizando el comparador de precio externo
    }
}
