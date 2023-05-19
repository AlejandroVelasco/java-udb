/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;
import sv.edu.udb.entidades.Producto;

/**
 *
 * @author aleev
 */
@ManagedBean(name = "productoControl")
@ViewScoped //ESTOS SON LOS SCOP's
public class ProductoControl implements Serializable {

    private Producto producto;
    private List<Producto> lstProductos;

    
       @PostConstruct
    public void init(){
        producto=new Producto();
        lstProductos = new ArrayList<>();
        cargarProductos();
    }

    private void cargarProductos() {
        lstProductos.add(new Producto(1, "Silla Gamer Victory Eagle"));
        lstProductos.add(new Producto(2, "Keyboarrd Bluefinger"));
        lstProductos.add(new Producto(3, "Acer Nitro 5"));
        lstProductos.add(new Producto(4, "Samsumg Galaxy S20"));
        lstProductos.add(new Producto(5, "Samsung Earbuds"));
        lstProductos.add(new Producto(6, "PlayStation 5"));
    }

    public void guardarProducto(){
        String msg = "Error al guardarProducto";
        try{   
            lstProductos.add(this.producto);
            this.producto=null;
            msg="Producto agregado";
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg)); 
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg));
        }
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getLstProductos() {
        return lstProductos;
    }

    public void setLstProductos(List<Producto> lstProductos) {
        this.lstProductos = lstProductos;
    }
}
