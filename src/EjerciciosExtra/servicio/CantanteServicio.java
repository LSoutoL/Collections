/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra.servicio;

import EjerciciosExtra.entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class CantanteServicio {
    private Scanner leer;

    public CantanteServicio() {
    this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public ArrayList<CantanteFamoso> CrearLista (){
        ArrayList <CantanteFamoso> lista = new ArrayList();
        for (int i = 0; i < 5; i++) {
        lista.add(nuevo());
        }
        return lista;
    }
    public CantanteFamoso nuevo (){
        System.out.println("Indique el nombre del Cantante");
        String nombre = leer.next();
        System.out.println("Indique su disco con mas ventas");
        String disco = leer.next();
        return new CantanteFamoso(nombre, disco);
    }
    public void mostrarLista (ArrayList <CantanteFamoso> lista){
        for (CantanteFamoso cantante : lista) {
            System.out.println(cantante);
        }
    }
    
    public void eliminarCantante (ArrayList <CantanteFamoso> lista){
        System.out.println("Indique el nombre del cantante que desea eliminar");
        String nombre = leer.next();
        Iterator <CantanteFamoso> it = lista.iterator();
        while (it.hasNext()){
            if (it.next().getNombre().equalsIgnoreCase(nombre)){
                it.remove();
            }
        }
    }
    /*Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa.*/
    
    public void Menu (ArrayList<CantanteFamoso> lista){
        int opcion;
        do{
            System.out.println("Indique la accion que desea realizar:");
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            opcion=leer.nextInt();
            switch (opcion){
                case 1: lista.add(nuevo());
                break;
                case 2: mostrarLista(lista);
                break;
                case 3: eliminarCantante(lista);
                break;    
            }
                
        } while (opcion!=4);
    }
}
