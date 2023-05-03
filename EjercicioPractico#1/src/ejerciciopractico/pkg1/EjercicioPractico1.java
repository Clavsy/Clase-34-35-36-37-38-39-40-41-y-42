/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> perros = new ArrayList();
        boolean salir = false;
        
        do{
            System.out.println("Ingresar raza de perro:");
            perros.add(leer.nextLine());
            System.out.println("Quieres ingresar otro perro? (S/N)");
            if(leer.nextLine().equalsIgnoreCase("N")){
                salir = true;
            }
        }while(!salir);
        
        System.out.println(perros.toString());
        
    }
    
}
