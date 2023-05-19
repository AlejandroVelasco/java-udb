/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.controladores;

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.commons.codec.digest.DigestUtils;
import sv.edu.udb.entidades.Usuario;
import sv.edu.udb.modelos.UsuarioFacade;

/**
 *
 * @author aleev
 */
@Named(value = "loginControl")
@SessionScoped
public class LoginControl implements Serializable {

    /**
     * Creates a new instance of LoginControl
     */
    
    @EJB
    private UsuarioFacade usuarioFacade;
    
    private String usuario;
    private String claveCifrada;
    private Usuario usuarioValidado;
    
    
    public LoginControl() {
    }
    
    @PostConstruct
    public void init(){
        
    }
    
    public String validarUsuario(){
        claveCifrada = DigestUtils.sha512Hex(claveCifrada);
        usuarioValidado = new Usuario();
        usuarioValidado = usuarioFacade.buscarUsuario(usuario, claveCifrada);
        
        if(usuarioValidado != null){
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuarioValidado);
            return "procesos/facturacion/listaFacturas.xhtml?faces-redirect=true";
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Error", "Error al iniciar sesion"));
        return null;
    }
    
    public void cerrarSesion(){
       try {
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
            FacesContext.getCurrentInstance().getExternalContext().redirect("/APPFACTURA");
        } catch (IOException e) {
            System.out.println("Error al cerrar la sesión " + e);
        }
    }
  
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClaveCifrada() {
        return claveCifrada;
    }

    public void setClaveCifrada(String claveCifrada) {
        this.claveCifrada = claveCifrada;
    }

    public Usuario getUsuarioValidado() {
        return usuarioValidado;
    }

    public void setUsuarioValidado(Usuario usuarioValidado) {
        this.usuarioValidado = usuarioValidado;
    }
    
}
 