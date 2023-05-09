/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import EjerciciosExtra.entidades.CantanteFamoso;
import EjerciciosExtra.entidades.Libro;
import EjerciciosExtra.servicio.CantanteServicio;
import EjerciciosExtra.servicio.LibroServicio;
import EjerciciosExtra.servicio.NumServicio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;



/**
 *
 * @author lucia
 */
public class EjerciciosExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*NumServicio serv = new NumServicio();
        serv.NumPrograma();*/
        
       /* CantanteServicio servicio = new CantanteServicio();
        ArrayList <CantanteFamoso> lista = servicio.CrearLista();
        servicio.mostrarLista(lista);
        servicio.Menu(lista);
        servicio.mostrarLista(lista);*/
       
       /*LibroServicio servicio = new LibroServicio();
       HashSet <Libro> Liberia = new HashSet();
       servicio.Menu(Liberia);*/
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap <Integer, String> ciudades = new HashMap();
        
        //Agregar 10 ciudades:
        for (int i = 0; i < 10; i++) {
            System.out.println("Indique el nombre de una ciudad");
            String ciudad = leer.next();
            System.out.println("Ingrese el codigo postal de esa ciudad");
            Integer codigo = leer.nextInt();
            ciudades.put(codigo, ciudad);
        }
        
        //Mostrar el HashMap
        /*for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            System.out.println("Ciudad: " + entry.getValue() + " - Codigo Postal: " + entry.getKey());
        }*/
        for (Integer codigo : ciudades.keySet()) {
            System.out.println("ciudad: " + ciudades.get(codigo) + " - codigo postal: " + codigo);
        }
        
        //Buscar ciudad por codigo postal
        System.out.println("Indique el codigo postal que desea buscar");
        Integer cod = leer.nextInt();
        if (ciudades.containsKey(cod)){
            System.out.println("Ese codigo postal pertenece a la ciudad de " + ciudades.get(cod));
        } else System.out.println("Ese codigo no corresponde a una ciudad cargada.");
        
        //Agregar una nueva ciudad
        System.out.println("Indique el nombre de una ciudad");
            String ciudad = leer.next();
            System.out.println("Ingrese el codigo postal de esa ciudad");
            Integer codigo = leer.nextInt();
            ciudades.put(codigo, ciudad);
        
        //Eliminar tres ciudades
        int i =0;
        do {
            /*System.out.println("Indique el codigo postal de la ciudad que desea elimnar");  
            Integer codi = leer.nextInt();
            if (ciudades.containsKey(codi)){
                ciudades.remove(codi);
                i++;
            }*/
            System.out.println("Indique la ciudad que desea eliminar");
            String nombre = leer.next();
            /*for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                if (value.equals(nombre)){
                    ciudades.remove(key);
                    i++;
                }                
            }*/
            if (ciudades.containsValue(nombre)){
            for (Integer key : ciudades.keySet()) {
            String value = ciudades.get(key);
            if(nombre.equalsIgnoreCase(value)){
                ciudades.remove(key);
                i++;
            }
            }
            } else System.out.println("La ciudad no fue encontrada.");
        } while (i<3);
        for (Integer cods : ciudades.keySet()) {
            System.out.println("Ciudad: " + ciudades.get(cods) + " - Codigo Postal: "+ cods);
        }
    }

}
