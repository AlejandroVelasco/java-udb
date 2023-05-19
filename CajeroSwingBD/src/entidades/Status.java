package entidades;

import java.util.List;

public class Status {
private int idStatus ;
private String descripcion;
private List<Usuario> lstUsuarios;

    public Status(int idStatus, String descripcion) {
        this.idStatus = idStatus;
        this.descripcion = descripcion;
    }

    public Status() {
    }
    

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Usuario> getLstUsuarios() {
        return lstUsuarios;
    }

    public void setLstUsuarios(List<Usuario> lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }


    
}
