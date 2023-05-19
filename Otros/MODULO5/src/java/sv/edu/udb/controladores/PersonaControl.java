package sv.edu.udb.controladores;

import java.io.Serializable;
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
public class PersonaControl implements Serializable {

    //OBJETO DE LA CLASE Persona
    private Persona persona;
    private List<Persona> lstPersona;

    //Inicializar elementos acá
    @PostConstruct
    public void init() {
        persona = new Persona();
        lstPersona = new ArrayList<>();
        cargarPersonas();
    }

    public void cargarPersonas() {
//        Persona persona1 = new Persona("Juan", "Perez", "12213");
//        lstPersona.add(persona1); 
        lstPersona.add(new Persona("Juan", "Perez", "12213"));
        lstPersona.add(new Persona("Carlos", "Melendez", "12312323"));
        lstPersona.add(new Persona("Claudia", "Ramirez", "34455"));
        lstPersona.add(new Persona("Pablo", "Rodriguez", "12312323"));
        lstPersona.add(new Persona("Marco", "Portillo", "34455"));
        lstPersona.add(new Persona("Patricio", "Carcamo", "12312323"));
        lstPersona.add(new Persona("Jonathan", "Morales", "12213"));
        lstPersona.add(new Persona("Carlos", "Melendez", "12312323"));
        lstPersona.add(new Persona("Claudia", "Ramirez", "34455"));
        lstPersona.add(new Persona("Luis", "Alvarez", "12312323"));
        lstPersona.add(new Persona("Marco", "Portillo", "34455"));
        lstPersona.add(new Persona("Mauricio", "Cienfuegos", "12312323"));
        lstPersona.add(new Persona("Juan", "Perez", "12213"));
        lstPersona.add(new Persona("Marlon", "Solorzano", "12312323"));
        lstPersona.add(new Persona("Claudia", "Ramirez", "34455"));
        lstPersona.add(new Persona("Pablo", "Rodriguez", "12312323"));
        lstPersona.add(new Persona("Karla", "García", "34455"));
        lstPersona.add(new Persona("Jorge", "Gonzalez", "12312323"));
    }

    public void guardarPersona() {
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
