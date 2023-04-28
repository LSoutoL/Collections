/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class EjerciciosPracticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*1. Diseñar un programa que lea y guarde razas de perros en un ArrayList
        *de tipo String. El programa pedirá una raza de perro en un bucle, el 
        *mismo se guardará en la lista y después se le preguntará al usuario si 
        *quiere guardar otro perro o si quiere salir. Si decide salir, se 
        *mostrará todos los perros guardados en el ArrayList.*/
        
        Scanner leer = new Scanner(System.in);
        ArrayList <String> razasPerro = new ArrayList();
        int opcion=0;
        do {
            System.out.println("Ingrese una raza de mascota");
            razasPerro.add(leer.next());
            
            System.out.println("Desea agregar otra raza?");
            System.out.println("1. Si");
            System.out.println("2. NO");
            opcion=leer.nextInt();
        } while (opcion==1);
        for (String otro : razasPerro) {
            System.out.println(otro);
        }
    }
    
}
