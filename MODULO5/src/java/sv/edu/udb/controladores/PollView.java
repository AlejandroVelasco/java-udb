/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.controladores;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author aleev
 */
@Named(value = "pollView")
@ViewScoped
public class PollView implements Serializable{

    /**
     * Creates a new instance of PollView
     */
    public PollView() {
    }
    
    private int number;

    public void increment() {
        number++;
    }

    public int getNumber() {
        return number;
    }
    
}
