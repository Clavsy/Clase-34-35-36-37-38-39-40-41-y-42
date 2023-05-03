/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico.pkg3;

import Services.AlumnoService;

/**
 *
 * @author clavs
 */
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlumnoService ser = new AlumnoService();
        
        ser.crearAlumno();
        ser.notaFinal();
        
    }
}
