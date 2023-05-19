package entidades;

import java.sql.Date;

public class Usuario {
    // 1 USUARIO TIENE 1 STATUS (ACTIVO O INACTIVO) --> 1 objeto Status
    // 1 STATUS PUEDEN TENERLO VARIOS USUARIO   --> lstUsuarios
    
    private int idUsuario;
    private Status idStatus;  
    private Rol idRol;
    private String nombre;
    private String usuario;
    private String pass;
    private String email;
    private Date fechaCreacion;
    private Date fechaModificacion;

    public Usuario() {
    }
    
    

    public Usuario(int idUsuario, Status idStatus, Rol idRol, String nombre, String usuario, String pass, String email, Date fechaCreacion, Date fechaModificacion) {
        this.idUsuario = idUsuario;
        this.idStatus = idStatus;
        this.idRol = idRol;
        this.nombre = nombre;
        this.usuario = usuario;
        this.pass = pass;
        this.email = email;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Status getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Status idStatus) {
        this.idStatus = idStatus;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

}
