/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class ProductoService {
    Scanner leer = new Scanner(System.in);
    HashMap<String, Integer> producto = new HashMap();

    public void ingresarProducto(){
        System.out.println("Ingresar nombre de producto:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el precio en pesos:");
        int precio = leer.nextInt();
        producto.put(nombre, precio);
        leer.nextLine();
    }
    
    public void modificarPrecio(){
        System.out.println("Ingrese el nombre del producto:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el nuevo precio:");
        producto.put(nombre, leer.nextInt());
        leer.nextLine();
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese el nombre del producto a eliminar:");
        String borrar = leer.nextLine();
        producto.remove(borrar);
        leer.nextLine();
    }
    
    public void mostrarProductos(){
        System.out.println("Lista de productos actual:");
        for (Map.Entry<String, Integer> entry : producto.entrySet()) {
            System.out.println(entry.getKey() + " $" + entry.getValue());
        }
    }
    
}
