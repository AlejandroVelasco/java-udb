/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.ejercicios.s2;
/**
 *
 * @author aleev
 */
public class Cotizacion {
    //Auto y Helpers
    private Automovil auto;
    private Extras extras;
    
    //Resultados Cotizacion
    private double totalExtras;
    private double totalIva;
    private double subtotal;
    private double totalDias;
    private int    dias;
    private double totalPagar;
    private double totalAuto;
    private Precios tablaPrecios = new Precios();

    public Cotizacion(Automovil auto, Extras extras, int dias) {
        this.auto = auto;
        this.extras = extras;
        this.dias = dias;
        this.calcularTotalesPagar();
    }
    
    public void calcularTotalesPagar(){
        double totalAuto = this.auto.getMarca().getPrecio()
                  + this.auto.getModelo().getPrecio();
        double totalExtras = this.extras.getTotalExtras();
       
        Transmision transmision = this.auto.getTransmision(); 
        if(transmision.getId() == 1){
            totalExtras += Precios.AUTOMATICO;
        }else{
            totalExtras += Precios.MANUAL;
        }
       
        double totalAutoExtras = totalAuto + totalExtras;
        double totalDias = dias*Precios.DIAS;
        double subtotal = totalAutoExtras + totalDias;
        double totalIva = subtotal*Precios.IVA;
        double totalPagar = subtotal + totalIva;
        
        
        this.totalAuto = totalAuto;
        this.totalDias = totalDias;
        this.totalExtras = totalExtras;
        this.totalIva = totalIva;
        this.totalPagar = totalPagar;
        
    }

    public Automovil getAuto() {
        return auto;
    }

    public void setAuto(Automovil auto) {
        this.auto = auto;
    }

    public Extras getExtras() {
        return extras;
    }

    public void setExtras(Extras extras) {
        this.extras = extras;
    }

    public double getTotalExtras() {
        return totalExtras;
    }

    public void setTotalExtras(double totalExtras) {
        this.totalExtras = totalExtras;
    }

    public double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(double totalIva) {
        this.totalIva = totalIva;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(double totalDias) {
        this.totalDias = totalDias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public double getTotalAuto() {
        return totalAuto;
    }

    public void setTotalAuto(double totalAuto) {
        this.totalAuto = totalAuto;
    }
    
    
    
}