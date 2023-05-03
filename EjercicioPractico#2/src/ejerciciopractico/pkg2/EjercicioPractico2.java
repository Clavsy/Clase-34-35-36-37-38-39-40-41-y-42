/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico.pkg2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> perros = new ArrayList();
        boolean salir = false;

        do {
            System.out.println("Ingresar raza de perro:");
            perros.add(leer.nextLine());
            System.out.println("Quieres ingresar otro perro? (S/N)");
            if (leer.nextLine().equalsIgnoreCase("N")) {
                salir = true;
            }
        } while (!salir);

        System.out.println("Lista armada:");
        System.out.println(perros.toString());

        System.out.println("Ingrese una raza para borrar:");
        String raza = leer.nextLine();
        boolean eliminado = false;
        
        Iterator it = perros.iterator();
        while (it.hasNext()) {
            if (it.next().equals(raza)) {
                it.remove();
                eliminado = true;
            }
        }

        if (eliminado) {
            System.out.println("Elemento eliminado!");
        } else {
            System.out.println("No se encontró el elemento ingresado.");
        }
        
        System.out.println("Lista actualizada:");
        System.out.println(perros.toString());
    }
}
