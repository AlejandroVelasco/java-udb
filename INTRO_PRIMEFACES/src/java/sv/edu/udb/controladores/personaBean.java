/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.controladores;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author aleev
 */
@ManagedBean(name = "personaBean")
@RequestScoped
public class personaBean {

    /**
     * Creates a new instance of personaBean
     */
    public class personaBean implements Serializable{
        private String nombre;
        
    }
    
}
