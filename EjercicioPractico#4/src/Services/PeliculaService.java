/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class PeliculaService {

    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> lista = new ArrayList();

    public void crearPelicula() {
        boolean salir = false;
        System.out.println("INGRESAR PELICULAS:");
        do {
            System.out.println("Título:");
            String titulo = leer.nextLine();
            System.out.println("Director:");
            String director = leer.nextLine();
            System.out.println("Duración (en horas):");
            Integer duracion = leer.nextInt();
            Pelicula peli = new Pelicula(titulo, director, duracion);
            lista.add(peli);
            System.out.println("Desea añadir otra pelicula? (S/N)");
            leer.nextLine();
            if (leer.nextLine().equalsIgnoreCase("N")) {
                salir = true;
            }
        } while (!salir);
    }

    public void mostrarPelis() {
        System.out.println("LISTA DE PELÍCULAS REGISTRADAS:");
        for (int i = 0; i < lista.size(); i++) {
            Pelicula peli = lista.get(i);
            System.out.println("Pelicula #" + (i + 1));
            System.out.println("Título: " + peli.getTitulo());
            System.out.println("Director: " + peli.getDirector());
            System.out.println("Duracion (en horas): " + peli.getDuracion() + " horas");
        }
    }

    public void mostrarPelisLargas() {
        System.out.println("LISTA DE PELÍCULAS CON DURACIÓN MAYOR A UNA HORA:");

        for (int i = 0; i < lista.size(); i++) {
            Pelicula peli = lista.get(i);
            if (peli.getDuracion() >= 1) {
                System.out.println("Pelicula #" + (i + 1));
                System.out.println("Título: " + peli.getTitulo());
                System.out.println("Director: " + peli.getDirector());
                System.out.println("Duracion (en horas): " + peli.getDuracion() + " horas");
            }
        }
    }

    public void ordenarPelisMenorAMayor() {
        Collections.sort(lista, Pelicula.compararDuracion);
    }
    
    public void ordenarPelisMayorAMenor() {
        Collections.sort(lista, Pelicula.compararDuracion);
        Collections.reverse(lista);
    }
    
    public void ordenarPelisPorTitulo() {
        Collections.sort(lista, Pelicula.compararTitulo);
    }
    
    public void ordenarPelisDirector() {
        Collections.sort(lista, Pelicula.compararDirector);
    }
}
