/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos.entidades;

/**
 *
 * @author lucia
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. 
 * Para esto, tendremos una clase Pelicula con el título, director y duración 
 * de la película (en horas). Implemente las clases y métodos necesarios para 
 * esta situación, teniendo en cuenta lo que se pide a continuación:
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + "horas" + '}';
    }
    
    
}
