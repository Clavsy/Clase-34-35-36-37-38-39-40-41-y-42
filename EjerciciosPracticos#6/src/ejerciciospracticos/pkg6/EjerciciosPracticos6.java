/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos.pkg6;

import Service.ProductoService;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjerciciosPracticos6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoService lista = new ProductoService();
        Scanner leer = new Scanner(System.in);
        
        boolean salir = false;
        
        System.out.println("LISTA DE PRODUCTOS:");
        do{
            System.out.println("Qué desea realizar?");
            System.out.println(" 1- Ingresar producto.");
            System.out.println(" 2- Modificar precio.");
            System.out.println(" 3- Eliminar producto.");
            System.out.println(" 4- Mostrar productos.");
            System.out.println(" 5- Salir.");
            int eleccion = leer.nextInt();
            
            switch (eleccion){
                case 1:
                    lista.ingresarProducto();
                    break;
                case 2:
                    lista.modificarPrecio();
                    break;
                case 3:
                    lista.eliminarProducto();
                    break;
                case 4:
                    lista.mostrarProductos();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("La opción ingresada no es valida.");
            }
        }while(!salir);
    }
    
}
