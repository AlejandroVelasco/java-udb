/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.ejemlos.s3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleev
 */
public class Test {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos = Alumno.listarAlumnos();
        for(Alumno a : listaAlumnos){
            System.out.println("Nombre = " + a.getNombre());
            
            System.out.println("Apellido = " + a.getApellido());
            
            System.out.println("DUI = " + a.getDui());
            
            System.out.println("Edad = " + a.getEdad());
        }
    }
}
