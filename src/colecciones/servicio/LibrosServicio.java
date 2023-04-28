/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.servicio;

import colecciones.entidades.Libros;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class LibrosServicio {
    private ArrayList <Libros> libreria; 
    private Scanner leer;

    public LibrosServicio() {
        this.libreria= new ArrayList();
        this.leer= new Scanner(System.in).useDelimiter("\n");
    }
    public Libros crearLibro(){
        System.out.println("Indique el titulo del libro");
        String titulo = leer.next();
        System.out.println("Indique el autor del libro");
        String autor = leer.next();
        return new Libros(titulo, autor);
    }
    public void crearLibreria(int num){
        for (int i = 0; i < num; i++) {
            libreria.add(crearLibro());
        }
    }
    public void mostrarLibreria(){
        for (Libros algun : libreria) {
            System.out.println(algun.toString());
        }
    }
    
}
