/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosTeoria.entidades;

/**
 *
 * @author lucia
 */
public class Libros {
    private String titulo;
    private String autor;

    public Libros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libros() {
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + '}';
    }
    
    
}
