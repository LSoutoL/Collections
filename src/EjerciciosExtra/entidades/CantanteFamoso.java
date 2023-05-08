/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra.entidades;

/**
 *
 * @author lucia
 * Esta clase guardará cantantes famosos y tendrá como atributos el nombre y 
 * discoConMasVentas.
 */
public class CantanteFamoso {
    private String nombre;
    private String disco;

    public CantanteFamoso(String nombre, String disco) {
        this.nombre = nombre;
        this.disco = disco;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDisco() {
        return disco;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", disco=" + disco + '}';
    }
    
    
}
