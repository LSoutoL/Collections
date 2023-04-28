/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import java.util.ArrayList;
import java.util.Iterator;
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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       /*1. Diseñar un programa que lea y guarde razas de perros en un ArrayList
        *de tipo String. El programa pedirá una raza de perro en un bucle, el 
        *mismo se guardará en la lista y después se le preguntará al usuario si 
        *quiere guardar otro perro o si quiere salir. Si decide salir, se 
        *mostrará todos los perros guardados en el ArrayList.*/
        
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
        System.out.println("Las razas son:");
        for (String otro : razasPerro) {
            System.out.println(otro);
        }
       
       /* 2. Continuando el ejercicio anterior, después de mostrar los perros, 
        * al usuario se le pedirá un perro y se recorrerá la lista con un Iterator, 
        * se buscará el perro en la lista. Si el perro está en la lista, se 
        * eliminará el perro que ingresó el usuario y se mostrará la lista 
        * ordenada. Si el perro no se encuentra en la lista, se le informará al 
        * usuario y se mostrará la lista ordenada.*/
       
        System.out.println("Indique la raza que desea eliminar");
        String elim = leer.next();
        Iterator <String> it = razasPerro.iterator();
        int contador =0;
        while (it.hasNext()){
            if (it.next().equals(elim)){
              it.remove();
              contador++;
            }       
        }
        if (contador==0) {
            System.out.println("Error al eliminar. La raza no fue encontrada.");
        }
         System.out.println("Las razas son:");
         for (String otro : razasPerro) {
            System.out.println(otro);
        }
       
    }
    
}
