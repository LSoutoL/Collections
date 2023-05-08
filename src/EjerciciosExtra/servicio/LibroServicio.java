/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra.servicio;

import EjerciciosExtra.entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author lucia
 * tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
 */
public class LibroServicio {
    private Scanner leer;

    public LibroServicio() {
        this.leer= new Scanner(System.in).useDelimiter("\n");
    }
    
    public HashSet <Libro> Libreria (){
        HashSet<Libro> libreria = new HashSet();
        String opc;
        do{
        libreria.add(nuevo());
        System.out.println("Desea agregar otro libro? (S/N)");
        opc=leer.next();
        } while (opc.equals("s"));
        return libreria;
    }
    
    public Libro nuevo (){
        System.out.println("Indique el titulo del libro");
        String titulo=leer.next();
        System.out.println("Indique el autor del libro");
        String autor=leer.next();
        System.out.println("Indique la cantidad de ejemplares que posee en la biblioteca");
        int ejemplares =leer.nextInt();
        System.out.println("Indique la cantidad de ejemplares que ha prestado");
        int prestados = leer.nextInt();
        return new Libro(titulo, autor, ejemplares, prestados);
    }
    public boolean prestamo (HashSet <Libro> Libreria){
        System.out.println("Indique el libro que desea en prestamo");
        String titulo=leer.next();
        boolean prestamo=false;
        for (Libro libro : Libreria) {
            System.out.println(libro.getTitulo());
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
            if(libro.getPrestados()<libro.getEjemplares()){
                libro.setPrestados(libro.getPrestados()+1);
                prestamo=true;
            }    
            }
        }
    return prestamo;
    }
    public boolean devolucion (HashSet <Libro> Libreria){
        System.out.println("Indique el libro que desea devolver");
        String titulo =leer.next();
        boolean devolucion = false;
        for (Libro libro : Libreria) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                if(libro.getPrestados()>0){
                    libro.setPrestados(libro.getPrestados()-1);
                    devolucion=true;
                }
            }
        }
        
    return devolucion;    
    }
    public void Menu (HashSet <Libro> Libreria){
        int opc;
        do{
        System.out.println("Indique la accion que desea realizar");
        System.out.println("1. Agregar un libro");
        System.out.println("2. Pedir un prestamo");
        System.out.println("3. Hacer una devolucion");
        System.out.println("4. Salir");
        opc = leer.nextInt();
        switch (opc){
            case 1: Libreria=Libreria();
            break;
            case 2: 
            System.out.println("La accion tuvo como resultado: " +prestamo(Libreria));
            break;
            case 3: 
            System.out.println("La accion tuvo como resultado: " +devolucion(Libreria));
            break;
        }
        } while (opc!=4);
    }
}
