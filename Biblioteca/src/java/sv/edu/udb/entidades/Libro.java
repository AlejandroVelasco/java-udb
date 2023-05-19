package sv.edu.udb.entidades;

import java.util.Date;

/**
 *
 * @author aleev
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String descripcion;
    private Date fechaPublicacion;
    private Date fechaRegistro;
    private int codCategoria;
    private int codEditorial;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, String descripcion, Date fechaPublicacion, Date fechaRegistro, int codCategoria, int codEditorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.descripcion = descripcion;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
