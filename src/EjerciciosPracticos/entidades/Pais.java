/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos.entidades;

import java.util.Objects;

/**
 *
 * @author lucia
 */
public class Pais {
    private String nombre;
    private Integer habitantes;
    private String continente;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
        this.habitantes = Integer.valueOf((int)Math.random()*1000);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.nombre);
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
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", habitantes=" + habitantes + '}';
    }

}