/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico.pkg5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author clavs
 */
public class EjercicioPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        TreeSet<String> paises = new TreeSet();
        
        boolean salir = false;
        
        System.out.println("Crear lista de países:");
        do{
            System.out.println("Ingrese un país:");
            String país = leer.nextLine();
            paises.add(país);
            System.out.println("Quiere ingresar otro país? (S/N):");
            if(leer.nextLine().equalsIgnoreCase("N")){
                salir = true;
            }
        }while(!salir);
        
        System.out.println("Lista de países actual:");
        System.out.println(paises.toString());
        
        System.out.println("Ingrese un país para borrar:");
        String borrar = leer.nextLine();
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().equals(borrar)) {
                it.remove();
            }
        }
        
        System.out.println("Lista de países actualizada:");
        System.out.println(paises.toString());
    }
}
