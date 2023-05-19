/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.entidades;

/**
 *
 * @author aleev
 */
public class Counter {
    private int count = 0;
    
    public synchronized int increment(){
        return count++;
    }
}
