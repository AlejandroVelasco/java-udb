/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.entidades;

/**
 *
 * @author aleev
 */
public class Alumno {
 private int carnet;
 private String nombres;
 private String apellidos;

    public Alumno(int carnet, String nombres, String apellidos) {
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Alumno() {
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
 
 
}
