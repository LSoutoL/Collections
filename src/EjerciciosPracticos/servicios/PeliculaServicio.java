/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos.servicios;
        
import EjerciciosPracticos.entidades.Pelicula;
import EjerciciosPracticos.utilidades.PeliculaComparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lucia
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula 
 * pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al 
 * usuario si quiere crear otra Pelicula o no. 
 * Después de ese bucle realizaremos las siguientes acciones:
 * 
 * • Mostrar en pantalla todas las películas.
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y 
 * mostrarlo en pantalla.
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y 
 * mostrarlo en pantalla.
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
public class PeliculaServicio {
    private Scanner leer;
    private ArrayList <Pelicula> listaPelis;

    public PeliculaServicio() {
        this.leer=new Scanner (System.in).useDelimiter("\n");
        this.listaPelis=new ArrayList();
    }
        
    public ArrayList<Pelicula> cargarPelicula () {
        String opcion;
        do {
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo=leer.next();
        System.out.println("Ingrese el director de la pelicula");
        String director =leer.next();
        System.out.println("Ingrese la duracion de la pelicula (en horas)");
        Double duracion =leer.nextDouble();
        listaPelis.add(new Pelicula(titulo, director, duracion));
        System.out.println("Desea ingresar otro alumno? S/N");
        opcion = leer.next();
      } while (opcion.equalsIgnoreCase("s"));
        return listaPelis;
    }
    
    public void mostrarPelis(){
        listaPelis.forEach((peli) -> {
            System.out.println(peli);
        });
    }
    
    public void duracionMayor(){
        for (Pelicula peli : listaPelis) {
            if (peli.getDuracion()>1.0){
                System.out.println(peli);
            }
        }
    }
    
    public void duracionDescendente(){
        Collections.sort(listaPelis, PeliculaComparadores.duracionDescendente);
        listaPelis.forEach((peli) -> {
            System.out.println(peli);
        });
    }
    
    public void duracionAscendente(){
        Collections.sort(listaPelis, PeliculaComparadores.duracionAscendente);
        listaPelis.forEach((peli) -> {
            System.out.println(peli);
        });
    }
    
    public void tituloAlfabetico(){
        Collections.sort(listaPelis, PeliculaComparadores.tituloAlfabetico);
        listaPelis.forEach((peli) -> {
            System.out.println(peli);
        });
    }
    
    public void directorAlfabetico(){
        Collections.sort(listaPelis, PeliculaComparadores.directorAlfabetico);
        listaPelis.forEach((peli) -> {
            System.out.println(peli);
        });
    }
    
    
}
