/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.entidades;

import java.util.Date;

/**
 *
 * @author Salvador Peña Menjívar
 */
public class Libro {

    private String isbn;
    private String titulo;
    private String descripcion;
    private String nombreAutor;
    private Date fechaPublicacion;
    private Date fechaRegistro;
    private int codCategoria;
    private int codEditorial;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String descripcion, String nombreAutor, Date fechaPublicacion, Date fechaRegistro, int codCategoria, int codEditorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.nombreAutor = nombreAutor;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaRegistro = fechaRegistro;
        this.codCategoria = codCategoria;
        this.codEditorial = codEditorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public int getCodEditorial() {
        return codEditorial;
    }

    public void setCodEditorial(int codEditorial) {
        this.codEditorial = codEditorial;
    }

}
