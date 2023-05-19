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
public class Usuario {
    private int idUsuario;
    private String usuario;
    private String pass;
    private int idEstado;

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    

    
    public int getIdUsuario() {
        return idUsuario;
    }

    public Usuario() {
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public Usuario(int idUsuario, String usuario, String pass) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.pass = pass;
    }
    
    
}
