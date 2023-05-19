/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.entidades;

/**
 *
 * @author Salvador Peña Menjívar
 */
public class Categoria {
    private int codCategoria;
    private String nombre;

    public Categoria() {
    }

    public Categoria(int codCategoria, String nombre) {
        this.codCategoria = codCategoria;
        this.nombre = nombre;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
