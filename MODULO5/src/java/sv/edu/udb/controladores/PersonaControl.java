package sv.edu.udb.controladores;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import sv.edu.udb.entidades.Persona;


/*
RequestScoped
ViewScoped
ApplicationScoped
ConversationScoped
*/
@ManagedBean(name = "personaControl")
@ViewScoped //ESTOS SON LOS SCOP's
public class PersonaControl implements Serializable{
    //OBJETO DE LA CLASE Persona
    private Persona persona;
    
    private List<Persona> lstPersona;
    
    
    //Inicializar elementos acá
    @PostConstruct
    public void init(){
        persona=new Persona();
         lstPersona = new ArrayList<>();
        cargarPersonas();
    }
    
     public void cargarPersonas(){
        lstPersona.add(new Persona("Juan", "Perez", "0562794-0"));
        lstPersona.add(new Persona("Carlos", "Melendez", "123456-0"));
        lstPersona.add(new Persona("Claudia", "Ramirez", "987654-0"));
        lstPersona.add(new Persona("Patricio", "Carcamo", "00103646-0")); 
        
    }
    
    
    public void guardarPersona(){
//        try {
//            
//        } catch (SQLException e) {
//            
//        }
     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "Persona ya existe en la bd"));
    
    }
    
    public void onDateSelect() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", "ENVIANDO MENSAJE DESDE EL CONTROLADOR"));
    }
    
    //METODOS SET Y GET
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
