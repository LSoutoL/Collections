/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos.servicios;

import EjerciciosPracticos.entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lucia
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. 
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de 
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 * 
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere 
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la 
 * lista, se llama al método. Dentro del método se usará la lista notas para 
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto 
 * por el método y mostrado en el main.
 */
public class AlumnoServicio {
    private ArrayList <Alumno> AlumnoList;
    private Scanner leer;

    public AlumnoServicio() {
        this.AlumnoList= new ArrayList();
        this.leer= new Scanner(System.in).useDelimiter("\n");
    }
       
    public ArrayList<Alumno> crearAlumno () {
        String opcion;
        do {
        System.out.println("Ingrese el nombre del alumno");
        String nombre=leer.next();
        ArrayList <Integer> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i+1)+ " del alumno:");
            notas.add(leer.nextInt());
        }
        AlumnoList.add(new Alumno(nombre, notas));
            System.out.println("Desea ingresar otro alumno? S/N");
            opcion = leer.next();
      } while (opcion.equalsIgnoreCase("s"));
        return AlumnoList;
    }  
    public double notaFinal (String nombre){
        Iterator <Alumno> it = AlumnoList.iterator();
        int suma=0;
        for (Alumno alumno : AlumnoList) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)){
                for (int nota : alumno.getNotas()) {
                    System.out.println(nota);
                    suma+=nota;
                }
            }
        }
     return suma/3;   
    }
    
}
