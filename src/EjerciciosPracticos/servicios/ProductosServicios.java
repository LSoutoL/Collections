/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos.servicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class ProductosServicios {
    private Scanner leer;
    private HashMap <String, Double> tienda;

    public ProductosServicios() {
        this.leer= new Scanner(System.in).useDelimiter("\n");
        this.tienda=new HashMap();
    }
    
    public void menu(){
        int opc;
        do {
            System.out.println("Indique la accion que desea realizar");
            System.out.println("1. Ingresar un producto");
            System.out.println("2. Modificar el precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar los productos de la tienda");
            System.out.println("5. Salir");
            opc=leer.nextInt();
            switch (opc){
                case 1: ingresarProducto();
                break;
                case 2: modificarPrecio();
                break;
                case 3: eliminarProducto();
                break;
                case 4: mostrarTienda();
                break;
            }
        } while (opc!=5);
    }
       
    public HashMap<String, Double> ingresarProducto(){
       String opc;
       do{
           System.out.println("Ingrese el producto");
           String producto=leer.next();
           System.out.println("Ingrese el precio de " + producto);
           Double precio = leer.nextDouble();
           tienda.put(producto, precio);
           System.out.println("Desea ingresar otro producto? (S/N)");
           opc = leer.next();           
       }while(opc.equalsIgnoreCase("s"));
        return tienda;
    }
    
    public void modificarPrecio (){
        System.out.println("Indique el producto cuyo precio desea modificar");
        String producto=leer.next();
        System.out.println("Indique el nuevo precio que desea asignarle");
        Double precio=leer.nextDouble();
        tienda.replace(producto, precio);
    }
    public void eliminarProducto(){
        System.out.println("Indique el producto que desea eliminar");
        String producto = leer.next();
        tienda.remove(producto);
    }
    
    public void mostrarTienda (){
        for (Map.Entry<String, Double> entry : tienda.entrySet()) {
            System.out.println(entry.getKey()+ " { precio: " + entry.getValue()+ " }");
        }
    }
}
