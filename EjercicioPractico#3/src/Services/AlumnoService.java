/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class AlumnoService {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList();

    public void crearAlumno() {

        boolean salir = false;

        do {

            Alumno alumno = new Alumno();
            ArrayList<Integer> notas = new ArrayList();
            System.out.println("Nombre:");
            alumno.setNombre(leer.nextLine());
            System.out.println("Nota #1:");
            notas.add(leer.nextInt());
            System.out.println("Nota #2:");
            notas.add(leer.nextInt());
            System.out.println("Nota #3:");
            notas.add(leer.nextInt());
            leer.nextLine();
            alumno.setNotas(notas);
            alumnos.add(alumno);

            System.out.println("Desea añadir otro alumno? (S/N)");
            if (leer.nextLine().equalsIgnoreCase("N")) {
                salir = true;
            }

        } while (!salir);
    }

    public void notaFinal() {

        System.out.println("Ingrese nombre del alumno para calcular su nota final:");
        String nombre = leer.nextLine();
        boolean alumnoEncontrado = false;
        int promedio;
        String nombreCal;

        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a = alumnos.get(i);
            ArrayList<Integer> notas = a.getNotas();
            if (nombre.equalsIgnoreCase(a.getNombre())) {
                nombreCal = a.getNombre();
                promedio = (notas.get(0) + notas.get(1) + notas.get(2)) / 3;
                System.out.println("El promedio final de " + nombreCal + " es de " + promedio);
                alumnoEncontrado = true;
            }
        }
        if(!alumnoEncontrado){
            System.out.println("No se encontro el alumno ingresado.");
        }
    }
}
