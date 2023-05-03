/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos.servicios;

import EjerciciosPracticos.entidades.Pais;
import EjerciciosPracticos.utilidades.PaisComparadores;
import com.sun.pisces.PiscesRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author lucia
 */
public class PaisServicio {
    private Scanner leer;
    private HashSet<Pais> paises;

    public PaisServicio() {
        this.leer= new Scanner(System.in).useDelimiter("\n");
        this.paises=new HashSet();
    } 
    
    public HashSet<Pais> cargarPais (){
        String opcion;
        do{
        System.out.println("Ingrese el nombre del pais");
        String nombre = leer.next();
        paises.add(new Pais(nombre));
        System.out.println("Desea ingresar otro pais? (S/N)");
        opcion=leer.next();
        } while (opcion.equalsIgnoreCase("s"));
        mostrarPaises();
        return paises;
    }
    
    public void mostrarPaises (){
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }
    
    public void Alfabetico(){
        ArrayList<Pais> listaPaises = new ArrayList ();
        listaPaises.addAll(paises);
        Collections.sort(listaPaises, PaisComparadores.Alfabetico);
        for (Pais pais : listaPaises) {
            System.out.println(pais);
        }
    }
    
    public void eliminarPais(){
        System.out.println("Indique el pais que desea eliminar");
        String nombre =leer.next();
        if (Collections.frequency(paises, nombre)==0){
            System.out.println("El pais no es parte del conjunto");
        } else {
        Iterator<Pais> it =paises.iterator();
        while(it.hasNext()){
            if (it.next().getNombre().equalsIgnoreCase(nombre)){
                it.remove();
            }
        }
        mostrarPaises();
    }
    }
}
