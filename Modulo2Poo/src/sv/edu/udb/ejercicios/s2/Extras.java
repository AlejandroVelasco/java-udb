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
public class Extras {
    private boolean sunroof;
    private boolean rines;
    private boolean estereo;
    private double totalExtras;

    public Extras() {
        this.sunroof = false;
        this.rines = false;
        this.estereo = false;
        this.totalExtras = 0;
    }
    
    public double getTotalExtras() {
        double total = 0;
        if(sunroof){
            total += Precios.SUNROOF;
        }
        
        if(rines){
            total += Precios.RINES;
        }
        if(estereo){
            total += Precios.ESTEREO;
        }
        this.totalExtras = total;
        return this.totalExtras;
    }    
    
    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public boolean isRines() {
        return rines;
    }

    public void setRines(boolean rines) {
        this.rines = rines;
    }

    public boolean isEstereo() {
        return estereo;
    }

    public void setEstereo(boolean estereo) {
        this.estereo = estereo;
    }
   
    
}
