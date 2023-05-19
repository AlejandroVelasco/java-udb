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
public class Alumno {
    private String nombre;
    private String apellido;
    private String dui;
    private int edad;

    public Alumno(String nombre, String apellido, String dui, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.edad = edad;
    }

    
    public static List<Alumno> listarAlumnos(){
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Juan", "Perez", "123456789", 80));
        listaAlumnos.add(new Alumno("Pedro", "Ramirez", "123456789", 26));
        listaAlumnos.add(new Alumno("Alejandro", "Velasco", "123456789", 23));
        return listaAlumnos;    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
