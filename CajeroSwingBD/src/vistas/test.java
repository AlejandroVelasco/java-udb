/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Cuenta;
import java.math.BigDecimal;

/**
 *
 * @author Salvador Peña Menjívar
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta = new Cuenta();
        cuenta.setNumCuenta("12344");
        cuenta.setSaldo(BigDecimal.ZERO);
        System.out.println(cuenta);
    }
    
}
