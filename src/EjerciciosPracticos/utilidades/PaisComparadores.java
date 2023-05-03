/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos.utilidades;

import EjerciciosPracticos.entidades.Pais;
import java.util.Comparator;

/**
 *
 * @author lucia
 */
public class PaisComparadores {
    
    public static Comparator<Pais> Alfabetico = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
           return t.getNombre().compareToIgnoreCase(t1.getNombre());
        }
    };
    
}
