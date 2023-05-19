package sv.edu.udb.entidades;

import java.sql.Date;

public class Docente {
    private int idDocente;
    private String nombre;
    private String correo;
    private Date fechaIngreso;
    
    public Docente() {
    }

    public Docente(String nombre, String correo, Date fechaIngreso) {
        this.nombre = nombre;
        this.correo = correo;
        this.fechaIngreso = fechaIngreso;
    }



    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    
    
}
