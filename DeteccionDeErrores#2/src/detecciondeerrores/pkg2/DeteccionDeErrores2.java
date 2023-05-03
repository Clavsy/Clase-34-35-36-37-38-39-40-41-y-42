/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detecciondeerrores.pkg2;

import java.util.HashMap;

/**
 *
 * @author clavs
 */
public class DeteccionDeErrores2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap<Integer, String> personas = new HashMap();
        
        String n1 = "Albus";
        int dni1 = 123456789;
        String n2 = "Severus";
        int dni2 = 987654321;
        personas.put(dni1, n1);
        personas.put(dni2, n2);
        
        String nombre = personas.get(dni1);
        
        System.out.println(personas.get(dni1));
    }

}
