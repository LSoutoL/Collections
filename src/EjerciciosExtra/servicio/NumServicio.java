/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra.servicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class NumServicio {
     public void NumPrograma(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Integer> numeros = new ArrayList();
        Integer num;
        System.out.println("Ingrese los numeros que desee. Cuando quiera finalizar, ingrese -99");
        do {
         num=leer.nextInt();
         if (num.equals(-99)){
             break;
         } else {
         numeros.add(num);}
        } while (num!=-99);
      mostrarNumeros(numeros);
      Integer suma = sumaNumeros(numeros);
      System.out.println("La suma de los numeros es " + suma);
      System.out.println("Su promedio es " + promedioNumeros(numeros, suma));  
    }
    public void mostrarNumeros(ArrayList <Integer> numeros){
        System.out.println("Los numeros ingresados son: ");
        for (Integer num : numeros) {
            System.out.println(num);
        }
    }
    public Integer sumaNumeros (ArrayList<Integer> numeros){
        Integer suma =0;
        for (Integer num: numeros) {
           suma+=num;
        }
        return suma;
    }
    public double promedioNumeros (ArrayList <Integer> numeros, Integer suma){
      return suma/numeros.size();
    }
}
