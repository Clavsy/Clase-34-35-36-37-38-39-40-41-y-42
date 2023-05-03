/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author clavs
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listado = new ArrayList();
        int x = 20;
        listado.add(x);
        listado.remove(0);
        
        TreeSet<String> listado2 = new TreeSet();
        String nombre = "Joaquin";
        listado2.add(nombre);
        listado2.remove("Joaquin");
        
        HashMap<Integer, String> personas = new HashMap();
        int dni = 45641208;
        String apellido = "Rego";
        personas.put(dni, apellido);
        personas.remove(45641208);
    }

}
