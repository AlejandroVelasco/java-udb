package sv.edu.udb.controladores;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    @PostConstruct
    public void init() {
        persona = new Persona();
    }
    
    public void onDateSelect(){
       Double total = 0.0;
       total +=25/25*56+65;
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", "ENVIANDO MENSAJE DESDE EL CONTROLADOR"));
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    
    
}
