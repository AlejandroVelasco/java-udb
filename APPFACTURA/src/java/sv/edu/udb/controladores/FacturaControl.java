/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.controladores;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import sv.edu.udb.entidades.Factura;
import sv.edu.udb.modelos.FacturaFacade;

/**
 *
 * @author aleev
 */
@Named(value = "facturaControl")
@ViewScoped
public class FacturaControl implements Serializable{

    @EJB
    private FacturaFacade facturaFacade;
    private List<Factura> lstFactura;
    
    public FacturaControl() {
    }
    
    @PostConstruct
    public void init(){
        lstFactura = facturaFacade.findAll();
    }

    public List<Factura> getLstFactura() {
        return lstFactura;
    }

    public void setLstFactura(List<Factura> lstFactura) {
        this.lstFactura = lstFactura;
    }
    
    
    
}
