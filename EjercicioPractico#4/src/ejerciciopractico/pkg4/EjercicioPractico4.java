/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico.pkg4;

import Services.PeliculaService;

/**
 *
 * @author clavs
 */
public class EjercicioPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PeliculaService service = new PeliculaService();
        
        service.crearPelicula();
        service.mostrarPelis();
        System.out.println(" ");
        service.mostrarPelisLargas();
        System.out.println(" ");
        service.ordenarPelisMayorAMenor();
        service.mostrarPelis();
        System.out.println(" ");
        service.ordenarPelisMenorAMayor();
        service.mostrarPelis();
        System.out.println(" ");
        service.ordenarPelisPorTitulo();
        service.mostrarPelis();
        System.out.println(" ");
        service.ordenarPelisDirector();
        service.mostrarPelis();
    }
}
