/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author clavs
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, String> alumnos = new HashMap();
        TreeMap<Integer, String> alumnosTree = new TreeMap(alumnos);
    }
    
}
