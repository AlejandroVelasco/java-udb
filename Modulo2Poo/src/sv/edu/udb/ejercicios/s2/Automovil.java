package sv.edu.udb.ejercicios.s2;
/**
 * @author aleev
 */
public class Automovil {
    private Marca marca;
    private Modelo modelo;
    private Transmision transmision;
    private String totalAuto;
        
    public Automovil() {
    }
    
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }   
}