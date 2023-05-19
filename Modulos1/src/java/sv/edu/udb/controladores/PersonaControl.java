package sv.edu.udb.controladores;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.annotation.FacesConfig;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.event.SelectEvent;

import sv.edu.udb.entidades.Persona;

/**
 *
 * @author aleev
 */

/*
requestScoped
viewScoped
ApplicationScoped
ConversationsScoped
*/
@Named("personaControl")
@ViewScoped
public class PersonaControl implements Serializable {

    /**
     * Creates a new instance of PersonaControl
     */
    private Persona persona;
    private List<Persona> lstPersona;
    
    @PostConstruct
    public void init() {
        persona = new Persona();  
        lstPersona = new ArrayList<>();
        cargarPersonas();
    }
    
    public void cargarPersonas(){
        lstPersona.add(new Persona("Juan", "Perez", "0562794-0"));
        lstPersona.add(new Persona("Carlos", "Melendez", "123456-0"));
        lstPersona.add(new Persona("Claudia", "Ramirez", "987654-0"));
        lstPersona.add(new Persona("Patricio", "Carcamo", "00103646-0")); 
        
    }
    
    public void onDateSelect(){
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", "ENVIANDO MENSAJE DESDE EL CONTROLADOR"));
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getLstPersona() {
        return lstPersona;
    }

    public void setLstPersona(List<Persona> lstPersona) {
        this.lstPersona = lstPersona;
    }

    
    
    
    
}
