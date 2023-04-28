/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosTeoria;

import EjerciciosTeoria.entidades.Libros;
import EjerciciosTeoria.servicio.LibrosServicio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author lucia
 */
public class EjerciciosTeoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Manos a la obra (1) : deteccion de errores
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> nuevo = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();
        
        //Manos a la obra (2): Toma la Lista, el Conjunto y el Mapa del 
        //ejemplo y agrega 5 objetos a cada uno.
        //
        
        int a = 1, b=2, c =3, d=4, e=5;
        listado.add(a);
        listado.add(b);
        listado.add(c);
        listado.add(d);
        listado.add(e);
        /*for (int otro : listado) {
            System.out.println(otro);
        }*/
        
        nuevo.add("f");
        nuevo.add("g");
        nuevo.add("h");
        nuevo.add("i");
        nuevo.add("j");
        /*for (String otro : nuevo) {
            System.out.println(otro);
        }*/
        
        personas.put(1, "a");
        personas.put(2, "b");
        personas.put(3, "c");
        personas.put(4, "d");
        personas.put(5, "e");
        /*for (Map.Entry<Integer, String> otro : personas.entrySet()) {
            System.out.print(otro.getKey());
            System.out.print(otro.getValue());
            System.out.println("");
        }
        /* otra alternativa, es mostrar cada elemento por separado en un bucle
        for normal (no mediante map entry):
        for (int otro: personas){
            System.out.println(otro);
        }
        for (String otra : persona){
            System.out.println(otra);
        }
        */
        
        //Manos a la obra (3): Toma la Lista, el Conjunto y el Mapa que 
        //hiciste previamente y elimina en cada uno un objeto de cada forma que 
        //aprendiste arriba.
        
        /*listado.remove(3);
        for (int otro : listado) {
            System.out.println(otro);
        }
        
        nuevo.remove("h");
        for (int otro : listado) {
            System.out.println(otro);
        }
        personas.remove(4);
        for (Map.Entry<Integer, String> otro : personas.entrySet()) {
            System.out.print(otro.getKey());
            System.out.print(otro.getValue());
            System.out.println("");
        }
        
        //Manos a la obra (4): deteccion de errores
        
        HashMap <Integer, String> personas2 = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas2.put(1, n1);
        personas2.put(2, n2);
        
        //Manos a la obra (5): deteccion de errores
        
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it =bebidas.iterator();
        while (it.hasNext()){
            if (it.next().equals("café")){
                it.remove();
        }
        }*/
        
        //Manos a la obra (6): ¡Es tu turno! Crea una lista de Libros y muestra 
        //el título de cada uno con un bucle.
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibrosServicio servicio = new LibrosServicio();
        System.out.println("Indique la cantidad de libros que desea ingresar");
        int num = leer.nextInt();
        servicio.crearLibreria(num);
        servicio.mostrarLibreria();
        
        //alternativa: rellenar directamente los obejetos y la coleccion mediante 
        //la formula libreria.add(new Libros ("Cascara de nuez","Mc Ewan"));
        
        
        
        
    }
    
}
