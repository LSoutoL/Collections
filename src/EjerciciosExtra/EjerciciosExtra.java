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
import java.util.HashSet;



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
       
       LibroServicio servicio = new LibroServicio();
       HashSet <Libro> Liberia = new HashSet();
       servicio.Menu(Liberia);

    }

}
